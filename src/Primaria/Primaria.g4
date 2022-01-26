grammar Primaria;

@header {
package Primaria;
}

program: command*;

command:
	expr ';'		# SingleCommand
	| ifcommand		# IfCommand
	| whilecommand	# WhileCommand
	| forcommand	# ForCommand
	| defcommand	# FuncCommand;

ifcommand:
	'if' expr commandBlock ('else' 'if' expr commandBlock)* (
		'else' elseBlock = commandBlock
	)?;

whilecommand: 'while' expr commandBlock;

forcommand: 'for' Variavel 'in' expr commandBlock;

defcommand:
	'def' funcName = Variavel '(' (Variavel (',' Variavel)*)? ')' commandBlock;

commandBlock: '{' program '}';

expr:
	expr '[' expr ']'	# SelectExpr
	| expr '<' expr '>'	# SelectColExpr
	| 'str_val' expr	# StrValCommandExpr
	| 'size' expr		# SizeCommandExpr
	| expr op = (
		'=='
		| '!='
		| '<'
		| '>'
		| '<='
		| '>='
		| '^'
		| '*'
		| '/'
		| '%'
		| '+'
		| '-'
	) expr											# OperationExpr
	| Variavel '(' (expr (',' expr)*)? ')'			# FuncCallExpr
	| '(' expr ')'									# PriorExpr
	| '{' keyValue (',' keyValue)* '}'				# TableDefExpr
	| '(' expr ',' (expr (',' expr)*)? ')'			# SimpleTupleExpr
	| '(' keyValue (',' keyValue)* ')'				# KVTupleExpr
	| Variavel '=' expr								# InitCommandExpr
	| '[' expr ']'									# RefColExpr
	| 'set' expr 'to' expr							# SetCommandExpr
	| 'add' expr 'to' Variavel						# AddCommandExpr
	| 'first' expr									# FirstLineExpr
	| 'sort' expr 'by' expr dir = ('asc' | 'desc')?	# SortCommandExpr
	| 'pop' Int 'from' expr							# PopCommandExpr
	| 'check' expr 'with' expr						# CheckCommandExpr
	| 'del' expr									# DelCommandExpr
	| 'print' expr									# PrintCommandExpr
	| 'read_str'									# ReadStrCommandExpr
	| 'read_int'									# ReadIntCommandExpr
	| 'read_real'									# ReadRealCommandExpr
	| 'break'										# BreakCommandExpr
	| 'return' expr									# ReturnCommandExpr
	| 'import' expr									# ImportCommandExpr
	| 'export' expr									# ExportCommandExpr
	| 'true'										# TrueExpr
	| 'false'										# FalseExpr
	| Int											# IntValue
	| Real											# RealValue
	| String										# StrValue
	| Tipo											# TipoExpr
	| Variavel										# VarValue;

keyValue: String ':' expr;

Int: [0-9]+;
Real: [0-9]+ '.' [0-9]+;
String: '"' .*? '"';
Variavel: [a-z][a-zA-Z0-9_]*;
Tipo: 'Int' | 'Real' | 'String';
WS: [ \t\r\n] -> skip;
LineComment: '//' .*? '\n' -> skip;
MultilineComment: '/*' .*? '*/' -> skip;