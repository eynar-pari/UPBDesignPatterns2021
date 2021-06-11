package templateMethod.basic;

public abstract class AbstractClass {

    /**
    *  private ---> acceso solo en la misma clases
    *  protected ----> acceso en en todo paquete
    *  public ---> acceso es global
    * */


    abstract void method1();
    abstract void method2();

    public void method3(){
        System.out.println("AbstractClass llamando al metodo 3");
    }

    public void method5(){
        System.out.println("AbstractClass llamando al metodo 5");
    }

    public final void method4(){
        System.out.println("AbstractClass llamando al metodo 4 que no se puede sobre escribir");
    }
}
