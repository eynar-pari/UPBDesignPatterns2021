package memento.ejemplo;

public class Git {
    private Codigo state;

    public Git(){}

    public void setState(Codigo state) {
        System.out.println("**** Set State *****");
        state.info();
        this.state = state;
    }

    public Memento createVersion(){
        System.out.println("**** Create State *****");
        state.info();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.info();
    }

}
