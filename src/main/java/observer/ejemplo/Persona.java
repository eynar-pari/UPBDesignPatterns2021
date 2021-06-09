package observer.ejemplo;

public class Persona {
    private String ci;
    private String name;

    public Persona(String ci,String name){
        this.ci=ci;
        this.name=name;
    }

    public void info(){
        System.out.println("INFO> ci: "+ci);
        System.out.println("INFO> name: "+name);
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
}
