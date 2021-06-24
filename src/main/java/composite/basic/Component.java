package composite.basic;

public abstract class Component {

    private String attribute1;
    private int attribute2;

    public Component(String attribute1, int attribute2){
        this.attribute1=attribute1;
        this.attribute2=attribute2;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }

    public abstract void operation();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void getChild(int position);
}
