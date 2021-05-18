package singleton.ejemplos.logger;

public class Profesor {
    String nombre;
    String categoria;
    String materia;

    public Profesor(){
        Logger.getInstance().info("Instanciando un Profesor");
    }

    public String getNombre() {
        Logger.getInstance().info("obteniendo el nombre del profesor: "+nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        Logger.getInstance().info("llenando el nombre del profesor: "+nombre);
        this.nombre = nombre;
    }

    public String getCategoria() {
        Logger.getInstance().info("obteniendo la categoria del profesor: "+categoria);
        return categoria;
    }

    public void setCategoria(String categoria) {
        Logger.getInstance().info("llenando la categoria del profesor: "+categoria);
        this.categoria = categoria;
    }

    public String getMateria() {
        Logger.getInstance().info("obteniendo la materia del profesor: "+materia);
        return materia;
    }

    public void setMateria(String materia) {
        Logger.getInstance().info("llenando la materia del profesor: "+materia);
        this.materia = materia;
    }
}
