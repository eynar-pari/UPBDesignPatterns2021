package factoryMethod.ejemplos.heladeria;

public class CreatorHeladoCrema extends CreatorHelados{
    @Override
    public HeladoCrema create() {

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
        
        Crema crema = new Crema();
        crema.setSabor("naranja");
        crema.setMarca("PIL");
        crema.setCosto("1");
        
        HeladoCrema heladoCrema = new HeladoCrema();
        heladoCrema.setBase(baseCono);
        heladoCrema.setForma("clasica");
        heladoCrema.setFruta(fruta);
        heladoCrema.setTamano("mediano");
        heladoCrema.setCrema(crema);
     
        return heladoCrema;
    }
}
