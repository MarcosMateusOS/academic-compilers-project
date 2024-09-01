package lang.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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
import lang.ast.TypeObject;

public class LangVisitorInterpreter extends Visitor {
	private HashMap<String, Data> datas; // Estrutura de dados para armazenar os tipos
	private HashMap<String, Function> functions;
	private Stack<HashMap<String, Object>> env;// Pilha de memoria
	private Stack<Object> operands;
	private Stack<Object> params;
	private boolean modeDebug, retMode;

	public LangVisitorInterpreter() {
		/* Construtor inicializando o interpretador */
		datas = new HashMap<String, Data>();
		functions = new HashMap<String, Function>();
		env = new Stack<HashMap<String, Object>>();
		env.push(new HashMap<String, Object>());
		operands = new Stack<Object>();
		params = new Stack<Object>();
		modeDebug = true;
		retMode = false;

	}//

	@Override
	public void visit(Program p) {

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
		retMode = false;

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
			if (this.modeDebug) {
				System.out.println("-------------- IntType ----------------");
				System.out.println(it.toString());
			}
			if (params.size() != 0) {
				System.out.println("-------------- PARAMS ----------------");
				operands.push(params.pop());
				System.out.println("STACK OPERANDS: " + operands);
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
				System.out.println("-------------- Function ----------------");
				System.out.println(f.toString());
			}

			// Cria um novo ambiente local para a função
			HashMap<String, Object> localEnv = new HashMap<>();

			// Se a função tiver parâmetros
			if (f.getParams() != null) {
				Params funcParams = f.getParams();
				System.out.println(funcParams);
				List<String> paramsIds = funcParams.getIDs();
				System.out.println(paramsIds.size());

				// Processa os parâmetros e empilha seus valores
				funcParams.accept(this);

				// Associa cada parâmetro ao seu valor no ambiente local
				for (int i = 0; i < paramsIds.size(); i++) {
					localEnv.put(paramsIds.get(i), operands.pop());
				}
			}

			// Empurra o ambiente local para a pilha
			env.push(localEnv);

			// Executa cada comando no corpo da função
			for (Command command : f.getCommands()) {
				if (retMode)
					break;
				command.accept(this);
			}

			// Remove o ambiente local após a execução
			env.pop();
			retMode = false;
			if (this.modeDebug) {
				System.out.println("Function executed successfully: " + f.getID());

			}
		} catch (Exception x) {
			if (this.modeDebug) {
				System.out.println("Error in Function: " + f.getID());
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
				System.out.println(p.getIDs());
				System.out.println(params.toString());
			}

			if (p.getIDs().size() != params.size()) {
				throw new RuntimeException("Número de argumentos fornecidos diferente do esperado!");
			}

			Set<String> seenIDs = new HashSet<>();
			for (String id : p.getIDs()) {
				if (!seenIDs.add(id)) {
					throw new RuntimeException("Argumentos duplicados" + id);
				}
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
			if (this.modeDebug) {
				System.out.println("-------------- ArrayType ----------------");
				System.out.println(at.toString());
			}
			if (params.size() != 0) {
				System.out.println(params.toString());
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
			if (this.modeDebug) {
				System.out.println("-------------- NameType ----------------");
				System.out.println(at.toString());
			}
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
			if (retMode) {
				return;
			}

			if (this.modeDebug) {
				System.out.println("-------------- Init CommandList ----------------");
				System.out.println(cl.toString());
			}

			for (Command command : cl.getCommands()) {
				command.accept(this);
				if (retMode) {
					return;
				}
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

			// Avalia a condição inicial
			Exp condition = iteratec.getExp();
			condition.accept(this);

			Object obj = operands.pop(); // Desempilha a condição (deve ser booleano ou equivalente)

			// Executa o loop enquanto a condição for verdadeira

			if (obj instanceof Boolean) {
				while ((Boolean) obj) { // Ou use o tipo que representa booleano na sua linguagem
					iteratec.getCommand().accept(this);

					// Reavalia a condição após a execução do comando do loop
					condition.accept(this);
					obj = operands.pop(); // Atualiza o valor de 'obj' com a nova condição

					if (this.modeDebug) {
						System.out.println("Iterate condition re-evaluated: " + obj);
					}
				}
			}

			if (obj instanceof Integer) {
				for (int i = 0; i < (Integer) obj; i++) {
					iteratec.getCommand().accept(this);
				}
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

			Object value;
			try (Scanner reader = new Scanner(System.in)) {

				value = reader.next();
				env.peek().put(lvalue.getID(), value);

			} catch (Exception x) {
				throwRuntimeException(readc, "Error reading input: " + x.getMessage());
			}

		} catch (Exception x) {
			this.throwRuntimeException(readc, "Error in ReadCommand: " + x.getMessage());
		}

	}

	@Override
	public void visit(PrintCommand printc) {
		try {

			if (this.modeDebug) {
				System.out.println("-------------- Init ReadCommand ----------------");
				System.out.println(printc.toString());
			}
			System.out.println("-------------- PrintCommand ----------------");
			System.out.println(printc.toString());
			printc.getExp().accept(this);
			Object obj = operands.pop();
			System.out.print(obj);
			// Está imprimindo todos os tipos
			// Colocar no relatorio

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
			retMode = true;

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
				System.out.println(exp.toString());
				exp.accept(this);
				retMode = true;
			}

		} catch (Exception x) {
			this.throwRuntimeException(returnMultc, x.getMessage());
		}

	}

	@Override
	public void visit(AssignCommand assignc) {
		try {
			if (this.modeDebug) {
				System.out.println("-------------- AssignCommand command ----------------");
				System.out.println(assignc.toString());
			}

			// Avalia a expressão do lado direito da atribuição
			assignc.getLExp().accept(this);

			LValue lvalue = assignc.getLValue(); // Obtém o lado esquerdo da atribuição

			// Tratamento de atribuição para identificadores simples
			if (lvalue instanceof IDLValue) {
				Object value = operands.pop();

				if (env.peek().containsKey(lvalue.getID())) {
					Object var = env.peek().get(lvalue.getID());

					if (var.getClass() != value.getClass()) {
						throw new RuntimeException("Atribuição inválida tipo diferente: " + lvalue.getID());
					}
				}
				env.peek().put(((IDLValue) lvalue).getID(), value);
			}

//	        // Tratamento de atribuição para acessos a propriedades de objetos dinâmicos
			else if (lvalue instanceof DotLValue) {
				DotLValue dotLValue = (DotLValue) lvalue;
				LValue innerLValue = dotLValue.getLValue();
				String propertyId = dotLValue.getID();
				String dataName = dotLValue.getData();

				// Trata acessos a arrays dentro de objetos
				if (innerLValue instanceof ArrayAccess) {
					ArrayAccess arrayAccess = (ArrayAccess) innerLValue;
					arrayAccess.getExp().accept(this); // Avalia a expressão de índice do array
					int index = (Integer) operands.pop(); // Recupera o índice
					Object value = operands.pop();
					List<Object> array = (List<Object>) env.peek().get(arrayAccess.getID());
					if (index < 0 || index >= array.size()) {
						throw new RuntimeException("Acesso a uma posição inválida no array: " + arrayAccess.getID());
					}

					// Assume que o valor a ser atribuído já está no topo da pilha de operandos
					array.set(index, value); // Atualiza o array na posição especificada
				} else {
					
					Object value = operands.pop();

					HashMap<String, Object> object = (HashMap<String, Object>) env.peek().get(dataName);
					TypeObject objVar = (TypeObject) object.get(innerLValue.getID());
					

					if (objVar != null) {
						if(objVar.getType().getClass() != value.getClass()) {
							throw new RuntimeException("Atribuição inválida tipo diferente: " + lvalue.getID());
						}
					}

					if (object != null) {
						object.put(propertyId, value);
					} else {
						throw new RuntimeException("Objeto não encontrado: " + innerLValue.getID());
					}
				}
			}

			// Tratamento para atribuições diretas a arrays
			else if (lvalue instanceof ArrayAccess) {
				ArrayAccess arrayAccess = (ArrayAccess) lvalue;
				arrayAccess.getExp().accept(this);
				int index = (Integer) operands.pop();
				Object value = operands.pop();
				List<Object> array = (List<Object>) env.peek().get(arrayAccess.getID());
				if (index < 0 || index >= array.size()) {
					throw new RuntimeException("Acesso a uma posição inválida no array: " + arrayAccess.getID());
				}

				array.set(index, value); // Atualiza o array na posição especificada
			}
		} catch (Exception x) {
			throw new RuntimeException("Erro em AssignCommand: " + assignc.getLine() + ", " + assignc.getColumn()
					+ " - " + x.getMessage());
		}

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
				int expectedParams = funct.getParams().getIDs().size();
				int providedParams = paramsFcall.getExps().size();

				if (expectedParams != providedParams)
					throw new RuntimeException("Número de argumentos fornecidos (" + providedParams
							+ ") não corresponde ao número de parâmetros esperados (" + expectedParams
							+ ") para a função " + fc.getID());

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

					if (env.peek().containsKey(l.getID()))
						throw new RuntimeException("Váriavel de retorno " + l.getID() + " já definida");

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

			Object right = operands.pop();
			Object left = operands.pop();

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
			Object right = operands.pop();
			Object left = operands.pop();

			operands.push(this.compareValues(left, right, "<"));

		} catch (Exception x) {
			throw new RuntimeException(
					" (" + lesseThan.getLine() + ", " + lesseThan.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(EqualityExp equalityExp) {
		try {
			if (this.modeDebug) {
				System.out.println("--------------EqualityExp----------------");
				System.out.println(equalityExp.toString());
			}

			equalityExp.getLeft().accept(this);
			equalityExp.getRight().accept(this);
			Object right = operands.pop();
			Object left = operands.pop();

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
			Object right = operands.pop();
			Object left = operands.pop();

			operands.push(this.compareValues(left, right, "!="));

		} catch (Exception x) {
			throw new RuntimeException(
					" (" + notEqualExp.getLine() + ", " + notEqualExp.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(PlusExp plusExp) {
		try {
			// Debugging: print current state
			if (this.modeDebug) {
				System.out.println("--------------PlusExp----------------");
				System.out.println(plusExp.toString());
			}

			plusExp.getLeft().accept(this);
			Object left = operands.pop();

			plusExp.getRight().accept(this);
			Object right = operands.pop();
			Object result = this.mathOperations(left, right, '+');
			operands.push(result);

		} catch (Exception x) {
			throw new RuntimeException(
					"Error in PlusExp at (" + plusExp.getLine() + ", " + plusExp.getColumn() + "): " + x.getMessage());
		}
	}

	@Override
	public void visit(MinusExp minusExp) {
		try {
			minusExp.getLeft().accept(this);
			Object left = operands.pop(); // Captura o resultado da avaliação do lado esquerdo

			minusExp.getRight().accept(this);
			Object right = operands.pop(); // Captura o resultado da avaliação do lado direito

			// Realiza a operação de subtração e empilha o resultado
			operands.push(this.mathOperations(left, right, '-'));

		} catch (Exception x) {
			throw new RuntimeException("Error in MinusExp at (" + minusExp.getLine() + ", " + minusExp.getColumn()
					+ "): " + x.getMessage());
		}
	}

	@Override
	public void visit(MultExp multExp) {
		try {
			multExp.getLeft().accept(this);
			multExp.getRight().accept(this);

			Object right = operands.pop();

			Object left = operands.pop();

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

			Object right = operands.pop();
			Object left = operands.pop();

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
		parenExp.getExp().accept(this);

	}

	@Override
	public void visit(NewTypeExp newexp) {
		try {
			if (this.modeDebug) {
				System.out.println("--------------NewTypeExp----------------");
				System.out.println(newexp.toString());
			}

			Type type = newexp.getType();

			if (type != null) {

				// Valida se é um array de tipos
				if (newexp.getExp() != null) {

					newexp.getType().accept(this); // Processa o tipo
					newexp.getExp().accept(this); // Processa a expressão que determina o tamanho do array

					if (type instanceof NameType) {

					}

					// Pega o tamanho do array de tipos
					Integer size = (Integer) operands.pop();
					Object types = operands.pop();

					// Cria uma lista para armazenar os tipos
					List<Object> array = new ArrayList<>(size);

					for (int i = 0; i < size; i++) {
						array.add(types);
					}

					operands.push(array);
				} else {
					String dataName = newexp.getDataName();

					System.out.println(dataName);

					HashMap<String, Object> vars = new HashMap<String, Object>();

					for (DataDeclaration dataDeclaration : datas.get(dataName).getDeclarations()) {
						System.out.println(dataDeclaration.toString());
						dataDeclaration.getType().accept(this);
						dataDeclaration.toString();
						operands.pop();
						TypeObject typeObject = new TypeObject(newexp.getLine(), newexp.getColumn(),
								dataDeclaration.getType(), dataDeclaration.getId());

						vars.put(dataDeclaration.getId(), typeObject);
					}
					operands.push(vars);

				}
			} else {
				// Caso seja um tipo Data (type == null)
				if (newexp.getExp() == null) {

					// Criando uma nova instância de Data sem array
					String dataID = newexp.getDataName();
					HashMap<String, Object> newDataInstance = createDataObject(dataID, newexp.getLine(),
							newexp.getColumn());
					operands.push(newDataInstance);
				} else {
					// Criando uma nova instância de Data como array
					newexp.getExp().accept(this);
					Integer size = (Integer) operands.pop();

					List<Object> array = new ArrayList<>(size);
					for (int i = 0; i < size; i++) {
						HashMap<String, Object> newDataInstance = createDataObject(newexp.getDataName(),
								newexp.getLine(), newexp.getColumn());
						array.add(newDataInstance);
					}

					operands.push(array);
				}
			}
		} catch (Exception x) {
			throw new RuntimeException(" (" + newexp.getLine() + ", " + newexp.getColumn() + ") " + x.getMessage());
		}
	}

	private HashMap<String, Object> createDataObject(String dataID, int line, int column) {
		HashMap<String, Object> newDataInstance = new HashMap<>();

		for (DataDeclaration d : datas.get(dataID).getDeclarations()) {
			d.getType().accept(this); // Processa o tipo da declaração
			operands.pop(); // Descartando o tipo da pilha

			// Cria um objeto padrão para cada campo no Data
			Object valorPadrao = new TypeObject(line, column, d.getType(), d.getId());
			newDataInstance.put(d.getId(), valorPadrao);
		}

		return newDataInstance;
	}

	@Override
	public void visit(ArrayAccess arrayAccess) {
		try {
			if (this.modeDebug) {
				System.out.println("--------------ArrayAccess command----------------");
				System.out.println(arrayAccess.toString());
			}

			// Busca o array no ambiente
			Object array = env.peek().get(arrayAccess.getID());

			if (array == null) {
				throw new RuntimeException("Erro => array não declarado " + arrayAccess.getID());
			}

			if (!(array instanceof List<?>)) {
				throw new RuntimeException("Erro => " + arrayAccess.getID() + " não é um array");
			}

			// Avalia a expressão do índice
			arrayAccess.getExp().accept(this);
			Object index = operands.pop();

			if (!(index instanceof Integer)) {
				throw new RuntimeException("Erro => O index do array deve ser um inteiro " + arrayAccess.getID());
			}

			int idx = (Integer) index;
			int size = ((List<?>) array).size();

			// Verifica se o índice está dentro dos limites
			if (idx < 0 || idx >= size) {
				throw new RuntimeException("Erro => Índice fora dos limites do array " + arrayAccess.getID());
			}

			// Obtém o valor do array no índice especificado
			Object value = ((List<?>) array).get(idx);

			// Empilha o valor para uso posterior
			operands.push(value);

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
		try {
			// Obtém o valor associado ao ID do LValue no ambiente atual

			Object r = env.peek().get(idLvalue.getID());

			// Verifica se o ID existe no ambiente, mesmo que seu valor seja null
			if (r != null || (r == null && env.peek().containsKey(idLvalue.getID()))) {
				operands.push(r);
			} else {

				throw new RuntimeException(
						" (" + idLvalue.getLine() + ", " + idLvalue.getColumn() + ") " + ": Erro no Identifier !!");
			}
		} catch (Exception x) {
			// Lança uma exceção com uma mensagem detalhada
			throw new RuntimeException(" (" + idLvalue.getLine() + ", " + idLvalue.getColumn() + ") "
					+ "Erro ao acessar o identificador: " + x.getMessage());
		}

	}

	@Override
	public void visit(DotLValue dotLvalue) {
		try {
			if (this.modeDebug) {
				System.out.println("--------------DotLValue command----------------");
				System.out.println(dotLvalue.toString());
				System.out.println(dotLvalue.getID());
				System.out.println(dotLvalue.getLValue().getID());
				System.out.println(env.peek().get(dotLvalue.getLValue().getID()));
			}

			Object obj = env.peek().get(dotLvalue.getLValue().getID());

			if (obj != null) {

				if (obj instanceof ArrayAccess) {
					// Assumimos que a DotLValue lida com ArrayAccess se for uma List
					ArrayAccess arr = (ArrayAccess) dotLvalue.getLValue();
					arr.getExp().accept(this);
					Integer index = (Integer) operands.pop();

					if (index != null && index >= 0 && index < ((List) obj).size()) {
						HashMap<String, Object> objValue = (HashMap<String, Object>) ((List) obj).get(index);
						if (objValue.containsKey(dotLvalue.getData())) {
							operands.push(objValue.get(dotLvalue.getData()));
						} else {
							throw new RuntimeException(
									"Atributo '" + dotLvalue.getID() + "' não encontrado no objeto no índice " + index);
						}
					} else {
						throw new RuntimeException("Índice " + index + " fora dos limites para " + dotLvalue.getID());
					}
				} else if (obj instanceof HashMap) {

					HashMap<String, Object> map = (HashMap<String, Object>) obj;

					if (map.containsKey(dotLvalue.getID())) {

						Object value = map.get(dotLvalue.getID());

						if (value instanceof TypeObject) {
							TypeObject checkTypeObjectContent = (TypeObject) ((TypeObject) value).getContent();

							if (checkTypeObjectContent == null)
								throw new RuntimeException("Atributo " + dotLvalue.getID() + " é null");
						}

						operands.push(value);
					} else {
						throw new RuntimeException(
								"Atributo '" + dotLvalue.getID() + "' não encontrado no objeto " + dotLvalue.getID());
					}
				} else {

					operands.push(obj);
				}
			} else {
				throw new RuntimeException("Objeto '" + dotLvalue.getID() + "' não encontrado no ambiente.");
			}
		} catch (Exception x) {
			throw new RuntimeException(
					"Erro em DotLValue: (" + dotLvalue.getLine() + ", " + dotLvalue.getColumn() + ") " + x.getMessage(),
					x);
		}
	}

	@Override
	public void visit(FunCallParams fcp) {
		try {

			for (Exp exp : fcp.getExps()) {
				exp.accept(this);
			}
		} catch (Exception x) {
			throw new RuntimeException(" (" + fcp.getLine() + ", " + fcp.getColumn() + ") " + x.getMessage());
		}

	}

	@Override
	public void visit(FuncReturnExp funReturnExp) {
		try {

			String functionID = funReturnExp.getID();
			Function func = functions.get(functionID);

			if (func == null) {
				throw new RuntimeException("Função " + functionID + " não encontrada.");
			}

			// Prevenção de recursão infinita
			if (params.contains(func)) {
				throw new RuntimeException("Recursão infinita detectada na função: " + functionID);
			}

			FunCallParams funCallParams = funReturnExp.getFunCallParams();

			if (funCallParams != null) {

				// Verifica os parâmetros da função e adiciona-os à pilha de parâmetros
				for (Exp exp : funCallParams.getExps()) {
					exp.accept(this);
					Object paramValue = operands.pop();

					params.push(paramValue);

				}
			}

			// Executa a função e captura os valores de retorno
			func.accept(this);
			// Remove a marcação da execução da função após a conclusão

			// Pega o valor da posição que identifica qual variável o usuário quer que seja
			// retornada

			IntVal returnIndex = (IntVal) funReturnExp.getExp();
			int returnIdxValue = returnIndex.getValue();

			List<Type> functionReturnTypes = func.returnReturnTypes();
			if (functionReturnTypes.size() == 0) {
				throw new RuntimeException(" (" + funReturnExp.getLine() + ", " + funReturnExp.getColumn()
						+ ") A função não apresenta tipos de retorno");
			}

			// Validação do índice de retorno
			if (returnIdxValue < 0 || returnIdxValue >= functionReturnTypes.size()) {
				throw new RuntimeException("Posição inválida do retorno: " + returnIdxValue);
			}

			// Desempilha os valores de retorno e mantém apenas o solicitado

			if (functionReturnTypes.size() > 1) { // Verifica se há múltiplos valores de retorno

				for (int i = functionReturnTypes.size() - 1; i >= 0; i--) {
					Object returnValue = operands.pop();
					if (i == returnIdxValue) {
						operands.push(returnValue);
					}
				}
			} else if (functionReturnTypes.size() == 1) { // Quando tiver somente 1 retorno
				if (returnIdxValue == 0) {

					// Não faz nada, o valor de retorno já está no operands
				} else {
					throw new RuntimeException(" (" + funReturnExp.getLine() + ", " + funReturnExp.getColumn()
							+ ") Acesso a posição inválida de elemento no retorno da função");
				}
			}

		} catch (Exception x) {
			throw new RuntimeException(
					" (" + funReturnExp.getLine() + ", " + funReturnExp.getColumn() + ") " + x.getMessage());
		}
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

			if (left instanceof Boolean && right instanceof Boolean) {
				Boolean leftValue = (Boolean) left;
				Boolean rightValue = (Boolean) right;
				switch (comparison) {
				case "==":
					return leftValue == rightValue;
				case "&&":
					return leftValue == rightValue;
				default:
					throw new RuntimeException("Expressão inválida para comparação " + comparison);

				}
			} else if ((left instanceof Integer || left instanceof Float)
					&& (right instanceof Integer || right instanceof Float)) {

				float leftValue = ((Number) left).floatValue();
				float rightValue = ((Number) right).floatValue();

				switch (comparison) {
				case "<":
					return leftValue < rightValue;
				case ">":
					return leftValue > rightValue;
				case "!=":
					return leftValue != rightValue;
				case "==":
					return leftValue == rightValue;
				default:
					throw new RuntimeException("Expressão inválida para comparação " + comparison);
				}

			}

			return false;
		} catch (Exception x) {
			throw new RuntimeException(x.getMessage());
		}
	}

	private void throwRuntimeException(Node node, String message) {
		throw new RuntimeException(" (" + node.getLine() + ", " + node.getColumn() + ") " + message);
	}

}