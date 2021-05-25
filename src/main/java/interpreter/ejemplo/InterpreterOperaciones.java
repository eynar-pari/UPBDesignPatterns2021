package interpreter.ejemplo;


import java.util.ArrayList;
import java.util.List;

public class InterpreterOperaciones extends AbstractExpresion {

    private List<AbstractExpresion> parseTree= new ArrayList<>();
    private ContextOperacionArit context;

    public InterpreterOperaciones(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context= new ContextOperacionArit(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "+":
                    parseTree.add(new TerminaExpresionSuma(word.length()));
                    break;
                case "-":
                    parseTree.add(new TerminaExpresionResta(word.length()));
                    break;
               default:
                   parseTree.add(new TerminaExpresionNumber(word.length()));
                    break;
            }

        }
    }


    public int interpretar(){
        for (AbstractExpresion terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }



    @Override
    public void interpreter(ContextOperacionArit context) {

    }
}
