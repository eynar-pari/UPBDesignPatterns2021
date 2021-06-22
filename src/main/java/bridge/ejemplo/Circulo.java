package bridge.ejemplo;



public class Circulo implements IFigura {

    private IColor color;

    private int radio;

    public Circulo(int radio){
        this.radio=radio;
    }

    public Circulo(IColor color){
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
