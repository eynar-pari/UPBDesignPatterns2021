package _ejerciciosParcial1.iterator;

import java.util.Stack;


public class IteratorMojix implements Iterator {
    private Stack<Empleado> empleados;
    private int position;
    public IteratorMojix(Stack<Empleado> empleados){
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
