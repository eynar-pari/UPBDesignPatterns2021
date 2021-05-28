package _ejerciciosParcial1.iterator;

import java.util.Stack;

public class EmpresaMojix implements IEmpresa {
    private Stack<Empleado> empleados;

    public EmpresaMojix(){
        empleados= new Stack<Empleado>();
    }
     public void add(Empleado value){
         empleados.add(value);
     }

    @Override
    public IteratorMojix iterator() {
        return new IteratorMojix(this.empleados);
    }
}
