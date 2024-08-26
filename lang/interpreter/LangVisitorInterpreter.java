package lang.interpreter;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import lang.ast.AndExp;
import lang.ast.ArrayAccess;
import lang.ast.ArrayType;
import lang.ast.AssignCommand;
import lang.ast.BoolType;
import lang.ast.CharType;
import lang.ast.CharVal;
import lang.ast.Command;
import lang.ast.CommandList;
import lang.ast.Data;
import lang.ast.DataDeclaration;
import lang.ast.DivExp;
import lang.ast.DotLValue;
import lang.ast.EqualityExp;
import lang.ast.Exp;
import lang.ast.False;
import lang.ast.FloatType;
import lang.ast.FloatVal;
import lang.ast.FunCallParams;
import lang.ast.FuncReturnExp;
import lang.ast.Function;
import lang.ast.FunctionCall;
import lang.ast.IDLValue;
import lang.ast.IfCommand;
import lang.ast.IfElseCommand;
import lang.ast.IntType;
import lang.ast.IntVal;
import lang.ast.IterateCommand;
import lang.ast.LValue;
import lang.ast.LesserThanExp;
import lang.ast.MinusExp;
import lang.ast.MinusSignExp;
import lang.ast.ModExp;
import lang.ast.MultExp;
import lang.ast.NameType;
import lang.ast.NewTypeExp;
import lang.ast.Node;
import lang.ast.NotEqualExp;
import lang.ast.NotSignExp;
import lang.ast.Null;
import lang.ast.Params;
import lang.ast.ParenExp;
import lang.ast.PlusExp;
import lang.ast.PrintCommand;
import lang.ast.Program;
import lang.ast.ReadCommand;
import lang.ast.ReturnCommand;
import lang.ast.ReturnMultCommand;
import lang.ast.True;
import lang.ast.Type;

public class LangVisitorInterpreter extends Visitor {
	private HashMap<String, Data> datas; // Estrutura de dados para armazenar os tipos
	private HashMap<String, Function> functions;
	private Stack<HashMap<String, Object>> env;// Pilha de memoria
	private Stack<Object> operands;
	private Stack<Object> params;
	private boolean modeDebug;

	public LangVisitorInterpreter() {
		/* Construtor inicializando o interpretador */
		datas = new HashMap<String, Data>();
		functions = new HashMap<String, Function>();
		env = new Stack<HashMap<String, Object>>();
		env.push(new HashMap<String, Object>());
		operands = new Stack<Object>();
		params = new Stack<Object>();
		modeDebug = true;
	}//

	@Override
	public void visit(Program p) {
		try {
			Node main = null;
			if (this.modeDebug) {
				System.out.println("-------------- Init Program ----------------");
			}
			if (p.getDatas() != null) {
				for (Data data : p.getDatas()) {
					datas.put(data.getId(), data);
				}

			}

			if (p.getFunction() != null) {
				for (Function func : p.getFunction()) {

					if (func.getID().equals("main")) {
						main = func;
					}
					System.out.println(func.toString());
					functions.put(func.getID(), func);
				}

			}
			if (main == null) {
				throw new RuntimeException("Não há uma função chamada inicio ! abortando ! ");
			}

			main.accept(this);

		} catch (Exception x) {
			if (this.modeDebug) {
				System.out.println("Error Program");
			}
			this.throwRuntimeException(p, x.getMessage());
		}

	}

	@Override
	public void visit(Data d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(DataDeclaration dd) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(IntType it) {
		try {
			if (params.size() != 0) {
				operands.push(params.pop());
			} else {
				operands.push(it);
			}

		} catch (Exception x) {
			this.throwRuntimeException(it, x.getMessage());
		}
	}

	@Override
	public void visit(BoolType bt) {
		try {
			if (params.size() != 0) {
				operands.push(params.pop());
			} else {
				operands.push(bt);
			}

		} catch (Exception x) {
			this.throwRuntimeException(bt, x.getMessage());
		}

	}

	@Override
	public void visit(CharType ct) {
		try {
			if (params.size() != 0) {
				operands.push(params.pop());
			} else {
				operands.push(ct);
			}

		} catch (Exception x) {
			this.throwRuntimeException(ct, x.getMessage());
		}

	}

	@Override
	public void visit(FloatType ft) {
		try {
			if (params.size() != 0) {
				operands.push(params.pop());
			} else {
				operands.push(ft);
			}

		} catch (Exception x) {
			this.throwRuntimeException(ft, x.getMessage());
		}

	}

	@Override
	public void visit(Function f) {
		try {
			if (this.modeDebug) {
				System.out.println("-------------- Init Function ----------------");
				System.out.println(f.getID());
			}
			HashMap<String, Object> localEnv = new HashMap<String, Object>();

			if (f.getParams() != null) {
				System.out.println("-------------- Adicionando params ----------------");

				Params funcParams = f.getParams();
				List<String> paramsIds = funcParams.getIDs();
				System.out.println(funcParams.getIDs());
				funcParams.accept(this);

				for (int i = 0; i < paramsIds.size(); i++) {
					localEnv.put(paramsIds.get(i), operands.pop());
				}

			}
			env.push(localEnv);
			System.out.println("-------------- Command function ----------------");
			System.out.println(f.getCommands());
			for (Command command : f.getCommands()) {
				command.accept(this);
			}

			env.pop();
			System.out.println(f.toString());
		} catch (Exception x) {
			if (this.modeDebug) {
				System.out.println("Error Command");
			}
			this.throwRuntimeException(f, x.getMessage());
		}

	}

	@Override
	public void visit(Params p) {
		try {
			if (this.modeDebug) {
				System.out.println("-------------- Init Params ----------------");
				System.out.println(p.toString());
			}

			for (Type type : p.getTypes()) {
				type.accept(this);
			}

		} catch (Exception x) {
			if (this.modeDebug) {
				System.out.println("Error Params");
			}
			this.throwRuntimeException(p, x.getMessage());
		}

	}

	@Override
	public void visit(ArrayType at) {
		try {
			if (params.size() != 0) {
				operands.push(params.pop());
			} else {
				operands.push(at);
			}

		} catch (Exception x) {
			this.throwRuntimeException(at, x.getMessage());
		}
	}

	@Override
	public void visit(NameType at) {
		try {
			if (params.size() != 0) {
				operands.push(params.pop());
			} else {
				operands.push(at);
			}

		} catch (Exception x) {
			this.throwRuntimeException(at, x.getMessage());
		}

	}

	@Override
	public void visit(Command cm) {
		try {

			if (this.modeDebug) {
				System.out.println("-------------- Init Command ----------------");
				System.out.println(cm.toString());
			}

			cm.accept(this);
		} catch (Exception x) {
			this.throwRuntimeException(cm, x.getMessage());
		}

	}

	@Override
	public void visit(CommandList cl) {
		try {

			if (this.modeDebug) {
				System.out.println("-------------- Init CommandList ----------------");
				System.out.println(cl.toString());
			}

			for (Command command : cl.getCommands()) {
				command.accept(this);
			}

		} catch (Exception x) {
			this.throwRuntimeException(cl, x.getMessage());
		}

	}

	@Override
	public void visit(IfCommand ifc) {
		try {

			if (this.modeDebug) {
				System.out.println("-------------- Init IfCommand ----------------");
				System.out.println(ifc.toString());
			}

			ifc.getExp().accept(this);

			if ((Boolean) operands.pop()) {
				ifc.getCmd().accept(this);

			}

		} catch (Exception x) {
			this.throwRuntimeException(ifc, x.getMessage());
		}

	}

	@Override
	public void visit(IfElseCommand ifElsec) {
		try {

			if (this.modeDebug) {
				System.out.println("-------------- Init IfElseCommand ----------------");
				System.out.println(ifElsec.toString());
			}

			ifElsec.getExp().accept(this);

			if ((Boolean) operands.pop()) {
				ifElsec.getCmd().accept(this);
			} else {
				ifElsec.getElsCmd().accept(this);
			}

		} catch (Exception x) {
			this.throwRuntimeException(ifElsec, x.getMessage());
		}

	}

	@Override
	public void visit(IterateCommand iteratec) {
		try {
			if (this.modeDebug) {
				System.out.println("-------------- Init IterateCommand ----------------");
				System.out.println(iteratec.toString());
			}
			System.out.println("-------------- LOOP ----------------");
			// Avalia a condição inicial
			Exp condition = iteratec.getExp();
			condition.accept(this);
			System.out.println(condition.toString());
			operands.pop();//Empilha a condição
			
			// Executa o loop enquanto a condição for verdadeira
			while ((Boolean) operands.pop()) {
				iteratec.getCommand().accept(this);
				System.out.println(iteratec.getCommand().toString());

				// Reavaliar a condição após a execução do comando do loop
				condition.accept(this);
				operands.pop();
			}

		} catch (Exception x) {
			if (this.modeDebug) {
				System.out.println("Error IterateCommand");
				System.out.println(x.getMessage());
			}
			this.throwRuntimeException(iteratec, x.getMessage());
		}
	}

	@Override
	public void visit(ReadCommand readc) {
		try {

			if (this.modeDebug) {
				System.out.println("-------------- Init ReadCommand ----------------");
				System.out.println(readc.toString());
			}

			LValue lvalue = readc.getLValue();

			try (Scanner reader = new Scanner(System.in)) {
				Object value = reader.next();
				env.peek().put(lvalue.getID(), value);
			} catch (Exception x) {
				throwRuntimeException(readc, x.getMessage());
			}

		} catch (Exception x) {
			this.throwRuntimeException(readc, x.getMessage());
		}

	}

	@Override
	public void visit(PrintCommand printc) {
		try {

			if (this.modeDebug) {
				System.out.println("-------------- Init ReadCommand ----------------");
				System.out.println(printc.toString());
			}

			printc.getExp().accept(this);
			Object obj = operands.pop();
			System.out.print(obj);

		} catch (Exception x) {
			this.throwRuntimeException(printc, x.getMessage());
		}

	}

	@Override
	public void visit(ReturnCommand returnc) {
		try {

			if (this.modeDebug) {
				System.out.println("--------------Return----------------");
				System.out.println(returnc.toString());
			}

			returnc.getExp().accept(this);

		} catch (Exception x) {
			this.throwRuntimeException(returnc, x.getMessage());
		}

	}

	@Override
	public void visit(ReturnMultCommand returnMultc) {
		try {

			if (this.modeDebug) {
				System.out.println("--------------Return command----------------");
				System.out.println(returnMultc.toString());
			}
			for (Exp exp : returnMultc.getExps()) {
				exp.accept(this);
			}

		} catch (Exception x) {
			this.throwRuntimeException(returnMultc, x.getMessage());
		}

	}

	@Override
	public void visit(AssignCommand assignc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(FunctionCall fc) {
		try {
			if (this.modeDebug) {
				System.out.println("--------------Function Call----------------");
				System.out.println(fc.toString());
			}

			// Busca a Função na lista de funções do programa
			Function funct = functions.get(fc.getID());

			if (funct == null) {
				throw new RuntimeException("Função " + fc.getID() + " não encontrada");
			}

			FunCallParams paramsFcall = fc.getFunCallParams();

			// Realiza a verificação de todos os parâmetros da função
			if (paramsFcall != null && paramsFcall.getExps() != null) {
				// Visita as EXP dos parâmetros da função
				for (Exp exp : paramsFcall.getExps()) {
					exp.accept(this);
					params.push(operands.pop());
				}
			}

			// Executa a função
			funct.accept(this);

			List<LValue> lvalues = fc.getLvalues();

			if (lvalues != null) {
				// Inversão da ordem para associar corretamente os valores retornados às
				// variáveis
				for (int i = lvalues.size() - 1; i >= 0; i--) {
					LValue l = lvalues.get(i);
					env.peek().put(l.getID(), operands.pop());
				}
			}

		} catch (Exception x) {
			this.throwRuntimeException(fc, x.getMessage());
		}
	}

	@Override
	public void visit(AndExp andexp) {
		try {
			andexp.getLeft().accept(this);
			andexp.getRight().accept(this);

			Object left = operands.pop();
			Object right = operands.pop();

			operands.push(this.compareValues(left, right, "&&"));

		} catch (Exception x) {
			this.throwRuntimeException(andexp, x.getMessage());
		}

	}

	@Override
	public void visit(LesserThanExp lesseThan) {
		try {
			lesseThan.getLeft().accept(this);
			lesseThan.getRight().accept(this);

			Object left = operands.pop();
			Object right = operands.pop();

			operands.push(this.compareValues(left, right, "<"));

		} catch (Exception x) {
			throw new RuntimeException(
					" (" + lesseThan.getLine() + ", " + lesseThan.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(EqualityExp equalityExp) {
		try {
			equalityExp.getLeft().accept(this);
			equalityExp.getRight().accept(this);

			Object left = operands.pop();
			Object right = operands.pop();

			operands.push(this.compareValues(left, right, "=="));

		} catch (Exception x) {
			throw new RuntimeException(
					" (" + equalityExp.getLine() + ", " + equalityExp.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(NotEqualExp notEqualExp) {
		try {
			notEqualExp.getLeft().accept(this);
			notEqualExp.getRight().accept(this);

			Object left = operands.pop();
			Object right = operands.pop();

			operands.push(this.compareValues(left, right, "!="));

		} catch (Exception x) {
			throw new RuntimeException(
					" (" + notEqualExp.getLine() + ", " + notEqualExp.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(PlusExp plusExp) {
		try {
			plusExp.getLeft().accept(this);
			plusExp.getRight().accept(this);

			Object left = operands.pop();
			Object right = operands.pop();

			operands.push(this.mathOperations(left, right, '+'));

		} catch (Exception x) {
			throw new RuntimeException(" (" + plusExp.getLine() + ", " + plusExp.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(MinusExp minusExp) {
		try {
			minusExp.getLeft().accept(this);
			minusExp.getRight().accept(this);

			Object left = operands.pop();
			Object right = operands.pop();

			operands.push(this.mathOperations(left, right, '-'));

		} catch (Exception x) {
			throw new RuntimeException(" (" + minusExp.getLine() + ", " + minusExp.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(MultExp multExp) {
		try {
			multExp.getLeft().accept(this);
			multExp.getRight().accept(this);

			Object left = operands.pop();
			Object right = operands.pop();

			operands.push(this.mathOperations(left, right, '*'));

		} catch (Exception x) {
			throw new RuntimeException(" (" + multExp.getLine() + ", " + multExp.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(DivExp divExp) {
		try {
			divExp.getLeft().accept(this);
			divExp.getRight().accept(this);

			Object left = operands.pop();
			Object right = operands.pop();

			operands.push(this.mathOperations(left, right, '/'));

		} catch (Exception x) {
			throw new RuntimeException(" (" + divExp.getLine() + ", " + divExp.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(ModExp modExp) {
		try {
			modExp.getLeft().accept(this);
			modExp.getRight().accept(this);

			Object left = operands.pop();
			Object right = operands.pop();

			operands.push(this.mathOperations(left, right, '%'));

		} catch (Exception x) {
			throw new RuntimeException(" (" + modExp.getLine() + ", " + modExp.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(NotSignExp notSignExp) {
		try {
			notSignExp.getExp().accept(this);
			Object value = operands.pop();
			if (!(value instanceof Boolean))
				throw new RuntimeException(" (" + notSignExp.getLine() + ", " + notSignExp.getColumn()
						+ ")- Operação inválidada pra o tipo logico '!'");

		} catch (Exception x) {
			throw new RuntimeException(
					" (" + notSignExp.getLine() + ", " + notSignExp.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(MinusSignExp minusSignExp) {
		try {
			minusSignExp.getExp().accept(this);
			Object value = operands.pop();
			if (!(value instanceof Integer || value instanceof Float))
				throw new RuntimeException(" (" + minusSignExp.getLine() + ", " + minusSignExp.getColumn()
						+ ")- Operação inválidada pra o tipo logico '-'");

			if (value instanceof Integer)
				operands.push((Integer) value - 1);

			if (value instanceof Float)
				operands.push((Float) value - 1);

		} catch (Exception x) {
			throw new RuntimeException(
					" (" + minusSignExp.getLine() + ", " + minusSignExp.getColumn() + ") " + x.getMessage());
		}
	}

	@Override
	public void visit(True t) {
		try {

			operands.push(true);

		} catch (Exception x) {
			throw new RuntimeException(" (" + t.getLine() + ", " + t.getColumn() + ") " + x.getMessage());
		}
	}

	@Override
	public void visit(False f) {
		try {

			operands.push(false);

		} catch (Exception x) {
			throw new RuntimeException(" (" + f.getLine() + ", " + f.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(Null n) {
		try {

			operands.push(null);

		} catch (Exception x) {
			throw new RuntimeException(" (" + n.getLine() + ", " + n.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(IntVal intval) {
		try {

			operands.push(intval.getValue());

		} catch (Exception x) {
			throw new RuntimeException(" (" + intval.getLine() + ", " + intval.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(FloatVal floatVal) {
		try {

			operands.push(floatVal.getValue());

		} catch (Exception x) {
			throw new RuntimeException(" (" + floatVal.getLine() + ", " + floatVal.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(CharVal charval) {
		try {

			operands.push(charval.getValue());

		} catch (Exception x) {
			throw new RuntimeException(" (" + charval.getLine() + ", " + charval.getColumn() + ") " + x.getMessage());
		}
	}

	@Override
	public void visit(ParenExp parenExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(NewTypeExp newexp) {
		try {

			if (this.modeDebug) {
				System.out.println("--------------NewTypeExp----------------");
				System.out.println(newexp.toString());
			}

		} catch (Exception x) {
			throw new RuntimeException(" (" + newexp.getLine() + ", " + newexp.getColumn() + ") " + x.getMessage());

		}
	}

	@Override
	public void visit(ArrayAccess arrayAccess) {
		try {

			if (this.modeDebug) {
				System.out.println("--------------Return command----------------");
				System.out.println(arrayAccess.toString());
			}

		} catch (Exception x) {
			throw new RuntimeException(
					" (" + arrayAccess.getLine() + ", " + arrayAccess.getColumn() + ") " + x.getMessage());
		}
	}

	@Override
	public void visit(LValue Lvalue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(IDLValue idLvalue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(DotLValue dotLvalue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(FunCallParams fcp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(FuncReturnExp funReturnExp) {
		// TODO Auto-generated method stub

	}

	private Number mathOperations(Object left, Object right, char operation) {
		try {
			if (left instanceof Integer && right instanceof Integer) {
				int leftValue = (Integer) left;
				int rightValue = (Integer) right;
				switch (operation) {
				case '+':
					return leftValue + rightValue;
				case '-':
					return leftValue - rightValue;
				case '*':
					return leftValue * rightValue;
				case '/':
					return leftValue / rightValue;
				case '%':
					return leftValue / rightValue;
				default:
					return 0;
				}
			} else if ((left instanceof Float || left instanceof Integer)
					&& (right instanceof Float || right instanceof Integer)) {
				float leftValue = ((Number) left).floatValue();
				float rightValue = ((Number) right).floatValue();
				switch (operation) {
				case '+':
					return leftValue + rightValue;
				case '-':
					return leftValue - rightValue;
				case '*':
					return leftValue * rightValue;
				case '/':
					return leftValue / rightValue;
				case '%':
					return leftValue / rightValue;
				default:
					return 0;
				}
			} else {
				throw new RuntimeException("Expressão inválida para operação " + operation);
			}
		} catch (Exception x) {
			throw new RuntimeException(x.getMessage());
		}
	}

	private boolean compareValues(Object left, Object right, String comparison) {
		try {
			if ((left instanceof Integer || left instanceof Float)
					&& (right instanceof Integer || right instanceof Float)) {
				float leftValue = ((Number) left).floatValue();
				float rightValue = ((Number) right).floatValue();
				switch (comparison) {
				case "==":
					return leftValue == rightValue;
				case "<":
					return leftValue < rightValue;
				case ">":
					return leftValue > rightValue;
				case "!=":
					return leftValue <= rightValue;
				default:
					return false;
				}
			} else {
				throw new RuntimeException("Expressão inválida para comparação " + comparison);
			}
		} catch (Exception x) {
			throw new RuntimeException(x.getMessage());
		}
	}

	private void throwRuntimeException(Node node, String message) {
		throw new RuntimeException(" (" + node.getLine() + ", " + node.getColumn() + ") " + message);
	}

}