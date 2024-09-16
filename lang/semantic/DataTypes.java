package lang.semantic;

import java.util.ArrayList;

public class DataTypes {
	private String name;
	private ArrayList<String> varNames;
	private ArrayList<SType> varTypes;

	public DataTypes(String name, ArrayList<String> varNames, ArrayList<SType> varTypes) {
		this.name = name;
		this.varNames = varNames;
		this.varTypes = varTypes;
	}

	public ArrayList<String> getVarName() {
		return this.varNames;
	}

	public ArrayList<SType> getVarTypes() {
		return this.varTypes;
	}
}