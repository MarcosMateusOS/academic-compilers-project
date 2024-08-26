package lang.interpreter;

import lang.ast.SuperNode;


// Adaptador para classe de parser. a Função parseFile deve retornar null caso o parser resulte em erro. 

public interface InterpreterAdaptor{
   public abstract SuperNode parseFile(String path) ;
   
}


