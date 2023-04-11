#!/bin/sh

# build
# make file list
echo "find src/$1 -name *.java > sources.txt"
find src/$1 -name *.java > sources.txt
echo "javac -classpath lib/* -d target @sources.txt"
javac -classpath lib/* -d target @sources.txt
#javac-algs4 -d target ./src/$1/$2/*.java 

# run
echo "java -classpath target:lib/args4.jar $2 $3"
java -classpath target:lib/* $2 $3 
#java-algs4 -classpath target $1.$2.$3 $4