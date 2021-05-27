package iterator.basic;

import java.util.Vector;

public class IteratorConcreteListB implements Iterator{
    private Vector<String> nombres;
    private int position;
    public IteratorConcreteListB(Vector<String> nombres){
        this.nombres=nombres;
        this.position=0;
    }

    @Override
    public Object next() {
        return this.nombres.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.nombres.size() !=0 && this.nombres.size() > position;
    }
}
