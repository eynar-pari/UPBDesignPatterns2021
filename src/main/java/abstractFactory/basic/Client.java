package abstractFactory.basic;

public class Client {

    public static void main (String [] argsss){

        FactoryProduct.make("product2").createDato();
        FactoryProduct.make("product2").readDato();


        ConcreteProduct1 product1 = (ConcreteProduct1) FactoryProduct.make("product1");
        product1.createDato();
        product1.updateDato();
        
        FactoryProduct.make("product3").createDato();

    }


}
