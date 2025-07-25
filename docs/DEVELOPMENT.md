# Guia de Desenvolvimento - Compilador Lang

Este guia fornece informações detalhadas sobre a arquitetura interna do compilador e como contribuir para o projeto.

## 🏗️ Arquitetura do Sistema

### Visão Geral

O compilador Lang segue uma arquitetura modular típica de compiladores, com as seguintes fases:

```
Código Fonte (.lan)
       ↓
   Análise Léxica (ANTLR)
       ↓
   Análise Sintática (ANTLR)
       ↓
   Construção da AST
       ↓
   Análise Semântica
       ↓
   Interpretação / Geração de Código
```

### Componentes Principais

#### 1. Parser (`lang/parser/`)

- **`Lang.g4`**: Gramática ANTLR que define a sintaxe da linguagem
- **`ParseAdaptorImplementation.java`**: Implementação do adaptador de parsing
- **`TestParser.java`**: Bateria de testes sintáticos
- **Classes geradas pelo ANTLR**: `LangLexer`, `LangParser`, `LangVisitor`, etc.

#### 2. AST (`lang/ast/`)

- **`SuperNode.java`**: Classe base para todos os nós da AST
- **Nós específicos**: Cada construção da linguagem tem sua classe correspondente
- **Visitor Pattern**: Implementação do padrão visitor para travessia da árvore

#### 3. Análise Semântica (`lang/semantic/`)

- **`LangVisitorTypeCheck.java`**: Verificador de tipos principal
- **`SemanticImplementation.java`**: Implementação da análise semântica
- **`TyEnv.java`**: Ambiente de tipos (symbol table)
- **`TestSemantic.java`**: Bateria de testes semânticos

#### 4. Interpretador (`lang/interpreter/`)

- **`LangVisitorInterpreter.java`**: Interpretador principal usando visitor pattern
- **`InterpreterAdaptorImplementation.java`**: Adaptador para execução
- **`TestInterpreter.java`**: Testes do interpretador

#### 5. Geração de Código (`lang/code_gen/`)

- **Geração de bytecode Jasmin**: Para JVM
- **Geração de código Python**: Para execução em Python
- **StringTemplate**: Usado para geração de código

## 🔧 Configuração do Ambiente de Desenvolvimento

### Ferramentas Necessárias

1. **Java Development Kit (JDK) 11+**
2. **ANTLR 4.8**: Incluído em `lib/antlr-4.8-complete.jar`
3. **StringTemplate**: Incluído em `lib/ST-4.3.1.jar`
4. **Jasmin**: Incluído em `lib/jasmin.jar`
5. **IDE**: IntelliJ IDEA, Eclipse, ou VS Code com extensões Java

### Configuração do Projeto

#### IntelliJ IDEA

1. Abra o projeto na raiz
2. Configure o SDK do projeto para Java 11+
3. Adicione as bibliotecas do diretório `lib/` ao classpath:
   - `lib/antlr-4.8-complete.jar`
   - `lib/ST-4.3.1.jar`
   - `lib/jasmin.jar`

#### Eclipse

1. Importe como projeto Java existente
2. Configure Build Path:
   - Adicione as JARs externas do diretório `lib/`
   - Configure compilação para Java 11+

#### VS Code

1. Instale a extensão "Extension Pack for Java"
2. Configure `.vscode/settings.json`:

```json
{
    "java.project.sourcePaths": ["lang"],
    "java.project.referencedLibraries": [
        "lib/*.jar"
    ]
}
```

## 🔍 Estrutura do Código

### Fluxo de Execução

1. **`LangCompiler.main()`**: Ponto de entrada principal
2. **Parsing**: `ParseAdaptorImplementation` usa ANTLR para gerar AST
3. **Análise Semântica**: `SemanticImplementation` verifica tipos e escopo
4. **Execução**: `InterpreterAdaptorImplementation` interpreta ou gera código

### Padrões de Design Utilizados

#### Visitor Pattern

```java
// Exemplo de implementação do visitor
public class LangVisitorInterpreter extends LangBaseVisitor<String> {
    
    @Override
    public String visitProgram(LangParser.ProgramContext ctx) {
        // Lógica para processar programa
        return super.visitProgram(ctx);
    }
    
    @Override
    public String visitFunction(LangParser.FunctionContext ctx) {
        // Lógica para processar função
        return super.visitFunction(ctx);
    }
}
```

#### Adapter Pattern

```java
public class ParseAdaptorImplementation {
    public SuperNode parseFile(String path) {
        // Implementação do parsing
    }
    
    public SuperNode parseText(String input) {
        // Implementação do parsing de texto
    }
}
```

### Sistema de Tipos

O verificador de tipos mantém um ambiente (symbol table) que mapeia identificadores para tipos:

```java
public class TyEnv {
    private HashMap<String, Type> env;
    
    public void set(String id, Type type) {
        env.put(id, type);
    }
    
    public Type get(String id) {
        return env.get(id);
    }
}
```

## 🚀 Adicionando Novas Funcionalidades

### 1. Adicionando um Novo Operador

**Passo 1: Modificar a Gramática**

Edite `lang/parser/Lang.g4`:

```antlr
// Adicionar token
POWER_SIGN : '**';

// Adicionar regra
mexp : mexp POWER_SIGN sexp    #PowerExp
     | // outras regras existentes
```

**Passo 2: Regenerar Parser**

```bash
make gen-parser-antlr
make gen-parser
```

**Passo 3: Adicionar Nó AST**

Crie a classe correspondente em `lang/ast/`:

```java
public class PowerExp extends BinOp {
    public PowerExp(int line, int col, Expr left, Expr right) {
        super(line, col, left, right);
    }
}
```

**Passo 4: Atualizar Visitor**

Adicione método em `LangVisitorTypeCheck.java`:

```java
@Override
public String visitPowerExp(LangParser.PowerExpContext ctx) {
    // Verificação de tipos
    String leftType = visit(ctx.aexp());
    String rightType = visit(ctx.sexp());
    
    if (leftType.equals("Int") && rightType.equals("Int")) {
        return "Int";
    }
    // Tratamento de erro
}
```

Adicione método em `LangVisitorInterpreter.java`:

```java
@Override
public String visitPowerExp(LangParser.PowerExpContext ctx) {
    // Implementação da potenciação
    int base = Integer.parseInt(visit(ctx.aexp()));
    int exponent = Integer.parseInt(visit(ctx.sexp()));
    return String.valueOf(Math.pow(base, exponent));
}
```

### 2. Adicionando um Novo Tipo de Dados

**Passo 1: Modificar Gramática**

```antlr
STRING_TYPE : 'String';

btype : // tipos existentes
      | STRING_TYPE #StringType
```

**Passo 2: Atualizar Sistema de Tipos**

**Passo 3: Implementar Operações**

### 3. Adicionando Nova Estrutura de Controle

Exemplo: Adicionar `while`:

**Passo 1: Gramática**

```antlr
WHILE : 'while';

cmd : // comandos existentes
    | WHILE OPEN_PARENT exp CLOSE_PARENT cmd #WhileCommand
```

**Passo 2: AST e Visitors**

Seguir padrão similar aos comandos existentes.

## 🧪 Testes

### Estrutura de Testes

```
testes/
├── sintaxe/
│   ├── certo/      # Programas sintaticamente corretos
│   └── errado/     # Programas com erros sintáticos
└── semantica/
    ├── certo/      # Programas semanticamente corretos
    └── errado/     # Programas com erros semânticos
```

### Adicionando Novos Testes

1. **Testes Sintáticos**: Adicione arquivos `.lan` em `testes/sintaxe/`
2. **Testes Semânticos**: Adicione arquivos `.lan` em `testes/semantica/`
3. **Execute**: Use `make run-test-parser` ou `make run-test-semantic`

### Criando Testes Unitários

```java
public class TestNewFeature {
    private ParseAdaptorImplementation parser;
    
    @Test
    public void testNewOperator() {
        String code = "main() { x = 2 ** 3; }";
        SuperNode ast = parser.parseText(code);
        // Asserts
    }
}
```

## 🔧 Build e Deploy

### Makefile

O projeto usa um Makefile para automação:

```makefile
# Compilação completa
make all

# Limpeza
make clean-cache

# Testes específicos
make run-test-parser
make run-test-semantic
make run-test-it

# Execução
make run action="-i" path="programa.lan"
```

### Scripts de Build

Para Windows, crie `build.bat`:

```batch
@echo off
java -jar lib\antlr-4.8-complete.jar -visitor lang\parser\Lang.g4
javac -cp lib\antlr-4.8-complete.jar;lib\ST-4.3.1.jar;. lang\**\*.java
```

## 🐛 Debugging

### Ferramentas de Debug

1. **ANTLR TestRig**: Para testar gramática
```bash
java -cp lib/antlr-4.8-complete.jar org.antlr.v4.gui.TestRig lang.parser.Lang prog -gui
```

2. **AST Visualization**: Use a opção `-gvz`
```bash
java -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang.LangCompiler -gvz programa.lan
```

3. **Type Environment Debug**: Use `-dti`
```bash
java -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang.LangCompiler -dti programa.lan
```

### Debugging Comum

#### Problemas de Parsing

1. Verifique a gramática com TestRig
2. Adicione prints nos visitors
3. Use ferramentas visuais do ANTLR

#### Problemas de Tipos

1. Use `-tp` para ver o ambiente de tipos
2. Adicione logs no `TyEnv`
3. Verifique precedência de operadores

#### Problemas do Interpretador

1. Adicione prints nos métodos visit
2. Verifique estado das variáveis
3. Use debugger da IDE

## 📚 Recursos Úteis

### Documentação ANTLR

- [ANTLR 4 Reference](https://github.com/antlr/antlr4/blob/master/doc/index.md)
- [Grammar Examples](https://github.com/antlr/grammars-v4)

### Padrões de Compiladores

- Visitor Pattern para AST traversal
- Symbol Table para ambiente de tipos
- Two-pass compilation (parsing + semantic analysis)

### Ferramentas Relacionadas

- **GraphViz**: Para visualização de AST
- **JUnit**: Para testes unitários
- **Git**: Controle de versão

## 🤝 Contribuindo

### Workflow de Contribuição

1. Fork o repositório
2. Crie branch para feature: `git checkout -b feature/nova-funcionalidade`
3. Implemente e teste a funcionalidade
4. Commit com mensagem descritiva
5. Push e abra Pull Request

### Padrões de Código

- **Indentação**: 4 espaços
- **Nomenclatura**: CamelCase para classes, camelCase para métodos
- **Comentários**: Em português para código acadêmico
- **Testes**: Sempre adicione testes para novas funcionalidades

### Revisão de Código

- Todos os PRs devem passar nos testes existentes
- Código deve ser bem documentado
- Funcionalidades novas precisam de testes
- Mantenha compatibilidade com versões anteriores