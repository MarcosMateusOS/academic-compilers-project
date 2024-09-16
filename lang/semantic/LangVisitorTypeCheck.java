package lang.semantic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import lang.ast.*;
import lang.interpreter.*;

public class LangVisitorTypeCheck extends Visitor {

	private STyInt tyint = STyInt.newSTyInt();
	private STyFloat tyfloat = STyFloat.newSTyFloat();
	private STyBool tybool = STyBool.newSTyBool();
	private STyErr tyerr = STyErr.newSTyErr();
	private STyChar tychar = STyChar.newSTyChar();
	private STyNull tynull = STyNull.newSTyNull();
	private HashMap<String, DataTypes> datas;

	private ArrayList<String> logError;
	private TyEnv<LocalEnv<SType>> env;
	private LocalEnv<SType> temp;
	private Stack<SType> stk;
	private boolean retChk;

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
				}

				if (env.checkDuplicity(ID)) {
					this.logError.add(
							" (" + p.getLine() + ", " + p.getColumn() + ") " + "função função " + ID + " já definida");
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

				FuncTypes funcTypes = new FuncTypes(returnTypes, returnTypes, nameParams, ID);

				LocalEnv<SType> localEnv = new LocalEnv<SType>(ID, funcTypes);

				env.setFunction(ID, localEnv);
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

		if (datas != null && datas.containsKey(ID)) {
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
		// TODO Auto-generated method stub

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

	}

	@Override
	public void visit(NameType at) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Command cm) {
		cm.accept(this);

	}

	@Override
	public void visit(CommandList cl) {
		cl.accept(this);

	}

	@Override
	public void visit(IfCommand ifc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(IfElseCommand ifElsec) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(IterateCommand interatec) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ReadCommand readc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(PrintCommand printc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ReturnCommand returnc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ReturnMultCommand returnMultc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AssignCommand assignc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(FunctionCall fc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AndExp andexp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LesserThanExp lesseThan) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(EqualityExp equalityExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(NotEqualExp notEqualExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(PlusExp plusExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(MinusExp minusExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(MultExp multExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(DivExp divExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ModExp modExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(NotSignExp notSignExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(MinusSignExp minusSignExp) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ArrayAccess arrayAccess) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(FuncReturnExp funReturnExp) {
		// TODO Auto-generated method stub

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

}
