package _ejerciciosParcial1.iterator;

public class EmpresaJalaSoft implements IEmpresa {

    private Empleado [] empleados;
    private int position;

    public EmpresaJalaSoft(){
        position=0;
        empleados= new Empleado[3];
    }
     public void add(Empleado value){
         empleados[position]=value;
        position++;
     }

    @Override
    public IteratorJalasoft iterator() {
        return new IteratorJalasoft(this.empleados);
    }
}
