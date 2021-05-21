package abstractFactory.ejercicios;

public class PasajeStandart implements IPasaje {

    private String numeroVuelo;
    private Pais desting;
    private Pais origen;
    private Avion avion;
    private Pasajero pasajero;
    private String numeroAsiento;
    private String costoPasaje;

    public PasajeStandart(){}

    @Override
    public void crear() {
        System.out.println("PASAJE INFANTE");
        System.out.println("numeroVuelo: "+numeroVuelo);
        System.out.println("numeroAsiento: "+numeroAsiento);
        System.out.println("costoEspecial: "+ costoPasaje);
        desting.show();;
        origen.show();
        avion.show();
        pasajero.show();

    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Pais getDesting() {
        return desting;
    }

    public void setDesting(Pais desting) {
        this.desting = desting;
    }

    public Pais getOrigen() {
        return origen;
    }

    public void setOrigen(Pais origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(String costoPasaje) {
        this.costoPasaje = costoPasaje;
    }
}
