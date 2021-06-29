package facade.basic;

public class ConcreteObject4 {

    private String attribute1;

    public ConcreteObject4(){}

    public void metodoD(){
        System.out.println("\n----------------");
        System.out.println("running....");
        System.out.println("ConcreteObject4>metodoD");
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
