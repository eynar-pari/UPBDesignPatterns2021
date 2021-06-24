package composite.ejemplo;


public class SubTask extends Entidad {


    public SubTask(String titulo, String prioridad, String descripcion, int estimacion) {
        super(titulo, prioridad, descripcion, estimacion);
    }

    @Override
    public void operation() {
        this.showInfo();
    }

    @Override
    public void add(Entidad component) {
        System.out.println("No applicable");

    }

    @Override
    public void remove(Entidad component) {
        System.out.println("No applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No applicable");
    }
}
