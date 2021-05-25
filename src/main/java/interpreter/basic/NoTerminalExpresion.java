package interpreter.basic;

import java.util.ArrayList;
import java.util.List;

public class NoTerminalExpresion extends  AbstractExpresion {

    private List<AbstractExpresion> parseTree= new ArrayList<>();
    private Context context;

    public NoTerminalExpresion(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context= new Context(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "A":
                    parseTree.add(new TerminalExpresionA());
                    break;
                case "E":
                    parseTree.add(new TerminalExpresionE());
                    break;
                case "I":
                    parseTree.add(new TerminalExpresionI());
                    break;
                case "O":
                    parseTree.add(new TerminalExpresionO());
                    break;
                case "U":
                    parseTree.add(new TerminalExpresionU());
                    break;
                default:
                    break;
            }

        }
    }


    public String interpretar(){
        for (AbstractExpresion terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}
