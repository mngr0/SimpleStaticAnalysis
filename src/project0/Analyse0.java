package project0;

import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import parser.SimpleLexer;

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
            listener.writeErrors();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
