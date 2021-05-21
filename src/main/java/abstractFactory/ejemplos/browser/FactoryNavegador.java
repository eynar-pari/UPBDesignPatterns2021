package abstractFactory.ejemplos.browser;

public class FactoryNavegador {
    public static final String CHROME="Chrome";
    public static final String FIREFOX="firefox";
    public static final String EDGE="edge";
    public static final String SAFARI="safari";

    public static Navegador make(String type){
        Navegador navegador;
        switch (type){
            case CHROME:
                navegador= new Chrome();
                break;
            case FIREFOX:
                navegador= new FireFox();
                break;
            case EDGE:
                navegador= new Edge();
                break;
            case SAFARI:
                navegador= new Safari();
                break;
            default:
                navegador= new Chrome();
                break;
        }
        return navegador;
    }

}
