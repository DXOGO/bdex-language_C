#!/bin/bash

pip install ./python/package
antlr4-build
jar cfm Compiler.jar Manifest.txt Primaria/*.class Secundaria/*.class template.stg
