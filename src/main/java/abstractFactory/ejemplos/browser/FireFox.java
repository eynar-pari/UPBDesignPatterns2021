package abstractFactory.ejemplos.browser;

public class FireFox extends  Navegador{
    @Override
    public void openUrl(String url) {
        System.out.println("FireFox> Abriendo la url: "+url);
    }

    @Override
    public void saveCache() {
        System.out.println("guardando cachecen Firefox");

    }
}
