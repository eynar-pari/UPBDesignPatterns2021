package _ejerciciosParcial1.factoryMethod;

public class Cuaderno {
    String tipo;
    String numHojas;

    public Cuaderno(String tipo, String numHojas) {
        this.tipo = tipo;
        this.numHojas = numHojas;
    }
    public void showData(){
        System.out.println("Cuaderno tipo:"+tipo);
        System.out.println("Cuaderno numHojas:"+numHojas);
    }
}
