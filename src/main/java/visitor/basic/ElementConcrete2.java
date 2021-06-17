package visitor.basic;

public class ElementConcrete2 implements  IElement {

    private String attribute1;
    private int attribute2;

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

    @Override
    public String metodo1() {
        return null;
    }

    @Override
    public int metodo2() {
        return 0;
    }

    @Override
    public void metodo3() {

    }

    @Override
    public void accept(IVisit visitante) {
        // invocar al metodo comun del visitante
        visitante.visit(this);
    }
}
