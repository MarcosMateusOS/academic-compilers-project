/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/
package lang.semantic;

import java.util.List;

public class FuncTypes extends SType {
	private String funcName;
	private List<SType> parametersTypes; // tipos dos parametros
	private List<String> nameParams; // nome dos parametros
	private List<SType> returnTypes; // tipos dos retornos

	public FuncTypes(List<SType> t, List<SType> returnTypes) {
		this.parametersTypes = t;
		this.returnTypes = returnTypes;
	}

	public FuncTypes(List<SType> t, List<SType> returnTypes, List<String> nameParams, String funcName) {
		this.parametersTypes = t;
		this.returnTypes = returnTypes;
		this.nameParams = nameParams;
		this.funcName = funcName;
	}

	public List<SType> getTypes() {
		return this.parametersTypes;
	}

	public List<SType> getReturnType() {
		return this.returnTypes;
	}

	public List<String> getTypesName() {
		return nameParams;
	}

	@Override
	public boolean match(SType st) {
		boolean matched = false;

		if (st instanceof FuncTypes) {
			FuncTypes fcTypes = (FuncTypes) st;

			;
			if (fcTypes.getTypes().size() == this.parametersTypes.size()) {
				matched = true;

				for (int i = 0; i < parametersTypes.size(); i++) {
					matched = matched && this.parametersTypes.get(i).match(fcTypes.getTypes().get(i));
				}

			}
		}
		
		return matched;
	}

}
