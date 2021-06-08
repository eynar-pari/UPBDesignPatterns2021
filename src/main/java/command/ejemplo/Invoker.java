package command.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<IOperacionBuild> commandList = new ArrayList<>();

    public Invoker(){}

    public void addCommand(IOperacionBuild concreteCommand){
        commandList.add(concreteCommand);
    }

    public void executeCommands(){
        for (IOperacionBuild command: commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
