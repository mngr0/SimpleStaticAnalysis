package analyser;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import models.Environment;
import models.SemanticError;
import models.SimpleStmtBlock;
import models.SimpleVisitorImpl;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.SimpleLexer;
import parser.SimpleParser;

public class Analyse {

	public static void main(String[] args) {
		
		//read the input file from arguments or simply read it from console input
		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
		InputStream is = System.in;
		
		
		try{
			if (inputFile != null)
				is = new FileInputStream(inputFile);
			
			//this is the input stream for ANTLR
			ANTLRInputStream input = new ANTLRInputStream(is);
			
			//create lexer
			SimpleLexer lexer = new SimpleLexer(input);
			//create parser
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SimpleParser parser = new SimpleParser(tokens);
			
			//tell the parser to build the AST
			parser.setBuildParseTree(true);
			
			//build custom visitor
			SimpleVisitorImpl visitor = new SimpleVisitorImpl();
			
			//visit the root, this will recursively visit the whole tree
			SimpleStmtBlock p = (SimpleStmtBlock) visitor.visitBlock(parser.block());
			
			//check semantics
			//give a fresh environment, no need to make it persist
			//this is just semantic checking
			List<SemanticError> errors = p.checkSemantics(new Environment());
			
			//this means the semantic checker found some errors
			if(errors.size() > 0){
				System.out.println("Check semantics FAILED");			
				for(SemanticError err: errors)
					System.out.println(err);
			}else{
				System.out.println("Check semantics succeded");
			}
		/*}catch(RecognitionException e){
			System.out.println("Some errors where found in the parsing process");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
