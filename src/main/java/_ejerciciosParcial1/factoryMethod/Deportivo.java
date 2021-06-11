package _ejerciciosParcial1.factoryMethod;

public class Deportivo {
    String talla;
    String color;
    String numPrendas;

    public Deportivo(String talla, String color, String numPrendas) {
        this.talla = talla;
        this.color = color;
        this.numPrendas = numPrendas;
    }
    public void showData(){
        System.out.println("Deportivo talla:"+talla);
        System.out.println("Deportivo color:"+color);
        System.out.println("Deportivo numPrendas:"+numPrendas);
    }
}
