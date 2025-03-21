package lang.ast;

import lang.interpreter.Visitor;

//Regra: lvalue OPEN_BRACKET exp CLOSE_BRACKET #ArrayAccess
public class ArrayAccess extends LValue{
	private LValue lvalue;
	private Exp exp;

	public ArrayAccess(int line, int col, LValue lvalue, Exp exp) {
		super(line, col);
		
		this.exp = exp;
		this.lvalue = lvalue;
	}

	@Override
	public String toString() {
		return lvalue.toString() + " [ " + exp.toString() + " ] ";
		
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	
	public String getID() {
		return this.lvalue.getID();
	}
	
	public Exp getExp() {
		return this.exp;
	}
	
	public LValue getLValue() {
		return this.lvalue;
	}


}