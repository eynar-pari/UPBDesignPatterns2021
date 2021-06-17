package visitor.basic;

public interface IElement {

    String metodo1();
    int metodo2();
    void metodo3();

    // agregar accept
    void accept(IVisit visitante);
}
