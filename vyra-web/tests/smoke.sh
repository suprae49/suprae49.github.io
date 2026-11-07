#!/bin/sh
set -eu
ROOT=$(CDPATH= cd -- "$(dirname -- "$0")/.." && pwd)
TMP=$(mktemp -d)
trap 'rm -rf "$TMP"' EXIT HUP INT TERM

cd "$TMP"
"$ROOT/vyra" run "$ROOT/demo.vy" > actual.txt
diff -u "$ROOT/tests/expected-demo.txt" actual.txt

"$ROOT/vyra" "$ROOT/demo.vy" > /dev/null
gcc -Wall -Wextra -Werror -std=c11 output.c -lm -o generated-program
./generated-program > generated.txt
diff -u "$ROOT/tests/expected-demo.txt" generated.txt

cat > invalid.vy <<'VYRA'
print(unknown_variable)
VYRA
if "$ROOT/vyra" run invalid.vy > /dev/null 2> invalid.err; then
  echo "Expected undefined-variable program to fail" >&2
  exit 1
fi
grep -q "Undefined variable: unknown_variable" invalid.err

echo "VYRA smoke tests passed."
