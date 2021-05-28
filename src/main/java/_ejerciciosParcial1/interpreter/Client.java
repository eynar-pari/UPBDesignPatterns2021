package _ejerciciosParcial1.interpreter;

public class Client {

    public static void main (String[]args){

        String operacion="Como administrador Quiero generar un reporte diario Para evaluar las ganancias";

        InterpreterGherkins interpreterOperaciones = new InterpreterGherkins(operacion);
        System.out.println("Operacion: "+operacion);
        System.out.println("Resultado: "+interpreterOperaciones.interpretar());

    }
}
