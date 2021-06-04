package memento.ejemplo;


public class Memento {
    private Codigo state;

    public Memento(Codigo stateSaved){
        this.state=stateSaved;
    }

    public Codigo getState() {
        return state;
    }
}
