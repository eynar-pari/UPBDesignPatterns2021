package adapter.basic;

public class ConcreteAdapter2 implements IAdapter {
    @Override
    public void metodo1() {
        System.out.println("INFO ConcreteAdapter2 > metodo1");
    }

    @Override
    public String metodo2() {
        System.out.println("INFO ConcreteAdapter2 > metodo2");
        return null;
    }

    @Override
    public int metodo3() {
        System.out.println("INFO ConcreteAdapter2 > metodo3");
        return 0;
    }
}
