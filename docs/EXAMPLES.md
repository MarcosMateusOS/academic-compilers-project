# Exemplos da Linguagem Lang

Esta coleção contém exemplos práticos da linguagem **Lang** para demonstrar suas funcionalidades.

## 🚀 Exemplos Básicos

### 1. Hello World

```lang
main() {
    print "Hello, World!";
}
```

### 2. Variáveis e Tipos

```lang
main() {
    x :: Int;
    y :: Float;
    c :: Char;
    b :: Bool;
    
    x = 42;
    y = 3.14;
    c = 'A';
    b = true;
    
    print x;
    print y;
    print c;
    print b;
}
```

### 3. Entrada e Saída

```lang
main() {
    nome :: Char[];
    idade :: Int;
    
    print "Digite seu nome: ";
    read nome;
    print "Digite sua idade: ";
    read idade;
    
    print "Olá, ";
    print nome;
    print "! Você tem ";
    print idade;
    print " anos.";
}
```

## 🔢 Operações Aritméticas

### 4. Calculadora Básica

```lang
soma(a :: Int, b :: Int) : Int {
    return a + b;
}

subtracao(a :: Int, b :: Int) : Int {
    return a - b;
}

multiplicacao(a :: Int, b :: Int) : Int {
    return a * b;
}

divisao(a :: Int, b :: Int) : Float {
    return a / b;
}

main() {
    x :: Int;
    y :: Int;
    
    x = 10;
    y = 3;
    
    print "Soma: ";
    print soma(x, y);
    
    print "Subtração: ";
    print subtracao(x, y);
    
    print "Multiplicação: ";
    print multiplicacao(x, y);
    
    print "Divisão: ";
    print divisao(x, y);
}
```

## 🔄 Estruturas de Controle

### 5. Condicionais

```lang
main() {
    numero :: Int;
    
    print "Digite um número: ";
    read numero;
    
    if (numero > 0) {
        print "Número positivo";
    } else {
        if (numero < 0) {
            print "Número negativo";
        } else {
            print "Número é zero";
        }
    }
}
```

### 6. Loops

```lang
main() {
    n :: Int;
    i :: Int;
    
    print "Digite um número: ";
    read n;
    
    print "Contagem de 1 até ";
    print n;
    print ":";
    
    i = 1;
    iterate(n) {
        print i;
        i = i + 1;
    }
}
```

### 7. Tabuada

```lang
main() {
    numero :: Int;
    i :: Int;
    
    print "Digite um número para a tabuada: ";
    read numero;
    
    i = 1;
    iterate(10) {
        resultado = numero * i;
        print numero;
        print " x ";
        print i;
        print " = ";
        print resultado;
        i = i + 1;
    }
}
```

## 🏗️ Tipos Personalizados

### 8. Estrutura Simples

```lang
data Pessoa {
    nome :: Char[];
    idade :: Int;
    altura :: Float;
}

main() {
    p :: Pessoa;
    
    p = new Pessoa;
    
    print "Digite o nome: ";
    read p.nome;
    
    print "Digite a idade: ";
    read p.idade;
    
    print "Digite a altura: ";
    read p.altura;
    
    print "Dados da pessoa:";
    print "Nome: ";
    print p.nome;
    print "Idade: ";
    print p.idade;
    print "Altura: ";
    print p.altura;
}
```

### 9. Geometria - Retângulo

```lang
data Retangulo {
    largura :: Float;
    altura :: Float;
}

area(r :: Retangulo) : Float {
    return r.largura * r.altura;
}

perimetro(r :: Retangulo) : Float {
    return 2.0 * (r.largura + r.altura);
}

main() {
    ret :: Retangulo;
    
    ret = new Retangulo;
    
    print "Digite a largura: ";
    read ret.largura;
    
    print "Digite a altura: ";
    read ret.altura;
    
    a = area(ret);
    p = perimetro(ret);
    
    print "Área: ";
    print a;
    
    print "Perímetro: ";
    print p;
}
```

### 10. Sistema de Pontos

```lang
data Ponto {
    x :: Float;
    y :: Float;
}

distancia(p1 :: Ponto, p2 :: Ponto) : Float {
    dx = p2.x - p1.x;
    dy = p2.y - p1.y;
    return (dx * dx + dy * dy); -- Simplificado (sem raiz quadrada)
}

main() {
    p1 :: Ponto;
    p2 :: Ponto;
    
    p1 = new Ponto;
    p2 = new Ponto;
    
    print "Primeiro ponto:";
    print "X: ";
    read p1.x;
    print "Y: ";
    read p1.y;
    
    print "Segundo ponto:";
    print "X: ";
    read p2.x;
    print "Y: ";
    read p2.y;
    
    dist = distancia(p1, p2);
    
    print "Distância ao quadrado: ";
    print dist;
}
```

## 📊 Arrays

### 11. Array Básico

```lang
main() {
    numeros :: Int[];
    soma :: Int;
    i :: Int;
    
    numeros = new Int[5];
    
    print "Digite 5 números:";
    i = 0;
    iterate(5) {
        print "Número ";
        print i + 1;
        print ": ";
        read numeros[i];
        i = i + 1;
    }
    
    soma = 0;
    i = 0;
    iterate(5) {
        soma = soma + numeros[i];
        i = i + 1;
    }
    
    print "Soma dos números: ";
    print soma;
}
```

### 12. Matriz

```lang
main() {
    matriz :: Int[][];
    linhas :: Int;
    colunas :: Int;
    i :: Int;
    j :: Int;
    
    linhas = 3;
    colunas = 3;
    
    matriz = new Int[linhas][colunas];
    
    print "Preenchendo matriz 3x3:";
    i = 0;
    iterate(linhas) {
        j = 0;
        iterate(colunas) {
            print "Elemento [";
            print i;
            print "][";
            print j;
            print "]: ";
            read matriz[i][j];
            j = j + 1;
        }
        i = i + 1;
    }
    
    print "Matriz digitada:";
    i = 0;
    iterate(linhas) {
        j = 0;
        iterate(colunas) {
            print matriz[i][j];
            print " ";
            j = j + 1;
        }
        print '\n';
        i = i + 1;
    }
}
```

## 🔢 Funções Avançadas

### 13. Múltiplos Retornos

```lang
dividir(dividendo :: Int, divisor :: Int) : Int, Int {
    quociente = dividendo / divisor;
    resto = dividendo % divisor;
    return quociente, resto;
}

main() {
    a :: Int;
    b :: Int;
    q :: Int;
    r :: Int;
    
    print "Digite o dividendo: ";
    read a;
    
    print "Digite o divisor: ";
    read b;
    
    q, r = dividir(a, b);
    
    print "Quociente: ";
    print q;
    
    print "Resto: ";
    print r;
}
```

### 14. Funções Recursivas (Simulação com Loop)

```lang
fatorial(n :: Int) : Int {
    resultado :: Int;
    i :: Int;
    
    resultado = 1;
    i = 1;
    
    iterate(n) {
        resultado = resultado * i;
        i = i + 1;
    }
    
    return resultado;
}

fibonacci(n :: Int) : Int {
    a :: Int;
    b :: Int;
    temp :: Int;
    i :: Int;
    
    if (n == 0) {
        return 0;
    }
    
    if (n == 1) {
        return 1;
    }
    
    a = 0;
    b = 1;
    i = 2;
    
    iterate(n - 1) {
        temp = a + b;
        a = b;
        b = temp;
        i = i + 1;
    }
    
    return b;
}

main() {
    num :: Int;
    
    print "Digite um número: ";
    read num;
    
    fat = fatorial(num);
    fib = fibonacci(num);
    
    print "Fatorial de ";
    print num;
    print ": ";
    print fat;
    
    print "Fibonacci de ";
    print num;
    print ": ";
    print fib;
}
```

## 🎨 Programas Completos

### 15. Sistema de Biblioteca

```lang
data Livro {
    titulo :: Char[];
    autor :: Char[];
    ano :: Int;
    disponivel :: Bool;
}

data Biblioteca {
    livros :: Livro[];
    total :: Int;
}

adicionarLivro(bib :: Biblioteca, livro :: Livro) {
    bib.livros[bib.total] = livro;
    bib.total = bib.total + 1;
}

buscarLivro(bib :: Biblioteca, titulo :: Char[]) : Int {
    i :: Int;
    
    i = 0;
    iterate(bib.total) {
        if (bib.livros[i].titulo == titulo) {
            return i;
        }
        i = i + 1;
    }
    
    return -1; -- Não encontrado
}

main() {
    biblioteca :: Biblioteca;
    livro :: Livro;
    opcao :: Int;
    
    biblioteca = new Biblioteca;
    biblioteca.livros = new Livro[100]; -- Máximo 100 livros
    biblioteca.total = 0;
    
    print "Sistema de Biblioteca";
    print "1 - Adicionar livro";
    print "2 - Buscar livro";
    print "0 - Sair";
    
    print "Opção: ";
    read opcao;
    
    if (opcao == 1) {
        livro = new Livro;
        
        print "Título: ";
        read livro.titulo;
        
        print "Autor: ";
        read livro.autor;
        
        print "Ano: ";
        read livro.ano;
        
        livro.disponivel = true;
        
        adicionarLivro(biblioteca, livro);
        
        print "Livro adicionado com sucesso!";
    }
    
    if (opcao == 2) {
        titulo_busca :: Char[];
        indice :: Int;
        
        print "Digite o título: ";
        read titulo_busca;
        
        indice = buscarLivro(biblioteca, titulo_busca);
        
        if (indice >= 0) {
            print "Livro encontrado:";
            print "Título: ";
            print biblioteca.livros[indice].titulo;
            print "Autor: ";
            print biblioteca.livros[indice].autor;
            print "Ano: ";
            print biblioteca.livros[indice].ano;
        } else {
            print "Livro não encontrado.";
        }
    }
}
```

### 16. Jogo da Adivinhação

```lang
main() {
    numero_secreto :: Int;
    palpite :: Int;
    tentativas :: Int;
    acertou :: Bool;
    
    numero_secreto = 42; -- Número fixo para simplicidade
    tentativas = 0;
    acertou = false;
    
    print "=== JOGO DA ADIVINHAÇÃO ===";
    print "Tente adivinhar o número entre 1 e 100!";
    
    iterate(10) { -- Máximo 10 tentativas
        if (!acertou) {
            tentativas = tentativas + 1;
            
            print "Tentativa ";
            print tentativas;
            print ": ";
            read palpite;
            
            if (palpite == numero_secreto) {
                print "PARABÉNS! Você acertou!";
                print "Número de tentativas: ";
                print tentativas;
                acertou = true;
            } else {
                if (palpite < numero_secreto) {
                    print "Muito baixo! Tente novamente.";
                } else {
                    print "Muito alto! Tente novamente.";
                }
            }
        }
    }
    
    if (!acertou) {
        print "Que pena! O número era: ";
        print numero_secreto;
    }
}
```

## 🧪 Exemplos para Teste

### 17. Teste de Operadores

```lang
main() {
    a :: Int;
    b :: Int;
    
    a = 10;
    b = 3;
    
    print "a = ";
    print a;
    print "b = ";
    print b;
    
    print "a + b = ";
    print a + b;
    
    print "a - b = ";
    print a - b;
    
    print "a * b = ";
    print a * b;
    
    print "a / b = ";
    print a / b;
    
    print "a % b = ";
    print a % b;
    
    print "a < b: ";
    print a < b;
    
    print "a == b: ";
    print a == b;
    
    print "a != b: ";
    print a != b;
}
```

### 18. Teste de Arrays Complexos

```lang
data Estudante {
    nome :: Char[];
    notas :: Float[];
    media :: Float;
}

calcularMedia(estudante :: Estudante) {
    soma :: Float;
    i :: Int;
    
    soma = 0.0;
    i = 0;
    
    iterate(4) { -- 4 notas
        soma = soma + estudante.notas[i];
        i = i + 1;
    }
    
    estudante.media = soma / 4.0;
}

main() {
    turma :: Estudante[];
    num_estudantes :: Int;
    i :: Int;
    j :: Int;
    
    num_estudantes = 3;
    turma = new Estudante[num_estudantes];
    
    i = 0;
    iterate(num_estudantes) {
        turma[i] = new Estudante;
        turma[i].notas = new Float[4];
        
        print "Estudante ";
        print i + 1;
        print " - Nome: ";
        read turma[i].nome;
        
        j = 0;
        iterate(4) {
            print "Nota ";
            print j + 1;
            print ": ";
            read turma[i].notas[j];
            j = j + 1;
        }
        
        calcularMedia(turma[i]);
        i = i + 1;
    }
    
    print "=== RELATÓRIO DA TURMA ===";
    i = 0;
    iterate(num_estudantes) {
        print "Estudante: ";
        print turma[i].nome;
        print " - Média: ";
        print turma[i].media;
        i = i + 1;
    }
}
```

## 📝 Dicas para Execução

Para executar qualquer um destes exemplos:

1. Salve o código em um arquivo `.lan` (ex: `exemplo.lan`)
2. Compile o projeto: `make all`
3. Execute: `java -cp lib/antlr-4.8-complete.jar:lib/ST-4.3.1.jar:. lang.LangCompiler -i exemplo.lan`

Ou use os comandos make predefinidos:
- `make run-it` (executa `teste.lan`)
- `make run action="-i" path="exemplo.lan"` (executa arquivo específico)