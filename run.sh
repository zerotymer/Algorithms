#!/bin/sh

# build
# make file list
echo "find main &* ref java source files. and out put to sources.txt"
find src/ref -name *.java > sources.txt
find src/main -name *.java >> sources.txt
echo "compile java source files in sources.txt. and out put to target"
javac -classpath lib/* -d target @sources.txt
#javac-algs4 -d target ./src/$1/$2/*.java 

# run
echo "java -classpath target:lib/args4.jar $1 $2"
java -classpath target:lib/* $1 $2
#java-algs4 -classpath target $1 $2