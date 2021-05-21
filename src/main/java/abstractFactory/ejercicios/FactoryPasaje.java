package abstractFactory.ejercicios;

public class FactoryPasaje {

    public enum typePasaje{
           PASAJE_STANDART,PASAJE_SOLIDARIO,PASAJE_INFANTIL
        }

    public static IPasaje make(typePasaje type){
        IPasaje pasaje;
        switch (type){
            case PASAJE_STANDART:
                pasaje= new PasajeStandart();
                ((PasajeStandart) pasaje).setAvion(new Avion("F1","50","Modelo1","50"));
                ((PasajeStandart) pasaje).setCostoPasaje("50bs");
                ((PasajeStandart) pasaje).setDesting(new Pais("EEUU","NY","AER1"));
                ((PasajeStandart) pasaje).setOrigen(new Pais("BOLVIA","LP","AER2"));
                ((PasajeStandart) pasaje).setNumeroAsiento("0");
                ((PasajeStandart) pasaje).setPasajero(new Pasajero());
                break;
            case PASAJE_SOLIDARIO:
                pasaje= new PasajeSolidario();
                break;
            case PASAJE_INFANTIL:
                pasaje= new PasajeInfantes();
                break;
            default:
                pasaje= new PasajeInfantes();
                break;
        }
       return pasaje;
    }

}
