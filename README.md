# Compilador Lang

![Build Status](https://img.shields.io/badge/build-passing-green)
![Java](https://img.shields.io/badge/Java-11%2B-orange)
![ANTLR](https://img.shields.io/badge/ANTLR-4.8-blue)

Este repositório contém um **projeto acadêmico de compiladores** completo, desenvolvido como parte do estudo sobre design e implementação de compiladores. O projeto implementa um compilador completo para a linguagem **Lang**, uma linguagem imperativa com suporte a tipos de dados personalizados, incluindo todas as fases de compilação: análise léxica, sintática, semântica, interpretação e geração de código.

## 🚀 Características da Linguagem Lang

A linguagem **Lang** suporta:

- **Tipos de Dados**: `Int`, `Float`, `Char`, `Bool` e tipos personalizados (`data`)
- **Arrays**: Suporte completo a arrays multidimensionais
- **Estruturas de Controle**: `if/else`, `iterate` (loop)
- **Funções**: Definição e chamada de funções com múltiplos parâmetros e valores de retorno
- **Tipos Personalizados**: Definição de estruturas de dados com `data`
- **Operações**: Aritméticas, lógicas, relacionais e de acesso a membros
- **I/O**: Comandos `read` e `print`

## 📁 Estrutura do Projeto

```
academic-compilers-project/
├── lang/                          # Código fonte principal
│   ├── LangCompiler.java         # Classe principal do compilador
│   ├── parser/                   # Análise léxica e sintática
│   │   ├── Lang.g4              # Gramática ANTLR
│   │   └── *.java               # Classes geradas pelo ANTLR
│   ├── ast/                     # Árvore Sintática Abstrata
│   ├── semantic/                # Análise semântica e verificação de tipos
│   ├── interpreter/             # Interpretador da linguagem
│   └── code_gen/               # Geração de código (Jasmin/Python)
├── lib/                         # Bibliotecas externas
│   ├── antlr-4.8-complete.jar  # ANTLR runtime
│   ├── ST-4.3.1.jar           # StringTemplate
│   └── jasmin.jar              # Assembler Jasmin
├── testes/                     # Conjunto de testes
│   ├── sintaxe/                # Testes sintáticos
│   └── semantica/              # Testes semânticos
├── makefile                    # Automação de build
└── README.md                   # Esta documentação
```

## 🛠️ Instalação e Configuração

### Pré-requisitos

- **Java 11+** 
- **Make** (opcional, mas recomendado)
- Sistema Unix-like (Linux/macOS) ou Windows com WSL

### Clonando o Repositório

```bash
git clone https://github.com/MarcosMateusOS/academic-compilers-project.git
cd academic-compilers-project
```

### Compilação

**Usando Make (Recomendado):**
```bash
make all
```

**Compilação Manual:**
```bash
# Limpar arquivos anteriores
make clean-cache

# Gerar parser ANTLR
java -jar lib/antlr-4.8-complete.jar -visitor lang/parser/Lang.g4

# Compilar todos os componentes
javac -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang/ast/*.java
javac -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang/parser/*.java
javac -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang/semantic/*.java
javac -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang/interpreter/*.java
javac -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang/code_gen/*.java
javac -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang/LangCompiler.java
```

## 🎮 Uso do Compilador

### Sintaxe Básica

```bash
java -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang.LangCompiler [opção] [arquivo.lan]
```

### Opções Disponíveis

| Opção | Descrição |
|-------|-----------|
| `-bs` | Executa bateria de testes sintáticos |
| `-bty` | Executa bateria de testes de tipos |
| `-bsm` | Executa bateria de testes do interpretador |
| `-pp` | Pretty print do programa |
| `-tp` | Verificar tipos e imprimir ambiente de tipos |
| `-i` | Apenas interpretar |
| `-ti` | Verificar tipos e interpretar |
| `-dti` | Verificar tipos, mostrar ambiente e interpretar |
| `-gvz` | Gerar arquivo DOT para visualização da AST |

### Exemplos de Uso

**Interpretar um programa:**
```bash
make run-it
# ou
java -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang.LangCompiler -i teste.lan
```

**Verificar tipos:**
```bash
make run-tp
# ou
java -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang.LangCompiler -tp teste.lan
```

**Executar testes:**
```bash
# Testes sintáticos
make run-test-parser

# Testes do interpretador  
make run-test-it

# Testes semânticos
make run-test-semantic
```

## 📝 Sintaxe da Linguagem Lang

### Exemplo Básico

```lang
-- Definição de tipo personalizado
data Ponto {
   x :: Float;
   y :: Float;
}

-- Função principal
main() {
   p = new Ponto;
   p.x = 10.5;
   p.y = 20.3;
   print p.x;
   print p.y;
}
```

### Tipos de Dados

```lang
-- Tipos básicos
x :: Int;        -- Números inteiros
y :: Float;      -- Números com ponto flutuante  
c :: Char;       -- Caracteres
b :: Bool;       -- Booleanos (true/false)

-- Arrays
arr :: Int[];           -- Array de inteiros
matrix :: Float[][];    -- Matriz de floats

-- Tipos personalizados
p :: Ponto;             -- Tipo definido pelo usuário
```

### Estruturas de Controle

```lang
-- Condicional
if (x > 0) {
    print "Positivo";
} else {
    print "Não positivo";
}

-- Loop
iterate(10) {
    print i;
    i = i + 1;
}
```

### Funções

```lang
-- Função com parâmetros e retorno
soma(a :: Int, b :: Int) : Int {
    return a + b;
}

-- Função com múltiplos retornos
dividir(a :: Int, b :: Int) : Int, Int {
    return a / b, a % b;
}

-- Chamada de função
resultado = soma(5, 3);
quociente, resto = dividir(10, 3);
```

## 🧪 Testes

O projeto inclui um conjunto abrangente de testes organizados em:

- **`testes/sintaxe/certo/`**: Programas sintaticamente corretos
- **`testes/sintaxe/errado/`**: Programas com erros sintáticos
- **`testes/semantica/certo/`**: Programas semanticamente corretos
- **`testes/semantica/errado/`**: Programas com erros semânticos

### Executando Testes

```bash
# Todos os testes sintáticos
make run-test-parser

# Todos os testes semânticos  
make run-test-semantic

# Todos os testes do interpretador
make run-test-it
```

## 🏗️ Arquitetura do Compilador

### Fases de Compilação

1. **Análise Léxica**: Tokenização usando ANTLR
2. **Análise Sintática**: Parsing e construção da AST
3. **Análise Semântica**: Verificação de tipos e escopo
4. **Interpretação**: Execução direta da AST
5. **Geração de Código**: Produção de bytecode Jasmin ou Python

### Componentes Principais

- **`ParseAdaptorImplementation`**: Interface para análise sintática
- **`LangVisitorTypeCheck`**: Verificador de tipos
- **`LangVisitorInterpreter`**: Interpretador da linguagem
- **`CodeGeneration`**: Gerador de código

## 🛡️ Tratamento de Erros

O compilador fornece mensagens de erro detalhadas para:

- **Erros Sintáticos**: Tokens inesperados, estruturas malformadas
- **Erros Semânticos**: Tipos incompatíveis, variáveis não declaradas
- **Erros de Execução**: Divisão por zero, acesso inválido a arrays

## 🔧 Desenvolvimento

### Adicionando Novos Recursos

1. **Modificar a Gramática**: Edite `lang/parser/Lang.g4`
2. **Regenerar Parser**: Execute `make gen-parser-antlr`
3. **Atualizar AST**: Adicione novos nós em `lang/ast/`
4. **Implementar Semântica**: Atualize `lang/semantic/`
5. **Atualizar Interpretador**: Modifique `lang/interpreter/`

### Estrutura de Commits

- `feat:` para novos recursos
- `fix:` para correções de bugs
- `docs:` para documentação
- `test:` para testes

## 📋 Funcionalidades

- ✅ **Análise Léxica e Sintática**: Parsing completo usando ANTLR
- ✅ **Árvore Sintática Abstrata (AST)**: Representação estruturada do código
- ✅ **Verificação de Tipos**: Sistema robusto de tipos estáticos
- ✅ **Interpretador**: Execução direta de programas Lang
- ✅ **Geração de Código**: Suporte a Jasmin bytecode e Python
- ✅ **Tratamento de Erros**: Mensagens claras e informativas
- ✅ **Tipos Personalizados**: Definição de estruturas de dados
- ✅ **Arrays Multidimensionais**: Suporte completo a matrizes
- ✅ **Funções**: Parâmetros múltiplos e valores de retorno múltiplos

## 🤝 Contribuição

Este é um projeto acadêmico, mas contribuições são bem-vindas! Para contribuir:

1. Faça fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 👥 Autores

- **Marcos Mateus** - [@MarcosMateusOS](https://github.com/MarcosMateusOS)

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais informações.

## 🔗 Links Úteis

- [Documentação ANTLR](https://www.antlr.org/)
- [Jasmin Assembler](http://jasmin.sourceforge.net/)
- [StringTemplate](https://www.stringtemplate.org/)

---

**Projeto Acadêmico - DCC045 - Teoria dos Compiladores**
