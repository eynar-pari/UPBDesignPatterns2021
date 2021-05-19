package prototype.ejemplos.boletosFutbol;

public class Cliente {
    public static void main (String[] args){
        EntradaFisica entrada= new EntradaFisica();
        entrada.setPrecio("0");
        entrada.setNumeroAsiento("0");
        entrada.setNit("123456789");
        entrada.setLugar("La Paz - Bolivia");
        entrada.setFecha("19/02/2021");
        entrada.setFactura("0");
        entrada.setEquipoVisitante("Brasil");
        entrada.setEquipoLocal("Bolivia");
        entrada.setCategoria("");
        entrada.setPersona(new Persona("",""));

        EntradaFisica entradaOficial1= (EntradaFisica) entrada.clone();
        entradaOficial1.setPersona(new Persona("123","Jose"));
        entradaOficial1.setCategoria("Preferencia");
        entradaOficial1.setPrecio("100");
        entradaOficial1.setFactura("1111");
        entradaOficial1.setNumeroAsiento("1");

        EntradaFisica entradaOficial2= (EntradaFisica) entrada.clone();
        entradaOficial2.setPersona(new Persona("123","Jose1"));
        entradaOficial2.setCategoria("Preferencia");
        entradaOficial2.setPrecio("100");
        entradaOficial2.setFactura("1112");
        entradaOficial2.setNumeroAsiento("2");

        EntradaFisica entradaOficial3= (EntradaFisica) entrada.clone();
        entradaOficial3.setPersona(new Persona("123","Jose2"));
        entradaOficial3.setCategoria("Preferencia");
        entradaOficial3.setPrecio("100");
        entradaOficial3.setFactura("1113");
        entradaOficial3.setNumeroAsiento("3");

        EntradaFisica entradaOficial4= (EntradaFisica) entrada.clone();
        entradaOficial4.setPersona(new Persona("123","Jose3"));
        entradaOficial4.setCategoria("Preferencia");
        entradaOficial4.setPrecio("100");
        entradaOficial4.setFactura("1114");
        entradaOficial4.setNumeroAsiento("4");

        EntradaFisica entradaOficial5= (EntradaFisica) entrada.clone();
        entradaOficial5.setPersona(new Persona("123","Jose4"));
        entradaOficial5.setCategoria("Preferencia");
        entradaOficial5.setPrecio("100");
        entradaOficial5.setFactura("1115");
        entradaOficial5.setNumeroAsiento("5");

        EntradaFisica entradaOficial6= (EntradaFisica) entrada.clone();
        entradaOficial6.setPersona(new Persona("123","Jose5"));
        entradaOficial6.setCategoria("Preferencia");
        entradaOficial6.setPrecio("100");
        entradaOficial6.setFactura("1116");
        entradaOficial6.setNumeroAsiento("6");

        EntradaFisica entradaOficial7= (EntradaFisica) entrada.clone();
        entradaOficial7.setPersona(new Persona("123","Jose6"));
        entradaOficial7.setCategoria("Preferencia");
        entradaOficial7.setPrecio("100");
        entradaOficial7.setFactura("1117");
        entradaOficial7.setNumeroAsiento("7");

        entradaOficial1.showInformation();
        entradaOficial2.showInformation();
        entradaOficial3.showInformation();
        entradaOficial4.showInformation();
        entradaOficial5.showInformation();
        entradaOficial6.showInformation();
        entradaOficial7.showInformation();

    }
}
