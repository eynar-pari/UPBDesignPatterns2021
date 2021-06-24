package composite.ejemplo;

public abstract class Entidad {

    private String titulo;
    private int estimacion;
    private String descripcion;
    private String prioridad;

    public Entidad(String titulo,String prioridad, String descripcion, int estimacion){
        this.titulo=titulo;
        this.prioridad=prioridad;
        this.descripcion=descripcion;
        this.estimacion=estimacion;
    }

    public void showInfo(){
        System.out.println("\ntitulo: "+titulo);
        System.out.println("estimacion: "+estimacion);
        System.out.println("descripcion: "+descripcion);
        System.out.println("prioridad: "+prioridad+"\n");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEstimacion() {
        return estimacion;
    }

    public void setEstimacion(int estimacion) {
        this.estimacion = estimacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public abstract void operation();
    public abstract void add(Entidad component);
    public abstract void remove(Entidad component);
    public abstract void getChild(int position);
}
