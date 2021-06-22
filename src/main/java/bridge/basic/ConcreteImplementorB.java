package bridge.basic;

public class ConcreteImplementorB implements  Implementor {
    @Override
    public void operation1() {
        System.out.println("ConcreteImplementorB > operation1 ");
    }

    @Override
    public String operation2() {
        System.out.println("ConcreteImplementorB > operation2 ");
        return null;
    }

    @Override
    public int operation3() {
        System.out.println("ConcreteImplementorB > operation3 ");
        return 0;
    }
}
