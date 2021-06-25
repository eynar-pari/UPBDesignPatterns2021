package decorator.ejemplo;

public class Plugin implements  Ide{
    private Ide ide;

    public Plugin(Ide ide){
        this.ide=ide;
    }

    public Ide getIde() {
        return ide;
    }

    public void setIde(Ide ide) {
        this.ide = ide;
    }

    @Override
    public void operation() {
        this.ide.operation();
    }

    @Override
    public int getPrecio() {
        return 0;
    }

    @Override
    public void setPrecio(int precio) {

    }
}
