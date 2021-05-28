package _ejerciciosParcial1.interpreter;

public class TerminaExpresionComo extends AbstractExpresion {

    public TerminaExpresionComo(int amountDigit){
        this.amountDigit =amountDigit;
    }

    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith(" ")){
            context.input=context.input.substring(1);
        }
        if (context.input.startsWith("Como")) {

            context.output= context.output+"Given ";
            context.input = context.input.substring(amountDigit);
        }

    }
}

