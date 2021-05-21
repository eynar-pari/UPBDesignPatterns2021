package abstractFactory.ejercicios;


public class Client {
    public static void main (String []args){
        PasajeStandart a1= (PasajeStandart) FactoryPasaje.make(FactoryPasaje.typePasaje.PASAJE_STANDART);
        a1.setPasajero(new Pasajero("99999","JOSE"));
        a1.setNumeroAsiento("50");
        a1.crear();

        PasajeStandart a2= (PasajeStandart) FactoryPasaje.make(FactoryPasaje.typePasaje.PASAJE_STANDART);
        a2.setPasajero(new Pasajero("11111","JUAN"));
        a2.setNumeroAsiento("49");
        a2.crear();

        PasajeInfantes a3= (PasajeInfantes) FactoryPasaje.make(FactoryPasaje.typePasaje.PASAJE_INFANTIL);
        a3.setPasajero(new Pasajero("11111","JUAN","20/1/2021"));
        a3.setNumeroAsiento("1");
        a3.crear();


    }
}
