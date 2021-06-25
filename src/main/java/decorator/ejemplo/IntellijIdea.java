package decorator.ejemplo;

public class IntellijIdea implements Ide{
    private String licencia;
    private String tamano;
    private String version;
    private int precio;
    private String lenguajeProg;

    public IntellijIdea(){

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

    public String getLenguajeProg() {
        return lenguajeProg;
    }

    public void setLenguajeProg(String lenguajeProg) {
        this.lenguajeProg = lenguajeProg;
    }

    @Override
    public void operation() {
        System.out.println("IntelliJIDEA>licencia : "+licencia);
        System.out.println("IntelliJIDEA>precio : "+precio);
        System.out.println("IntelliJIDEA>version : "+version);
        System.out.println("IntelliJIDEA>tamano : "+tamano);
        System.out.println("IntelliJIDEA>lenguajeProg : "+lenguajeProg);
    }
}
