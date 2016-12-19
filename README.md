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
# Running the project
In order to run the project simply run the main program from class <code>Analyse</code>. The program gives the option to insert in the command line the name of the spl file (a program written in SIMPLE language) to analyse. Alternatively a run configuration may be created in order to automatize this process. The project includes a SIMPLE program file for testing featuring the same example described above.

# ANTLR development features
The code of the <code>Analyse</code> shows how to interact with the classes autogenerated by the ANTLR tool. To learn how to integrate the ANTLR development tools into your prefferred IDE follow the directions specified here: http://www.antlr.org/tools.html.

In my case I have used Eclipse IDE to create the project. The configuration of ANTLR tools in Eclipse is described in detail here: https://github.com/antlr4ide/antlr4ide

NOTE: in addition of the ANTLR tools configuration you may need to configure the project specific ANTLR settings in order to manage stuff like the location of the ANTLR generated files and the parameters passed to ANTLR in the automatic generation process. To configure the ANTLR project specific settings go to: Project Properties > ANTLR 4 (ensure to check the box for allowing project specific settings rather than workspace specific) > Tool > Options
once there you can set (in the case of this project) the output folder as "Directory = ./src" and also check the "Generate parse tree visitors (-visitor)" option.

NOTE 2: ANTLR Tools allows also to debug the Grammar defined in the .g4 file (See ./src/parser/simple.g4) in order to debug the grammar productions step the cursor over the desired rule and then go to Window > Show View > Other > ANTLR 4 > Parse Tree, a new Eclipse window will show up allowing to test the selected Grammar rule against a custom input.
