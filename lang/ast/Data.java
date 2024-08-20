package lang.ast;


import java.util.List;
import lang.interpreter.Visitor;




public class Data extends Node {
    private String nameType;
    private List<DataDeclaration> declarations;

    public Data(int line, int col,String nameType, List<DataDeclaration> declarations) {
        super(line, col);
        this.nameType = nameType;
        this.declarations = declarations;
    }

    public String getId() {
        return nameType;
    }

    public String getNameType() {
        return this.nameType;
    }

    public List<DataDeclaration> getDeclarations() {
        return this.declarations;
    }

    public DataDeclaration getDeclaration(int id) {
        return this.declarations.get(id);
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public void setDeclarations(DataDeclaration declaration) {
        this.declarations.add(declaration);
    }


    
    @Override
    public String toString() {
        String data = "data " + this.nameType + " { \n";
        for (DataDeclaration declaration : declarations) {
            data += declaration.toString() + "\n";
        }
        
        data += "}";
        return  data;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
  
}
