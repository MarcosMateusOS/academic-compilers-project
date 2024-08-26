package lang.ast;

import lang.interpreter.Visitor;

public class DotLValue extends LValue {
	
	private LValue lvalue;
	private String id;
	
	
	public DotLValue(int line, int col, LValue lvalue, String id) {
		super(line, col);
		this.lvalue = lvalue;
		this.id = id;
	}

	@Override
	public String toString() {
		return lvalue.toString() + " . " + id.toString();
		
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String getID() {
		return lvalue.getID();
	}

}