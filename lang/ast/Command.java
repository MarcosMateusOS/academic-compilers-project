package lang.ast;

import lang.interpreter.Visitor;

// Classe abstrata para representar regras de comando.
public abstract class Command extends Node {
  public Command(int line, int col) {
    super(line, col);
  }
  
  @Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
