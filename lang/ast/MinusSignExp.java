package lang.ast;

import lang.interpreter.Visitor;

public class MinusSignExp extends Exp {
	private Exp exp;

	public MinusSignExp(int line, int col, Exp exp) {
		super(line, col);
		this.exp = exp;
	}

	@Override
	public String toString() {
		return " - " + this.exp.toString();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public Exp getExp() {
		return this.exp;
	}

}