package _ejerciciosParcial1.interpreter;


public class TerminaExpresionAny extends AbstractExpresion {

    public TerminaExpresionAny(int amountDigit){
        this.amountDigit =amountDigit;
    }


    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith(" ")){
            context.input=context.input.substring(1);
        }

        context.output= context.output + context.input.substring(0,this.amountDigit)+" ";
        context.input= context.input.substring(this.amountDigit);

    }
}

