package templateMethod.ejemplo;


public class Client {

    public static void main (String[]argg){

         Docente docente= new Docente();
         Director director= new Director();
         Estudiante estudiante= new Estudiante();
         Marketing marketing = new Marketing();


        docente.caminar();
        docente.materias();
        director.caminar();
        director.adminSemestre();
        estudiante.caminar();
        estudiante.marcandoMateriasApp();
        marketing.caminar();
        marketing.realizaPromo();

    }
}
