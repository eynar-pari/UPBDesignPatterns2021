package factoryMethod.ejemplos.heladeria;

public class Client {
    public  static void main (String[]args){
        CreatorHelados heladoAgua= new CreatorHeladoAgua();
        heladoAgua.create().crear();

        CreatorHelados heladoCrema= new CreatorHeladoCrema();
        heladoCrema.create().crear();

        CreatorHelados heladoMixto= new CreatorHeladoMixto();
        heladoMixto.create().crear();
    }
}
