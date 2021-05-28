package _ejerciciosParcial1.interpreter;

public class TerminaExpresionPara extends AbstractExpresion {

    public TerminaExpresionPara(int amountDigit){
        this.amountDigit =amountDigit;
    }

    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith(" ")){
            context.input=context.input.substring(1);
        }
        if (context.input.startsWith("Para")) {
            context.output= context.output+"Then ";
            context.input = context.input.substring(amountDigit);
        }

    }
}

