package observer.ejemplo;

public class Video {
    private String titulo;
    private String categoria;

    public Video (String titulo,String categoria){
        this.titulo=titulo;
        this.categoria= categoria;
    }

    public void info(){
        System.out.println("INFO > titulo: "+titulo);
        System.out.println("INFO > categoria: ["+categoria+"]");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
