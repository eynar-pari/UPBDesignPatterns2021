package builder.basic;

public class Client {

     public static void main (String[] args){
          Director director = new Director();
          ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
          ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();

          director.setBuilder(concreteBuilder1);
          director.buildProduct();

          Product productType1 = director.getProduct();
          productType1.showData();

         director.setBuilder(concreteBuilder2);
         director.buildProduct();

         Product productType2 = director.getProduct();
         productType2.showData();

     }
}
