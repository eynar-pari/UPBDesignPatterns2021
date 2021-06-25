package decorator.basic;

public class DecoratorConcrete1 extends Decorator {
    private String attribute1;
    private int attribute2;
    private int attribute3;

    public DecoratorConcrete1(Component component) {
        super(component);
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }

    public int getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(int attribute3) {
        this.attribute3 = attribute3;
    }

    @Override
    public void operation(){
        super.operation();
        // agregando funcionalidad
        this.attribute1="nueva funcionalidad";
        this.attribute2=1;
        this.attribute3=2;

        System.out.println("INFO>.....Agregando funcionalidad (DecoratorConcrete1)");
    }

}
