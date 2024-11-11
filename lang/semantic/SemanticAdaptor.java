/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/

package lang.semantic;

import lang.ast.SuperNode;


public interface SemanticAdaptor{
   public abstract SuperNode parseFile(String path) ;
   
}


