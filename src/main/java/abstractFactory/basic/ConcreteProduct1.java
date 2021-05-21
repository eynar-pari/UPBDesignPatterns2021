package abstractFactory.basic;

public class ConcreteProduct1 implements IProduct{
    @Override
    public void readDato() {
        System.out.println("ConcreteProduct1 readDato");
    }

    @Override
    public void createDato() {
        System.out.println("ConcreteProduct1 createDato");
    }

    @Override
    public void updateDato() {
        System.out.println("ConcreteProduct1 updateDato");
    }

    @Override
    public void deleteDato() {
        System.out.println("ConcreteProduct1 deleteDato");
    }
}
