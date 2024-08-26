package lang.ast;

import lang.interpreter.Visitor;

public class ReturnCommand extends Command {
    private Exp exp;


    public ReturnCommand(int line, int col, Exp exp) {
        super(line, col);
        this.exp = exp;
    }

    @Override
    public String toString() {
        return " return " + this.exp.toString() + " ; ";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    
    public Exp getExp() {
        return this.exp;
    }
}
