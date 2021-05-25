package interpreter.ejemplo;

public class TerminaExpresionSuma extends AbstractExpresion{

    public TerminaExpresionSuma(int amountDigit){
        this.amountDigit =amountDigit;
    }

    @Override
    public void interpreter(ContextOperacionArit context) {

        if (context.input.startsWith("+")) {
            context.signo=1;
            context.input = context.input.substring(this.amountDigit);
        }

    }
}

