package lang.semantic;

import lang.ast.Node;

public abstract class SType extends Node {
	public SType() {}
	
	public abstract boolean match(SType st);
}