package singleton.ejemplos.logger;

public class Cliente {
    public static void main(String []args){
        Profesor profesor1 = new Profesor();
        profesor1.setCategoria("Inicial");
        profesor1.setMateria("Ing Soft");
        profesor1.setNombre("Pedro");

        Director director1 = new Director();
        director1.setNombre("Jose");
        director1.setGradoAcademico("Doctor");

        Director director2 = new Director();
        director2.setNombre("Maria");
        director2.setGradoAcademico("Master");


        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Juan");
        estudiante.setSemestre("9");
        estudiante.setCarrera("Derecho");

        estudiante.getCarrera();
        estudiante.getSemestre();
        profesor1.getCategoria();
        director1.getNombre();
        director2.getNombre();

    }
}
