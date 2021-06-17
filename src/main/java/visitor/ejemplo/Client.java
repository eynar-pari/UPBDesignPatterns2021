package visitor.ejemplo;

public class Client {

    public static void main(String []sss){

        Perro perro= new Perro();
        perro.setNombre("firulais");
        Gato gato= new Gato();
        gato.setNombre("gar");
        Caballo caballo= new Caballo();
        caballo.setEdad(5);

        VeterinarioE1 veterinarioE1 = new VeterinarioE1();
        // Enfermedad1
        perro.accept(veterinarioE1);
        gato.accept(veterinarioE1);
        caballo.accept(veterinarioE1);

        VeterinarioE2 veterinarioE2 = new VeterinarioE2();
        // Enfermedad2
        perro.accept(veterinarioE2);
        gato.accept(veterinarioE2);
        caballo.accept(veterinarioE2);


    }

}
