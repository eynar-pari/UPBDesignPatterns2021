package factoryMethod.ejemplos.heladeria;

public class CreatorHeladoAgua extends CreatorHelados{
    @Override
    public HeladoAgua create() {

        Base baseCono= new Base();
        baseCono.setCosto("5");
        baseCono.setNombre("cono");
        baseCono.setTamano("grande");
        baseCono.setTipo("galleta");

        Fruta fruta = new Fruta();
        fruta.setCosto("1");
        fruta.setNombre("frutilla");
        fruta.setTamano("mediano");
        fruta.setTipoFruta("dulces");

        HeladoAgua heladoAgua = new HeladoAgua();
        heladoAgua.setBase(baseCono);
        heladoAgua.setForma("clasica");
        heladoAgua.setFruta(fruta);
        heladoAgua.setTamano("mediano");

        return heladoAgua;
    }
}
