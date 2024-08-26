package lang.ast;

import java.util.ArrayList;
import java.util.List;
import lang.interpreter.Visitor;

public class Program extends Node {
   
    private List<Data> datas;
    private List<Function> functions;

    public Program(int line, int col) {
        super(line,col);
        this.datas = new ArrayList<Data>();
        this.functions = new ArrayList<Function>();
    }


    public void addData(Data data) {
        this.datas.add(data);
    }

    public List<Data> getDatas() {
        return datas;
    }
    
    public void addFunctions(Function function) {
        this.functions.add(function);
    }

    public List<Function> getFunction() {
        return functions;
    }


  
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
  
}
