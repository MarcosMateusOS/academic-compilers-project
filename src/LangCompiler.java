/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/

import java.io.IOException;

// Class principal para chamar instanciar as classes para compilar a lang
public class LangCompiler {
    public static void main(String args[]) throws IOException {
        LexerMain lexerMain = new LexerMain();

        lexerMain.exec(args[0]);
    }
}
