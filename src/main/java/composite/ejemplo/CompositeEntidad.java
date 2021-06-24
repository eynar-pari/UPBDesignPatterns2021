package composite.ejemplo;


import java.util.ArrayList;
import java.util.List;

public class CompositeEntidad extends Entidad {

    private List<Entidad> entidadList = new ArrayList<>();


    public CompositeEntidad(String titulo, String prioridad, String descripcion, int estimacion) {
        super(titulo, prioridad, descripcion, estimacion);
    }

    @Override
    public void operation() {
        this.showInfo();
        Global.totalEstimacion=Global.totalEstimacion+this.getEstimacion();
        for (Entidad entidad : entidadList) {
            entidad.operation();
            Global.totalEstimacion=Global.totalEstimacion+entidad.getEstimacion();
        }
    }

    public void showTotalEstimacion(){
        System.out.println("-------------------------");
        System.out.println("| TOTAL: "+Global.totalEstimacion+" |");
        System.out.println("-------------------------");
    }

    @Override
    public void add(Entidad entidad) {
        entidadList.add(entidad);
    }

    @Override
    public void remove(Entidad entidad) {
        entidadList.remove(entidad);
    }

    @Override
    public void getChild(int position) {
        //todo
    }


}
