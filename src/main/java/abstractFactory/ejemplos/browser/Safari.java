package abstractFactory.ejemplos.browser;

public class Safari extends  Navegador{
    @Override
    public void openUrl(String url) {
        System.out.println("Safari> Abriendo la url: "+url);
    }

    @Override
    public void saveCache() {
        System.out.println("guardando cachecen Safari");

    }
}
