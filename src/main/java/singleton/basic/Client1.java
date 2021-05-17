package singleton.basic;

public class Client1 {
    public static void main(String[]args){
        Singleton1.getInstance().print();
        Singleton1.getInstance().print();
        Singleton1.getInstance().restartSingleton();
        usingS();
        Singleton1.getInstance().print();
        Singleton1.getInstance().print();
        Singleton1.getInstance().print();
    }

    public static void usingS(){
        Singleton1.getInstance().print();
    }
}
