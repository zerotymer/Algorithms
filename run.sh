#!/bin/sh
# build
echo "javac ./src/my/$1/$2.java"
javac ./src/my/$1/$2.java
# run
echo "java -cp ./src/my/$1/* my.$1.$2"
java -cp ./src/my/$1/* my.$1.$2
