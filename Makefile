CC ?= gcc
CFLAGS ?= -Wall -Wextra -O2

.PHONY: all clean test ui-test
all: vyra

vyra: vyra.c
	$(CC) $(CFLAGS) vyra.c -o vyra -lm

test: vyra
	sh tests/smoke.sh

ui-test:
	node tests/ui-smoke.js

clean:
	rm -f vyra output.c main
