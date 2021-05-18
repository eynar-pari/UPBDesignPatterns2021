package prototype.basic;

public class Client {

    public static void main (String []args){
        ConcretePrototype objeto1 = new ConcretePrototype();
        objeto1.setAttribute1(5);
        objeto1.setAttribute2("este es el OBJETO 1");
        System.out.println("OBJ1 > "+objeto1.getAttribute2());

        ConcretePrototype objeto2 = (ConcretePrototype) objeto1.clone();
        System.out.println("OBJ2 > "+objeto2.getAttribute2());

        System.out.println("******************");
        objeto2.setAttribute2("este es el OBJETO 2");

        System.out.println("OBJ1 > "+objeto1.getAttribute2());
        System.out.println("OBJ2 > "+objeto2.getAttribute2());

    }
}
