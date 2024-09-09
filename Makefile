 all: build run

 build: 
		javac -d bin Codigo.java
		javac -d bin Biblioteca/*.java

 run: build
		javac -d bin Codigo.java

 clear:
		rm -r bin
