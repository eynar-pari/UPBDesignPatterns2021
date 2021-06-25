package decorator.ejemplo;

public class PluginDebug extends Plugin {
    private int precioPlugin;
    private boolean isOpenSource;

    public PluginDebug(Ide ide, int precioPlugin, boolean isOpenSource) {
        super(ide);
        this.precioPlugin=precioPlugin;
        this.isOpenSource=isOpenSource;
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("\tPluginDebug>Agregando Funcionalidad ....");
        int newPrecio=this.precioPlugin+ super.getPrecio();
        System.out.println("\tprecio nuevo con PluginDebug"+newPrecio);
    }

}
