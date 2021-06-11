package templateMethod.basic;

import command.basic.ConcreteCommand1;

public class Client {

    public static void main (String[]argg){

        Concrete1 concrete1 = new Concrete1();

        concrete1.method1();
        concrete1.method2();
        concrete1.method3();
        concrete1.method4();
        concrete1.method5();

        Concrete2 concrete2 = new Concrete2();

        concrete2.method1();
        concrete2.method2();
        concrete2.method3();
        concrete2.method4();
        concrete2.method5();

    }
}
