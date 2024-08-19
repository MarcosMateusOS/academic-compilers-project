# Variáveis
ANTLR_JAR = ./lib/antlr-4.8-complete.jar
SRC_DIR = ./lang
PARSER_DIR = $(SRC_DIR)/parser
AST_DIR = $(SRC_DIR)/ast
MAIN_CLASS = $(SRC_DIR)/LangCompiler.java

# Comandos
ANTLR_CMD = java -jar $(ANTLR_JAR)

# Regras principais
all: clean-cache gen-parser-antlr gen-ast gen-parser compile

compile: 
	@echo "Compilando o projeto"
	javac -cp $(ANTLR_JAR):. $(MAIN_CLASS)

gen-parser-antlr: $(PARSER_DIR)/Lang.g4
	@echo "Gerando Parser a partir de Lang.g4"
	$(ANTLR_CMD) -visitor $(PARSER_DIR)/Lang.g4

gen-parser: 
	@echo "Compilando Parser"
	javac -cp $(ANTLR_JAR):. $(PARSER_DIR)/*.java

clean-cache:
	@echo "Limpando Cache das Classes e arquivos desnecessários"
	rm -f $(PARSER_DIR)/*Listener.java \
	      $(PARSER_DIR)/LangLexer* \
	      $(PARSER_DIR)/LangParser.java \
	      $(PARSER_DIR)/Lang.interp \
	      $(PARSER_DIR)/Lang.tokens
	find . -type f -name "*.class" -delete
	find . -type f -name "*~" -delete

gen-ast:
	@echo "Gerando AST"
	javac -cp $(ANTLR_JAR) $(AST_DIR)/*.java

run-test:
	@echo "Executando o compilador"
	java -cp $(ANTLR_JAR):. lang.LangCompiler -bs
run: 
	@echo "Executando o compilador"
	java -cp $(ANTLR_JAR):. lang.LangCompiler -i $(file)
.PHONY: all compile gen-parser clean-cache gen-ast run
