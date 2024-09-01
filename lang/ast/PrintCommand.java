package lang.ast;

import lang.interpreter.Visitor;

public class PrintCommand extends Command {
    private Exp exp;


    public PrintCommand(int line, int col, Exp exp) {
        super(line, col);
        this.exp = exp;
    }

    @Override
    public String toString() {
        return " print " + this.exp.toString() + " ; ";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public Exp getExp() {
    	return this.exp;
    }
}
