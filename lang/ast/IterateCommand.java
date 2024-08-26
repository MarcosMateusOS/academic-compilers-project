package lang.ast;

import lang.interpreter.Visitor;

public class IterateCommand extends Command {
    private Exp exp;
    private Command cmd;

    public IterateCommand(int line, int col, Exp exp, Command cmd) {
        super(line, col);
        this.exp = exp;
        this.cmd = cmd;
    }

    @Override
    public String toString() {
        return "iterate (" + this.exp.toString() + ") " + this.cmd.toString();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public Exp getExp() {
    	return this.exp;
    }
    
    public Command getCommand() {
    	return this.cmd;
    }
}
