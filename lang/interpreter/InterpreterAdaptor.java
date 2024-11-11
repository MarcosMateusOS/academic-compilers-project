/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/

package lang.interpreter;

import lang.ast.SuperNode;


public interface InterpreterAdaptor{
   public abstract SuperNode parseFile(String path) ;
   
}


