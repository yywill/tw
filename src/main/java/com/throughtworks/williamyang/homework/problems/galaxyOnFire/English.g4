/*
glob is I
prok is V
pish is X
tegj is L
glob glob Silver is 34 Credits
glob prok Gold is 57800 Credits
pish pish Iron is 3910 Credits
how much is pish tegj glob glob ?
how many Credits is glob prok Silver ?
how many Credits is glob prok Gold ?
how many Credits is glob prok Iron ?
how much wood could a woodchuck chuck if a woodchuck could chuck wood ?
*/
grammar English ;

options {
	language = Java;
}

IS: 'is';
ROMAN: 'I'|'V'|'X'|'L'|'C'|'D'|'M' ;
CEDITS: 'Credits';
OBJECTS: 'Silver'|'Gold'|'Iron';
HOWMANY: 'how many';
HOWMUCH: 'how much';
Q: '?';
DECIMAL : '-'?[0-9]+('.'[0-9]+)? ;
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]* ;
NEWLINE: '\r'?'\n';
WC : (' '|'\t'|'\n'|'\r')+ {skip() ;};
QUANTANTY: IDENTIFIER+;
parse: (assignment|pricing|question)* ;

assignment:  IDENTIFIER IS ROMAN NEWLINE;
pricing: IDENTIFIER+ OBJECTS IS DECIMAL CEDITS NEWLINE;
question: ( (HOWMUCH IS IDENTIFIER+  Q)| (HOWMANY CEDITS IS IDENTIFIER+ OBJECTS  Q) ) NEWLINE;



