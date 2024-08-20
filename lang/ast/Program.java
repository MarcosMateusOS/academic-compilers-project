package lang.ast;

import java.util.ArrayList;
import java.util.List;
import lang.interpreter.Visitor;

public class Program extends Node {
    //private List functions = f
    private List<Data> datas;

    public Program(int line, int col) {
        super(line,col);
        this.datas = new ArrayList<>();
    }


    public void addData(Data data) {
        this.datas.add(data);
    }

    public List<Data> getDatas() {
        return datas;
    }

  
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
  
}
