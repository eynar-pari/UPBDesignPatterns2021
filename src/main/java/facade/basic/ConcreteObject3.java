package facade.basic;

public class ConcreteObject3 {

    private String attribute1;

    public ConcreteObject3(){}

    public void metodoC(){
        System.out.println("\n----------------");
        System.out.println("running....");
        System.out.println("ConcreteObject3>metodoC");
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
