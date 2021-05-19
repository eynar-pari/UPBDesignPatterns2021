package prototype.ejemplos.boletosFutbol;

public class EntradaFisica implements IEntradaFutbol {
    private String equipoVisitante;
    private String equipoLocal;
    private String numeroAsiento;
    private String fecha;
    private String lugar;
    private String precio;
    private String categoria;
    private String nit;
    private String factura;
    private Persona persona;
    private Tiempo time;


    public EntradaFisica(){}

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Tiempo getTime() {
        return time;
    }

    public void setTime(Tiempo time) {
        this.time = time;
    }

    @Override
    public Object clone() {
        EntradaFisica objClone= new EntradaFisica();
        objClone.setCategoria(this.categoria);
        objClone.setEquipoLocal(this.equipoLocal);
        objClone.setEquipoVisitante(this.equipoVisitante);
        objClone.setFactura(this.factura);
        objClone.setFecha(this.fecha);
        objClone.setLugar(this.lugar);
        objClone.setNit(this.nit);
        objClone.setNumeroAsiento(this.numeroAsiento);
        objClone.setPrecio(this.precio);
        objClone.setPersona(this.persona);
        objClone.time=this.time;
        return objClone;
    }

    public void showInformation(){
        System.out.println("***********************");
        System.out.println("equipoVisitante: "+equipoVisitante);
        System.out.println("equipoLocal: "+equipoLocal);
        System.out.println("numeroAsiento: "+numeroAsiento);
        System.out.println("fecha: "+fecha);
        System.out.println("lugar: "+lugar);
        System.out.println("precio: "+precio);
        System.out.println("categoria: "+categoria);
        System.out.println("nit: "+nit);
        System.out.println("factura: "+factura);
        System.out.println("persona ci:"+ persona.getCi());
        System.out.println("persona nombre: "+ persona.getNombre());
    }
}
