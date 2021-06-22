package bridge.basic;

public class Client {

    public static  void main(String[]ags){

        ConcreteAbstraction concreteAbstraction = new ConcreteAbstraction(new ConcreteImplementorA());
        concreteAbstraction.metodo1();
        concreteAbstraction.metodo2();

    }
}
