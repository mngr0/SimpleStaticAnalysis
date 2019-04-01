grammar Simple;

// THIS IS THE PARSER INPUT 


block		: '{' statement* '}';

statement	: assignment ';'
			| deletion ';'
			| print ';'
			| declaration ';'
		    | function
            | ifthenelse
			| block;

ifthenelse  : IF exp  block (ELIF exp block)* (ELSE block)?;


deletion	: DELETE ID;

print		: PRINT exp;

assignment	: ID '=' exp ;

function    : DEF ID '('(parameter(',' parameter)* )? ')' block  ;


parameter   : (VAR)? declaration;


declaration : type (ID | assignment )  ;






type        : BOOL
            | INT;


exp			: '(' exp ')'							#baseExp
			| '-' exp								#negExp
			| NOT exp                               #notExp
			| left=exp op=('*' | '/') right=exp		#binExp
			| left=exp op=('+' | '-') right=exp		#binExp
			| left=exp op=('or' | 'and') right=exp	#boolExp
			| ID 									#varExp
		    | NUMBER								#valExp
		    | BOOLS                                 #boolsExp;



// THIS IS THE LEXER INPUT


//IDs
fragment CHAR 	: 'a'..'z' |'A'..'Z' ;
IF              : 'if';
ELIF            : 'elif';
ELSE            : 'else';

DEF             : 'def' ;
DELETE          : 'delete';
PRINT           : 'print';
BOOL            : 'bool';
INT             : 'int';
VAR             : 'var';
BOOLS           : 'True'
                | 'False';
NOT             : 'not';
ID              : CHAR (CHAR | DIGIT)* ;

//Numbers
fragment DIGIT	: '0'..'9';	
NUMBER          : DIGIT+;

//ESCAPE SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMMENTS 	: '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMMENTS)* '*/' -> skip;
