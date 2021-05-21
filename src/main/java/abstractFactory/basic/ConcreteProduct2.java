package abstractFactory.basic;

public class ConcreteProduct2 implements IProduct{
    @Override
    public void readDato() {
        System.out.println("ConcreteProduct2 readDato");
    }

    @Override
    public void createDato() {
        System.out.println("ConcreteProduct2 createDato");
    }

    @Override
    public void updateDato() {
        System.out.println("ConcreteProduct2 updateDato");
    }

    @Override
    public void deleteDato() {
        System.out.println("ConcreteProduct2 deleteDato");
    }
}
