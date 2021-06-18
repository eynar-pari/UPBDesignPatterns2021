package adapter.basic;

public class ConcreteAdapterObject implements IAdapter{

    private ConcreteObject adaptee = new ConcreteObject();

    public ConcreteAdapterObject(ConcreteObject adaptee){
          this.adaptee=adaptee;
    }

    public ConcreteObject getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(ConcreteObject adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void metodo1() {
        System.out.println("*** Adaptee > metodo1");
        adaptee.metodoA();
        adaptee.metodoB();
    }

    @Override
    public String metodo2() {
        // logica
        System.out.println("*** Adaptee > metodo2");
        adaptee.metodoC();
        return null;
    }

    @Override
    public int metodo3() {
        // logica
        System.out.println("*** Adaptee > metodo3");
        adaptee.metodoD();
        return 0;
    }
}
