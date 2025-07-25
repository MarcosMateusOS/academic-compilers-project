# Gramática da Linguagem Lang

Este documento descreve a gramática formal da linguagem **Lang** implementada neste compilador.

## 📋 Estrutura Geral

A gramática está definida no arquivo `lang/parser/Lang.g4` usando a notação ANTLR4.

### Programa Principal

```antlr
prog : (data | fun)* 
```

Um programa Lang é composto por zero ou mais definições de tipos de dados (`data`) ou funções (`fun`).

## 🏗️ Definições de Tipos de Dados

### Sintaxe

```antlr
data : DATA_TYPE NAME_TYPE OPEN_BRACE decl* CLOSE_BRACE

decl : ID DOUBLE_COLON type SEMICOLON
```

### Exemplo

```lang
data Pessoa {
    nome :: Char[];
    idade :: Int;
    altura :: Float;
}
```

## 🔧 Definições de Funções

### Sintaxe

```antlr
fun : ID OPEN_PARENT params? CLOSE_PARENT (COLON type (COMMA type)*)? OPEN_BRACE cmd* CLOSE_BRACE

params : ID DOUBLE_COLON type (COMMA ID DOUBLE_COLON type)*
```

### Exemplos

```lang
-- Função sem parâmetros
main() {
    print "Hello World";
}

-- Função com parâmetros
soma(a :: Int, b :: Int) : Int {
    return a + b;
}

-- Função com múltiplos retornos
dividir(a :: Int, b :: Int) : Int, Int {
    return a / b, a % b;
}
```

## 📊 Sistema de Tipos

### Tipos Básicos

```antlr
btype : INT_TYPE     # Int
      | CHAR_TYPE    # Char  
      | BOOL_TYPE    # Bool
      | FLOAT_TYPE   # Float
      | NAME_TYPE    # Tipos personalizados
```

### Tipos Compostos

```antlr
type : btype                                    # Tipo básico
     | type OPEN_BRACKET CLOSE_BRACKET         # Array
```

### Exemplos

```lang
x :: Int;           -- Inteiro
y :: Float;         -- Ponto flutuante
c :: Char;          -- Caractere
b :: Bool;          -- Booleano
arr :: Int[];       -- Array de inteiros
matrix :: Float[][]; -- Matriz de floats
p :: Pessoa;        -- Tipo personalizado
```

## 🎯 Comandos

### Estruturas de Controle

```antlr
cmd : OPEN_BRACE (cmd)* CLOSE_BRACE                                    # Bloco
    | IF OPEN_PARENT exp CLOSE_PARENT cmd                             # If
    | IF OPEN_PARENT exp CLOSE_PARENT cmd ELSE cmd                    # If-Else
    | ITERATE OPEN_PARENT exp CLOSE_PARENT cmd                        # Loop
```

### Comandos de I/O

```antlr
cmd : READ lvalue SEMICOLON                                           # Leitura
    | PRINT exp SEMICOLON                                             # Impressão
```

### Comandos de Controle

```antlr
cmd : RETURN exp SEMICOLON                                            # Retorno simples
    | RETURN exp (COMMA exp)* SEMICOLON                               # Retorno múltiplo
```

### Atribuição e Chamadas de Função

```antlr
cmd : lvalue EQUAL exp SEMICOLON                                      # Atribuição
    | ID OPEN_PARENT exps? CLOSE_PARENT 
      (LESSER_THAN lvalue (COMMA lvalue)* GREATER_THAN)? SEMICOLON    # Chamada
```

## 🧮 Expressões

A gramática de expressões segue a precedência matemática tradicional:

### Expressões Lógicas (menor precedência)

```antlr
exp : exp AND_SIGN rexp     # E lógico
    | rexp                  # Expressão relacional
```

### Expressões Relacionais

```antlr
rexp : aexp LESSER_THAN aexp     # Menor que
     | rexp EQUALITY_SIGN aexp   # Igualdade
     | rexp NOT_EQUAL_SIGN aexp  # Diferença
     | aexp                      # Expressão aritmética
```

### Expressões Aritméticas

```antlr
aexp : aexp PLUS_SIGN mexp      # Soma
     | aexp MINUS_SIGN mexp     # Subtração
     | mexp                     # Expressão multiplicativa
```

### Expressões Multiplicativas

```antlr
mexp : mexp MULT_SIGN sexp      # Multiplicação
     | mexp DIVIDE_SIGN sexp    # Divisão
     | mexp MOD_SIGN sexp       # Módulo
     | sexp                     # Expressão simples
```

### Expressões Simples (maior precedência)

```antlr
sexp : NOT_SIGN sexp                                    # Negação lógica
     | MINUS_SIGN sexp                                  # Negação aritmética
     | TRUE | FALSE | NULL                              # Literais lógicos
     | INT_VAL | FLOAT_VAL | CHAR_VAL                   # Literais numéricos
     | OPEN_PARENT exp CLOSE_PARENT                     # Parênteses
     | NEW type (OPEN_BRACKET exp CLOSE_BRACKET)?      # Instanciação
     | ID OPEN_PARENT exps? CLOSE_PARENT OPEN_BRACKET exp CLOSE_BRACKET  # Retorno de função
     | lvalue                                           # L-value
```

## 🎯 L-Values

```antlr
lvalue : ID                                      # Identificador
       | lvalue OPEN_BRACKET exp CLOSE_BRACKET   # Acesso a array
       | lvalue DOT ID                          # Acesso a membro
```

### Exemplos

```lang
x               -- Variável simples
arr[0]          -- Elemento de array
matrix[i][j]    -- Elemento de matriz
pessoa.nome     -- Membro de estrutura
arr[0].campo    -- Combinação
```

## 🔤 Tokens Léxicos

### Palavras-Chave

```antlr
INT_TYPE    : 'Int';
CHAR_TYPE   : 'Char';
BOOL_TYPE   : 'Bool';
FLOAT_TYPE  : 'Float';
DATA_TYPE   : 'data';
IF          : 'if';
ELSE        : 'else';
ITERATE     : 'iterate';
READ        : 'read';
PRINT       : 'print';
RETURN      : 'return';
NEW         : 'new';
TRUE        : 'true';
FALSE       : 'false';
NULL        : 'null';
```

### Operadores

```antlr
AND_SIGN        : '&&';
EQUALITY_SIGN   : '==';
NOT_EQUAL_SIGN  : '!=';
LESSER_THAN     : '<';
GREATER_THAN    : '>';
PLUS_SIGN       : '+';
MINUS_SIGN      : '-';
MULT_SIGN       : '*';
DIVIDE_SIGN     : '/';
MOD_SIGN        : '%';
NOT_SIGN        : '!';
EQUAL           : '=';
```

### Delimitadores

```antlr
OPEN_PARENT     : '(';
CLOSE_PARENT    : ')';
OPEN_BRACE      : '{';
CLOSE_BRACE     : '}';
OPEN_BRACKET    : '[';
CLOSE_BRACKET   : ']';
DOUBLE_COLON    : '::';
COLON           : ':';
SEMICOLON       : ';';
COMMA           : ',';
DOT             : '.';
```

### Literais

```antlr
INT_VAL   : [0-9]+;
FLOAT_VAL : [0-9]+ '.' [0-9]+;
CHAR_VAL  : '\'' (~['\r\n] | '\\' .) '\'';
ID        : [a-zA-Z_][a-zA-Z_0-9]*;
NAME_TYPE : [A-Z][a-zA-Z_0-9]*;
```

## 📝 Comentários

```antlr
LINE_COMMENT      : '--' .*? EOL -> skip;
MULTILINE_COMMENT : '{-' .*? '-}' -> skip;
```

### Exemplos

```lang
-- Este é um comentário de linha

{-
   Este é um comentário
   de múltiplas linhas
-}
```

## 🎨 Exemplo Completo

```lang
-- Definição de tipo
data Retangulo {
    largura :: Float;
    altura :: Float;
}

-- Função para calcular área
area(r :: Retangulo) : Float {
    return r.largura * r.altura;
}

-- Função principal
main() {
    ret = new Retangulo;
    ret.largura = 10.5;
    ret.altura = 7.2;
    
    resultado = area(ret);
    print "Área: ";
    print resultado;
}
```

## 🔍 Precedência de Operadores

Da menor para a maior precedência:

1. **Lógicos**: `&&`
2. **Relacionais**: `<`, `==`, `!=`
3. **Aritméticos**: `+`, `-`
4. **Multiplicativos**: `*`, `/`, `%`
5. **Unários**: `!`, `-` (unário)
6. **Primários**: literais, identificadores, parênteses

## ⚠️ Regras Importantes

1. **Identificadores** começam com letra ou underscore
2. **Tipos personalizados** começam com letra maiúscula
3. **Comentários** podem ser aninhados (multiline)
4. **Strings** de caracteres usam escape sequences padrão
5. **Arrays** são indexados a partir de 0
6. **Blocos** sempre requerem chaves `{}`