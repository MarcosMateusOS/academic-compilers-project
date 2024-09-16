/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/
package lang.semantic;

import lang.parser.*;
import lang.interpreter.LangVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import lang.ast.Node;
import lang.ast.SuperNode;

public class SemanticImplementation implements SemanticAdaptor {

	@Override
	public SuperNode parseFile(String path) {
		try {
			CharStream stream = CharStreams.fromFileName(path);
			LangLexer lex = new LangLexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lex);
			LangParser parser = new LangParser(tokens);
			
		
			lex.addErrorListener(new BaseErrorListener() {
				@Override
				public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
						int charPositionInLine, String msg, RecognitionException e) {
					System.out.println("line " + line + ":" + charPositionInLine + " -- " + msg);
					throw new RuntimeException(e.getCause());
				}
			});

			if (parser.getNumberOfSyntaxErrors() != 0) {
				return null;
			}

			ParseTree tree = parser.prog();

			LangVisitor ast = new LangVisitor();
			
			LangVisitorTypeCheck checkSemantic = new LangVisitorTypeCheck();
			
			Node node = ast.visit(tree);

			
			node.accept(checkSemantic);
			
			if(checkSemantic.getNumErrors() > 0) {
				checkSemantic.printErrors();
				return null;	
			}

			return node;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
