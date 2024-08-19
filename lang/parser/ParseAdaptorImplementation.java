package lang.parser;

import lang.parser.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


import java.io.IOException;
import lang.ast.Node;
import lang.ast.SuperNode;





public class ParseAdaptorImplementation implements ParseAdaptor {

	@Override
	public SuperNode parseFile(String path) throws IOException {
		CharStream stream = CharStreams.fromFileName(path);
		// create a lexer that feeds off of stream
		LangLexer lex = new LangLexer(stream);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lex);
		// create a parser that feeds off the tokens buffer
		LangParser parser = new LangParser(tokens);
		// tell ANTLR to does not automatically build an AST
		parser.setBuildParseTree(false);
		ParseTree tree = parser.prog();
		
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
		

		return new Node();
	}

}
