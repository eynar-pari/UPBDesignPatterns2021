package singleton.basic;

public class Singleton1 {
    // attributo del mismo tipo
    private static Singleton1 instancia = null;

    // constructor privado
    private Singleton1(){
        System.out.println("INFO> Creando Singleton");
    }

    // metodo estatico publico - retorne la instancia unica
    public static Singleton1 getInstance() {
         if (instancia == null)
             instancia= new Singleton1();
         return instancia;
    }

    public void print(){
        System.out.println("Usando el singleton");
    }

    public void restartSingleton(){
        instancia=null;
    }

}
