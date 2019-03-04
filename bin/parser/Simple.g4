grammar Simple;

// THIS IS THE PARSER INPUT 

block		: '{' statement* '}';

statement	: assignment ';' 
			| deletion ';' 
			| print ';'
			| block;

assignment	: ID '=' exp;

deletion	: 'delete' ID;

print		: 'print' exp;



exp			: '(' exp ')'							#baseExp
			| '-' exp								#negExp
			| left=exp op=('*' | '/') right=exp		#binExp
			| left=exp op=('+' | '-') right=exp		#binExp
			| ID 									#varExp	
		    | NUMBER								#valExp;


// THIS IS THE LEXER INPUT

//IDs
fragment CHAR 	: 'a'..'z' |'A'..'Z' ;
ID              : CHAR (CHAR | DIGIT)* ;

//Numbers
fragment DIGIT	: '0'..'9';	
NUMBER          : DIGIT+;

//ESCAPE SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMMENTS 	: '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMMENTS)* '*/' -> skip;
