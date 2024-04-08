public enum TOKEN_TYPE {

    // BType
    ID,
    INT_VAL,
    CHAR_VAL,
    FLOAT_VAL,
    NAME_VAL,
   

    // CMD
    IF,
    ELSE,
    ITERATE,
    READ,
    PRINT,
    RETURN,

    // EXP
    EQUALITY_SIGN, // == 
    NOT_EQUAL_SIGN, // !-
    LESSER_THAN, // <
    GREATER_THAN, // >
    AND_SIGN, // &&

    PLUS_SIGN, // +
    MINUS_SIGN,  
    MULT_SIGN,
    DIVIDE_SIGN,
    MOD_SIGN, 
    NOT_SIGN, 
    HYPHEN_SIGN,


    EQUAL, // =
    AMPERSAND, //&
    PERCENT,
    DOT,
    COMMA,
    SEMICOLON,
    COLON,
    DOUBLE_COLON,
    OPEN_PARENT,
    CLOSE_PARENT,
    OPEN_BRECKET,
    CLOSE_BRECKET,
    OPEN_BRACE,
    CLOSE_BRACE,
    EOF,


  

    //RESERVADO
    TRUE,
    FALSE,
    NULL,
    INT,
    CHAR,
    BOOL,
    FLOAT,
    DATA,
    NEW
 
}
