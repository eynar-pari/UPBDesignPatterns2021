package abstractFactory.ejercicios;

public class Pais {
    /*pais, ciudad, aeropuerto*/
    private String pais;
    private String ciudad;
    private String aeropuerto;

    public Pais(){}

    public Pais(String pais,String ciudad, String aeropuerto){
        this.pais=pais;
        this.ciudad=ciudad;
        this.aeropuerto=aeropuerto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public void show(){
        System.out.println("PAIS> pais: "+pais);
        System.out.println("PAIS> ciudad: "+ciudad);
        System.out.println("PAIS> aeropuerto: "+aeropuerto);

    }
}
