
 /*  Esta seção é copiada antes da declaração da classe do analisador léxico.
  *  É nesta seção que se deve incluir imports e declaração de pacotes.
  *  Neste exemplo não temos nada a incluir nesta seção.
  */
  
%%

%unicode
%line
%column
%class LextTest
%function nextToken
%type Token

%{
    
    /* Código arbitrário pode ser inserido diretamente no analisador dessa forma. 
     * Aqui podemos declarar variáveis e métodos adicionais que julgarmos necessários. 
     */
    private int ntk;
    
    public int readedTokens(){
       return ntk;
    }
    private Token symbol(TOKEN_TYPE t) {
        ntk++;
        return new Token(t,yytext(), yyline+1, yycolumn+1);
        
    }
    private Token symbol(TOKEN_TYPE t, Object value) {
        ntk++;
        return new Token(t, value, yyline+1, yycolumn+1);
    }
%}

%init{
    ntk = 0; // Isto é copiado direto no construtor do lexer. 
%init}

  


  numInteger = [:digit:]+
  numFloat = ([:digit:]* "." ([:digit:] [:digit:]*))
  letter = [:letter:]
  id = [:lowercase:] ({letter} | "_" | [:digit:])*
  nameType = [:uppercase:] ({letter} | "_" | [:digit:])*


  endOfLine = \r|\n|\r\n
  whiteSpace = {endOfLine} | [ \t\f]
  lineComment = "--" (.) * {endOfLine}
    
%state COMMENT

%%

<YYINITIAL>{
   
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
    "." {return symbol(TOKEN_TYPE.COMMA);}
    ";" {return symbol(TOKEN_TYPE.SEMICOLON);}
    ":" {return symbol(TOKEN_TYPE.DOUBLE_COLON);}
    "(" {return symbol(TOKEN_TYPE.OPEN_PARENT);}
    ")" {return symbol(TOKEN_TYPE.OPEN_PARENT);}
    "{" {return symbol(TOKEN_TYPE.OPEN_BRECKET);}
    "}" {return symbol(TOKEN_TYPE.CLOSE_BRECKET);}
    "[" {return symbol(TOKEN_TYPE.OPEN_BRACE);}
    "]" {return symbol(TOKEN_TYPE.CLOSE_BRACE);}


 
    
    "{-"            { yybegin(COMMENT);               }
    {whiteSpace}       { /* Não faz nada  */             }
    {lineComment}   {                       }
}

<COMMENT>{
   "--"     { yybegin(YYINITIAL); } 
   "-}"     { yybegin(YYINITIAL); }
   [^"-}"]* {                     } //Ignora != -}
   "-"      {                     }
   "}"      {                     }
}



[^]                 { throw new RuntimeException("Illegal character <"+yytext()+">"); }



