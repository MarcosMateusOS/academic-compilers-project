# Variáveis
ANTLR_JAR = ./lib/antlr-4.8-complete.jar
STRING_TEMPLATE_JAR = ./lib/ST-4.3.1.jar
JASMIN_JAR = ./lib/jasmin.jar
SRC_DIR = ./lang
PARSER_DIR = $(SRC_DIR)/parser
INTERPRETER_DIR = $(SRC_DIR)/interpreter
CODE_GEN_DIR = $(SRC_DIR)/code_gen
SEMANTIC_DIR = $(SRC_DIR)/semantic
AST_DIR = $(SRC_DIR)/ast
MAIN_CLASS = $(SRC_DIR)/LangCompiler.java
JASMIN_FILE = $(CODE_GEN_DIR)/gen_files/generated.j
# Comandos
ANTLR_CMD = java -jar $(ANTLR_JAR)

# Regras principais
all: clean-cache gen-parser-antlr gen-ast gen-parser  gen-interpreter gen-semantic gen-code-gen compile

compile: 
	@echo "Compilando o projeto"
	javac -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. $(MAIN_CLASS)

gen-parser-antlr: $(PARSER_DIR)/Lang.g4
	@echo "Gerando Parser a partir de Lang.g4"
	$(ANTLR_CMD) -visitor $(PARSER_DIR)/Lang.g4

gen-parser: 
	@echo "Compilando Parser"
	javac -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. $(PARSER_DIR)/*.java

gen-semantic: 
	@echo "Compilando Semantic"
	javac -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. $(SEMANTIC_DIR)/*.java

gen-interpreter: 
	@echo "Compilando Interpreter"
	javac -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. $(INTERPRETER_DIR)/*.java
	
gen-code-gen: 
	@echo "Compilando Interpreter"
	javac -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. $(CODE_GEN_DIR)/*.java



clean-cache:
	@echo "Limpando Cache das Classes e arquivos desnecessários"
	rm -f $(PARSER_DIR)/*Listener.java \
	      $(PARSER_DIR)/LangLexer* \
	      $(PARSER_DIR)/LangParser.java \
	      $(PARSER_DIR)/Lang.interp \
	      $(PARSER_DIR)/Lang.tokens \
	      $(PARSER_DIR)/LangBaseVisitor.java \
				$(PARSER_DIR)/LangVisitor.java
	find . -type f -name "*.class" -delete
	find . -type f -name "*~" -delete

gen-ast:
	@echo "Gerando AST"
	javac -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. $(AST_DIR)/*.java

run-test-parser:
	@echo "Executando o Parser"
	java -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. lang.LangCompiler -bs
	
run-test-it: 
	@echo "Executando Interpreter"
	java -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. lang.LangCompiler -bsm
	
run-test-semantic: 
	@echo "Executando Interpreter"
	java -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. lang.LangCompiler -byt
	
	
run:
	@echo "Executando o compilador com os argumentos fornecidos"
	java -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. lang.LangCompiler $(action) $(path)

run-it:
	@echo "Executando o compilador com os argumentos fornecidos"
	java -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. lang.LangCompiler -i teste.lan

run-tp:
	@echo "Executando o compilador com os argumentos fornecidos"
	java -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. lang.LangCompiler -tp teste.lan
	
run-gen-python:
	@echo "Executando o compilador com os argumentos fornecidos"
	java -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. lang.LangCompiler -s teste.lan
	
run-gen-jasmin:
	@echo "Executando o compilador com os argumentos fornecidos"
	java -cp $(ANTLR_JAR):$(STRING_TEMPLATE_JAR):. lang.LangCompiler -pp teste.lan
	
	
run-jasmin-file:
	@echo "Executando arquivo Jasmin"
	java -jar $(JASMIN_JAR) $(JASMIN_FILE)
	java JasminGenerated
	
.PHONY: all compile gen-parser clean-cache gen-ast run
