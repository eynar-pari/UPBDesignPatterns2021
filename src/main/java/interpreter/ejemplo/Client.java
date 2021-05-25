package interpreter.ejemplo;

public class Client {

    public static void main (String[]args){

        String operacion="1 + 2 + 3 - 3 + 55";

        InterpreterOperaciones interpreterOperaciones = new InterpreterOperaciones(operacion);
        System.out.println("Operacion: "+operacion);
        System.out.println("Resultado: "+interpreterOperaciones.interpretar());

    }
}
