package _ejerciciosParcial1.factoryMethod;

public class Libro {
    String tipo;
    String autor;

    public Libro(String tipo, String autor) {
        this.tipo = tipo;
        this.autor = autor;

    }

    public void showData(){
        System.out.println("Libro tipo:"+tipo);
        System.out.println("Libro autor:"+autor);

    }
}
