
EXEC_PATH=testbot

CC=gcc

OBJS=testbot.o

CFLAGS+=-Wall -g -O0 -std=gnu99

CFLAGS+=-I../SATDLL/SATDLL/header

CFLAGS+=$(shell pkg-config --cflags glib-2.0)

LIBS+=-L. -lSATDLL
LIBS+=$(shell pkg-config --libs glib-2.0)

%.o: %.c
	$(CC) -c $(CFLAGS) $< -o $@

all: $(OBJS)
	$(CC) $(OBJS) $(LIBS) -o $(EXEC_PATH)

clean:
	rm -f $(OBJS)
	rm -f *~
	rm -f $(EXEC_PATH)

clean_res:
	rm -rf res_*


