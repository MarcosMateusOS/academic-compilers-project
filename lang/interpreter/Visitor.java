package lang.interpreter;


import lang.ast.Data;
import lang.ast.DataDeclaration;
import lang.ast.Program;

public abstract class Visitor {
  public abstract void visit(Program p);


  public abstract void visit(Data d);
  public abstract void visit(DataDeclaration dd);



  
}
