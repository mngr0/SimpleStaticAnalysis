package analyser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import models.Environment;
import models.SemanticError;
import models.SimpleStmtBlock;
import models.SimpleVisitorImpl;


import models.behavior.BTBlock;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.Token;
import parser.Listener;
import parser.SimpleLexer;
import parser.SimpleParser;

public class Analyse0 {

    public static void main(String[] args) {

        String fileName = "test.spl";

        try{
            FileInputStream is = new FileInputStream(fileName);
            ANTLRInputStream input = new ANTLRInputStream(is);

            //create lexer
            SimpleLexer lexer = new SimpleLexer(input);



            //listener
            Listener listener = new Listener();
            lexer.removeErrorListeners();
            lexer.addErrorListener(listener);
            lexer.getAllTokens();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
