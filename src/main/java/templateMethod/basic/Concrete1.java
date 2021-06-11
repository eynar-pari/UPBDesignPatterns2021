package templateMethod.basic;

public class Concrete1 extends AbstractClass{
    @Override
    void method1() {
        System.out.println("Concrete1 implentando metodo1");
    }

    @Override
    void method2() {
        System.out.println("Concrete1 implentando metodo2");
    }

    @Override
    public void method3(){
        System.out.println("Concrete1 creando metodo 3");
    }

}
