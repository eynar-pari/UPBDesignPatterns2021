package bridge.ejemploNoBrdige;

public class Cuadrado implements  Figura {

    private int tamanoLado;

    public Cuadrado(int tamanoLado){
        this.tamanoLado=tamanoLado;
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
        System.out.println("pintando de color Cafe");
    }

    @Override
    public void pintarMorado() {
        System.out.println("pintando de color Morado");
    }

    @Override
    public void pintarAmarillo() {

    }

    @Override
    public int getArea() {
        return 0;
    }
}
