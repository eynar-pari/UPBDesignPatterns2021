package strategy.ejemplo;

public class Jugador {
    private String ci;
    private String name;
    private int numeroCamiseta;
    private String position;

    public Jugador(){}

    public Jugador (String ci, String name, int numeroCamiseta,String position){
        this.ci=ci;
        this.name= name;
        this.numeroCamiseta=numeroCamiseta;
        this.position=position;
    }

    public void info(){
        System.out.println("INFO> ci: "+ci);
        System.out.println("INFO> name: "+name);
        System.out.println("INFO> numeroCamiseta: "+numeroCamiseta);
        System.out.println("INFO> position: "+position);
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

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
