package iterator.basic;

public class Client {
    public static void main (String[] args){

        ListA listA = new ListA();
        listA.add("Jose1");
        listA.add("Jose2");
        listA.add("Jose3");
        listA.add("Jose4");
        listA.add("Jose5");

        ListB listB = new ListB();
        listB.add("Maria1");
        listB.add("Maria2");
        listB.add("Maria3");
        listB.add("Maria4");
        listB.add("Maria5");

        Iterator iterator = listA.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre: "+iterator.next());
        }
        iterator = listB.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre: "+iterator.next());
        }
    }
}
