package lang.ast;

import lang.interpreter.Visitor;

public class FloatVal extends Exp {

	private float value;
	
	public FloatVal(int line, int col, float value) {
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
	
	public Float getValue() {
		return this.value;
	}

}