package observer.ejemplo;


public class UsuarioRegistrado implements IUsuario {

    private String categoria;
    private Persona persona;

    public UsuarioRegistrado(Persona persona, String categoria) {
        this.persona=persona;
        this.categoria=categoria;
    }

    @Override
    public void update(String message, Video video) {
        System.out.println("********* NOTIFY *********");
        System.out.println(message);
        persona.info();
        video.info();
    }

    @Override
    public String getCategoria() {
        return this.categoria;
    }
}
