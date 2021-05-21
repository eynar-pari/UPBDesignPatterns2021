package abstractFactory.ejercicios;

public class Pasajero {
    private String ci;
    private String nombre;
    private String fechaDeNacimiento;

    public Pasajero(){}
    public Pasajero(String ci, String nombre, String fechaDeNacimiento){
        this.ci=ci;
        this.nombre=nombre;
        this.fechaDeNacimiento=fechaDeNacimiento;

    }
    public Pasajero(String ci, String nombre){
        this.ci=ci;
        this.nombre=nombre;
        this.fechaDeNacimiento="";
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void show(){
        System.out.println("PASAJERO> ci: "+ci);
        System.out.println("PASAJERO> nombre: "+nombre);
        System.out.println("PASAJERO> fechaDeNacimient: "+fechaDeNacimiento);
    }
}
