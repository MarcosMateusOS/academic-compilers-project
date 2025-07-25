# Referência da API - Compilador Lang

Esta documentação descreve as principais classes e interfaces do compilador Lang.

## 📋 Índice

- [Classes Principais](#classes-principais)
- [AST (Abstract Syntax Tree)](#ast-abstract-syntax-tree)
- [Sistema de Tipos](#sistema-de-tipos)
- [Interpretador](#interpretador)
- [Geração de Código](#geração-de-código)
- [Utilitários](#utilitários)

## 🏗️ Classes Principais

### LangCompiler

**Pacote**: `lang`

Classe principal que coordena todas as fases de compilação.

```java
public class LangCompiler {
    public static void main(String[] args)
}
```

**Parâmetros de linha de comando:**

| Opção | Descrição |
|-------|-----------|
| `-bs` | Executa bateria de testes sintáticos |
| `-bty` | Executa bateria de testes de tipos |
| `-bsm` | Executa bateria de testes do interpretador |
| `-pp` | Pretty print do programa |
| `-tp` | Verificar tipos e imprimir ambiente |
| `-i` | Apenas interpretar |
| `-ti` | Verificar tipos e interpretar |
| `-dti` | Debug: tipos + ambiente + interpretação |
| `-gvz` | Gerar arquivo DOT para visualização |

### ParseAdaptorImplementation

**Pacote**: `lang.parser`

Adaptador principal para análise sintática usando ANTLR.

```java
public class ParseAdaptorImplementation {
    
    /**
     * Faz parsing de um arquivo
     * @param filename Caminho do arquivo .lan
     * @return Nó raiz da AST
     */
    public SuperNode parseFile(String filename)
    
    /**
     * Faz parsing de texto
     * @param input Código fonte como string
     * @return Nó raiz da AST
     */
    public SuperNode parseText(String input)
}
```

**Exemplo de uso:**
```java
ParseAdaptorImplementation parser = new ParseAdaptorImplementation();
SuperNode ast = parser.parseFile("programa.lan");
```

### SemanticImplementation

**Pacote**: `lang.semantic`

Implementação da análise semântica e verificação de tipos.

```java
public class SemanticImplementation {
    
    /**
     * Executa análise semântica completa
     * @param ast Árvore sintática abstrata
     * @return Environment de tipos resultante
     */
    public TyEnv semanticAnalysis(SuperNode ast)
    
    /**
     * Verifica tipos sem retornar environment
     * @param ast Árvore sintática abstrata
     * @return true se não houver erros de tipo
     */
    public boolean checkTypes(SuperNode ast)
}
```

### InterpreterAdaptorImplementation

**Pacote**: `lang.interpreter`

Adaptador para execução de programas Lang.

```java
public class InterpreterAdaptorImplementation {
    
    /**
     * Interpreta um programa a partir da AST
     * @param ast Árvore sintática abstrata
     * @param env Environment de tipos (opcional)
     */
    public void interpret(SuperNode ast, TyEnv env)
    
    /**
     * Interpreta arquivo diretamente
     * @param filename Caminho do arquivo
     */
    public void interpretFile(String filename)
}
```

## 🌳 AST (Abstract Syntax Tree)

### SuperNode

**Pacote**: `lang.ast`

Classe base para todos os nós da AST.

```java
public abstract class SuperNode {
    protected int line;     // Linha no código fonte
    protected int col;      // Coluna no código fonte
    
    /**
     * Constructor base
     * @param line Linha no código fonte
     * @param col Coluna no código fonte
     */
    public SuperNode(int line, int col)
    
    /**
     * Aceita um visitor para processamento
     * @param v Visitor que processará este nó
     */
    public abstract void accept(Visitor v)
    
    // Getters
    public int getLine()
    public int getCol()
}
```

### Nós de Programa

#### Program

```java
public class Program extends SuperNode {
    private List<SuperNode> declarations;
    
    public Program(int line, int col, List<SuperNode> declarations)
    public List<SuperNode> getDeclarations()
}
```

#### Data

```java
public class Data extends SuperNode {
    private String name;
    private List<Declaration> fields;
    
    public Data(int line, int col, String name, List<Declaration> fields)
    public String getName()
    public List<Declaration> getFields()
}
```

#### Function

```java
public class Function extends SuperNode {
    private String name;
    private List<Parameter> parameters;
    private List<Type> returnTypes;
    private List<Command> body;
    
    public Function(int line, int col, String name, 
                   List<Parameter> parameters,
                   List<Type> returnTypes,
                   List<Command> body)
    
    public String getName()
    public List<Parameter> getParameters()
    public List<Type> getReturnTypes()
    public List<Command> getBody()
}
```

### Nós de Expressões

#### Expr

Classe base para todas as expressões.

```java
public abstract class Expr extends SuperNode {
    public Expr(int line, int col)
}
```

#### BinOp

Classe base para operações binárias.

```java
public abstract class BinOp extends Expr {
    protected Expr left;
    protected Expr right;
    
    public BinOp(int line, int col, Expr left, Expr right)
    public Expr getLeft()
    public Expr getRight()
}
```

**Subclasses de BinOp:**
- `PlusExp`: Adição (`+`)
- `MinusExp`: Subtração (`-`)
- `MultExp`: Multiplicação (`*`)
- `DivExp`: Divisão (`/`)
- `ModExp`: Módulo (`%`)
- `AndExp`: E lógico (`&&`)
- `EqualityExp`: Igualdade (`==`)
- `NotEqualExp`: Diferença (`!=`)
- `LesserThanExp`: Menor que (`<`)

#### UnaryOp

```java
public abstract class UnaryOp extends Expr {
    protected Expr operand;
    
    public UnaryOp(int line, int col, Expr operand)
    public Expr getOperand()
}
```

**Subclasses:**
- `NotSignExp`: Negação lógica (`!`)
- `MinusSignExp`: Negação aritmética (`-`)

#### Literais

```java
public class IntVal extends Expr {
    private int value;
    public IntVal(int line, int col, int value)
    public int getValue()
}

public class FloatVal extends Expr {
    private float value;
    public FloatVal(int line, int col, float value)
    public float getValue()
}

public class CharVal extends Expr {
    private char value;
    public CharVal(int line, int col, char value)
    public char getValue()
}

public class BoolVal extends Expr {
    private boolean value;
    public BoolVal(int line, int col, boolean value)
    public boolean getValue()
}
```

### Nós de Comandos

#### Command

```java
public abstract class Command extends SuperNode {
    public Command(int line, int col)
}
```

#### IfCommand

```java
public class IfCommand extends Command {
    private Expr condition;
    private Command thenCommand;
    
    public IfCommand(int line, int col, Expr condition, Command thenCommand)
    public Expr getCondition()
    public Command getThenCommand()
}
```

#### IfElseCommand

```java
public class IfElseCommand extends Command {
    private Expr condition;
    private Command thenCommand;
    private Command elseCommand;
    
    public IfElseCommand(int line, int col, Expr condition, 
                        Command thenCommand, Command elseCommand)
    public Expr getCondition()
    public Command getThenCommand()
    public Command getElseCommand()
}
```

#### IterateCommand

```java
public class IterateCommand extends Command {
    private Expr times;
    private Command body;
    
    public IterateCommand(int line, int col, Expr times, Command body)
    public Expr getTimes()
    public Command getBody()
}
```

#### AssignCommand

```java
public class AssignCommand extends Command {
    private LValue target;
    private Expr value;
    
    public AssignCommand(int line, int col, LValue target, Expr value)
    public LValue getTarget()
    public Expr getValue()
}
```

## 🔍 Sistema de Tipos

### TyEnv

**Pacote**: `lang.semantic`

Environment (symbol table) para verificação de tipos.

```java
public class TyEnv {
    
    /**
     * Define tipo de uma variável
     * @param id Identificador da variável
     * @param type Tipo da variável
     */
    public void set(String id, Type type)
    
    /**
     * Obtém tipo de uma variável
     * @param id Identificador da variável
     * @return Tipo da variável ou null se não existir
     */
    public Type get(String id)
    
    /**
     * Verifica se variável existe
     * @param id Identificador da variável
     * @return true se a variável foi declarada
     */
    public boolean contains(String id)
    
    /**
     * Cria novo escopo
     * @return Novo environment com escopo aninhado
     */
    public TyEnv newScope()
    
    /**
     * Imprime environment para debug
     */
    public void printEnv()
}
```

### LangVisitorTypeCheck

**Pacote**: `lang.semantic`

Visitor responsável pela verificação de tipos.

```java
public class LangVisitorTypeCheck extends LangBaseVisitor<String> {
    private TyEnv env;
    private List<String> errors;
    
    /**
     * Constructor
     * @param env Environment inicial
     */
    public LangVisitorTypeCheck(TyEnv env)
    
    /**
     * Verifica se houve erros de tipo
     * @return true se não há erros
     */
    public boolean hasNoErrors()
    
    /**
     * Obtém lista de erros
     * @return Lista de mensagens de erro
     */
    public List<String> getErrors()
    
    // Métodos visit para cada tipo de nó
    @Override
    public String visitProgram(LangParser.ProgramContext ctx)
    
    @Override
    public String visitFunction(LangParser.FunctionContext ctx)
    
    @Override
    public String visitPlusExp(LangParser.PlusExpContext ctx)
    
    // ... outros métodos visit
}
```

### Tipos Suportados

```java
public enum BasicType {
    INT("Int"),
    FLOAT("Float"),
    CHAR("Char"),
    BOOL("Bool");
    
    private String name;
    
    BasicType(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
```

## 🚀 Interpretador

### LangVisitorInterpreter

**Pacote**: `lang.interpreter`

Visitor responsável pela interpretação do código.

```java
public class LangVisitorInterpreter extends LangBaseVisitor<String> {
    private HashMap<String, Object> variables;
    private HashMap<String, Function> functions;
    
    /**
     * Constructor
     */
    public LangVisitorInterpreter()
    
    /**
     * Executa programa
     * @param ast Árvore sintática abstrata
     */
    public void execute(SuperNode ast)
    
    /**
     * Define valor de variável
     * @param id Identificador
     * @param value Valor
     */
    public void setVariable(String id, Object value)
    
    /**
     * Obtém valor de variável
     * @param id Identificador
     * @return Valor da variável
     */
    public Object getVariable(String id)
    
    // Métodos visit para interpretação
    @Override
    public String visitPlusExp(LangParser.PlusExpContext ctx) {
        String left = visit(ctx.aexp());
        String right = visit(ctx.mexp());
        
        // Lógica de adição baseada nos tipos
        if (isNumeric(left) && isNumeric(right)) {
            return String.valueOf(
                Double.parseDouble(left) + Double.parseDouble(right)
            );
        }
        
        throw new RuntimeException("Tipos incompatíveis para adição");
    }
    
    // ... outros métodos visit
}
```

### Ambiente de Execução

```java
public class RuntimeEnvironment {
    private HashMap<String, Object> globals;
    private Stack<HashMap<String, Object>> scopes;
    
    /**
     * Entra em novo escopo
     */
    public void enterScope()
    
    /**
     * Sai do escopo atual
     */
    public void exitScope()
    
    /**
     * Define variável no escopo atual
     */
    public void define(String name, Object value)
    
    /**
     * Obtém valor de variável
     */
    public Object get(String name)
}
```

## 🔧 Geração de Código

### CodeGeneration

**Pacote**: `lang.code_gen`

Gerador de código para diferentes alvos.

```java
public class CodeGeneration {
    
    /**
     * Gera código Jasmin (bytecode JVM)
     * @param ast Árvore sintática abstrata
     * @return Código Jasmin como string
     */
    public String generateJasmin(SuperNode ast)
    
    /**
     * Gera código Python
     * @param ast Árvore sintática abstrata
     * @return Código Python como string
     */
    public String generatePython(SuperNode ast)
    
    /**
     * Salva código gerado em arquivo
     * @param code Código gerado
     * @param filename Nome do arquivo de saída
     */
    public void saveToFile(String code, String filename)
}
```

### StringTemplate Integration

```java
public class TemplateManager {
    private STGroup templates;
    
    /**
     * Carrega templates de arquivo
     * @param templateFile Arquivo de templates
     */
    public TemplateManager(String templateFile)
    
    /**
     * Aplica template com dados
     * @param templateName Nome do template
     * @param data Dados para o template
     * @return Código gerado
     */
    public String apply(String templateName, Map<String, Object> data)
}
```

## 🛠️ Utilitários

### TestParser

**Pacote**: `lang.parser`

Utilitário para execução de testes sintáticos.

```java
public class TestParser {
    private ParseAdaptorImplementation parser;
    
    /**
     * Constructor
     * @param parser Implementação do parser
     */
    public TestParser(ParseAdaptorImplementation parser)
    
    /**
     * Executa todos os testes sintáticos
     */
    public void runAllTests()
    
    /**
     * Testa arquivo específico
     * @param filename Arquivo de teste
     * @return true se passou no teste
     */
    public boolean testFile(String filename)
}
```

### TestSemantic

**Pacote**: `lang.semantic`

Utilitário para testes semânticos.

```java
public class TestSemantic {
    private SemanticImplementation semantic;
    
    public TestSemantic(SemanticImplementation semantic)
    public void runAllTests()
    public boolean testFile(String filename)
}
```

### TestInterpreter

**Pacote**: `lang.interpreter`

Utilitário para testes do interpretador.

```java
public class TestInterpreter {
    private InterpreterAdaptorImplementation interpreter;
    
    public TestInterpreter(InterpreterAdaptorImplementation interpreter)
    public void runAllTests()
    public boolean testFile(String filename)
}
```

## 🎯 Exemplos de Uso da API

### Parsing Simples

```java
// Criar parser
ParseAdaptorImplementation parser = new ParseAdaptorImplementation();

// Fazer parsing
SuperNode ast = parser.parseFile("programa.lan");

// Ou parsing de string
String code = "main() { print 42; }";
SuperNode ast2 = parser.parseText(code);
```

### Verificação de Tipos

```java
// Criar analisador semântico
SemanticImplementation semantic = new SemanticImplementation();

// Executar análise
TyEnv env = semantic.semanticAnalysis(ast);

// Verificar se há erros
if (semantic.checkTypes(ast)) {
    System.out.println("Programa bem tipado!");
} else {
    System.out.println("Erros de tipo encontrados");
}
```

### Interpretação

```java
// Criar interpretador
InterpreterAdaptorImplementation interpreter = 
    new InterpreterAdaptorImplementation();

// Interpretar com environment de tipos
interpreter.interpret(ast, env);

// Ou interpretar diretamente
interpreter.interpretFile("programa.lan");
```

### Pipeline Completo

```java
public void compileAndRun(String filename) {
    try {
        // Parsing
        ParseAdaptorImplementation parser = new ParseAdaptorImplementation();
        SuperNode ast = parser.parseFile(filename);
        
        // Análise semântica
        SemanticImplementation semantic = new SemanticImplementation();
        TyEnv env = semantic.semanticAnalysis(ast);
        
        if (!semantic.checkTypes(ast)) {
            System.err.println("Erros de tipo encontrados!");
            return;
        }
        
        // Interpretação
        InterpreterAdaptorImplementation interpreter = 
            new InterpreterAdaptorImplementation();
        interpreter.interpret(ast, env);
        
    } catch (Exception e) {
        System.err.println("Erro: " + e.getMessage());
    }
}
```

## 🔍 Tratamento de Erros

### Exceções Personalizadas

```java
public class LangSemanticException extends Exception {
    private int line;
    private int column;
    
    public LangSemanticException(String message, int line, int column) {
        super(message);
        this.line = line;
        this.column = column;
    }
    
    public int getLine() { return line; }
    public int getColumn() { return column; }
}

public class LangRuntimeException extends RuntimeException {
    public LangRuntimeException(String message) {
        super(message);
    }
}
```

### Error Reporting

```java
public class ErrorReporter {
    private List<String> errors;
    
    public void reportError(String message, int line, int column) {
        String error = String.format("Erro na linha %d, coluna %d: %s", 
                                    line, column, message);
        errors.add(error);
    }
    
    public boolean hasErrors() {
        return !errors.isEmpty();
    }
    
    public void printErrors() {
        errors.forEach(System.err::println);
    }
}
```