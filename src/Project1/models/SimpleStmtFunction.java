package Project1.models;

import models.Environment;
import models.SemanticError;
import models.SimpleStmt;
import models.SimpleStmtBlock;
import models.behavior.BTAtom;
import models.behavior.BTBase;

import java.util.LinkedList;
import java.util.List;

public class SimpleStmtFunction extends SimpleStmt {

    SimpleStmtBlock block;
    List<SimpleStmt> parameters;
    String id;


    public SimpleStmtFunction(SimpleStmtBlock block, String id, List<SimpleStmt> parameters) {
        this.block = block;
        this.id = id;
        this.parameters=parameters;
    }

    @Override
    public List<SemanticError> checkSemantics(Environment e) {

        return null;

    }

    @Override
    public BTBase inferBehavior(Environment e) {

        return null;
    }

}
