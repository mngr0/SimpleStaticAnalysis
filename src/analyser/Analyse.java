package analyser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import models.*;


import models.behavior.BTBlock;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.SimpleLexer;
import parser.SimpleParser;

public class Analyse {

	public static void main(String[] args) {
		
		String fileName = "test.spl";
		
		try{   
			FileInputStream is = new FileInputStream(fileName);
			ANTLRInputStream input = new ANTLRInputStream(is);

			//create lexer
			SimpleLexer lexer = new SimpleLexer(input);
			
			//create parser
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SimpleParser parser = new SimpleParser(tokens);


			//listener
			parser.removeParseListeners();
			lexer.removeErrorListeners();

			//tell the parser to build the AST
			parser.setBuildParseTree(true);
			
			//build custom visitor
			SimpleVisitorImpl visitor = new SimpleVisitorImpl();

			//visit the root, this will recursively visit the whole tree

			SimpleStmtBlock mainBlock = (SimpleStmtBlock) visitor.visitBlock(parser.block());

			//check semantics
			//give a fresh environment, no need to make it persist
			//this is just semantic checking
			List<SemanticError> errors = mainBlock.checkSemantics(new Environment());
			
			//this means the semantic checker found some errors
			if(errors.size() > 0){
				System.out.println("Check semantics FAILED");			
				for(SemanticError err: errors)
					System.out.println(err);
			}else{
				System.out.println("Check semantics succeded");
				System.out.println("Calculating behavioral type");
				
				//give a fresh environment, no need to make it persist
				BTBlock res = (BTBlock)mainBlock.inferBehavior(new Environment());
				
				System.out.println(res.toString());
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
