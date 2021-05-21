package abstractFactory.basic;

public class ConcreteProduct3 implements IProduct{
    @Override
    public void readDato() {
        System.out.println("ConcreteProduct3 readDato");
    }

    @Override
    public void createDato() {
        System.out.println("ConcreteProduct3 createDato");
    }

    @Override
    public void updateDato() {
        System.out.println("ConcreteProduct3 updateDato");
    }

    @Override
    public void deleteDato() {
        System.out.println("ConcreteProduct3 deleteDato");
    }
}
