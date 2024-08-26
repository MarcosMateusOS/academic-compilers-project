package lang.ast;

import java.util.ArrayList;
import java.util.List;

import lang.interpreter.Visitor;

//OPEN_BRACE cmd* CLOSE_BRACE #CommandList
public class CommandList extends Command{
	
	private List<Command> commands;
		
	/*Construtor com a lista de comandos vazios*/
	 public CommandList(int line, int col) {
	        super(line, col);
	        this.commands = new ArrayList<Command>();
	 }

	
    public CommandList(int line, int col, List<Command> commands) {
        super(line, col);
        this.commands = commands;
        
    }
    
    public List<Command> getCommands() {
        return this.commands;
    }
    
    public void setCommands(List<Command> cmds) {
        this.commands = cmds;
    }

    public Command getCommand(int id) {
        return this.commands.get(id);
    }
    
    public void addCommand(Command cmd) {
    	this.commands.add(cmd);
    }


    @Override
    public String toString() {
        String cmd = " { ";
        
        for(Command command : commands) {
        	cmd += command.toString();
        }
        
        cmd += " } ";
        return cmd;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}