package _parcial1Solucion.singletonFB;

public class Persona {
    private String ci;
    private String name;
    private String cargo;

    public Persona(){}

    public Persona(String ci, String name,String cargo){
        this.ci= ci;
        this.name= name;
        this.cargo=cargo;

    }

    public void info(){
        System.out.println("Persona - > ci: "+this.ci);
        System.out.println("Persona - > name: "+this.name);
        System.out.println("Persona - > cargo: "+this.cargo);
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
