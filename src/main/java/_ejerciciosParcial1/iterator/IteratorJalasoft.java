package _ejerciciosParcial1.iterator;

public class IteratorJalasoft implements Iterator {

    private Empleado [] empleados;
    private int position;

    public IteratorJalasoft(Empleado [] empleados){
        this.empleados=empleados;
    }

    @Override
    public Object next() {
        return empleados[position++];
    }

    @Override
    public boolean hasNext() {
        return empleados.length != 0 && position < empleados.length;
    }
}
