 all: build run

config:
	

 build: 
		javac -d bin Main.java
		javac -d bin Biblioteca/*.java

 run: build
		javac -d bin Main.java

 clear:
		rm -r bin
