
package lang.ast;

import lang.interpreter.Visitor;

//Regra :<assoc=left> exp AND_SIGN rexp                #AndExp
public class AndExp extends BinOp {
	//Regra :<assoc=left> exp AND_SIGN rexp                #AndExp
	public AndExp(int line, int col, Exp left, Exp right) {
		super(line, col, left, right);
	}

	@Override
	public String toString() {
		// transformar em string para o log
		return (left.toString() + " && " + right.toString());
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}