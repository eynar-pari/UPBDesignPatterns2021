package facade.basic;

public class Client {

    public static void main (String []args){

//        ConcreteObject1 concreteObject1 = new ConcreteObject1();
//        ConcreteObject2 concreteObject2 = new ConcreteObject2();
//        ConcreteObject3 concreteObject3 = new ConcreteObject3();
//        ConcreteObject4 concreteObject4 = new ConcreteObject4();
//
//        concreteObject1.metodoA();
//        concreteObject2.metodoB();
//        concreteObject3.metodoC();
//        concreteObject4.metodoD();

          Facade facade= new Facade();
          facade.callingMetodos();


    }
}
