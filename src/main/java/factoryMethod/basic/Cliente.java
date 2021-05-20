package factoryMethod.basic;

public class Cliente {
    public static void main (String [] args){

        ProductConcrete1 concrete1 = new ConcreteCreator1().factoryMethod();

    }
}
