package lang.ast;

import lang.interpreter.Visitor;

//Regra: IF OPEN_PARENT exp CLOSE_PARENT cmd #IfCommand

public class IfCommand extends Command {
	private Command cmd;
	private Exp exp;

	public IfCommand(int line, int col, Command cmd, Exp exp) {
		super(line, col);

		this.cmd = cmd;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "if ( " + exp.toString() + " ) " + cmd.toString();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public Exp getExp() {
		return this.exp;
	}
	
	public Command getCmd() {
		return this.cmd;
	}
	
	

}