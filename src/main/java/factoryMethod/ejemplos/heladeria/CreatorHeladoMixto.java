package factoryMethod.ejemplos.heladeria;

public class CreatorHeladoMixto extends CreatorHelados{
    @Override
    public HeladoMixto create() {

        Base baseCono= new Base();
        baseCono.setCosto("6");
        baseCono.setNombre("vaso");
        baseCono.setTamano("mediano");
        baseCono.setTipo("plastico");
        
        Fruta fruta = new Fruta();
        fruta.setCosto("1");
        fruta.setNombre("chirimolla");
        fruta.setTamano("mediano");
        fruta.setTipoFruta("acido");
        
        Crema crema = new Crema();
        crema.setSabor("vainilla");
        crema.setMarca("PIL");
        crema.setCosto("1");
        
        HeladoMixto heladoMixto = new HeladoMixto();
        heladoMixto.setBase(baseCono);
        heladoMixto.setForma("standart");
        heladoMixto.setFruta(fruta);
        heladoMixto.setTamano("mediano");
        heladoMixto.setCrema(crema);
        heladoMixto.setCosto("50");
     
        return heladoMixto;
    }
}
