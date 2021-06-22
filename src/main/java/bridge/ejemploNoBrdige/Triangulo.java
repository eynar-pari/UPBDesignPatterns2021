package bridge.ejemploNoBrdige;

public class Triangulo implements  Figura {

    private int lado;

    public Triangulo(int lado){
        this.lado=lado;
    }

    @Override
    public void pintarAzul() {
        System.out.println("pintando de color Azul");
    }

    @Override
    public void pintarRojo() {
        System.out.println("pintando de color Rojo");
    }

    @Override
    public void pintarVerde() {
        System.out.println("pintando de color Verde");
    }

    @Override
    public void pintarCafe() {

    }

    @Override
    public void pintarMorado() {

    }

    @Override
    public void pintarAmarillo() {

    }

    @Override
    public int getArea() {
        return 0;
    }
}
