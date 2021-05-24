package builder.examples;

public class I5Bajo extends BuilderComputadora {
    @Override
    public void buildMonitor() {
        computadora.setMonitor("24");
    }

    @Override
    public void buildMouse() {
       computadora.setMouse("normal");
    }

    @Override
    public void buildMemoria() {
      computadora.setMemoria("8gb");
    }

    @Override
    public void buildProcesador() {
      computadora.setProcesador("i5");
    }

    @Override
    public void buildVideo() {
      computadora.setVideo("4");
    }

    @Override
    public void buildTeclado() {
        computadora.setTeclado("normal");
    }
}
