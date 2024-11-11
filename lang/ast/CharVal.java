package lang.ast;

import lang.interpreter.Visitor;

//Regra: | CHAR_VAL                         #CharVal
public class CharVal extends Exp {

	private char value;

	public CharVal(int line, int col, String value) {
		super(line, col);
		this.formatChar(value);
	}

	private void formatChar(String valueString) {

		if (valueString.charAt(1) == '\\') { 

			String symbol = valueString.substring(1, valueString.length() - 1); 

			switch (symbol.charAt(1)) {
			case 'n':
				this.value = '\n';
				break;
			case 't':
				this.value = '\t';
				break;
			case 'b':
				this.value = '\b';
				break;
			case 'r':
				this.value = '\r';
				break;
			case '\\': // Caractere é a contra-barra
				this.value = '\\';
				break;
			case '\'': // Caractere é a aspas simples \'
				this.value = '\'';
				break;
			default:
				throw new IllegalArgumentException("caractere de escape desconhecido: \\" + symbol);
			}
			

		} else {
			this.value = valueString.charAt(1);

		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('\''); // Adiciona a aspas simples inicial

		// Tratamento dos literais de caracteres especiais
		switch (value) {
		case '\n':
			sb.append("\\n");
			break;
		case '\t':
			sb.append("\\t");
			break;
		case '\b':
			sb.append("\\b");
			break;
		case '\r':
			sb.append("\\r");
			break;
		case '\\':
			sb.append("\\\\");
			break;
		case '\'':
			sb.append("\\'");
			break;
		default:
			sb.append(value); // Adiciona o caractere literal
			break;
		}

		sb.append('\''); // Adiciona a aspas simples final
		return sb.toString(); // Retorna o resultado final como string
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public char getValue() {
		return this.value;
	}

}
