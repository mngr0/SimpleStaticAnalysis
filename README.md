# SimpleStaticAnalysis
This is a demo implementation of the plumbery behind the static analysis of code. This project implements semantic analysis and resource usage analysis for a simplistic language called SIMPLE. This project is created with education purposes and it is an ongoing work.

# Short project description
The project shows the process of building a static analysis tool. Static analysis can be divided into two major parts: (i) syntax processing, which 
is done in this case automatically with the help of ANTLR (http://www.antlr.org/) and (ii) the analysis of the written code, this repository includes 
two side branches. The simplest one called SemanticAnalysis which presents a naive implementation that simply check that every variable in use is 
declared and has not been deleted. And a more complex one (although simplistic too) that performs cost analysis by counting the maximum
number of variables in use at the same time, and the number of variables that remain undeleted at the end of the program, it also calculates
the value of each expression and records those that have been passed as an argument to the <code>print</code> function.
