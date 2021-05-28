package _ejerciciosParcial1.interpreter;


import java.util.ArrayList;
import java.util.List;

public class InterpreterGherkins extends AbstractExpresion {

    private List<AbstractExpresion> parseTree= new ArrayList<>();
    private ContextGherkins context;

    public InterpreterGherkins(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context= new ContextGherkins(input);
        for (String word : input.split(" ")) {
            switch (word){
                case "Como":
                    parseTree.add(new TerminaExpresionComo(word.length()));
                    break;
                case "Quiero":
                    parseTree.add(new TerminaExpresionQuiero(word.length()));
                    break;
                case "Para":
                    parseTree.add(new TerminaExpresionPara(word.length()));
                    break;
               default:
                   parseTree.add(new TerminaExpresionAny(word.length()));
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
    public void interpreter(ContextGherkins context) {

    }
}
