package proxy.basic;

public class Proxy implements  ISubject{

    private int attribute1;
    // dato importante // no debe tener su metodo set/get del objeto realSubject
    private RealSubject realSubject;

    public Proxy(){
        realSubject= new RealSubject();
    }

    public int getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(int attribute1) {
        this.attribute1 = attribute1;
    }

    @Override
    public void request() {
        // filtro para utilizar el objeto real
        if (attribute1 > 50){
            System.out.println("utilizando objeto real");
            this.realSubject.request();
        } else{
            System.out.println("valor no permitido para utilizar el objeto real :"+attribute1);
        }
    }
}
