package visitor.ejemplo;

import java.util.Date;

public class VeterinarioE2 implements  IDoctorAnimales {
    @Override
    public void recetandoMedicina(Perro perrito) {
        System.out.println("Perro> Cura para la enfermedad#2");
        System.out.println(new Date().toString());
    }

    @Override
    public void recetandoMedicina(Gato gatito) {
        System.out.println("Gato> Cura para la enfermedad#2");
        System.out.println(new Date().toString());

    }

    @Override
    public void recetandoMedicina(Caballo caballito) {
        System.out.println("Caballo> Cura para la enfermedad#2");
        System.out.println(new Date().toString());

    }
}
