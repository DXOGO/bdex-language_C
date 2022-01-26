grammar Secundaria;

@header {
package Secundaria;
}

main: header linha* EOF;

header: LETRAS ':' TIPO ('\t' LETRAS ':' TIPO)* ('\n')+;
linha: LETRAS ('\t' LETRAS)* ('\n')+;

TIPO: 'INT' | 'FLOAT' | 'STRING';
LETRAS: [ a-zA-Z0-9_.,@]+;
WS: [\r]+ -> skip;
//Gramática que descreva um ficheiro csv para guadar colunas, os seus tipos e dados