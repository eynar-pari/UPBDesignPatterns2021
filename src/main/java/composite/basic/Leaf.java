package composite.basic;

public class Leaf extends Component {
    public Leaf(String attribute1, int attribute2) {
        super(attribute1, attribute2);
    }

    @Override
    public void operation() {
         /// logica
         System.out.println("Leaf attribute1: "+this.getAttribute1());
         System.out.println("Leaf attribute2: "+this.getAttribute2());
    }

    @Override
    public void add(Component component) {
       System.out.println("no es posible agregar nuevos componentes, esta en el componente mas pequenio");
    }

    @Override
    public void remove(Component component) {
        System.out.println("no es posible remover componentes, esta en el componente mas pequenio");
    }

    @Override
    public void getChild(int position) {
        System.out.println("no es posible obtener componentes, esta en el componente mas pequenio");
    }
}
