package lang.ast;

import lang.interpreter.Visitor;

public class IntVal extends Exp {

	private int value;

	public IntVal(int line, int col, int value) {
		super(line, col);
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + value;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public Integer getValue() {
		return this.value;
	}

}