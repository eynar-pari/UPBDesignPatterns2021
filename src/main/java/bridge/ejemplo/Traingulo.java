package bridge.ejemplo;



public class Traingulo implements IFigura {


    private IColor color;

    private int lado;

    public Traingulo(int lado){
        this.lado=lado;
    }


    public Traingulo(IColor color){
        this.color=color;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void pintar() {
        System.out.println("pintando ...");
        color.pintar();
    }
}
