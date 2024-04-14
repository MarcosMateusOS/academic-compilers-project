/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/


 /*  Esta seção é copiada antes da declaração da classe do analisador léxico.
  *  É nesta seção que se deve incluir imports e declaração de pacotes.
  */
  
%%

%unicode
%line
%column
%class Lexer
%function nextToken
%type Token

%{
    
    
    private int ntk; // Contador de numero de tokens lidos
    
    public int readedTokens(){ // Retornar o numero de tokens lidos
       return ntk;
    }
    private Token symbol(TOKEN_TYPE t) {//  Constroi um token
        ntk++;
        return new Token(t,yytext(), yyline+1, yycolumn+1);
        
    }
    private Token symbol(TOKEN_TYPE t, Object value) {// Constroi um token com valor associado
        ntk++;
        return new Token(t, value, yyline+1, yycolumn+1);
    }
%}

%init{
    ntk = 0;  
%init}
  // Definição das expressões das linguagem 
  
  numInteger = [:digit:]+ // Definição dos numeros inteiros
  numFloat = ([:digit:]* "." ([:digit:] [:digit:]*)); // Definição dos valores floats
  letter = [:letter:] // Definição dos caracteres que são letras
  id = [:lowercase:] ({letter} | "_" | [:digit:])* // Definição dos identificadores da linguagem
  nameType = [:uppercase:] ({letter} | "_" | [:digit:])*  // Definição da estrutura de tipos


  endOfLine = \r|\n|\r\n  // Definição dos identificadores de final de linha
  whiteSpace = {endOfLine} | [ \t\f] // Definição dos espaços vazios
  lineComment = "--" (.) * {endOfLine} // Definição do comentario em linhha
    
%state COMMENT

%%

<YYINITIAL>{
    // Estados
   
    //Reservado
    "true" { return symbol(TOKEN_TYPE.TRUE);} 
    "false" { return symbol(TOKEN_TYPE.FALSE);}
    "null" { return symbol(TOKEN_TYPE.NULL);}
    "Int" { return symbol(TOKEN_TYPE.INT);}
    "Char" { return symbol(TOKEN_TYPE.CHAR);}
    "Bool" { return symbol(TOKEN_TYPE.BOOL);}
    "Float" { return symbol(TOKEN_TYPE.FLOAT);}
    "data" { return symbol(TOKEN_TYPE.DATA);}
    "new" { return symbol(TOKEN_TYPE.NEW);}
    
    // CMD
    "if" { return symbol(TOKEN_TYPE.IF);}
    "else" { return symbol(TOKEN_TYPE.ELSE);}
    "iterate" { return symbol(TOKEN_TYPE.ITERATE);}
    "read" { return symbol(TOKEN_TYPE.READ);}
    "print" { return symbol(TOKEN_TYPE.PRINT);}
    "return" { return symbol(TOKEN_TYPE.RETURN);}


    // Identificador e valores
    {id} { return symbol(TOKEN_TYPE.ID);   }
    {numInteger} { return symbol(TOKEN_TYPE.INT_VAL, Integer.parseInt(yytext()) );}
    {numFloat} { return symbol(TOKEN_TYPE.FLOAT_VAL, Float.parseFloat(yytext()) ); }
    {letter} { return symbol(TOKEN_TYPE.CHAR_VAL);}
    {nameType} { return symbol(TOKEN_TYPE.NAME_VAL);}


    // Logicos 
    "==" { return symbol(TOKEN_TYPE.EQUALITY_SIGN);}
    "!=" { return symbol(TOKEN_TYPE.NOT_EQUAL_SIGN);}
    "<" { return symbol(TOKEN_TYPE.LESSER_THAN);}
    ">" {return symbol(TOKEN_TYPE.GREATER_THAN);}
    "&&" {return symbol(TOKEN_TYPE.AND_SIGN);}

    // Simbolos
    "+" {return symbol(TOKEN_TYPE.PLUS_SIGN);}
    "-" {return symbol(TOKEN_TYPE.MINUS_SIGN);}
    "*" {return symbol(TOKEN_TYPE.MULT_SIGN);}
    "/" {return symbol(TOKEN_TYPE.DIVIDE_SIGN);}
    "%" {return symbol(TOKEN_TYPE.MOD_SIGN);}
    "!" {return symbol(TOKEN_TYPE.NOT_SIGN);}
    "=" {return symbol(TOKEN_TYPE.EQUAL);}
    "&" {return symbol(TOKEN_TYPE.AMPERSAND);}
    "." {return symbol(TOKEN_TYPE.DOT);}
    "," {return symbol(TOKEN_TYPE.COMMA);}
    ";" {return symbol(TOKEN_TYPE.SEMICOLON);}
    ":" {return symbol(TOKEN_TYPE.DOUBLE_COLON);}
    "(" {return symbol(TOKEN_TYPE.OPEN_PARENT);}
    ")" {return symbol(TOKEN_TYPE.OPEN_PARENT);}
    "{" {return symbol(TOKEN_TYPE.OPEN_BRECKET);}
    "}" {return symbol(TOKEN_TYPE.CLOSE_BRECKET);}
    "[" {return symbol(TOKEN_TYPE.OPEN_BRACE);}
    "]" {return symbol(TOKEN_TYPE.CLOSE_BRACE);}
    "\'" {return symbol(TOKEN_TYPE.SINGLE_QUOTES);}
    "\\" {return symbol(TOKEN_TYPE.BACK_SLASH);}
  
    

    // Comentarios e expressões que devem ser ignoradas
    "{-"            { yybegin(COMMENT);               }
    {whiteSpace}       { /* Não faz nada  */             }
    {lineComment}   {                       }
}

<COMMENT>{
    [^"-}"]* {                     } //Ignora != -}
   "-"      {                     }
   "}"      {                     }
   "-}"     { yybegin(YYINITIAL); }
}



[^]                 { throw new RuntimeException("Illegal character <"+yytext()+">"); }



