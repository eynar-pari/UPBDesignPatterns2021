package bridge.ejemploNoBrdige;

public class Circulo implements  Figura {

    private int radio;

    public Circulo(int radio){
        this.radio=radio;
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
        System.out.println("pintando de color Amrillo");
    }

    @Override
    public int getArea() {
        return 0;
    }
}
