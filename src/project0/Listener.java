package project0;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Listener extends BaseErrorListener {

    private List<String> errors;
    private Path errorFile= Paths.get("./SyntaxErrors.txt");


    void writeErrors() throws IOException{
        if(errors.size()>0){
            if(!Files.exists(errorFile)) {
                Files.createFile(errorFile);
            }
            for (String error : errors){
                Files.write(errorFile,error.getBytes(), StandardOpenOption.APPEND);
                System.err.println(error);
            }


        }else{
            System.out.println("No syntax errors");
        }
    }
    public Listener() throws IOException {
        errors=new ArrayList<>();
        Files.deleteIfExists(errorFile);


    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object problem, int line, int positionInLine, String msg, RecognitionException e)  {
        String error= (msg + " in line "+line+" position "+positionInLine + "\n");
        errors.add(error);


    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

    }

}
