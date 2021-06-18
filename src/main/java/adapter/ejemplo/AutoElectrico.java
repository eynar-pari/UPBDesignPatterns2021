package adapter.ejemplo;

public class AutoElectrico implements  IElectrico {
    private int cargaMaximaBateria=100;
    private int funcionandoTime;
    private int tiempoVida=3600;
    private int tiempoCarga=0;

    public int getCargaMaximaBateria() {
        return cargaMaximaBateria;
    }

    public void setCargaMaximaBateria(int cargaMaximaBateria) {
        this.cargaMaximaBateria = cargaMaximaBateria;
    }

    public int getFuncionandoTime() {
        return funcionandoTime;
    }

    public void setFuncionandoTime(int funcionandoTime) {
        this.funcionandoTime = funcionandoTime;
    }

    public int getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public int getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(int tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    @Override
    public void cargarBateria() {
        System.out.println("apagado ... bateria : "+cargaMaximaBateria);
        System.out.println("tiempo de vida de la bateria: "+tiempoVida+"segundo ");
        for (int i = 0; i < tiempoCarga; i++) {
            cargaMaximaBateria=cargaMaximaBateria+1;
        }
    }

    @Override
    public void utilizarBateria() {
        System.out.println("bateria actual : "+cargaMaximaBateria);
        for (int i = 0; i < funcionandoTime; i=i+5) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("... en marcha ...");
            cargaMaximaBateria=cargaMaximaBateria-2;
            System.out.println("bateria actual : "+cargaMaximaBateria);
        }
        tiempoVida=tiempoVida-funcionandoTime;

    }

    @Override
    public void habilitarBateria() {
         System.out.println("Revisando Bateria, este tiene una carga de "+cargaMaximaBateria+" del 100%");
         if ( cargaMaximaBateria < 25)
             System.out.println("tiene bateria menor al 25%, deberia de cargarlo");

    }
}
