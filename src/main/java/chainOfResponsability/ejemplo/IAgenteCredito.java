package chainOfResponsability.ejemplo;

public interface IAgenteCredito {
    void setNext(IAgenteCredito handler); //---> saber el siguiente responsable
    IAgenteCredito next(); //--> ir al siguient responsable
    void realizarPrestamo(Persona persona); // resolver el problema o moverse al siguinete responsable

}
