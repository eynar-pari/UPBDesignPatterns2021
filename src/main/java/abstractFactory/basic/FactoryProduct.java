package abstractFactory.basic;

public class FactoryProduct {
    public static IProduct make(String typeProduct){
           IProduct product;

           switch (typeProduct){
               case "product1":
                   product= new ConcreteProduct1();
                   break;
               case "product2":
                   product = new ConcreteProduct2();
                   break;
               case "producto3":
                   product = new ConcreteProduct3();
                   break;
               default:
                   product= new ConcreteProduct1();
                   break;
           }
           return product;
    }
}
