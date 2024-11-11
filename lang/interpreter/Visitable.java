/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/

package lang.interpreter;


public interface Visitable {

    public void accept(Visitor v);
}