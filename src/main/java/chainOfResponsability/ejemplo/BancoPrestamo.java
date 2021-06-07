package chainOfResponsability.ejemplo;

public class BancoPrestamo implements IAgenteCredito {
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

          AgenteCreditoSucursal agente = new AgenteCreditoSucursal();
          this.setNext(agente);

          SupervisosCreditoAgencia supervisorAgencia = new SupervisosCreditoAgencia();
          agente.setNext(supervisorAgencia);

          SupervisosCreditoDepartamental supervisorDepartamental = new SupervisosCreditoDepartamental();
          supervisorAgencia.setNext(supervisorDepartamental);

          ConcejoPresidentes presidentes = new ConcejoPresidentes();
          supervisorDepartamental.setNext(presidentes);

          this.next.realizarPrestamo(persona);
    }
}
