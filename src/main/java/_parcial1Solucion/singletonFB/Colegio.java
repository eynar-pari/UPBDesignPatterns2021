package _parcial1Solucion.singletonFB;


public class Colegio {
    private String  nombreColegio;
    private boolean isPublic;

    public Colegio(){

    }

    public Colegio(String nombreColegio,boolean isPublic){
        this.nombreColegio=nombreColegio;
        this.isPublic=isPublic;

    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public void  inscripcion( Estudiante estudiante, int candidad){
        VentanillaUnica.getInstance().pagarMatricula(estudiante,candidad);

    }
    public void mostrarInfoColegio(Persona persona){
        if (persona.getCargo().equals("RecursosHumanos")){
            VentanillaUnica.getInstance().mostrarDatod();
        }else{
            System.out.println("NO TIENE ACCESO PARA MOSTRAR DATOS");

        }

    }
}
