package bridge.ejemplo;



public class Cuadrado implements IFigura {

    private int tamanoLado;
    private IColor color;

    public Cuadrado(int tamanoLado){
        this.tamanoLado=tamanoLado;
    }

    public Cuadrado(IColor color){
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
