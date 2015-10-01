grammar Simple;

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


//IDs
fragment CHAR 	: 'a'..'z' |'A'..'Z' ;
ID              : CHAR (CHAR | DIGIT)* ;

//Numbers
fragment DIGIT	: '0'..'9';	
NUMBER          : DIGIT+;

//SCAPED SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMENTS 	: '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMENTS)* '*/' -> skip;
