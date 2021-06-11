package _ejerciciosParcial1.factoryMethod;

public class Mochila {
    String numeroBolsillo;
    String tamano;

    public Mochila(String numeroBolsillo, String tamano) {
        this.numeroBolsillo = numeroBolsillo;
        this.tamano = tamano;
    }

    public void showData(){
        System.out.println("Mochila tipo:"+numeroBolsillo);
        System.out.println("Mochila autor:"+tamano);

    }
}
