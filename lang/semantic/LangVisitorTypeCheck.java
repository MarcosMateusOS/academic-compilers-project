/*
    Grupo: Marcos Mateus Oliveira dos Santos - 201835019
           Giovane Nilmer de Oliveira Santos - 201835012

*/
package lang.semantic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import lang.ast.*;
import lang.interpreter.*;

public class LangVisitorTypeCheck extends Visitor {

	private STyInt tyint = STyInt.newSTyInt(); // Cria um novo tipo inteiro
	private STyFloat tyfloat = STyFloat.newSTyFloat(); // Cria um novo tipo float
	private STyBool tybool = STyBool.newSTyBool(); // Cria um novo tipo booleano
	private STyErr tyerr = STyErr.newSTyErr(); // Cria um novo tipo de erro
	private STyChar tychar = STyChar.newSTyChar(); // Cria um novo tipo char
	private STyNull tynull = STyNull.newSTyNull(); // Cria um novo tipo null
	private HashMap<String, DataTypes> datas; // Armazena os tipos de datas

	private ArrayList<String> logError; // Armazena os erros de tipo
	private TyEnv<LocalEnv<SType>> env; // Armazena o ambiente de tipos
	private LocalEnv<SType> temp; // Armazena o ambiente de tipos temporário
	private Stack<SType> stk; // Pilha dos tipos
	private boolean retChk; // Verifica o retorno da função
	private int returnPos; // Posição do retorno

	public LangVisitorTypeCheck() {
		env = new TyEnv<LocalEnv<SType>>();
		stk = new Stack<SType>();
		logError = new ArrayList<String>();
		datas = new HashMap<String, DataTypes>();
	}

	public int getNumErrors() {
		return this.logError.size();
	}

	public void printErrors() {
		for (String s : logError) {
			System.out.println(s);
		}
	}
	
	public TyEnv<LocalEnv<SType>> getEnv(){
		return this.env;
	}
	

	@Override
	public void visit(Program p) {

		Node main = null;
		if (p.getDatas() != null) {
			for (Data data : p.getDatas()) {
				data.accept(this);
			}
		}

		if (p.getFunction() != null) {
			for (Function func : p.getFunction()) {
				String ID = func.getID();
				if (ID.equals("main")) {
					main = func;

					if (func.getParams().getTypes().size() > 0) {
						this.logError.add(" (" + p.getLine() + ", " + p.getColumn() + ") "
								+ "a função main não deve possuir argumentos");
						stk.push(tyerr);
					}
				}

				if (env.checkDuplicity(ID)) {
					this.logError
							.add(" (" + p.getLine() + ", " + p.getColumn() + ") " + "função " + ID + " já definida");
					stk.push(tyerr);
					break;
				}

				List<SType> parametersTypes = new ArrayList<SType>();
				List<String> nameParams = new ArrayList<String>();
				List<SType> returnTypes = new ArrayList<SType>();

				if (func.getParams() != null) {
					Params param = func.getParams();
					List<Type> types = param.getTypes();
					List<String> idsTypes = param.getIDs();
					param.accept(this);

					int index = 0;
					for (Type type : types) {
						type.accept(this);

						parametersTypes.add(stk.pop());

						if (nameParams.contains(idsTypes.get(index))) {
							this.logError.add(" (" + p.getLine() + ", " + p.getColumn() + ") "
									+ "parametros duplicados: " + param.toString());
							stk.push(tyerr);

						}

						nameParams.add(idsTypes.get(index));

						index++;

					}

				}

				if (func.getReturnTypes() != null) {
					List<Type> types = func.getReturnTypes();

					for (Type type : types) {
						type.accept(this);
						returnTypes.add(stk.pop());
					}

				}

				FuncTypes funcTypes = new FuncTypes(parametersTypes, returnTypes, nameParams, ID);

				LocalEnv<SType> localEnv = new LocalEnv<SType>(ID, funcTypes);

				env.set(ID, localEnv);

			}

		}

		if (p.getFunction() != null) {
			for (Function func : p.getFunction()) {
				String ID = func.getID();
				if (ID.equals("main")) {
					main = func;

					if (func.getParams().getTypes().size() > 0) {
						this.logError.add(" (" + p.getLine() + ", " + p.getColumn() + ") "
								+ "a função main não deve possuir argumentos");
						stk.push(tyerr);
					}
				}

				func.accept(this);
			}
		}

		if (main == null) {
			this.logError.add(" (" + p.getLine() + ", " + p.getColumn() + ") " + "função main não definida");
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(Data d) {

		String ID = d.getId();

		if (datas != null && datas.get(ID) != null) {
			this.logError.add(" (" + d.getLine() + ", " + d.getColumn() + ") " + "o tipo data " + ID + " já definida");
			stk.push(tyerr);
		} else {
			List<DataDeclaration> declarations = d.getDeclarations();
			ArrayList<String> varNames = new ArrayList<String>();
			ArrayList<SType> varTypes = new ArrayList<SType>();

			for (DataDeclaration dcl : declarations) {
				String dclID = dcl.getId();
				if (varNames.contains(dclID)) {
					this.logError.add(" (" + d.getLine() + ", " + d.getColumn() + ") " + "duplicidade de atributos "
							+ dclID + " no tipo data " + ID);
					stk.push(tyerr);
				}

				varNames.add(dclID);
				dcl.getType().accept(this);
				varTypes.add(stk.pop());

			}

			DataTypes dataTypes = new DataTypes(ID, varNames, varTypes);
			datas.put(ID, dataTypes);

		}

	}

	@Override
	public void visit(Function f) {
		System.out.println(f.toString());
		retChk = false;
		String ID = f.getID();
		temp = (LocalEnv<SType>) env.get(ID);

		if (f.getParams() != null) {

			Params param = f.getParams();
			List<Type> types = param.getTypes();
			List<String> idsTypes = param.getIDs();
			param.accept(this);

			for (int index = 0; index < types.size(); index++) {
				String paramID = idsTypes.get(index);
				types.get(index).accept(this);
				temp.set(paramID, stk.pop()); // Armazena o tipo do parâmetro
			}

		}

		int aux = 0;
		boolean checkFunctionReturn = false;
		for (Command command : f.getCommands()) {
			command.accept(this);

			if (command instanceof IfCommand && aux + 1 == f.getCommands().size()) {
				checkFunctionReturn = true;
				retChk = false;
			}
			aux++;
		}

		if (!retChk && ((FuncTypes) temp.get()).getReturnType().size() > 0) {
			if (checkFunctionReturn) {
				this.logError.add(" (" + f.getLine() + ", " + f.getColumn() + ") "
						+ " falta do return no final do escopo da função " + f.getID());
				stk.push(tyerr);
			} else {
				this.logError.add(" (" + f.getLine() + ", " + f.getColumn() + ") " + "a função não possui um return");
				stk.push(tyerr);
			}
		}

	}

	@Override
	public void visit(Params p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(DataDeclaration dd) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(IntType it) {

		stk.push(tyint);
	}

	@Override
	public void visit(BoolType bt) {
		stk.push(tybool);

	}

	@Override
	public void visit(CharType ct) {
		stk.push(tychar);

	}

	@Override
	public void visit(FloatType ft) {
		stk.push(tyfloat);

	}

	@Override
	public void visit(ArrayType at) {

		if (at.getType() instanceof NameType && datas.get(((NameType) at.getType()).getName()) == null) {

			this.logError.add(" (" + at.getLine() + ", " + at.getColumn() + ") " + "o tipo data "
					+ ((NameType) at.getType()).getName() + "indefinida");
			stk.push(tyerr);

		} else {
			at.getType().accept(this);
			SType type = stk.pop();

			if (type instanceof STyData) {
				if (datas.get(((STyData) type).getName()) == null) {
					this.logError.add(" (" + at.getLine() + ", " + at.getColumn() + ") " + "o tipo data "
							+ ((STyData) type).getName() + "indefinida");
					stk.push(tyerr);
				} else {
					STyArray array = new STyArray(type);
					stk.push(array);
				}
			} else if (type instanceof STyErr) {
				this.logError
						.add(" (" + at.getLine() + ", " + at.getColumn() + ") " + "o tipo não aceito pela linguagem");
				stk.push(tyerr);
			} else {
				STyArray array = new STyArray(type);
				stk.push(array);
			}
		}

	}

	@Override
	public void visit(NameType at) {

		String ID = at.getName();

		if (datas.get(ID) != null) {
			STyData typeData = new STyData(ID);
			stk.push(typeData);

		} else {

			this.logError.add(" (" + at.getLine() + ", " + at.getColumn() + ") " + "o tipo data " + ID
					+ " não foi definida para ser um parametro");
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(Command cm) {
		cm.accept(this);

	}

	@Override
	public void visit(CommandList cl) {
		for (Command command : cl.getCommands()) {
			command.accept(this);

		}
	}

	@Override
	public void visit(IfCommand ifc) {
		ifc.getExp().accept(this);

		if (stk.pop().match(tybool)) {
			ifc.getCmd().accept(this);
		} else {
			this.logError.add(
					" (" + ifc.getLine() + ", " + ifc.getColumn() + ") " + "o tipo da expressão do if deve um bool ");
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(IfElseCommand ifElsec) {
		ifElsec.getExp().accept(this);

		if (stk.pop().match(tybool)) {
			ifElsec.getCmd().accept(this);

			if (ifElsec.getElsCmd() != null) {
				ifElsec.getElsCmd().accept(this);
			}
		} else {
			this.logError.add(" (" + ifElsec.getLine() + ", " + ifElsec.getColumn() + ") "
					+ "o tipo da expressão do if dever um bool ");
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(IterateCommand interatec) {
		interatec.getExp().accept(this);
		SType expType = stk.pop();
		if (expType.match(tybool)) {
			interatec.getCommand().accept(this);
		} else if (expType.match(tyint)) {
			interatec.getCommand().accept(this);
		} else {
			this.logError.add(" (" + interatec.getLine() + ", " + interatec.getColumn() + ") "
					+ "o interate aceita apenas tipos bool ou int ");
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(ReadCommand readc) {
		readc.getLValue().accept(this);

	}

	@Override
	public void visit(PrintCommand printc) {
		printc.getExp().accept(this);

	}

	@Override
	public void visit(ReturnCommand returnc) {
		returnc.getExp().accept(this);

		if (temp.get() instanceof FuncTypes) {
			FuncTypes funcTypes = (FuncTypes) temp.get();
			List<SType> returnTypes = funcTypes.getReturnType();

			if (returnTypes.size() > 1) {
				this.logError.add(" (" + returnc.getLine() + ", " + returnc.getColumn() + ") "
						+ "quantidade de retorno da função diferente do esperado");
				stk.push(tyerr);
			}

			SType returnType = returnTypes.get(0); // Como a função é retorno unico pega o primeriop da lista

			if (returnTypes != null) {
				SType returnedType = stk.pop();

				if (!returnType.match(returnedType)) {
					this.logError.add(" (" + returnc.getLine() + ", " + returnc.getColumn() + ") "
							+ "tipo retornado da função diferente do esperado");
					stk.push(tyerr);
				}

			}

		} else {
			stk.pop().match(temp.get());
		}

		retChk = true;

	}

	@Override
	public void visit(ReturnMultCommand returnMultc) {
		for (Exp exp : returnMultc.getExps()) {
			exp.accept(this);
		}

		if (temp.get() instanceof FuncTypes) {
			FuncTypes funcTypes = (FuncTypes) temp.get();
			List<SType> returnTypes = funcTypes.getReturnType();
			int sizeReturnExps = returnMultc.getExps().size();

			if (returnTypes.size() != sizeReturnExps) {
				this.logError.add(" (" + returnMultc.getLine() + ", " + returnMultc.getColumn() + ") "
						+ "quantidade dos retornos da função diferente do esperado");
				stk.push(tyerr);
			}

			if (returnTypes.get(0) != null) {

				for (int i = returnTypes.size() - 1; i >= 0; i--) {
					SType returnType = returnTypes.get(i);
					SType returnedType = stk.pop();

					if (!returnType.match(returnedType)) {
						this.logError.add(" (" + returnMultc.getLine() + ", " + returnMultc.getColumn() + ") "
								+ "tipo retornado pela função diferente do esperado " + "retornado: " + returnedType
								+ "/esperado: " + returnType);
						stk.push(tyerr);
					}

				}

			}

		} else {
			stk.pop().match(temp.get());
		}

		retChk = true;

	}

	@Override
	public void visit(AssignCommand assignc) {

		assignc.getLExp().accept(this);
		LValue lvalue = assignc.getLValue(); // lado esquerdo da atribuição

		// Atribuição para variáveis simples
		if (lvalue instanceof IDLValue) {
			SType typeExp = stk.pop();

			if (typeExp instanceof STyData) {
				if (temp.get(lvalue.getID()) != null) {
					SType varType = temp.get(lvalue.getID());

					if (!typeExp.match(varType)) {
						this.logError.add(" (" + lvalue.getLine() + ", " + lvalue.getColumn() + ") "
								+ "Atribuição inválida tipo diferente: " + lvalue.getID());
						stk.push(tyerr);

					}
				} else {
					String dataName = ((STyData) typeExp).getName();

					if (datas.get(dataName) == null) {
						this.logError.add(" (" + assignc.getLine() + ", " + assignc.getColumn() + ")- " + " tipo data "
								+ dataName + " indefinida");
						stk.push(tyerr);
					}

					STyData newData = new STyData(dataName);
					temp.set(lvalue.getID(), newData);
				}

			} else {
				if (temp.get(lvalue.getID()) != null) {
					SType varType = temp.get(lvalue.getID());

					if (!typeExp.match(varType)) {
						this.logError.add(" (" + lvalue.getLine() + ", " + lvalue.getColumn() + ") "
								+ "Atribuição inválida tipo diferente: " + lvalue.getID());
						stk.push(tyerr);

					}
				} else {
					temp.set(lvalue.getID(), typeExp);
				}
			}

		} else if (lvalue instanceof ArrayAccess) {

			lvalue.accept(this);

			if (temp.get(lvalue.getID()) == null) {
				assignc.getLExp().accept(this);

				SType varType = stk.pop();
				STyArray arrType = new STyArray(varType);

				temp.setLocal(lvalue.getID(), arrType);
			} else {
				assignc.getLExp().accept(this);

				SType varType = stk.pop();
				SType arrType = stk.pop();

				if (!arrType.match(varType)) {
					this.logError.add(" (" + lvalue.getLine() + ", " + lvalue.getColumn() + ") "
							+ "Atribuição inválida tipos diferente: " + lvalue.getID());
					stk.push(tyerr);

				}
			}

		} else if (lvalue instanceof DotLValue) {
			DotLValue dotLValue = (DotLValue) lvalue;

			if (dotLValue.getLValue() != null && dotLValue.getLValue() instanceof ArrayAccess) {
				assignc.getLExp().accept(this);
				lvalue.accept(this);
			} else {
				assignc.getLExp().accept(this);
				lvalue.accept(this);
			}

			String dataName = dotLValue.getData();

			SType varType = stk.pop();
			SType typeExp = stk.pop();

			if (!typeExp.match(varType)) {
				this.logError.add(" (" + lvalue.getLine() + ", " + lvalue.getColumn() + ") "
						+ "Atribuição inválida tipos diferentes: " + typeExp.toString() + " tipo atribuição: "
						+ dataName + ":" + varType);
				stk.push(tyerr);

			}

		}

	}

	@Override
	public void visit(FunctionCall fc) {

		String ID = fc.getID();
		LocalEnv<SType> func = (LocalEnv<SType>) env.get(ID);

		if (func == null) {
			this.logError.add(" (" + fc.getLine() + ", " + fc.getColumn() + ")- função " + ID + "não definida");
			stk.push(tyerr);
		}

		FunCallParams paramsFcall = fc.getFunCallParams();
		FuncTypes funcTypes = (FuncTypes) func.get();
		List<SType> paramTypes = funcTypes.getTypes();

		// Verifica o número de parâmetros
		if (paramsFcall.getExps().size() != paramTypes.size()) {
			this.logError.add(" (" + fc.getLine() + ", " + fc.getColumn()
					+ ")- Número de argumentos fornecidos não corresponde ao número de parâmetros esperados");
			stk.push(tyerr);
			return;
		}

		// Verifica os tipos dos parâmetros
		for (int i = 0; i < paramsFcall.getExps().size(); i++) {
			paramsFcall.getExps().get(i).accept(this);
			SType paramType = stk.pop();
			if (!paramType.match(paramTypes.get(i))) {
				this.logError.add(" (" + fc.getLine() + ", " + fc.getColumn() + ")- Tipo incompatível para o argumento "
						+ i + " ao parâmetro da função");
				stk.push(tyerr);
			}
		}
		List<LValue> lvalues = fc.getLvalues();

		if (lvalues != null) {

			List<SType> funcReturnTypes = funcTypes.getReturnType();

			if (funcReturnTypes != null && lvalues.size() == funcReturnTypes.size()) {
				// Verifica se a função tem valores de retorno
				// Inverte a ordem dos valores de retorno para atribuir corretamente

				for (int i = lvalues.size() - 1; i >= 0; i--) {
					LValue l = lvalues.get(i);

					if (temp.get(l.getID()) != null) {
						SType varType = temp.get(l.getID());
						SType varTypeReturn = funcReturnTypes.get(i);

						if (!varType.match(varTypeReturn)) {
							this.logError.add(" (" + fc.getLine() + ", " + fc.getColumn() + ")- variavel " + l.getID()
									+ " tipo: " + varType.toString() + " diferente do retornado pelo função "
									+ varTypeReturn.toString());
							stk.push(tyerr);
						}

						temp.set(l.getID(), varTypeReturn);

					} else {

						SType varType = temp.get(l.getID());
						SType varTypeReturn = funcReturnTypes.get(i);

						temp.set(l.getID(), varTypeReturn);

					}

				}
			} else {

				this.logError.add(" (" + fc.getLine() + ", " + fc.getColumn()
						+ ")- quantidade de retornos solicidados diferente do numero definido na função");
				stk.push(tyerr);
			}

		}

	}

	@Override
	public void visit(AndExp andexp) {
		try {

			andexp.getLeft().accept(this);
			andexp.getRight().accept(this);
			SType right = stk.pop();
			SType left = stk.pop();
			if (this.compareValues(left, right, "&&")) {
				stk.push(tybool);
			}

		} catch (Exception x) {
			this.logError.add(" (" + andexp.getLine() + ", " + andexp.getColumn() + ") " + x.getMessage());
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(LesserThanExp lesseThan) {
		try {
			lesseThan.getLeft().accept(this);
			lesseThan.getRight().accept(this);
			SType right = stk.pop();
			SType left = stk.pop();
			if (this.compareValues(left, right, "<")) {
				stk.push(tybool);
			}

		} catch (Exception x) {
			this.logError.add(" (" + lesseThan.getLine() + ", " + lesseThan.getColumn() + ") " + x.getMessage());
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(EqualityExp equalityExp) {
		try {
			equalityExp.getLeft().accept(this);
			equalityExp.getRight().accept(this);
			SType right = stk.pop();
			SType left = stk.pop();
			if (this.compareValues(left, right, "==")) {
				stk.push(tybool);
			}

		} catch (Exception x) {
			this.logError.add(" (" + equalityExp.getLine() + ", " + equalityExp.getColumn() + ") " + x.getMessage());
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(NotEqualExp notEqualExp) {
		try {
			notEqualExp.getLeft().accept(this);
			notEqualExp.getRight().accept(this);
			SType right = stk.pop();
			SType left = stk.pop();
			if (this.compareValues(left, right, "!=")) {
				stk.push(tybool);
			}

		} catch (Exception x) {
			this.logError.add(" (" + notEqualExp.getLine() + ", " + notEqualExp.getColumn() + ") " + x.getMessage());
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(PlusExp plusExp) {
		try {

			plusExp.getLeft().accept(this);
			plusExp.getRight().accept(this);
			SType right = stk.pop();
			SType left = stk.pop();
			if (this.mathOperations(left, right, "+")) {
				this.addToStack(left, right);
			}

		} catch (Exception x) {
			this.logError.add(" (" + plusExp.getLine() + ", " + plusExp.getColumn() + ") " + x.getMessage());
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(MinusExp minusExp) {
		try {
			minusExp.getLeft().accept(this);
			minusExp.getRight().accept(this);
			SType right = stk.pop();
			SType left = stk.pop();
			if (this.mathOperations(left, right, "-")) {
				this.addToStack(left, right);
			}

		} catch (Exception x) {
			this.logError.add(" (" + minusExp.getLine() + ", " + minusExp.getColumn() + ") " + x.getMessage());
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(MultExp multExp) {
		try {

			multExp.getLeft().accept(this);
			multExp.getRight().accept(this);

			SType right = stk.pop();

			SType left = stk.pop();

			if (this.mathOperations(left, right, "*")) {
				this.addToStack(left, right);
			}

		} catch (Exception x) {
			this.logError.add(" (" + multExp.getLine() + ", " + multExp.getColumn() + ") " + x.getMessage());
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(DivExp divExp) {
		try {
			divExp.getLeft().accept(this);
			divExp.getRight().accept(this);
			SType right = stk.pop();
			SType left = stk.pop();
			if (this.mathOperations(left, right, "/")) {
				this.addToStack(left, right);
			}

		} catch (Exception x) {
			this.logError.add(" (" + divExp.getLine() + ", " + divExp.getColumn() + ") " + x.getMessage());
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(ModExp modExp) {
		try {
			modExp.getLeft().accept(this);
			modExp.getRight().accept(this);
			SType right = stk.pop();
			SType left = stk.pop();
			if (this.mathOperations(left, right, "%")) {
				this.addToStack(left, right);
			}

		} catch (Exception x) {
			this.logError.add(" (" + modExp.getLine() + ", " + modExp.getColumn() + ") " + x.getMessage());
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(NotSignExp notSignExp) {

		notSignExp.getExp().accept(this);
		SType ty = stk.pop();

		if (ty.match(tybool)) {
			stk.add(ty);
		} else {
			this.logError.add(" (" + notSignExp.getLine() + ", " + notSignExp.getColumn()
					+ ")- tipo inválido operador logico '!'");
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(MinusSignExp minusSignExp) {
		minusSignExp.getExp().accept(this);
		SType ty = stk.pop();

		if (ty.match(tyint) || ty.match(tyfloat)) {
			stk.add(ty);
		} else {
			this.logError.add(" (" + minusSignExp.getLine() + ", " + minusSignExp.getColumn()
					+ ")- tipo inválido operador logico '-'");
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(True t) {
		stk.add(tybool);

	}

	@Override
	public void visit(False f) {
		stk.add(tybool);
	}

	@Override
	public void visit(Null n) {
		stk.add(tynull);

	}

	@Override
	public void visit(IntVal intval) {
		this.returnPos = intval.getValue();
		stk.add(tyint);

	}

	@Override
	public void visit(FloatVal floatVal) {
		stk.add(tyfloat);

	}

	@Override
	public void visit(CharVal charval) {
		stk.add(tychar);

	}

	@Override
	public void visit(ParenExp parenExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(NewTypeExp newexp) {
		Type type = newexp.getType();

		if (type != null) {

			// Valida se é um array de tipos
			if (newexp.getExp() != null) {

				newexp.getType().accept(this); // Processa o tipo
				newexp.getExp().accept(this); // Processa a expressão que determina o tamanho do array

				// Pega o tamanho do array de tipos
				SType size = stk.pop();

				if (!size.match(tyint)) {
					this.logError.add(" (" + newexp.getLine() + ", " + newexp.getColumn()
							+ ")- tipo inválido para instanciar o tamanho de um array, deve ser o int");
					stk.push(tyerr);
				}

				SType typeArr = stk.pop();

				STyArray arrType = new STyArray(typeArr);

				stk.add(arrType);
			} else {
				type.accept(this);

			}
		} else {

			String dataID = newexp.getDataName();

			if (!datas.containsKey(dataID)) {
				this.logError.add(" (" + newexp.getLine() + ", " + newexp.getColumn() + ")- tipo data não declaradosF");
				stk.push(tyerr);
			}

			if (newexp.getExp() == null) {
				STyData tyData = new STyData(dataID);
				stk.add(tyData);
			} else {

				newexp.getExp().accept(this); // Processa a expressão que determina o tamanho do array

				// Pega o tamanho do array de tipos
				SType size = stk.pop();

				if (!size.match(tyint)) {
					this.logError.add(" (" + newexp.getLine() + ", " + newexp.getColumn()
							+ ")- tipo inválido para instanciar o tamanho de um array, deve ser o int");
					stk.push(tyerr);
				}

				STyData tyData = new STyData(dataID);
				stk.add(tyData);
			}
		}

	}

	@Override
	public void visit(ArrayAccess arrayAccess) {

		// Verifica se o valor da variável é um identificador (é um array simples)
		if (arrayAccess.getLValue() instanceof IDLValue) {
			// Verifica se o array está definido
			if (temp.get(arrayAccess.getLValue().getID()) == null) {
				this.logError.add(" (" + arrayAccess.getLine() + ", " + arrayAccess.getColumn()
						+ ")- array indefinido: " + arrayAccess.getLValue().getID());
				stk.push(tyerr);
				return;
			}

			SType arrType = temp.get(arrayAccess.getLValue().getID());

			// Verifica se a variável é um array
			if (arrType instanceof STyArray) {
				SType type = ((STyArray) arrType).getType();
				stk.push(type); // Empilha o tipo do array
			} else {
				this.logError.add(" (" + arrayAccess.getLine() + ", " + arrayAccess.getColumn() + ")- a variável "
						+ arrayAccess.getLValue().getID() + " não é um array");
				stk.push(tyerr);
				return;
			}
		}

		// Verifica se é um acesso a matriz (ArrayAccess dentro de outro ArrayAccess)
		else if (arrayAccess.getLValue() instanceof ArrayAccess) {
			if (temp.get(arrayAccess.getLValue().getID()) == null) {
				this.logError.add(" (" + arrayAccess.getLine() + ", " + arrayAccess.getColumn()
						+ ")- array indefinido: " + arrayAccess.getLValue().getID());
				stk.push(tyerr);
				return;
			}

			SType arrType = temp.get(arrayAccess.getLValue().getID());

			// Verifica se é um array do tipo matriz
			if (arrType instanceof STyArray) {
				SType types = ((STyArray) arrType).getType();

				// Verifica se o argumento também é um array (matriz)
				if (types instanceof STyArray) {
					SType typeMat = ((STyArray) types).getType();

					if (typeMat instanceof STyArray) {
						this.logError.add(" (" + arrayAccess.getLine() + ", " + arrayAccess.getColumn()
								+ ")- Não é permitido uma matriz de três dimensões: " + arrType);
						stk.push(tyerr);
					} else {
						// Verifica o índice da linha da matriz
						((ArrayAccess) arrayAccess.getLValue()).getExp().accept(this);
						SType tipoLinha = stk.pop();

						// Verifica se o tipo da posição da linha é inteiro
						if (!tipoLinha.match(tyint)) {
							this.logError.add(" (" + arrayAccess.getLine() + ", " + arrayAccess.getColumn()
									+ ")- Arrays só podem ter sua posição acessada com índices inteiros e não com '"
									+ tipoLinha + "'");
							stk.push(tyerr);
							return;
						}

						stk.push(typeMat); // Empilha o tipo da matriz
					}
				} else {
					stk.push(types); // Empilha o tipo do array
				}
			} else {
				this.logError.add(" (" + arrayAccess.getLine() + ", " + arrayAccess.getColumn() + ")- a variável "
						+ arrayAccess.getLValue().getID() + " não é um array");
				stk.push(tyerr);
				return;
			}
		}

		// Verifica a expressão do índice
		arrayAccess.getExp().accept(this);
		SType index = stk.pop();

		// Verifica se o índice do array é do tipo inteiro
		if (!index.match(tyint)) {
			this.logError.add(" (" + arrayAccess.getLine() + ", " + arrayAccess.getColumn()
					+ ")- O índice de um array deve ser um inteiro e não '" + index + "'");
			stk.push(tyerr);
		}
	}

	@Override
	public void visit(FuncReturnExp funReturnExp) {

		String ID = funReturnExp.getID();
		LocalEnv<SType> func = (LocalEnv<SType>) env.get(ID);

		if (func == null) {
			this.logError.add(" (" + funReturnExp.getLine() + ", " + funReturnExp.getColumn() + ")- função " + ID
					+ "não definida");
			stk.push(tyerr);
		}

		FunCallParams funCallParams = funReturnExp.getFunCallParams();

		if (funCallParams != null) {
			FuncTypes funcTypes = (FuncTypes) func.get();
			List<SType> funcParamsTypes = funcTypes.getTypes();

			if (funcParamsTypes.size() != funCallParams.getExps().size()) {
				this.logError.add(" (" + funReturnExp.getLine() + ", " + funReturnExp.getColumn()
						+ ")- quantidade de argumentos incompatível ao definido na função " + ID);
				stk.push(tyerr);
			}

			// Verifica os parâmetros da função e adiciona-os à pilha de tipos dos
			// parâmetros
			int aux = 0;
			for (Exp exp : funCallParams.getExps()) {
				if (aux + 1 > funcParamsTypes.size()) {
					// Trata o caso de ser passado um numero maior de argumentos
					// do que esperado pela função
					// Para o loop para não ter acesso indevido a memoria
					break;
				}

				exp.accept(this);
				SType paramType = stk.pop();
				SType funcParamType = funcParamsTypes.get(aux);

				if (!paramType.match(funcParamType)) {
					this.logError.add(" (" + funReturnExp.getLine() + ", " + funReturnExp.getColumn()
							+ ")- tipo incompativel do argumento  " + aux + "definido na função");
					stk.push(tyerr);
				}
				aux++;

			}
		} else {
			FuncTypes funcTypes = (FuncTypes) func.get();
			List<SType> funcParamsTypes = funcTypes.getTypes();

			if (funcParamsTypes.size() > 0) {
				this.logError.add(" (" + funReturnExp.getLine() + ", " + funReturnExp.getColumn()
						+ ")- foram enviados argumentos para um função onde não foi denifido parametros");
				stk.push(tyerr);
			}

		}

		funReturnExp.getExp().accept(this);
		SType funcReturnIndex = stk.pop();

		if (!funcReturnIndex.match(tyint)) {
			this.logError.add(" (" + funReturnExp.getLine() + ", " + funReturnExp.getColumn()
					+ ")- tipo inválido para acesso ao retorno de uma função => " + "esperado: Int" + "passado: "
					+ funcReturnIndex.toString());

			stk.push(tyerr);
		}

		FuncTypes funcTypes = (FuncTypes) func.get();
		List<SType> funcReturnTypes = funcTypes.getReturnType();
		stk.push(funcReturnTypes.get(this.returnPos));
//		for (SType returnType : funcReturnTypes) {
//			stk.push(returnType);
//		}

	}

	@Override
	public void visit(LValue Lvalue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(IDLValue idLvalue) {

		if (temp.get(idLvalue.getID()) != null) {
			stk.push(temp.get(idLvalue.getID()));
		} else {
			this.logError.add(" (" + idLvalue.getLine() + ", " + idLvalue.getColumn() + ")- " + idLvalue.getID()
					+ " variavel indefinida");
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(DotLValue dotLvalue) {

		if (temp.get(dotLvalue.getData()) instanceof STyData) {

			STyData dataType = (STyData) temp.get(dotLvalue.getLValue().getID());
			DataTypes data = datas.get(dataType.getName());

			if (data != null) {
				ArrayList<String> varNames = data.getVarName();
				ArrayList<SType> varTypes = data.getVarTypes();

				for (int i = 0; i < varNames.size(); i++) {
					if (varNames.get(i).equals(dotLvalue.getID())) {
						stk.push(varTypes.get(i)); // Empilha o tipo do campo (ex: `x` é `int`)
						return;
					}
				}

				this.logError.add(" (" + dotLvalue.getLine() + ", " + dotLvalue.getColumn() + ")- Atributo "
						+ dotLvalue.getID() + " não encontrado no tipo " + dotLvalue.getLValue().getID());
				stk.push(tyerr);
			} else {
				this.logError.add(" (" + dotLvalue.getLine() + ", " + dotLvalue.getColumn() + ")- Tipo de dado "
						+ dataType.getName() + " não definido");
				stk.push(tyerr);
			}

		} else if (temp.get(dotLvalue.getLValue().getID()) instanceof STyArray) {

			dotLvalue.getLValue().accept(this);

			STyData dataType = (STyData) stk.pop();
			DataTypes data = datas.get(dataType.getName());
			ArrayList<String> varNames = data.getVarName();
			ArrayList<SType> varTypes = data.getVarTypes();

			boolean findedAtr = false;
			for (int i = 0; i < varTypes.size(); i++) {
				if (varNames.get(i).equals(dotLvalue.getID())) {
					findedAtr = true;
					stk.push(varTypes.get(i));
					break;
				}

			}

			if (!findedAtr) {
				this.logError.add(" (" + dotLvalue.getLine() + ", " + dotLvalue.getColumn() + ")- " + dotLvalue.getID()
						+ " atributo " + dotLvalue.getID() + " não encontrado no tipo " + dotLvalue.getData());
				stk.push(tyerr);
			}

		} else if (datas.get(dotLvalue.getData()) != null) {

		} else {
			this.logError.add(" (" + dotLvalue.getLine() + ", " + dotLvalue.getColumn() + ")- " + dotLvalue.getID()
					+ " tipo data " + dotLvalue.getData() + " indefinida");
			stk.push(tyerr);
		}

	}

	@Override
	public void visit(FunCallParams fcp) {
		for (Exp exp : fcp.getExps()) {
			exp.accept(this);
		}

	}

	// Método para comparar os tipos dos valores
	private boolean compareValues(SType left, SType right, String comparison) {
		try {

			if (left.match(tybool) && right.match(tybool)) {
				switch (comparison) {
				case "==":
					return true;
				case "&&":
					return true;
				default:
					throw new RuntimeException("Tipo inválido para expressão de comparação " + comparison);

				}
			} else if ((left.match(tyint) || right.match(tyint)) || (left.match(tyfloat) || right.match(tyfloat))) {
				switch (comparison) {
				case "<":
					return true;
				case ">":
					return true;
				case "!=":
					return true;
				case "==":
					return true;
				default:
					throw new RuntimeException("Tipo inválido para expressão de comparação " + comparison);
				}
			} else if (left.match(tychar) || right.match(tychar)) {
				switch (comparison) {
				case "!=":
					return true;
				case "==":
					return true;
				default:
					throw new RuntimeException("Expressão inválida para comparação " + comparison);
				}

			}

			throw new RuntimeException("Tipo inválido para expressão de comparação " + comparison);

		} catch (Exception x) {

			throw new RuntimeException(x.getMessage());
		}
	}

	private boolean mathOperations(SType left, SType right, String string) {
		try {

			if (left.match(tyint) && right.match(tyint)) {
				switch (string) {
				case "+":
				case "-":
				case "*":
				case "/":
				case "%":
					return true;
				default:
					throw new RuntimeException("Operação inválida para inteiros: " + string);
				}

			} else if ((left.match(tyint) || left.match(tyfloat)) && (right.match(tyint) || right.match(tyfloat))) {

				switch (string) {
				case "+":
				case "-":
				case "*":
				case "/":
				case "%":
					return true;
				default:
					throw new RuntimeException("Operação inválida para floats: " + string);
				}
				// Operações para Char
			} else if (left.match(tychar) && right.match(tychar)) {
				switch (string) {
				case "+": // concatenação de caracteres
					return true;
				default:
					throw new RuntimeException("Operação inválida para char: " + string);
				}
			}

			throw new RuntimeException("Tipos incompatíveis para operação " + string);

		} catch (Exception x) {
			throw new RuntimeException(x.getMessage());
		}
	}

	private void addToStack(SType left, SType right) {
		if ((left.match(tyint) && right.match(tyint)) || (left.match(tyfloat) && right.match(tyfloat))
				|| (left.match(tychar) && right.match(tychar))) {
			stk.add(left);
			stk.add(right);
		} else {
			throw new RuntimeException("Tipo inválido para expressão" + left + " and " + right);
		}
	}

}
