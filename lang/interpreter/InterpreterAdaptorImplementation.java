package lang.interpreter;

import lang.parser.*;
import lang.interpreter.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import lang.ast.Node;
import lang.ast.SuperNode;

public class InterpreterAdaptorImplementation implements InterpreterAdaptor {

	@Override
	public SuperNode parseFile(String path) {
		try {
			CharStream stream = CharStreams.fromFileName(path);
			// create a lexer that feeds off of stream
			LangLexer lex = new LangLexer(stream);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lex);
			System.out.println(tokens.getText());
			// create a parser that feeds off the tokens buffer
			LangParser parser = new LangParser(tokens);
			// tell ANTLR to does not automatically build an Alex.removeErrorListeners();
			
		
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
			Node node = ast.visit(tree);

			LangVisitorInterpreter interpreter = new LangVisitorInterpreter();
			node.accept(interpreter);

			return node;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
