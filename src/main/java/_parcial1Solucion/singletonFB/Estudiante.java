package _parcial1Solucion.singletonFB;

public class Estudiante {
    private String ci;
    private String name;
    private String horaMatriculacion;
     private int cantidad;
    public Estudiante(){}

    public Estudiante(String ci, String name){
        this.ci= ci;
        this.name= name;

    }

    public void info(){
        System.out.println("Estudiante - > ci: "+this.ci);
        System.out.println("Estudiante - > name: "+this.name);
        System.out.println("Estudiante - > hora: "+this.horaMatriculacion);
        System.out.println("Estudiante - > cantidad: "+this.cantidad);
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHoraMatriculacion() {
        return horaMatriculacion;
    }

    public void setHoraMatriculacion(String horaMatriculacion) {
        this.horaMatriculacion = horaMatriculacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
