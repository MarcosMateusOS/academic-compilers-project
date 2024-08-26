package lang.ast;

import lang.interpreter.Visitor;

public abstract class Command extends Node {
  public Command(int line, int col) {
    super(line, col);
  }
  
  @Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
