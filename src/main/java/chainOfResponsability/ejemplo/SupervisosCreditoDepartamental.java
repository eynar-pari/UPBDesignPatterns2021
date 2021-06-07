package chainOfResponsability.ejemplo;


public class SupervisosCreditoDepartamental implements IAgenteCredito {
    private  IAgenteCredito next;

    @Override
    public void setNext(IAgenteCredito handler) {
        this.next=handler;
    }

    @Override
    public IAgenteCredito next() {
        return this.next;
    }

    @Override
    public void realizarPrestamo(Persona persona) {

          if (persona.getPrestamoSolicitado() > 100000 && persona.getPrestamoSolicitado() <= 200000  ){
              System.out.println("INFO> Prestamo Aprobado por el SupervisosCreditoDepartamental con el monto de : "+persona.getPrestamoSolicitado() );
          } else {
              this.next.realizarPrestamo(persona);
          }
    }
}
