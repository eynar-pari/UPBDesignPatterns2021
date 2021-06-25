package decorator.ejemplo;

import java.security.SecurityPermission;

public class Client {

    public static void main(String [] args){
        Ide eclipse = new Eclipse();
        ((Eclipse)eclipse).setLicencia("opensource");
        ((Eclipse)eclipse).setTamano("50mb");
        ((Eclipse)eclipse).setPrecio(0);
        ((Eclipse)eclipse).setVersion("v2020");

        eclipse= new PluginTest(eclipse,50,false);
        eclipse= new PluginDeploy(eclipse,0,true);

        eclipse.operation();



    }

}
