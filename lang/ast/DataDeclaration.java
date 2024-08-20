package lang.ast;

import lang.interpreter.Visitor;

public class DataDeclaration extends Node {
  String id;
  Type type;

  public DataDeclaration(int line, int col,String id, Type type) {
    super(line, col);
    this.id = id;
    this.type = type;
  }

  public String getId() {
    return id;
  }

  public Type getType() {
    return type;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

  @Override
  public String toString() {
    return id + " :: " + type.toString() + "; ";
  }
}
  

