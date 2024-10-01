/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/

package lang.parser;

import lang.parser.*;

import javax.swing.JFrame;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import lang.ast.Node;
import lang.ast.SuperNode;
import lang.interpreter.LangVisitor;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.util.Arrays;

public class ParseAdaptorImplementation implements ParseAdaptor {

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
			// tell ANTLR to does not automatically build an AST
			
			lex.removeErrorListeners();
			lex.addErrorListener(new BaseErrorListener() {
				@Override
				public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
						int charPositionInLine, String msg, RecognitionException e) {
					System.out.println("line " + line + ":" + charPositionInLine + " -- " + msg);
					throw new RuntimeException(e.getCause());
				}
			});

			ParseTree tree = parser.prog();

			if (parser.getNumberOfSyntaxErrors() != 0) {
				return null;
			}

			LangVisitor ast = new LangVisitor();

			Node node = ast.visit(tree);


			return node;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
