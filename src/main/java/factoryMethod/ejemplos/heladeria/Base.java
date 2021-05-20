package factoryMethod.ejemplos.heladeria;

public class Base {
    // base (nombre, tamano, tipo, costo)
    private String nombre;
    private String tamano;
    private String tipo;
    private String costo;

    public Base(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public void showInfo(){
        System.out.println("base nombre: "+nombre);
        System.out.println("base tamano: "+tamano);
        System.out.println("base tipo: "+tipo);
        System.out.println("base costo: "+costo);

    }
}
