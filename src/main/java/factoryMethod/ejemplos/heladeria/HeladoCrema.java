package factoryMethod.ejemplos.heladeria;

public class HeladoCrema implements IHelado{

    private String tamano;
    private String forma;
    private Fruta fruta;
    private Base base;
    private Crema crema;

    public HeladoCrema(){
        fruta = new Fruta();
        base= new Base();
        crema = new Crema();
    }

    @Override
    public void crear() {
        System.out.println("Helado De Crema - tamano: "+tamano);
        System.out.println("Helado De Crema - forma: "+forma);
        fruta.showInfo();
        base.showInfo();
        crema.showInfo();
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }
}
