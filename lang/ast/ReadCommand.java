package lang.ast;

import lang.interpreter.Visitor;

//Regra: | READ lvalue SEMICOLON #ReadCommand
public class ReadCommand extends Command {
    private LValue lvalue;


    public ReadCommand(int line, int col, LValue lvalue) {
        super(line, col);
        this.lvalue = lvalue;
    }

    @Override
    public String toString() {
        return " read " + lvalue.toString() + " ; ";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public LValue getLValue() {
    	return this.lvalue;
    }
    
}
