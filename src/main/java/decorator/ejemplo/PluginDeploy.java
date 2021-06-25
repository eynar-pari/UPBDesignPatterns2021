package decorator.ejemplo;

public class PluginDeploy extends Plugin {
    private int precioPlugin;
    private boolean isOpenSource;

    public PluginDeploy(Ide ide, int precioPlugin, boolean isOpenSource) {
        super(ide);
        this.precioPlugin=precioPlugin;
        this.isOpenSource=isOpenSource;
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("\tPluginDeploy>Agregando Funcionalidad ....");
        int newPrecio=this.precioPlugin+ super.getPrecio();
        System.out.println("\tprecio nuevo con PluginDeploy"+newPrecio);

    }

}
