#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <time.h>

static double vyra_rand(void) __attribute__((unused));
static double vyra_len(const char *s) __attribute__((unused));
static double vyra_deg2rad(double d) __attribute__((unused));
static double vyra_rad2deg(double r) __attribute__((unused));
static double vyra_isinf(double x) __attribute__((unused));
static double vyra_isnan(double x) __attribute__((unused));
static double vyra_isfinite(double x) __attribute__((unused));
static double vyra_isnormal(double x) __attribute__((unused));
static double vyra_signbit(double x) __attribute__((unused));
static double vyra_clamp(double x, double min, double max) __attribute__((unused));
static double vyra_lerp(double a, double b, double t) __attribute__((unused));
static double vyra_map(double x, double in_min, double in_max, double out_min, double out_max) __attribute__((unused));
static double vyra_typeof(double x) __attribute__((unused));
static double vyra_type_of(double x) __attribute__((unused));
static double vyra_to_int(double x) __attribute__((unused));
static double vyra_to_float(double x) __attribute__((unused));
static double vyra_ord(const char *s) __attribute__((unused));
static double vyra_chr(int c) __attribute__((unused));
static double vyra_sum(double *arr, int n) __attribute__((unused));
static double vyra_prod(double *arr, int n) __attribute__((unused));
static double vyra_mean(double *arr, int n) __attribute__((unused));
static double vyra_median(double *arr, int n) __attribute__((unused));
static double vyra_stdev(double *arr, int n) __attribute__((unused));
static double *vyra_sort(double *arr, int n) __attribute__((unused));
static double *vyra_reverse(double *arr, int n) __attribute__((unused));
static double *vyra_shuffle(double *arr, int n) __attribute__((unused));
static double *vyra_range(double start, double stop, double step, int *out_n) __attribute__((unused));
static double *vyra_enumerate(double *arr, int n, int *out_n) __attribute__((unused));
static double *vyra_zip(double *a, int na, double *b, int nb, int *out_n) __attribute__((unused));
static double vyra_any(double *arr, int n) __attribute__((unused));
static double vyra_all(double *arr, int n) __attribute__((unused));
static long long vyra_abs_int(long long x) __attribute__((unused));
static int vyra_clz(unsigned int x) __attribute__((unused));
static int vyra_ctz(unsigned int x) __attribute__((unused));
static int vyra_popcount(unsigned int x) __attribute__((unused));
static long long vyra_min_int(long long a, long long b) __attribute__((unused));
static long long vyra_max_int(long long a, long long b) __attribute__((unused));
static long long vyra_gcd(long long a, long long b) __attribute__((unused));
static long long vyra_lcm(long long a, long long b) __attribute__((unused));
static long long vyra_factorial(int n) __attribute__((unused));
static long long vyra_perm(int n, int k) __attribute__((unused));
static long long vyra_comb(int n, int k) __attribute__((unused));
static long long vyra_sqrt_int(long long n) __attribute__((unused));
static long long vyra_isqrt(long long n) __attribute__((unused));
static unsigned int vyra_bit_and(unsigned int a, unsigned int b) __attribute__((unused));
static unsigned int vyra_bit_or(unsigned int a, unsigned int b) __attribute__((unused));
static unsigned int vyra_bit_xor(unsigned int a, unsigned int b) __attribute__((unused));
static unsigned int vyra_bit_not(unsigned int a) __attribute__((unused));
static unsigned int vyra_bit_shl(unsigned int a, unsigned int b) __attribute__((unused));
static unsigned int vyra_bit_shr(unsigned int a, unsigned int b) __attribute__((unused));
static int vyra_find(const char *s, const char *sub) __attribute__((unused));
static int vyra_rfind(const char *s, const char *sub) __attribute__((unused));
static int vyra_startswith(const char *s, const char *prefix) __attribute__((unused));
static int vyra_endswith(const char *s, const char *suffix) __attribute__((unused));
static int vyra_contains(const char *s, const char *sub) __attribute__((unused));
static int vyra_count(const char *s, const char *sub) __attribute__((unused));
static int vyra_isalpha(const char *s) __attribute__((unused));
static int vyra_isdigit(const char *s) __attribute__((unused));
static int vyra_isalnum(const char *s) __attribute__((unused));
static int vyra_isspace(const char *s) __attribute__((unused));
static int vyra_islower(const char *s) __attribute__((unused));
static int vyra_isupper(const char *s) __attribute__((unused));
static int vyra_isnumeric(const char *s) __attribute__((unused));
static int vyra_isdecimal(const char *s) __attribute__((unused));
static int vyra_isidentifier(const char *s) __attribute__((unused));
static int vyra_isprintable(const char *s) __attribute__((unused));
static double vyra_rand(void) { return (double)rand() / (double)RAND_MAX; }
static double vyra_len(const char *s) { return s ? (double)strlen(s) : 0.0; }
static double vyra_deg2rad(double d) { return d * 3.141592653589793 / 180.0; }
static double vyra_rad2deg(double r) { return r * 180.0 / 3.141592653589793; }
static double vyra_isinf(double x) { return isinf(x) ? 1.0 : 0.0; }
static double vyra_isnan(double x) { return isnan(x) ? 1.0 : 0.0; }
static double vyra_isfinite(double x) { return isfinite(x) ? 1.0 : 0.0; }
static double vyra_isnormal(double x) { return isnormal(x) ? 1.0 : 0.0; }
static double vyra_signbit(double x) { return signbit(x) ? 1.0 : 0.0; }
static double vyra_clamp(double x, double min, double max) { return x < min ? min : (x > max ? max : x); }
static double vyra_lerp(double a, double b, double t) { return a + (b - a) * t; }
static double vyra_map(double x, double in_min, double in_max, double out_min, double out_max) { return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min; }
static double vyra_typeof(double x) { (void)x; return 1.0; /* always number in VYRA */ }
static double vyra_type_of(double x) { (void)x; return 1.0; }
static double vyra_to_int(double x) { return (long long)x; }
static double vyra_to_float(double x) { return x; }
static double vyra_ord(const char *s) { return s && *s ? (double)(unsigned char)*s : 0.0; }
static double vyra_chr(int c) { return (double)(c & 0xFF); }
static double vyra_sum(double *arr, int n) { double s = 0; for (int i = 0; i < n; i++) s += arr[i]; return s; }
static double vyra_prod(double *arr, int n) { double p = 1; for (int i = 0; i < n; i++) p *= arr[i]; return p; }
static double vyra_mean(double *arr, int n) { if (n <= 0) return 0; double s = 0; for (int i = 0; i < n; i++) s += arr[i]; return s / n; }
static int vyra_cmp(const void *a, const void *b) { double da = *(const double*)a, db = *(const double*)b; return (da > db) - (da < db); }
static double vyra_median(double *arr, int n) { if (n <= 0) return 0; qsort(arr, n, sizeof(double), vyra_cmp); return arr[n/2]; }
static double vyra_stdev(double *arr, int n) { if (n <= 1) return 0; double m = vyra_mean(arr, n); double s = 0; for (int i = 0; i < n; i++) { double d = arr[i] - m; s += d * d; } return sqrt(s / (n - 1)); }
static double *vyra_sort(double *arr, int n) { qsort(arr, n, sizeof(double), vyra_cmp); return arr; }
static double *vyra_reverse(double *arr, int n) { for (int i = 0, j = n - 1; i < j; i++, j--) { double t = arr[i]; arr[i] = arr[j]; arr[j] = t; } return arr; }
static double *vyra_shuffle(double *arr, int n) { for (int i = n - 1; i > 0; i--) { int j = rand() % (i + 1); double t = arr[i]; arr[i] = arr[j]; arr[j] = t; } return arr; }
static double *vyra_range(double start, double stop, double step, int *out_n) { if (step == 0) { *out_n = 0; return NULL; } int n = (int)((stop - start) / step); if (n < 0) n = 0; double *arr = malloc(n * sizeof(double)); for (int i = 0; i < n; i++) arr[i] = start + i * step; *out_n = n; return arr; }
static double *vyra_enumerate(double *arr, int n, int *out_n) { *out_n = n * 2; double *res = malloc(*out_n * sizeof(double)); for (int i = 0; i < n; i++) { res[2*i] = i; res[2*i+1] = arr[i]; } return res; }
static double *vyra_zip(double *a, int na, double *b, int nb, int *out_n) { int n = na < nb ? na : nb; *out_n = n * 2; double *res = malloc(*out_n * sizeof(double)); for (int i = 0; i < n; i++) { res[2*i] = a[i]; res[2*i+1] = b[i]; } return res; }
static double vyra_any(double *arr, int n) { for (int i = 0; i < n; i++) if (arr[i]) return 1.0; return 0.0; }
static double vyra_all(double *arr, int n) { for (int i = 0; i < n; i++) if (!arr[i]) return 0.0; return 1.0; }
static long long vyra_abs_int(long long x) { return x < 0 ? -x : x; }
static int vyra_clz(unsigned int x) { if (x == 0) return 32; int n = 0; while ((x & 0x80000000) == 0) { x <<= 1; n++; } return n; }
static int vyra_ctz(unsigned int x) { if (x == 0) return 32; int n = 0; while ((x & 1) == 0) { x >>= 1; n++; } return n; }
static int vyra_popcount(unsigned int x) { int n = 0; while (x) { n += x & 1; x >>= 1; } return n; }
static long long vyra_min_int(long long a, long long b) { return a < b ? a : b; }
static long long vyra_max_int(long long a, long long b) { return a > b ? a : b; }
static long long vyra_gcd(long long a, long long b) { while (b) { long long t = b; b = a % b; a = t; } return a < 0 ? -a : a; }
static long long vyra_lcm(long long a, long long b) { return a == 0 || b == 0 ? 0 : (a / vyra_gcd(a, b)) * b; }
static long long vyra_factorial(int n) { if (n < 0) return 0; long long r = 1; for (int i = 2; i <= n; i++) r *= i; return r; }
static long long vyra_perm(int n, int k) { if (k < 0 || k > n) return 0; long long r = 1; for (int i = 0; i < k; i++) r *= (n - i); return r; }
static long long vyra_comb(int n, int k) { if (k < 0 || k > n) return 0; if (k > n - k) k = n - k; long long r = 1; for (int i = 1; i <= k; i++) r = r * (n - k + i) / i; return r; }
static long long vyra_sqrt_int(long long n) { if (n < 0) return 0; long long x = n; long long y = (x + 1) / 2; while (y < x) { x = y; y = (x + n / x) / 2; } return x; }
static long long vyra_isqrt(long long n) { return vyra_sqrt_int(n); }
static unsigned int vyra_bit_and(unsigned int a, unsigned int b) { return a & b; }
static unsigned int vyra_bit_or(unsigned int a, unsigned int b) { return a | b; }
static unsigned int vyra_bit_xor(unsigned int a, unsigned int b) { return a ^ b; }
static unsigned int vyra_bit_not(unsigned int a) { return ~a; }
static unsigned int vyra_bit_shl(unsigned int a, unsigned int b) { return a << b; }
static unsigned int vyra_bit_shr(unsigned int a, unsigned int b) { return a >> b; }
static int vyra_find(const char *s, const char *sub) { (void)s; (void)sub; return -1; }
static int vyra_rfind(const char *s, const char *sub) { (void)s; (void)sub; return -1; }
static int vyra_startswith(const char *s, const char *prefix) { (void)s; (void)prefix; return 0; }
static int vyra_endswith(const char *s, const char *suffix) { (void)s; (void)suffix; return 0; }
static int vyra_contains(const char *s, const char *sub) { (void)s; (void)sub; return 0; }
static int vyra_count(const char *s, const char *sub) { (void)s; (void)sub; return 0; }
static int vyra_isalpha(const char *s) { (void)s; return 0; }
static int vyra_isdigit(const char *s) { (void)s; return 0; }
static int vyra_isalnum(const char *s) { (void)s; return 0; }
static int vyra_isspace(const char *s) { (void)s; return 0; }
static int vyra_islower(const char *s) { (void)s; return 0; }
static int vyra_isupper(const char *s) { (void)s; return 0; }
static int vyra_isnumeric(const char *s) { (void)s; return 0; }
static int vyra_isdecimal(const char *s) { (void)s; return 0; }
static int vyra_isidentifier(const char *s) { (void)s; return 0; }
static int vyra_isprintable(const char *s) { (void)s; return 0; }
static double vyra_remquo(double x, double y) __attribute__((unused));
static double vyra_remquo(double x, double y) { int quo; (void)quo; return remainder(x, y); }

int main(void) {
    srand((unsigned)time(NULL));
    char *name = "";
    double age = 0;
    double counter = 0;
    double total = 0;
    double n = 0;
    char *msg = "";

    name = "Supreme";
    age = 13.0;
    printf("%s", "Hello,");
    printf(" ");
    printf("%s", name);
    printf("\n");
    printf("%s", "Age:");
    printf(" ");
    printf("%.15g", (double)(age));
    printf("\n");
    printf("%.15g", (double)(7.0 / 2.0));
    printf(" ");
    printf("%.15g", (double)(3.141592653589793));
    printf("\n");
    counter = 1.0;
    while (counter <= 6.0) {
        if (counter == 3.0) {
            printf("%s", "three!");
            printf("\n");
        }
        else if (counter > 4.0  &&  counter < 6.0) {
            printf("%s", "big");
            printf(" ");
            printf("%.15g", (double)(counter));
            printf("\n");
        }
        else {
            printf("%.15g", (double)(counter));
            printf("\n");
        }
        counter += 1.0;
        if (counter == 6.0) {
            break;
        }
    }
    total = 0.0;
    n = 1.0;
    while (n <= 10.0) {
        total += n;
        n = n + 1.0;
    }
    printf("%s", "sum 1..10 =");
    printf(" ");
    printf("%.15g", (double)(total));
    printf("\n");
    msg = name;
    printf("%s", msg);
    printf("\n");

    return 0;
}
