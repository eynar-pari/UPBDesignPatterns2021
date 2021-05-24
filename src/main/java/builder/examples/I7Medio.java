package builder.examples;

public class I7Medio extends BuilderComputadora {
    @Override
    public void buildMonitor() {
        computadora.setMonitor("32");
    }

    @Override
    public void buildMouse() {
       computadora.setMouse("luminoso");
    }

    @Override
    public void buildMemoria() {
      computadora.setMemoria("gb16");
    }

    @Override
    public void buildProcesador() {
      computadora.setProcesador("i7");
    }

    @Override
    public void buildVideo() {
      computadora.setVideo("8");
    }

    @Override
    public void buildTeclado() {
        computadora.setTeclado("luminoso");
    }
}
