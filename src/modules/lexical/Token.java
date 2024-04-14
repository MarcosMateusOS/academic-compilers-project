/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/

/*
 * Class que define um token da linguagem
 * Definação dos tokens: 
 * - Possui dois inteiros: - l -> linha 
 *                         - c -> coluna
 * - TOKEN_TYPE: o tipo do token
 * - lexema: é onde guardar o lexeme do token
 * - info: informação do token, como valores inteiros, float e char
*/
public class Token {
      public int l, c;
      public TOKEN_TYPE t;
      public String lexeme;
      public Object info;



      // Construturos da class token
      public Token(TOKEN_TYPE t, String lex, Object o, int l, int c) {
            this.t = t;
            lexeme = lex;
            info = o;
            this.l = l;
            this.c = c;
      }

      public Token(TOKEN_TYPE t, String lex, int l, int c) {
            this.t = t;
            lexeme = lex;
            info = null;
            this.l = l;
            this.c = c;
      }

      public Token(TOKEN_TYPE t, Object o, int l, int c) {
            this.t = t;
            lexeme = "";
            info = o;
            this.l = l;
            this.c = c;
      }

      // Função para impressão do token
      @Override
      public String toString() {
            if(t == TOKEN_TYPE.ID || t == TOKEN_TYPE.CHAR_VAL || t == TOKEN_TYPE.NAME_VAL){
                  return  (t + ":" + lexeme);
            }else if(info != null){
                  return (t + ":" + info.toString());
            }else{
                  return lexeme;
            }
      }
}


