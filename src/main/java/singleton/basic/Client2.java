package singleton.basic;

public class Client2 {
    public static void main(String[]args){
        Singleton2.getInstance().print();
        Singleton2.getInstance().print();
        Singleton2.getInstance().print();
        usingS();
        Singleton2.getInstance().print();
        Singleton2.getInstance().print();
        Singleton2.getInstance().print();
    }

    public static void usingS(){
        Singleton2.getInstance().print();
    }
}
