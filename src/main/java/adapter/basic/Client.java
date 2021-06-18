package adapter.basic;

public class Client {
    public static void main (String [] arggggg){
        ConcreteObject adaptee = new ConcreteObject();

        ConcreteAdapter1 concreteAdapter1 = new ConcreteAdapter1();
        ConcreteAdapter2 concreteAdapter2 = new ConcreteAdapter2();
        ConcreteAdapter3 concreteAdapter3 = new ConcreteAdapter3();
        ConcreteAdapterObject concreteAdapterObject = new ConcreteAdapterObject(adaptee);

        concreteAdapter1.metodo1();
        concreteAdapter2.metodo1();
        concreteAdapter3.metodo1();
        concreteAdapterObject.metodo1();
        concreteAdapterObject.metodo2();
        concreteAdapterObject.metodo3();
    }

}
