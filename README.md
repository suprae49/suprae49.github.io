# VYRA Code Studio

VYRA is a small indentation-based language that compiles to C. The browser IDE also includes Python and C editing modes; only VYRA is executed by the built-in browser compiler.

## Start here

Open `index.html` in a modern browser. No server or package installation is required for the browser IDE.

- **Run** (`Ctrl+Enter`): compile and execute VYRA in the browser. Python and C modes show a clear runtime notice instead of being sent to the VYRA compiler.
- **Compile to C**: compile VYRA and display the generated `output.c`.
- **Output / output.c**: switch between program output and the latest generated C code. The IDE recompiles automatically if the VYRA source changed.
- **Load demo / Reset demo**: load the selected language's built-in demo. Reset asks before replacing changed source.
- **Language selector**: VYRA is the first-run default. Python and C have separate demo code, autocomplete, drafts, and file extensions, but the browser IDE does not bundle their runtimes.
- **Open file / Download file**: open `.vy`, `.py`, `.c`, and `.h` files or drag one onto the editor. Download saves the active source with its current filename.
- **Copy code / Find**: copy the editor source or find and replace text in the current file. Find supports next, replace, replace-all, and `Ctrl+F`.
- **Theme**: cycle Auto, Dark, and Light. The preference is stored locally when browser storage is available.
- **Autosave / Restore draft**: drafts are stored locally in the same browser. The most recent changes are flushed on page navigation when possible. First launch still opens the VYRA demo; use Restore draft to recover existing work.
- **Phone quick insert**: on narrow screens, tap the language-aware template strip below the language selector to insert common statements at the cursor.
- **Project backup**: use Export backup / Import backup to move local drafts, file names, active language, theme, and editor preferences as a versioned JSON file.
- **Install / offline**: on HTTPS, supported browsers can install VYRA as an app. After one online load and service-worker activation, the IDE and guide shell can reopen offline.
- **Mobile workspace**: on narrow screens, use the Editor / Output switcher. Run opens Output; loading a demo or file returns to Editor. The top toolbar can be swiped horizontally.
- **Editor assistance**: line numbers, cursor/document counts, four-space Tab, auto-indent, comment toggle, language-specific completion suggestions, adjustable font size (12–20px), and a saved word-wrap preference.
- **Mobile dock**: a fixed bottom navigation bar for Editor, Run, Output, and Guide, with safe-area spacing on phones.
- **Indentation fix**: Shift+Tab now outdents the current line even when the cursor is inside the code, and selected-line indentation no longer spills onto the next line when the selection ends at its start.

## Keyboard shortcuts

| Shortcut | Action |
|---|---|
| `Ctrl+Enter` | Run VYRA / show the runtime notice for Python or C |
| `Ctrl+S` | Download the current source file |
| `Ctrl+F` | Open Find and Replace |
| `Ctrl+Shift+L` | Load the selected language demo |
| `Ctrl+/` | Toggle comments on selected lines (`#` for VYRA/Python, `//` for C) |
| `Tab` / `Shift+Tab` | Indent / outdent selected lines, or insert/remove indentation at the cursor |
| `Enter` | Continue indentation; adds a level after VYRA/Python `:` and C `{` |
| `Backspace` | Remove one four-space indent when the cursor is in leading whitespace |
| `↑` / `↓`, `Enter`, `Esc` | Navigate, accept, or close autocomplete suggestions |

## Native compiler (Linux/macOS)

```sh
make
./vyra demo.vy            # generate output.c
./vyra run demo.vy        # compile with GCC and run
make test                 # native compiler smoke tests
make ui-test              # browser IDE JavaScript/UI smoke tests (Node.js required)
```

GCC is required for the native workflow. `-lm` links the math library. Node.js is required only for `make ui-test`.

## Language scope

The current VYRA compiler supports numeric and string assignments, `print`, `if` / `elif` / `else`, `while`, `break`, `continue`, `pass`, comments, arithmetic/comparison/logical operators, and the built-in math functions `sqrt`, `sin`, `cos`, `tan`, `abs`, `pow`, `floor`, `ceil`, and `PI`.

Known limits include no user-defined functions, `for` loops, collections, input/file/network APIs, string concatenation, or `%` / `**` operators. Use `pow(a, b)` for powers. Python and C are not run by the browser IDE; use their native runtimes/compilers separately.

## Project files

| File | Purpose |
|---|---|
| `index.html` | Browser IDE and JavaScript implementation of the VYRA compiler |
| `vyra.c` | Native VYRA-to-C compiler |
| `demo.vy` | Default VYRA demonstration program |
| `how-to.html` | Responsive user tutorial and language reference |
| `tests/smoke.sh` | Native compiler smoke tests |
| `tests/ui-smoke.js` | Browser IDE logic and UI smoke tests using a lightweight DOM stub |
| `manifest.webmanifest` | Installable web-app metadata |
| `sw.js` | Offline app-shell cache and navigation fallback |
| `icon.svg`, `icon-192.png`, `icon-512.png` | App icons |
| `Makefile` | Build, test, and clean targets |

The C compiler and JavaScript port are maintained separately. When changing the language, keep the implementations aligned and run both test suites.
