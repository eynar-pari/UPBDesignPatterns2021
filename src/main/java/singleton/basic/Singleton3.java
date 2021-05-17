package singleton.basic;

public class Singleton3 {
    //attributo del mismo tipo
    public static Singleton3 instance = null;

    //constructor privado
    private Singleton3(){
        System.out.println("INFO> creando Singleton");
    }

    private synchronized static void makeInstace(){
        if (instance == null)
            instance= new Singleton3();
     }


    // metodo publico que retorne la instance
    public static Singleton3 getInstance(){
         if (instance == null)
             makeInstace();
         return  instance;
    }

    public void print(){
        System.out.println("Usando el singleton");
    }


}
