package composite.basic;

public class Client {

    public static void main(String[] args){
        Composite rama = new Composite("Rama",50);
        rama.add(new Leaf("hoja1",1));
        rama.add(new Leaf("hoja2",2));
        rama.add(new Leaf("hoja3",3));
        rama.add(new Leaf("hoja4",4));
        rama.add(new Leaf("hoja5",5));

        Composite rama2 = new Composite("Rama",50);
        rama2.add(new Leaf("hoja11",11));
        rama2.add(new Leaf("hoja12",12));
        rama2.add(new Leaf("hoja13",13));
        rama2.add(new Leaf("hoja14",14));
        rama2.add(new Leaf("hoja15",15));

        Composite rama3 = new Composite("Rama",50);
        rama3.add(new Leaf("hoja113",11));
        rama3.add(new Leaf("hoja123",12));
        rama3.add(new Leaf("hoja133",13));
        rama3.add(new Leaf("hoja143",14));
        rama3.add(new Leaf("hoja153",15));

        Composite arbol = new Composite("arbol",100);
        arbol.add(rama);
        arbol.add(rama2);
        arbol.add(rama3);

        Composite arbol2 = new Composite("arbol2",100);
        arbol2.add(rama);
        arbol2.add(rama2);
        arbol2.add(rama3);

        Composite bosque= new Composite("bosque",200);
        bosque.add(arbol);
        bosque.add(arbol2);

        bosque.operation();
    }

}
