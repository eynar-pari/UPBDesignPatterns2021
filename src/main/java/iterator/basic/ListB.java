package iterator.basic;

import java.util.Vector;

public class ListB implements IList{
    private Vector<String> nombres;

    public ListB(){
        nombres= new Vector<>();
    }
     public void add(String value){
        nombres.add(value);
     }

    @Override
    public IteratorConcreteListB iterator() {
        return new IteratorConcreteListB(this.nombres);
    }
}
