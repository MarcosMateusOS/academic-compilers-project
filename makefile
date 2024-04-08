run-lexer:
	@echo "Limpando Cache da Class"
	rm -rf ./build


	@echo "Compilando Jflex"
	java -jar ./lib/jflex-full-1.8.2.jar ./src/modules/lexical/Exemplo.jflex

	@echo "Compilando Modulo Lexical"
	javac -d classes ./src/*.java ./src/modules/**/*.java
	

