package facade.basic;

public class ConcreteObject1 {

    private String attribute1;

    public ConcreteObject1(){}

    public void metodoA(){
        System.out.println("\n----------------");
        System.out.println("running....");
        System.out.println("ConcreteObject1>metodoA");
        System.out.println("algoritmo....");
        System.out.println("----------------");
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }
}
