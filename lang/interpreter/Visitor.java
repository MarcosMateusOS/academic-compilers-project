/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/

package lang.interpreter;



import lang.ast.*;

public abstract class Visitor {
  public abstract void visit(Program p);


  public abstract void visit(Data d);
  public abstract void visit(Function f);
  public abstract void visit(Params p);
  public abstract void visit(DataDeclaration dd);
  
  public abstract void visit(IntType it);
  public abstract void visit(BoolType bt);
  public abstract void visit(CharType ct);
  public abstract void visit(FloatType ft);
  public abstract void visit(ArrayType at);
  public abstract void visit(NameType at);
  
 
  //CMD
  public abstract void visit(Command cm);
  public abstract void visit(CommandList cl);
  public abstract void visit(IfCommand ifc);
  public abstract void visit(IfElseCommand ifElsec);
  public abstract void visit(IterateCommand interatec);
  public abstract void visit(ReadCommand readc);
  public abstract void visit(PrintCommand printc);
  public abstract void visit(ReturnCommand returnc);
  public abstract void visit(ReturnMultCommand returnMultc);
  public abstract void visit(AssignCommand assignc);
  public abstract void visit(FunctionCall fc);
  
  //EXP
  public abstract void visit(AndExp andexp);
  public abstract void visit(LesserThanExp lesseThan);
  public abstract void visit(EqualityExp equalityExp);
  public abstract void visit(NotEqualExp notEqualExp);
  public abstract void visit(PlusExp plusExp);
  public abstract void visit(MinusExp minusExp);
  public abstract void visit(MultExp multExp);
  public abstract void visit(DivExp divExp);
  public abstract void visit(ModExp modExp);
  public abstract void visit(NotSignExp notSignExp);
  public abstract void visit(MinusSignExp minusSignExp);
  public abstract void visit(True t);
  public abstract void visit(False f);
  public abstract void visit(Null n);
  public abstract void visit(IntVal intval);
  public abstract void visit(FloatVal floatVal);
  public abstract void visit(CharVal charval);
  public abstract void visit(ParenExp parenExp);
  public abstract void visit(NewTypeExp newexp);
  public abstract void visit(ArrayAccess arrayAccess);
  public abstract void visit(FuncReturnExp funReturnExp);
  
  
  public abstract void visit(LValue Lvalue);
  public abstract void visit(IDLValue idLvalue);
  public abstract void visit(DotLValue dotLvalue);
  
  public abstract void visit(FunCallParams fcp);
  
  
  


  
}
