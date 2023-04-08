#!/bin/sh

# build
echo "javac -classpath lib/* -d target ./src/$1/$2/*.java"
javac -classpath lib/*:src/$1/$2/* -d target src/$1/$2/*.java 
#javac-algs4 -d target ./src/$1/$2/*.java 

# run
echo "java -classpath target:lib/args4.jar $1.$2.$3 $4"
echo ""
echo ""
java -classpath target:lib/* $1.$2.$3 $4
#java-algs4 -classpath target $1.$2.$3 $4
