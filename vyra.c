/*
 * VYRA compiler v0.2
 * VYRA source (.vy) -> C (output.c) -> native binary via gcc
 *
 * Build:   gcc vyra.c -o vyra -lm
 * Compile: ./vyra main.vy
 * Run:     ./vyra run main.vy
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <stdarg.h>

#define VERSION "0.2"
#define MAX_LINE 2048
#define MAX_VARS 500
#define MAX_NAME 128
#define MAX_DEPTH 64
#define MAX_ARGS 64

enum { KIND_IF, KIND_ELSE, KIND_WHILE };

typedef struct
{
    char name[MAX_NAME];
    int is_string;
} Variable;

static Variable variables[MAX_VARS];
static int variable_count = 0;

static int line_no = 0;
static int error_count = 0;

/* Block (indentation) tracking */
static int block_indent[MAX_DEPTH]; /* indent of the line that opened the block */
static int block_body[MAX_DEPTH];   /* indent of the block's body (-1 = unknown) */
static int block_kind[MAX_DEPTH];
static int depth = 0;
static int expect_block = 0;
static int base_indent = -1;

static const char *reserved[] = {
    "auto", "break", "case", "char", "const", "continue", "default", "do",
    "double", "else", "enum", "extern", "float", "for", "goto", "if", "inline",
    "int", "long", "register", "restrict", "return", "short", "signed",
    "sizeof", "static", "struct", "switch", "typedef", "union", "unsigned",
    "void", "volatile", "while", "main", "printf",
    "fn", "print", "elif", "pass", "and", "or", "not", "True", "False", "PI",
    "sqrt", "sin", "cos", "tan", "abs", "pow", "floor", "ceil", NULL};

/* ------------------------------------------------------------ helpers */

static void report_error(const char *fmt, ...)
{
    va_list ap;

    fprintf(stderr, "Error (line %d): ", line_no);
    va_start(ap, fmt);
    vfprintf(stderr, fmt, ap);
    va_end(ap);
    fputc('\n', stderr);

    error_count++;
}

static void trim(char *s)
{
    int start = 0;

    while (isspace((unsigned char)s[start]))
        start++;

    if (start > 0)
        memmove(s, s + start, strlen(s + start) + 1);

    int len = (int)strlen(s);

    while (len > 0 && isspace((unsigned char)s[len - 1]))
        s[--len] = '\0';
}

static int is_reserved(const char *name)
{
    for (int i = 0; reserved[i]; i++)
    {
        if (strcmp(reserved[i], name) == 0)
            return 1;
    }
    return 0;
}

static int find_variable(const char *name)
{
    for (int i = 0; i < variable_count; i++)
    {
        if (strcmp(variables[i].name, name) == 0)
            return i;
    }
    return -1;
}

static int add_variable(const char *name, int is_string)
{
    if (variable_count >= MAX_VARS)
    {
        report_error("Too many variables (max %d)", MAX_VARS);
        return -1;
    }

    snprintf(variables[variable_count].name, MAX_NAME, "%s", name);
    variables[variable_count].is_string = is_string;

    return variable_count++;
}

/* True only if the WHOLE string is one literal ("a" is, "a" + "b" is not). */
static int is_string_literal(const char *s)
{
    char q = s[0];

    if (q != '"' && q != '\'')
        return 0;

    for (int i = 1; s[i]; i++)
    {
        if (s[i] == '\\')
        {
            if (!s[i + 1])
                return 0;
            i++;
            continue;
        }
        if (s[i] == q)
            return s[i + 1] == '\0';
    }
    return 0;
}

static int is_ident_start(char c)
{
    return isalpha((unsigned char)c) || c == '_';
}

static int is_ident_char(char c)
{
    return isalnum((unsigned char)c) || c == '_';
}

static int is_identifier(const char *s)
{
    if (!s[0] || !is_ident_start(s[0]))
        return 0;

    for (int i = 1; s[i]; i++)
    {
        if (!is_ident_char(s[i]))
            return 0;
    }
    return 1;
}

static int is_string_var(const char *s)
{
    if (!is_identifier(s))
        return 0;

    int i = find_variable(s);
    return i >= 0 && variables[i].is_string;
}

static int starts_kw(const char *s, const char *kw)
{
    size_t n = strlen(kw);

    return strncmp(s, kw, n) == 0 &&
           (s[n] == ' ' || s[n] == '\t' || s[n] == '(');
}

static void strip_comment(char *s)
{
    char quote = 0;

    for (int i = 0; s[i]; i++)
    {
        if (quote)
        {
            if (s[i] == '\\' && s[i + 1])
                i++;
            else if (s[i] == quote)
                quote = 0;
        }
        else if (s[i] == '"' || s[i] == '\'')
            quote = s[i];
        else if (s[i] == '#')
        {
            s[i] = '\0';
            return;
        }
    }
}

static int measure_indent(const char *s)
{
    int n = 0;

    for (; *s == ' ' || *s == '\t'; s++)
        n += (*s == '\t') ? 4 : 1;

    return n;
}

static void emit_indent(FILE *out)
{
    for (int i = 0; i < 4 * (depth + 1); i++)
        fputc(' ', out);
}

/* ------------------------------------------------------- expressions */

static const char *c_function(const char *name)
{
    static const char *map[][2] = {
        {"sqrt", "sqrt"}, {"sin", "sin"}, {"cos", "cos"}, {"tan", "tan"},
        {"abs", "fabs"}, {"pow", "pow"}, {"floor", "floor"}, {"ceil", "ceil"}};

    for (size_t i = 0; i < sizeof(map) / sizeof(map[0]); i++)
    {
        if (strcmp(map[i][0], name) == 0)
            return map[i][1];
    }
    return NULL;
}

/* Translate a VYRA numeric expression into C. Reports errors. */
static void emit_expression(FILE *out, const char *e)
{
    int paren = 0;
    const char *p = e;

    while (*p)
    {
        if (*p == '"' || *p == '\'')
        {
            report_error("Strings can't be used in math (string joining isn't supported yet)");
            return;
        }

        /* numbers: make 7/2 behave like 3.5, not 3 */
        if (isdigit((unsigned char)*p) || (*p == '.' && isdigit((unsigned char)p[1])))
        {
            const char *s = p;
            int is_float = 0;

            while (isdigit((unsigned char)*p))
                p++;

            if (*p == '.')
            {
                is_float = 1;
                p++;
                while (isdigit((unsigned char)*p))
                    p++;
            }

            if ((*p == 'e' || *p == 'E') &&
                (isdigit((unsigned char)p[1]) ||
                 ((p[1] == '+' || p[1] == '-') && isdigit((unsigned char)p[2]))))
            {
                is_float = 1;
                p += 2;
                while (isdigit((unsigned char)*p))
                    p++;
            }

            fwrite(s, 1, (size_t)(p - s), out);
            if (!is_float)
                fputs(".0", out);
            continue;
        }

        if (is_ident_start(*p))
        {
            char word[MAX_NAME];
            int n = 0;

            while (is_ident_char(*p))
            {
                if (n < MAX_NAME - 1)
                    word[n++] = *p;
                p++;
            }
            word[n] = '\0';

            const char *q = p;
            while (isspace((unsigned char)*q))
                q++;

            if (strcmp(word, "PI") == 0)
                fputs("3.141592653589793", out);
            else if (strcmp(word, "and") == 0)
                fputs(" && ", out);
            else if (strcmp(word, "or") == 0)
                fputs(" || ", out);
            else if (strcmp(word, "not") == 0)
                fputs("!", out);
            else if (strcmp(word, "True") == 0)
                fputs("1", out);
            else if (strcmp(word, "False") == 0)
                fputs("0", out);
            else if (*q == '(')
            {
                const char *cfn = c_function(word);

                if (!cfn)
                {
                    report_error("Unknown function: %s", word);
                    return;
                }
                fputs(cfn, out);
            }
            else
            {
                int idx = find_variable(word);

                if (idx < 0)
                {
                    report_error("Undefined variable: %s", word);
                    return;
                }
                if (variables[idx].is_string)
                {
                    report_error("String variable '%s' can't be used in math", word);
                    return;
                }
                fputs(word, out);
            }
            continue;
        }

        if (*p == '=')
        {
            char prev = (p > e) ? p[-1] : 0;

            if (p[1] != '=' && !(prev && strchr("!<>=", prev)))
            {
                report_error("Use '==' to compare values ('=' is only for assignment)");
                return;
            }
        }
        else if (*p == '*' && p[1] == '*')
        {
            report_error("'**' isn't supported yet (use pow(a, b))");
            return;
        }
        else if (*p == '/' && (p[1] == '/' || p[1] == '*'))
        {
            report_error("'//' and '/*' aren't supported");
            return;
        }
        else if (*p == '%')
        {
            report_error("The '%%' operator isn't supported yet");
            return;
        }
        else if (*p == '(')
            paren++;
        else if (*p == ')')
        {
            if (--paren < 0)
            {
                report_error("Unbalanced parentheses");
                return;
            }
        }
        else if (*p == ',')
        {
            if (paren == 0)
            {
                report_error("Unexpected ','");
                return;
            }
        }
        else if (!strchr("+-*/<>=!. \t", *p))
        {
            report_error("Unexpected character '%c'", *p);
            return;
        }

        fputc(*p++, out);
    }

    if (paren != 0)
        report_error("Unbalanced parentheses");
}

/* Emit a VYRA string literal ('..' or "..") as a C "..." literal. */
static void emit_string_literal(FILE *out, const char *s)
{
    size_t len = strlen(s);

    fputc('"', out);

    for (size_t i = 1; i + 1 < len; i++)
    {
        char c = s[i];

        if (c == '\\' && i + 2 < len)
        {
            char n = s[i + 1];

            if (n == '\'')
                fputc('\'', out);
            else
            {
                fputc('\\', out);
                fputc(n, out);
            }
            i++;
        }
        else if (c == '"')
            fputs("\\\"", out);
        else
            fputc(c, out);
    }

    fputc('"', out);
}

/* -------------------------------------------------------- statements */

static void compile_print(FILE *out, char *line)
{
    size_t len = strlen(line);
    char *start = line + 6;
    char *args[MAX_ARGS];
    int count = 0;

    if (line[len - 1] != ')')
    {
        report_error("print() is missing its closing parenthesis");
        return;
    }

    line[len - 1] = '\0';
    trim(start);

    if (*start)
    {
        char *p = start;
        int paren = 0;
        char quote = 0;

        args[count++] = p;

        for (; *p; p++)
        {
            if (quote)
            {
                if (*p == '\\' && p[1])
                    p++;
                else if (*p == quote)
                    quote = 0;
            }
            else if (*p == '"' || *p == '\'')
                quote = *p;
            else if (*p == '(')
                paren++;
            else if (*p == ')')
                paren--;
            else if (*p == ',' && paren == 0)
            {
                if (count >= MAX_ARGS)
                {
                    report_error("Too many arguments in print()");
                    return;
                }
                *p = '\0';
                args[count++] = p + 1;
            }
        }

        if (quote)
        {
            report_error("Unterminated string");
            return;
        }
    }

    for (int i = 0; i < count; i++)
    {
        char *a = args[i];
        trim(a);

        if (!*a)
        {
            report_error("Empty argument in print()");
            return;
        }

        if (i > 0)
        {
            emit_indent(out);
            fputs("printf(\" \");\n", out);
        }

        emit_indent(out);

        if (is_string_literal(a))
        {
            fputs("printf(\"%s\", ", out);
            emit_string_literal(out, a);
            fputs(");\n", out);
        }
        else if (is_string_var(a))
        {
            fprintf(out, "printf(\"%%s\", %s);\n", a);
        }
        else
        {
            fputs("printf(\"%.15g\", (double)(", out);
            emit_expression(out, a);
            fputs("));\n", out);
        }
    }

    emit_indent(out);
    fputs("printf(\"\\n\");\n", out);
}

/* Finds the '=' of an assignment, skipping strings and ==, !=, <=, >= */
static char *find_assign(char *s)
{
    char quote = 0;

    for (char *p = s; *p; p++)
    {
        if (quote)
        {
            if (*p == '\\' && p[1])
                p++;
            else if (*p == quote)
                quote = 0;
        }
        else if (*p == '"' || *p == '\'')
            quote = *p;
        else if (*p == '=')
        {
            char prev = (p > s) ? p[-1] : 0;

            if (p[1] == '=')
            {
                p++;
                continue;
            }
            if (prev && strchr("!<>=", prev))
                continue;

            return p;
        }
    }
    return NULL;
}

static void compile_assignment(FILE *out, char *line)
{
    char *eq = find_assign(line);

    if (!eq)
    {
        report_error("Invalid assignment");
        return;
    }

    char op = 0;

    if (eq > line && eq[-1] && strchr("+-*/", eq[-1]))
    {
        op = eq[-1];
        eq[-1] = '\0';
    }
    else
        *eq = '\0';

    char *name = line;
    char *expr = eq + 1;

    trim(name);
    trim(expr);

    if (strlen(name) >= MAX_NAME || !is_identifier(name))
    {
        report_error("Invalid variable name: %s", name);
        return;
    }

    if (is_reserved(name))
    {
        report_error("'%s' is a reserved word and can't be a variable name", name);
        return;
    }

    if (!*expr)
    {
        report_error("Missing value after '='");
        return;
    }

    int is_str = is_string_literal(expr) || is_string_var(expr);
    int idx = find_variable(name);

    if (op && is_str)
    {
        report_error("'%c=' only works with numbers", op);
        return;
    }

    if (idx < 0 && op)
    {
        report_error("Undefined variable: %s", name);
        return;
    }

    if (idx >= 0 && variables[idx].is_string != is_str)
    {
        report_error("Can't assign %s to %s variable '%s'",
                     is_str ? "a string" : "a number",
                     variables[idx].is_string ? "the string" : "the number",
                     name);
        return;
    }

    emit_indent(out);

    if (is_str)
    {
        fprintf(out, "%s = ", name);

        if (is_string_literal(expr))
            emit_string_literal(out, expr);
        else
            fputs(expr, out);

        fputs(";\n", out);
    }
    else
    {
        if (op)
            fprintf(out, "%s %c= ", name, op);
        else
            fprintf(out, "%s = ", name);

        emit_expression(out, expr);
        fputs(";\n", out);
    }

    /* Added after the expression so `x = x + 1` fails when x doesn't exist. */
    if (idx < 0)
        add_variable(name, is_str);
}

static void push_block(int rel, int kind)
{
    if (depth >= MAX_DEPTH)
    {
        report_error("Blocks are nested too deeply (max %d)", MAX_DEPTH);
        return;
    }

    block_indent[depth] = rel;
    block_body[depth] = -1;
    block_kind[depth] = kind;
    depth++;
    expect_block = 1;
}

static void compile_conditional(FILE *out, char *line, int rel,
                                const char *kw, int kind)
{
    size_t len = strlen(line);

    if (line[len - 1] != ':')
    {
        report_error("'%s' statement must end with ':'", kw);
        push_block(rel, kind);
        return;
    }

    line[len - 1] = '\0';

    char *cond = line + strlen(kw);
    trim(cond);

    if (!*cond)
    {
        report_error("'%s' needs a condition", kw);
        push_block(rel, kind);
        return;
    }

    emit_indent(out);

    if (strcmp(kw, "elif") == 0)
        fputs("else if (", out);
    else
        fprintf(out, "%s (", kw);

    emit_expression(out, cond);
    fputs(") {\n", out);

    push_block(rel, kind);
}

static int inside_loop(void)
{
    for (int i = 0; i < depth; i++)
    {
        if (block_kind[i] == KIND_WHILE)
            return 1;
    }
    return 0;
}

static void compile_line(FILE *out, char *line)
{
    strip_comment(line);

    int indent = measure_indent(line);

    trim(line);

    if (!*line)
        return;

    if (strncmp(line, "fn ", 3) == 0)
    {
        if (strcmp(line, "fn main():") != 0)
            report_error("Custom functions aren't supported yet (only 'fn main():')");
        else if (base_indent >= 0)
            report_error("'fn main():' must come before other statements");
        return;
    }

    if (base_indent < 0)
        base_indent = indent;

    int rel = indent - base_indent;

    if (rel < 0)
    {
        report_error("Indentation is less than the start of the program");
        rel = 0;
    }

    /* First line after a block opener must be indented deeper. */
    if (expect_block)
    {
        int top = depth - 1;

        if (top >= 0)
        {
            if (rel <= block_indent[top])
                report_error("Expected an indented block");
            else
                block_body[top] = rel;
        }
        expect_block = 0;
    }

    /* Close blocks we've dedented out of. */
    int popped_kind = -1;
    int popped_indent = -1;

    while (depth > 0 && rel <= block_indent[depth - 1])
    {
        depth--;
        popped_kind = block_kind[depth];
        popped_indent = block_indent[depth];
        emit_indent(out);
        fputs("}\n", out);
    }

    int expected = (depth > 0) ? block_body[depth - 1] : 0;

    if (rel != expected)
        report_error("Inconsistent indentation");

    /* ---- dispatch ---- */

    if (strncmp(line, "print(", 6) == 0)
    {
        compile_print(out, line);
        return;
    }

    if (starts_kw(line, "if"))
    {
        compile_conditional(out, line, rel, "if", KIND_IF);
        return;
    }

    if (starts_kw(line, "while"))
    {
        compile_conditional(out, line, rel, "while", KIND_WHILE);
        return;
    }

    if (starts_kw(line, "elif"))
    {
        if (popped_kind != KIND_IF || popped_indent != rel)
            report_error("'elif' without a matching 'if'");

        compile_conditional(out, line, rel, "elif", KIND_IF);
        return;
    }

    if (strncmp(line, "else", 4) == 0)
    {
        const char *r = line + 4;

        while (isspace((unsigned char)*r))
            r++;

        if (strcmp(r, ":") == 0)
        {
            if (popped_kind != KIND_IF || popped_indent != rel)
                report_error("'else' without a matching 'if'");

            emit_indent(out);
            fputs("else {\n", out);
            push_block(rel, KIND_ELSE);
            return;
        }
    }

    if (strcmp(line, "break") == 0 || strcmp(line, "continue") == 0)
    {
        if (!inside_loop())
            report_error("'%s' outside of a loop", line);

        emit_indent(out);
        fprintf(out, "%s;\n", line);
        return;
    }

    if (strcmp(line, "pass") == 0)
    {
        emit_indent(out);
        fputs(";\n", out);
        return;
    }

    if (find_assign(line))
    {
        compile_assignment(out, line);
        return;
    }

    report_error("Unsupported syntax: %s", line);
}

/* ------------------------------------------------------------ driver */

static int compile_file(const char *path)
{
    FILE *input = fopen(path, "r");

    if (!input)
    {
        fprintf(stderr, "Error: Cannot open file %s\n", path);
        return 1;
    }

    FILE *body = tmpfile();

    if (!body)
    {
        fprintf(stderr, "Error: Cannot create temporary file\n");
        fclose(input);
        return 1;
    }

    char line[MAX_LINE];

    while (fgets(line, sizeof(line), input))
    {
        line_no++;

        if (!strchr(line, '\n') && !feof(input))
        {
            int c;

            report_error("Line too long (max %d characters)", MAX_LINE - 1);
            while ((c = fgetc(input)) != EOF && c != '\n')
                ;
            continue;
        }

        compile_line(body, line);
    }

    fclose(input);

    if (expect_block)
        report_error("Expected an indented block at end of file");

    while (depth > 0)
    {
        depth--;
        emit_indent(body);
        fputs("}\n", body);
    }

    if (error_count > 0)
    {
        fprintf(stderr, "\nCompilation failed: %d error(s).\n", error_count);
        fclose(body);
        return 1;
    }

    FILE *output = fopen("output.c", "w");

    if (!output)
    {
        fprintf(stderr, "Error: Cannot create output.c\n");
        fclose(body);
        return 1;
    }

    fputs("#include <stdio.h>\n", output);
    fputs("#include <stdlib.h>\n", output);
    fputs("#include <math.h>\n\n", output);
    fputs("int main(void) {\n", output);

    for (int i = 0; i < variable_count; i++)
    {
        if (variables[i].is_string)
            fprintf(output, "    char *%s = \"\";\n", variables[i].name);
        else
            fprintf(output, "    double %s = 0;\n", variables[i].name);
    }

    if (variable_count > 0)
        fputc('\n', output);

    rewind(body);

    char buf[4096];
    size_t n;

    while ((n = fread(buf, 1, sizeof(buf), body)) > 0)
        fwrite(buf, 1, n, output);

    fputs("\n    return 0;\n", output);
    fputs("}\n", output);

    fclose(body);
    fclose(output);

    return 0;
}

static void exe_name_from(const char *path, char *out, size_t size)
{
    const char *base = strrchr(path, '/');

    base = base ? base + 1 : path;
    snprintf(out, size, "%s", base);

    char *dot = strrchr(out, '.');

    if (dot && dot != out)
        *dot = '\0';

    for (char *p = out; *p; p++)
    {
        if (!isalnum((unsigned char)*p) && *p != '_')
            *p = '_';
    }

    if (!*out || strcmp(out, "vyra") == 0)
        snprintf(out, size, "program");
}

int main(int argc, char *argv[])
{
    int run = 0;
    int quiet = 0;
    const char *source = NULL;

    if (argc == 3 && strcmp(argv[1], "run") == 0)
    {
        run = 1;
        source = argv[2];
    }
    else if (argc == 3 && strcmp(argv[1], "compile") == 0)
    {
        quiet = 1; /* no banner, used by the web UI */
        source = argv[2];
    }
    else if (argc == 2)
    {
        source = argv[1];
    }
    else
    {
        printf("VYRA v%s\n\n", VERSION);
        printf("Usage:\n");
        printf("  vyra main.vy       compile to output.c\n");
        printf("  vyra run main.vy   compile, build with gcc, and run\n");
        printf("  vyra compile main.vy   compile quietly (no banner)\n");
        return 1;
    }

    if (!run && !quiet)
    {
        printf("\n");
        printf("================================\n");
        printf("       VYRA COMPILER v%s\n", VERSION);
        printf("================================\n\n");
    }

    if (compile_file(source) != 0)
        return 1;

    if (quiet)
        return 0;

    if (!run)
    {
        printf("Source: %s\n", source);
        printf("Generated: output.c\n");
        printf("Compilation completed!\n\n");
        return 0;
    }

    char exe[256];
    char cmd[600];

    exe_name_from(source, exe, sizeof(exe));

    snprintf(cmd, sizeof(cmd), "gcc output.c -o %s -lm", exe);

    if (system(cmd) != 0)
    {
        fprintf(stderr, "Error: gcc failed to build output.c\n");
        return 1;
    }

    snprintf(cmd, sizeof(cmd), "./%s", exe);

    return system(cmd) == 0 ? 0 : 1;
}
