package adapter.basic;

public class ConcreteObject {
    // Adaptee
    public void metodoA(){
        System.out.println("ConcreteObject > metodoA");

    }

    public int metodoB(){
        System.out.println("ConcreteObject > metodoB");
        return 0;
    }

    public String metodoC(){
        System.out.println("ConcreteObject > metodoC");
        return "";
    }

    public String metodoD(){
        System.out.println("ConcreteObject > metodoD");
        return "";
    }

}
