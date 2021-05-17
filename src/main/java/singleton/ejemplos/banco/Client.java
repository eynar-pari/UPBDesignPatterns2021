package singleton.ejemplos.banco;

import singleton.basic.Singleton3;

public class Client {

    public static void main (String []argumento){

        Thread jose = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero cajeroLaPaz = new Cajero();
                cajeroLaPaz.retirarDinero("UPB",100);
            }
        });

        Thread maria = new Thread(new Runnable() {
            @Override
            public void run() {
                BancaMovil bancaMovil= new BancaMovil();
                bancaMovil.retirarDinero("UPB",200);

            }
        });

        Thread marcelo = new Thread(new Runnable() {
            @Override
            public void run() {
                SucursalBanco sucursalBancoCbba= new SucursalBanco();
                sucursalBancoCbba.retirarDinero("UPB",300);
            }
        });

        jose.start();
        marcelo.start();
        maria.start();


    }

}
