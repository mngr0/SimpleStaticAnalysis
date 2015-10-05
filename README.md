# SimpleStaticAnalysis
This is a demo implementation of the plumbery behind the static analysis of code. This project implements semantic analysis and resource usage analysis for a simplistic language called SIMPLE. This project is created with education purposes and it is an ongoing work.

# Short project description
The project shows the process of building a static analysis tool. Static analysis can be divided into two major parts: (i) syntax processing, which 
is done in this case automatically with the help of ANTLR (http://www.antlr.org/) and (ii) the analysis of the written code, this repository includes 
two side branches. The simplest one called SemanticAnalysis which presents a naive implementation that simply check that every variable in use is 
declared and has not been deleted. And a more complex one (although simplistic too) that performs cost analysis by counting the maximum
number of variables in use at the same time, and the number of variables that remain undeleted at the end of the program, it also calculates
the value of each expression and records those that have been passed as an argument to the <code>print</code> function.

# Long project description
The project uses an example language called <code>SIMPLE</code>. This language allows variable declaration, variable redefiniton and variable elimination. Variables can only be of <code>Integer</code> type, variables are declared by simply assigning an expression to an identifier. <code>SIMPLE</code> also allow standard arithmetical expressions which behave in the usual way, arithmetic expressions can use and be assigned to variables. The language, besides standard assignment operations, include the <code>delete</code> operation that allows to remove a variable from memory. And the <code>print</code> operation that allows to record the value of an expression given by argument. Finally the language allows nested blocks in which new variables can be declared, blocks allow to redefine variables already defined in outer blocks and give those a new value which will only be effective in the current and subsequent nested blocks. Variable elemination will remove the closest declared occurrence, without affecting previous occurrences of the variable.

<h2>SIMPLE Language Syntax</h2>
```antlr
block		: '{' statement* '}';

statement	: assignment ';' 
			| deletion ';' 
			| print ';'
			| block;

assignment	: ID '=' exp;

deletion	: 'delete' ID;

print		: 'print' exp;

exp			: '(' exp ')'							
			| '-' exp						
			| exp ('*' | '/') exp		
			| exp ('+' | '-') exp		
			| ID 								
		    | NUMBER								
```

<h2>SIMPLE Language Example</h2>
```csharp
{
 	a = 4; //variable a has value 4
	print a; //value 4 has been recorded
	{
		a = 2; //a is redefined
		print a; //value 2 has been recorded
		delete a; //a has been deleted
		print a; //value 4 has been recorded
	}
	delete a; //a has been deleted
	
	b = 4; //variable b has value 4
	print b * 2 + 4; //value 12 has been recorded
}
```

# Semantic Analysis
First analysis approach will check for correct variable usage, this means, (i) a variable needs to be declared before use (variable cannot appear on the right side of an assignment, or as an argument of an opertion without appearing on the left side of an assignmet first) (ii) variable cannot be used after being deleted (notice that <code>delete</code> removes only the closest declaration, so if another variable with the same name exist in an outer block, this won't be affected)

The branch <code>SemanticAnalysis</code> of the repository records the project state up to this task. 

<h2>Example</h2>
```csharp
{
 	a = 4; //variable a has value 4
	b = 4; //variable b has value 4 
	c = d + a; //ERROR: variable d doesn't exist
	{
		a = 2; //a is redefined
		print a; //value 2 has been recorded
		delete a; //a has been deleted
		delete b; //b has been deleted
		print a; //value 4 has been recorded
		print b; //ERROR: variable b has been deleted
	}
	delete a; //a has been deleted
}
```

# Behavior Inference
A more complicated analysis checks the behavior of a <code>SIMPLE</code> code. The aim is to extract a tuple in the form <code>[max, total, {<i>prints</i>}]</code> where:

element|description
-------|-----------------------------------------------------------------
max|<i>is the maximum number of variable that may exist at the same time</i>
total|<i>is the number of variables that remains undeleted after the end</i>
prints|<i>is the set of values that have been recorded through the </i><code>print</code> <i>operation</i>

The branch <code>Inference</code> of the repository records the project state up to this task. 

<h2>Example</h2>
```csharp
{
 	a = 4; //[1, 1, {}] -> one variable added
	print a + 2; //[1, 1, {6}] -> value 6 recorded
	{
		a = 2; //[2, 2, {6}] -> one variable added
		print a; //[2, 2, {6,2}] -> value 2 recorded
		delete a; //[2, 1, {6,2}] -> one variable removed
		print a; //[2, 1, {6,2,4}] -> value 4 recorded
	}
	delete a; //[2, 0, {6,2,4}] -> one variable removed
	b = 4; //[2, 1, {6,2,4}] -> one variable added
	print b * 2 + 4; //[2, 1, {6,2,4,12}] -> value 12 recorded
	
	
	//FINAL [2, 1, {6,2,4,12}]
	//maximum coexisting variables: 2
	//variables non deleted: 1
	//recorded values: 6, 2, 4 and 12
}
```
