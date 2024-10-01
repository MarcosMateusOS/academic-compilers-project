/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/

package lang.semantic;

import lang.ast.Node;

public abstract class SType extends Node {
	public SType() {}
	
	public abstract boolean match(SType st);
}