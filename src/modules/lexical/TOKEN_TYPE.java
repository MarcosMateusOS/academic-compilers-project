/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/


// Enum com todos os tipos de token da linguagem Lang
public enum TOKEN_TYPE {

    // BType
    ID, // Identificadores
    INT_VAL, // Valores dos inteiros
    CHAR_VAL, // Valores dos caracteres
    FLOAT_VAL, // Valores dos booleanos
    NAME_VAL,   

    // CMD - Palavras reservadas
    IF, // if
    ELSE, // else
    ITERATE,// iterate
    READ, // read
    PRINT, // print
    RETURN, // return

    // EXP
    EQUALITY_SIGN, // == 
    NOT_EQUAL_SIGN, // !-
    LESSER_THAN, // <
    GREATER_THAN, // >
    AND_SIGN, // &&

    PLUS_SIGN, // +
    MINUS_SIGN, // -
    MULT_SIGN, // *
    DIVIDE_SIGN, // /
    MOD_SIGN, // % 
    NOT_SIGN,// ! 



    EQUAL, // =
    AMPERSAND, //&
    DOT, // .
    COMMA, // ,
    SEMICOLON,// ;
    COLON,// :
    DOUBLE_COLON,// ::
    OPEN_PARENT,// (
    CLOSE_PARENT,// /
    OPEN_BRECKET,// {
    CLOSE_BRECKET,// }
    OPEN_BRACE,// [
    CLOSE_BRACE,// ]
    SINGLE_QUOTES,// '
    BACK_SLASH,// \
    EOF,// \r|\n|\r\n


  

    //RESERVADO - Tipos
    TRUE,// true
    FALSE,// false
    NULL,// null
    INT,// int
    CHAR,// char
    BOOL,// bool
    FLOAT,// float
    DATA,// data
    NEW// new
 
}
