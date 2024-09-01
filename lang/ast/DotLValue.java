package lang.ast;

import lang.interpreter.Visitor;

public class DotLValue extends LValue {
	
	private LValue lvalue;
	private String id;
	private String dataName;
	
	
	public DotLValue(int line, int col, LValue lvalue, String id, String dataName) {
		super(line, col);
		this.lvalue = lvalue;
		this.id = id;
		this.dataName = dataName;
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
		return id;
	}
	
	public String getData() {
		return this.dataName;
	}
	

	
	public LValue getLValue() {
		return this.lvalue;
	}
	

}