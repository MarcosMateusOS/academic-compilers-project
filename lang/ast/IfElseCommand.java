package lang.ast;

import lang.interpreter.Visitor;

//IF OPEN_PARENT exp CLOSE_PARENT cmd ELSE cmd

public class IfElseCommand extends Command {
	private Command cmd;
	private Command cmdElse;
	private Exp exp;

	public IfElseCommand(int line, int col, Command cmd,Command cmdElse, Exp exp) {
		super(line, col);

		this.cmd = cmd;
		this.cmdElse = cmdElse;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "if ( " + exp.toString() + " ) " + cmd.toString() + " else " + cmdElse.toString();
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
	
	public Command getElsCmd() {
		return this.cmdElse;
	}

}