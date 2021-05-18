package singleton.ejemplos.logger;

public class Estudiante {
    String nombre;
    String semestre;
    String carrera;

    public Estudiante(){
        Logger.getInstance().info("Instanciando un Estudiante");
    }

    public String getNombre() {
        Logger.getInstance().info("obteniendo el nombre del estudiante: "+nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        Logger.getInstance().info("llenando el nombre del estudiante: "+nombre);
        this.nombre = nombre;
    }

    public String getSemestre() {
        Logger.getInstance().info("obteniendo el semestre del estudiante: "+semestre);
        return semestre;
    }

    public void setSemestre(String semestre) {
        Logger.getInstance().info("llenando el semestre del estudiante: "+semestre);
        this.semestre = semestre;
    }

    public String getCarrera() {
        Logger.getInstance().info("obteniendo la carrera del estudiante: "+carrera);
        return carrera;
    }

    public void setCarrera(String carrera) {
        Logger.getInstance().info("llenando la carrera del estudiante: "+carrera);
        this.carrera = carrera;
    }
}
