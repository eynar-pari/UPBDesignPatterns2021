package abstractFactory.ejercicios;

public class Avion {

    private String marca;
    private String capacidad;
    private String modelo;
    private String numeroAsiento;

    public Avion(){}

    public Avion(String marca,String capacidad, String modelo, String numeroAsiento){
        this.marca=marca;
        this.capacidad=capacidad;
        this.modelo=modelo;
        this.numeroAsiento=numeroAsiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public void show() {
        System.out.println("AVION> marca: "+marca);
        System.out.println("AVION> capacidad:"+capacidad);
        System.out.println("AVION> modelo: "+modelo);
        System.out.println("AVION> numeroAsient: "+numeroAsiento);
    }
}