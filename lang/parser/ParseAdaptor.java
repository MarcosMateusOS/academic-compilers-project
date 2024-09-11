/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/

package lang.parser;

import lang.ast.SuperNode;


// Adaptador para classe de parser. a Função parseFile deve retornar null caso o parser resulte em erro. 

public interface ParseAdaptor{
   public abstract SuperNode parseFile(String path) ;
   
}


