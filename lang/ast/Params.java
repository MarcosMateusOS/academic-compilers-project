package lang.ast;

import java.util.ArrayList;
import java.util.List;

import lang.interpreter.Visitor;

public class Params extends Node {

	// fun: ID OPEN_PARENT params? CLOSE_PARENT (COLON type (COMMA type)*)?
	// OPEN_BRACE cmd* CLOSE_BRACE #Function ;

	private List<String> ids;
	private List<Type> types;

	public Params(int line, int col, List<String> ids, List<Type> types) {
		super(line, col);
		this.ids = ids;
		this.types = types;
	}

	public Params(int line, int col) {
		super(line, col);
		this.ids = new ArrayList<String>();
		this.types = new ArrayList<Type>();
	}

	public void setIDs(List<String> ids) {
		this.ids = ids;
	}

	public void setTypes(List<Type> types) {
		this.types = types;
	}
	
	public void addID(String id) {
		this.ids.add(id);
	}

	public void addType(Type type) {
		this.types.add(type);
	}

	public List<String> getIDs() {
		return this.ids;
	}

	public List<Type> getTypes() {
		return this.types;
	}

	@Override
	public String toString() {
		String paramsSTR = "";

		for (int i = 0; i < ids.size(); i++) {
			paramsSTR += ids.get(i).toString() + " : " + types.get(i).toString() + ", ";
		}

		return paramsSTR;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}