package factoryMethod.ejemplos.heladeria;

public class Client {
    public  static void main (String[]args){
        CreatorHelados heladoAgua= new CreatorHeladoAgua();
        heladoAgua.create().crear();

        CreatorHelados heladoCrema= new CreatorHeladoCrema();
        heladoCrema.create().crear();

        HeladoMixto helado =  new CreatorHeladoMixto().create();
        helado.setTamano("Gigante");
    }
}
