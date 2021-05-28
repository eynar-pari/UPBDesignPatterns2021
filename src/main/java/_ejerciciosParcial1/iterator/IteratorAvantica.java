package _ejerciciosParcial1.iterator;

import java.util.Vector;

public class IteratorAvantica implements Iterator {
    private Vector<Empleado> empleados;
    private int position;
    public IteratorAvantica(Vector<Empleado> empleados){
        this.empleados=empleados;
        this.position=0;
    }

    @Override
    public Object next() {
        return this.empleados.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.empleados.size() !=0 && this.empleados.size() > position;
    }
}
