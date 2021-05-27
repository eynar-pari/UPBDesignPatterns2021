package iterator.basic;

public class ListA implements IList{

    private String [] nombres;
    private int position;

    public ListA(){
        position=0;
        nombres= new String[5];
    }
     public void add(String value){
        nombres[position]=value;
        position++;
     }

    @Override
    public IteratorConcreteListA iterator() {
        return new IteratorConcreteListA(this.nombres);
    }
}
