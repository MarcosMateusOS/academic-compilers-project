package lang.ast;

import lang.interpreter.Visitor;

//Regra: |<assoc=left> rexp NOT_EQUAL_SIGN aexp         #NotEqualExp
public class NotEqualExp extends BinOp {

	public NotEqualExp(int line, int col, Exp left, Exp right) {
		super(line, col, left, right);
	}

	@Override
	public String toString() {
		return (left.toString() + " != " + right.toString());
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}