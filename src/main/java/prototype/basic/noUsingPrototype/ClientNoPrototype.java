package prototype.basic.noUsingPrototype;

public class ClientNoPrototype {
    public static void main (String[] arg){
        NoPrototype obj1 = new NoPrototype();
        obj1.setAttribute1(5);
        obj1.setAttribute2("este es el OBJETO 1");
        System.out.println("OBJ1 > "+obj1.getAttribute2());

        NoPrototype obj2 = new NoPrototype();
        obj2 = obj1;
        System.out.println("OBJ2 > "+obj2.getAttribute2());

        System.out.println("******************");
        obj2.setAttribute2("este es el OBJETO 2");

        System.out.println("*** OBJ1 > "+obj1.getAttribute2());
        System.out.println("*** OBJ2 > "+obj2.getAttribute2());

    }

}
