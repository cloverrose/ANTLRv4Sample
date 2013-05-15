ANTLR v4 Sample
===============

Install ANTLR v4
----------------

    cd /usr/local/lib
    wget http://antlr4.org/download/antlr-4.0-complete.jar
    export CLASSPATH=".:/usr/local/lib/antlr-4.0-complete.jar:$CLASSPATH"
    alias antlr4='java -jar /usr/local/lib/antlr-4.0-complete.jar'
    alias grun='java org.antlr.v4.runtime.misc.TestRig'

Run Sample
----------

    git clone https://github.com/cloverrose/ANTLRv4Sample.git
    cd ANTLRv4Sample
    antlr4 Sample.g4
    javac *.java
    java Main


