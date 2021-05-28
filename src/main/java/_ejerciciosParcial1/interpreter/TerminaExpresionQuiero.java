package _ejerciciosParcial1.interpreter;

public class TerminaExpresionQuiero extends AbstractExpresion {

    public TerminaExpresionQuiero(int amountDigit){
        this.amountDigit =amountDigit;
    }

    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith(" ")){
            context.input=context.input.substring(1);
        }
        if (context.input.startsWith("Quiero")) {
            context.output= context.output+"When ";

            context.input = context.input.substring(amountDigit);
        }

    }
}

