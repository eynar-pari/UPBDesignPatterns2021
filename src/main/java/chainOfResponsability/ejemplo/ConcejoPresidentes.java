package chainOfResponsability.ejemplo;


public class ConcejoPresidentes implements IAgenteCredito {
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

          if (persona.getPrestamoSolicitado() > 200000 ){
              System.out.println("INFO> Prestamo Aprobado por el ConcejoPresidentes con el monto de : "+persona.getPrestamoSolicitado() );
          } else {
              System.out.println(" ERROR! el monto debe ser atendido por otro en la cadena de responsabilidad : "+persona.getPrestamoSolicitado() );

          }
    }
}
