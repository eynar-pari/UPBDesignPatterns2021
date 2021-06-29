package facade.basic;

public class Facade {

    private ConcreteObject1 object1 = new ConcreteObject1();
    private ConcreteObject2 object2 = new ConcreteObject2();
    private ConcreteObject3 object3 = new ConcreteObject3();
    private ConcreteObject4 object4 = new ConcreteObject4();


    public Facade(){}

    public void callingMetodos(){
        object1.metodoA();
        object2.metodoB();
        object3.metodoC();
        object4.metodoD();

    }

}
