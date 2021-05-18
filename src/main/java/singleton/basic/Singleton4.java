package singleton.basic;

public class Singleton4 implements Cloneable {
    // attributo del mismo tipo
    private static Singleton4 instancia = null;

    // constructor privado
    private Singleton4(){
        System.out.println("INFO> Creando Singleton");
    }

    // metodo estatico publico - retorne la instancia unica
    public static Singleton4 getInstance() {
         if (instancia == null)
             instancia= new Singleton4();
         return instancia;
    }

    public void print(){
        System.out.println("Usando el singleton");
    }

    public void restartSingleton(){
        instancia=null;
    }

    public Object clone() throws CloneNotSupportedException {
        throw  new CloneNotSupportedException();
    }
}
