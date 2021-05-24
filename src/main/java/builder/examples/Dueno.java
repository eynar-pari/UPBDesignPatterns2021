package builder.examples;

public class Dueno {
    private BuilderComputadora builderComputadora;
    public void setBuilderComputadora(BuilderComputadora builderComputadora){
        this.builderComputadora=builderComputadora;
    }
    public Computadora getComputadora(){
        return builderComputadora.getComputadora();
    }

    public void armarComputadora(){
        this.builderComputadora.createComputadora();
        this.builderComputadora.buildMemoria();
        this.builderComputadora.buildMonitor();
        this.builderComputadora.buildMouse();
        this.builderComputadora.buildProcesador();
        this.builderComputadora.buildTeclado();
        this.builderComputadora.buildVideo();
    }



}
