package interpreter.basic;

public class Client {

    public static void main (String []args){
        String interpretar="A E I O U A E I O U U U U U";
        // 1 2 3 4 5 1

        NoTerminalExpresion parser = new NoTerminalExpresion(interpretar);

        String interpretado=parser.interpretar();
        System.out.println(" Interpretar: "+interpretar);
        System.out.println(" Interpretado: "+interpretado);




    }
}
