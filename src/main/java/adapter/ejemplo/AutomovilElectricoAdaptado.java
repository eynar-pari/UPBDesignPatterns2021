package adapter.ejemplo;

public class AutomovilElectricoAdaptado implements IAutomovil {

    private AutoElectrico autoElectrico;

    public AutomovilElectricoAdaptado (AutoElectrico autoElectrico){
        System.out.println("Adaptando AutoElectrico a la familia de IAutomovil");
        this.autoElectrico=autoElectrico;
    }

    @Override
    public void prender() {
        this.autoElectrico.habilitarBateria();
    }

    @Override
    public void cargar() {
        System.out.println("Adaptando AutoElectrico a la familia de IAutomovil");
       this.autoElectrico.cargarBateria();
    }

    @Override
    public void utilizarAutomovil() {
        System.out.println("Adaptando AutoElectrico a la familia de IAutomovil");
        this.autoElectrico.utilizarBateria();
    }
}
