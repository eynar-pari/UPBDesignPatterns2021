package _ejerciciosParcial1.iterator;

import java.util.List;



public class IteratorTruextend implements Iterator {
    private List<Empleado> empleados;
    private int position;
    public IteratorTruextend(List<Empleado> empleados){
        this.empleados=empleados;
        position=0;

    }

    @Override
    public Object next() {
        return this.empleados.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.empleados.size() !=0 &&  position< this.empleados.size();
    }
}
