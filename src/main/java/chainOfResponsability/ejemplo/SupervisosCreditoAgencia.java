package chainOfResponsability.ejemplo;


public class SupervisosCreditoAgencia implements IAgenteCredito {
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

          if (persona.getPrestamoSolicitado() > 50000 && persona.getPrestamoSolicitado() <= 100000  ){
              System.out.println("INFO> Prestamo Aprobado por el SupervisosCreditoAgencia con el monto de : "+persona.getPrestamoSolicitado() );
          } else {
              this.next.realizarPrestamo(persona);
          }
    }
}
