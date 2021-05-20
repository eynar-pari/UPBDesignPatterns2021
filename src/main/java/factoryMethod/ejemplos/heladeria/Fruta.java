package factoryMethod.ejemplos.heladeria;

public class Fruta {

    private String tipoFruta;
    private String nombre;
    private String costo;
    private String tamano;

    public Fruta(){
    }

    public String getTipoFruta() {
        return tipoFruta;
    }

    public void setTipoFruta(String tipoFruta) {
        this.tipoFruta = tipoFruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void showInfo(){
        System.out.println("fruta tipoFruta: "+tipoFruta);
        System.out.println("fruta nombre: "+nombre);
        System.out.println("fruta costo: "+costo);
        System.out.println("fruta tamano: "+tamano);
    }
}
