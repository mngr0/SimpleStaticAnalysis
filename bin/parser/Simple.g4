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

assignment	: ID '=' exp ;

deletion	: 'delete' ID;

print		: 'print' exp;

declaration : type ID //TODO
            | type assignment; //TODO

type        : 'bool'    //TODO
            | 'int';    //TODO

parameter   : declaration           //TODO
            | 'var' ID              //TODO
            | 'var' assignment;     //TODO

function    : 'func' ID '('(parameter(',' parameter)* ) ')' block  ;        //TODO MANCA IL NOME

ifthenelse  : 'if' exp  block ('elif' exp block)* ('else' exp block)*; //TODO


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
ID              : CHAR (CHAR | DIGIT)* ;

//Numbers
fragment DIGIT	: '0'..'9';	
NUMBER          : DIGIT+;

//ESCAPE SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMMENTS 	: '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMMENTS)* '*/' -> skip;
