package composite.basic;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> componentList = new ArrayList<>();

    public Composite(String attribute1, int attribute2) {
        super(attribute1, attribute2);
    }

    @Override
    public void operation() {
        System.out.println("----- composite ----- : > "+this.getAttribute1());
        for (Component component :componentList ) {
            component.operation();
        }
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println("attribute1: "+componentList.get(position).getAttribute1());
        System.out.println("attribute2: "+componentList.get(position).getAttribute2());
    }
}
