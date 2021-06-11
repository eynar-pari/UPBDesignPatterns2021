package templateMethod.ejemplo;

public class Persona {

    protected String name;

    public Persona(){}

    public void caminar(){
        System.out.println("Persona> caminando");

    }

    protected void caminar2(){
        System.out.println("Persona> caminando");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
