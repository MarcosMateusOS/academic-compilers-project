package lang.interpreter;

import lang.parser.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;



import lang.ast.Node;
import lang.ast.SuperNode;





public class InterpreterAdaptorImplementation implements InterpreterAdaptor {

	@Override
	public SuperNode parseFile(String path){
		try {	CharStream stream = CharStreams.fromFileName(path);
		// create a lexer that feeds off of stream
		LangLexer lex = new LangLexer(stream);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lex);
		System.out.println(tokens.getText());
		// create a parser that feeds off the tokens buffer
		LangParser parser = new LangParser(tokens);
		// tell ANTLR to does not automatically build an AST
		
		ParseTree tree = parser.prog();

		tokens.fill();  // Garante que todos os tokens sejam consumidos
        for (Token token : tokens.getTokens()) {
            System.out.println("Token: " + token.getText() + " - Tipo: " + lex.getVocabulary().getSymbolicName(token.getType()));
        }
		
		/*
		 * if(parser.getNumberOfSyntaxErrors() == 0){
			// Create a visitor
			Visitor v = new Visitor();
			// Visit the tree
			return v.visit(tree);
		}
		 */

		 if(parser.getNumberOfSyntaxErrors() != 0){
			return null;
		 }

		 LangVisitor ast = new LangVisitor();
		 System.out.println("Tree");
		 System.out.println(tree.toStringTree());
	     Node node = ast.visit(tree);
		 
		 return node;
				
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
