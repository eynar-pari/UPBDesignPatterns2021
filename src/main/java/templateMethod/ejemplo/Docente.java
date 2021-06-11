package templateMethod.ejemplo;

public class Docente extends  Persona{

    public Docente(){}

    public void materias(){

        System.out.println("dictando materias");

    }

    @Override
    public void caminar(){
        System.out.println("DOCENTE> Caminar");

    }
}
