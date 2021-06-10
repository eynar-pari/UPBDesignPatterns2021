package state.ejemplo;

public class Client {
    public static void main(String []args){
        IStateComputadora state = new Apagado();
        Computadora computadora = new Computadora();
        computadora.setTimeLimit(20);
        computadora.setState(state);
        computadora.request();

        state = new PrendidoMinando("minando cryptos");
        computadora.setTimeLimit(20);
        computadora.setState(state);
        computadora.request();

        state = new PrendidoPrograma("chrome");
        computadora.setState(state);
        computadora.request();



    }
}
