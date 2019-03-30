grammar Simple;

// THIS IS THE PARSER INPUT 

block		: '{' statement* '}';

statement	: assignment ';'
			| deletion ';'
			| print ';'
			| declaration ';'   //TODO
		    | function          //TODO
            | ifthenelse        //TODO
			| block;

deletion	: DELETE ID;

print		: PRINT exp;

assignment	: ID '=' exp ;

function    : DEF ID '('(parameter(',' parameter)* ) ')' block  ;        //TODO

ifthenelse  : 'if' exp  block ('elif' exp block)* ('else' block)*; //TODO

declaration : type ID //TODO
            | type assignment; //TODO




parameter   : declaration           //TODO
            | VAR ID;              //TODO
    //        | 'var' assignment;     //TODO non sono sicuro che debba essere  accettabile

type        : BOOL    //TODO
            | INT;    //TODO


exp			: '(' exp ')'							#baseExp
			| '-' exp								#negExp
			| left=exp op=('*' | '/') right=exp		#binExp
			| left=exp op=('+' | '-') right=exp		#binExp
			| left=exp op=('or' | 'and') right=exp	#boolExp //TODO
			| ID 									#varExp
		    | NUMBER								#valExp;



// THIS IS THE LEXER INPUT


//IDs
fragment CHAR 	: 'a'..'z' |'A'..'Z' ;
DEF             : 'def' ;
DELETE          : 'delete';
PRINT           : 'print';
BOOL            : 'bool';
INT             : 'int';
VAR             : 'var';
ID              : CHAR (CHAR | DIGIT)* ;

//Numbers
fragment DIGIT	: '0'..'9';	
NUMBER          : DIGIT+;

//ESCAPE SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMMENTS 	: '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMMENTS)* '*/' -> skip;
