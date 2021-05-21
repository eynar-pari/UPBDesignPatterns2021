package abstractFactory.ejemplos.browser;

public class Edge extends  Navegador{
    @Override
    public void openUrl(String url) {
        System.out.println("Edge> Abriendo la url: "+url);
    }

    @Override
    public void saveCache() {
        System.out.println("guardando cachecen Edge");

    }
}
