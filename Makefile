SRC=$(shell ls *.java)
SRC_CLASS=${SRC:.java=.class}

.PHONY: all
all: run

.PHONY: run
run: ${SRC_CLASS}
	java -cp . Main

%.class:
	javac $*.java

.PHONY: clean
clean:
	$(RM) ${SRC_CLASS}
