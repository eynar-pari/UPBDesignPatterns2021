package abstractFactory.ejemplos.browser;

public class Chrome extends  Navegador{
    @Override
    public void openUrl(String url) {
        System.out.println("Chrome> Abriendo la url: "+url);
    }

    @Override
    public void saveCache() {
        System.out.println("guardando cachecen Chrome");

    }
}
