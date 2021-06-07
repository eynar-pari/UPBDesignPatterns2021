package chainOfResponsability.ejemplo;

public class Client {

    public static void main (String []ar){
        BancoPrestamo bancoPrestamo = new BancoPrestamo();

        bancoPrestamo.realizarPrestamo(new Persona("878787","UPB1",25000));
        bancoPrestamo.realizarPrestamo(new Persona("878787","UPB2",75000));
        bancoPrestamo.realizarPrestamo(new Persona("878787","UPB3",150000));
        bancoPrestamo.realizarPrestamo(new Persona("878787","UPB4",500000));


    }

}
