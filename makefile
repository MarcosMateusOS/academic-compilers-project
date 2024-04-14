run-lexer:
	@echo "Limpando Cache das Classes"
	rm -rf ./classes
	rm -rf ./modules/lexical/Lexer.java


	@echo "Compilando Jflex"
	java -jar ./lib/jflex-full-1.8.2.jar ./src/modules/lexical/LangLex.jflex

	@echo "Compilando Modulo Lexical"
	javac -d classes ./src/*.java ./src/modules/**/*.java
	