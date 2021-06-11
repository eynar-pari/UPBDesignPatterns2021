package _ejerciciosParcial1.factoryMethod;

public class Computadora {
    String marca;
    String os;

    public Computadora(String marca, String os) {
        this.marca = marca;
        this.os = os;
    }
    public void showData(){
        System.out.println("Computadora marca: "+marca);
        System.out.println("Computadora marca:"+os);
    }
}
