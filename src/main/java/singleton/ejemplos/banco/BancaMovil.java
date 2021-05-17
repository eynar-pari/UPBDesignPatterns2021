package singleton.ejemplos.banco;

public class BancaMovil {

    public BancaMovil(){

    }

    public void retirarDinero(String cuenta,int cantidad){
        System.out.println("Cuenta: "+cuenta);
        Banco.getInstance().getMoney(cantidad);
    }
}
