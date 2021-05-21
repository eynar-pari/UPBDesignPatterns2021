package abstractFactory.ejercicios;

public class PasajeSolidario implements IPasaje {

    private String numeroVuelo;
    private Pais desting;
    private Pais origen;
    private Avion avion;
    private Pasajero pasajero;
    private String numeroAsiento;
    private String costoEspecial;
    private String descuento;
    private String motivoDescuento;

    public PasajeSolidario(){}

    @Override
    public void crear() {
        System.out.println("PASAJE INFANTE");
        System.out.println("numeroVuelo: "+numeroVuelo);
        System.out.println("numeroAsiento: "+numeroAsiento);
        System.out.println("costoEspecial: "+costoEspecial);
        System.out.println("descuento: "+descuento);
        System.out.println("motivoDescuento: "+motivoDescuento);
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

    public String getCostoEspecial() {
        return costoEspecial;
    }

    public void setCostoEspecial(String costoEspecial) {
        this.costoEspecial = costoEspecial;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
    }
}
