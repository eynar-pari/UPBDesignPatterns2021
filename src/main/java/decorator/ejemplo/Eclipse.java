package decorator.ejemplo;

public class Eclipse implements Ide{

    private String licencia;
    private String tamano;
    private String version;
    private int precio;

    public Eclipse(){

    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void operation() {
        System.out.println("Eclipse>licencia : "+licencia);
        System.out.println("Eclipse>precio : "+precio);
        System.out.println("Eclipse>version : "+version);
        System.out.println("Eclipse>tamano : "+tamano);
    }
}
