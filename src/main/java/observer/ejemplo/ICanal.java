package observer.ejemplo;


public interface ICanal {
    void attach(IUsuario observer);
    void deattach(IUsuario observer);
    void notifyObserver(Video video);
}
