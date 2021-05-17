package singleton.basic;

public class Singleton2 {
    // attributo del mismo tipo
    private static final Singleton2 instancia= new Singleton2();

    // constructor privado
    private Singleton2(){
        System.out.println("INFO> Instanciando Singleton2");
    }

    // metodo publico que retorna la instancia
    public static Singleton2 getInstance(){
        return instancia;
    }

    public void print(){
        System.out.println("Usando Singleton");
    }
}
