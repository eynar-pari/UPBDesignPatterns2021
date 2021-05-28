package _ejerciciosParcial1.iterator;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTruextend implements IEmpresa {
    private List<Empleado> empleados;

    public EmpresaTruextend(){
        empleados= new ArrayList<>();
    }
     public void add(Empleado value){
         empleados.add(value);
     }

    @Override
    public IteratorTruextend iterator() {
        return new IteratorTruextend(this.empleados);
    }
}
