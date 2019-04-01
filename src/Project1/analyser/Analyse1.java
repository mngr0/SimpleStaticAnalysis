package Project1.analyser;

import models.Environment;
import models.SemanticError;
import models.SimpleStmtBlock;
import models.SimpleVisitorImpl;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.SimpleLexer;
import parser.SimpleParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@SuppressWarnings("Duplicates")
public class Analyse1 {

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


			parser.setBuildParseTree(true);
			
			//build custom visitor
			SimpleVisitorImpl visitor = new SimpleVisitorImpl();

			//visit the root, this will recursively visit the whole tree

			visitor.visitBlock(parser.block());


			System.out.println("Number of functions: "+visitor.getCountFunctions());
			boolean result=true;
			for(Map.Entry<String,Integer> entry : visitor.getTable().entrySet()){
				if(entry.getValue()>1){
					result=false;
				}
			}
			System.out.println("No repetitions of variables: "+ result);




		/*}catch(RecognitionException e){
			System.out.println("Some errors where found in the parsing process");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());*/
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
