package lang.ast;

import java.util.ArrayList;
import java.util.List;

import lang.interpreter.Visitor;

public class ReturnMultCommand extends Command {
    private List<Exp> exps;


    public ReturnMultCommand(int line, int col, List<Exp> exp) {
        super(line, col);
        this.exps = exp;
    }
    
    public ReturnMultCommand(int line, int col) {
        super(line, col);
        this.exps = new ArrayList<Exp>();
    }


    @Override
    public String toString() {
    	String returnStr = " return ";
    	
    	for(Exp exp : this.exps) {
    		returnStr += exp.toString() + ", ";
    	}
    		
    	returnStr += ";";
    	
        return returnStr;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public List<Exp> getExps() {
        return this.exps;
    }
}
