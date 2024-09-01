package lang.ast;

import java.util.ArrayList;
import java.util.List;

import lang.interpreter.Visitor;

//Regra : ID OPEN_PARENT params? CLOSE_PARENT (COLON type (COMMA type)*)? OPEN_BRACE cmd* CLOSE_BRACE #Function;
public class Function extends Node {

	// fun: ID OPEN_PARENT params? CLOSE_PARENT (COLON type (COMMA type)*)?
	// OPEN_BRACE cmd* CLOSE_BRACE #Function ;

	private String ID;
	private Params params;
	private List<Command> commands;
	private List<Type> returnTypes;

	public Function(int line, int col, String ID, Params params, List<Command> commands, List<Type> returnTypes) {
		super(line, col);
		this.ID = ID;
		this.params = params;
		this.commands = commands;
		this.returnTypes = returnTypes;
	}
	
	public Function(int line, int col, String ID) {
		super(line, col);
		this.ID = ID;
		this.params = new Params(line,col);
		this.commands = new ArrayList<Command>();
		this.returnTypes = new ArrayList<Type>();
	}


	@Override
	public String toString() {
		String functionSTR = ID.toString() + "(" + params.toString();

		if (returnTypes.size() > 0) {
			functionSTR += ") : ";
			for (int i = 0; i < returnTypes.size() - 1; i++) {
				String typeAux = returnTypes.get(i).toString();
				functionSTR += typeAux.toString() + ", ";
			}
			functionSTR += returnTypes.get(returnTypes.size() - 1).toString();
		} else {
			functionSTR += ")";
		}
		functionSTR += "{\n";
		for (Command command : commands) {
			functionSTR += command.toString() + "\n";
		}
		functionSTR += " } ";

		return functionSTR;

	}
	
	public void setParams(Params pms) {
		this.params = pms;
	}
	
	
	public void addReturnType(Type type) {
		this.returnTypes.add(type);
	}
	
	public void addCommand(Command cmd) {
		this.commands.add(cmd);
	}
	
	public String getID() {
		return this.ID;
	}
	
	public Params getParams() {
		return this.params;
	}
	
	public List<Command> getCommands() {
		return this.commands;
	}
	
	public Integer returnSize() {
		return this.returnTypes.size();
	}
	
	public List<Type> returnReturnTypes() {
		return this.returnTypes;
	}
	
	


	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}