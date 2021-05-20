package factoryMethod.ejemplos.heladeria;

public class Crema {
    private String sabor;
    private String costo;
    private String marca;

    public Crema(){}

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void showInfo(){
        System.out.println("crema - sabor: "+sabor);
        System.out.println("crema - costo: "+costo);
        System.out.println("crema - marca: "+marca);
    }
}
