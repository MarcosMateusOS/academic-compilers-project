package lang.ast;

import lang.interpreter.Visitor;

//Regra: | INT_VAL                          #IntVal
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