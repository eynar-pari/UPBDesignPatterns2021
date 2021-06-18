package adapter.ejemplo;

public class Client {

    public static void main(String[]args){
        // Empresa B
        AutoElectrico minibus= new AutoElectrico();
        minibus.setCargaMaximaBateria(100);
        minibus.setFuncionandoTime(20);
        minibus.setTiempoCarga(15);
        minibus.setTiempoVida(3000);

        // Empresa A

        Diesel vagoneta= new Diesel();
        vagoneta.setCantidadDeCarga(15);
        vagoneta.setCapacidad(100);
        vagoneta.setTiempoEnMarcha(20);


        Gasolina taxi= new Gasolina();
        taxi.setCantidadDeCarga(15);
        taxi.setCapacidad(100);
        taxi.setTiempoEnMarcha(20);
        GasolinaEspecial flota= new GasolinaEspecial();

        flota.setCantidadDeCarga(15);
        flota.setCapacidad(100);
        flota.setTiempoEnMarcha(20);

        /////*************

        flota.prender();
        flota.cargar();
        flota.utilizarAutomovil();

        AutomovilElectricoAdaptado minibusAdaptado = new AutomovilElectricoAdaptado(minibus);
        minibusAdaptado.prender();
        minibusAdaptado.cargar();
        minibusAdaptado.utilizarAutomovil();


    }
}
