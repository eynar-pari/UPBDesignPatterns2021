package singleton.ejemplos.logger;

public class Director {
    String nombre;
    String gradoAcademico;

    public Director(){
        Logger.getInstance().info("Instanciando un Directo");
    }

    public String getNombre() {
        Logger.getInstance().info("obteniendo el nombre del Director: "+nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        Logger.getInstance().info("llenando el nombre del Director: "+nombre);
        this.nombre = nombre;
    }

    public String getGradoAcademico() {
        Logger.getInstance().info("obteniendo el grado academico del Director: "+gradoAcademico);
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        Logger.getInstance().info("llenando el grado academico del Director: "+gradoAcademico);
        this.gradoAcademico = gradoAcademico;
    }
}
