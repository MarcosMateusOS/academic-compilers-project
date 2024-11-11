package lang.ast;

import lang.interpreter.Visitor;

//Regra: |<assoc=left> rexp EQUALITY_SIGN aexp          #EqualityExp
public class EqualityExp extends BinOp {

	public EqualityExp(int line, int col, Exp left, Exp right) {
		super(line, col, left, right);
	}

	@Override
	public String toString() {
		return (left.toString() + " == " + right.toString());
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}