package decorator.basic;

public class Client {
    public static void main (String[]args){

        // objeto principal
        Component torta= new ComponentConcrete1();

        // decoradores
        torta = new DecoratorConcrete1(torta);
        torta = new DecoratorConcrete2(torta);

        torta.operation();

    }
}
