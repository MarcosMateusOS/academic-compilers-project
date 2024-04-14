/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012
*/
import java.io.FileReader;
import java.io.IOException;



// Class Lexer Main para instaciar o analisador lexico pelo jflex e ler o arquivo passado por argumento 
public class LexerMain {
    public void exec(String path) throws IOException {
        
        // Instancia o analisador lexico criado pelo jflex e ler o arquivo
        Lexer lx = new Lexer(new FileReader(path));
        
        // Intancia de um novo token
        Token t = lx.nextToken();

        // Impressão dos tokens
        while (t != null) {
            System.out.println(t.toString());
            t = lx.nextToken();
        }
        System.out.println("Total de tokens lidos " + lx.readedTokens());
    }
}
