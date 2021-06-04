package memento.ejemplo;

public class Client {
    public static void main (String []argsss ){
        Github github= new Github();
        Git git= new Git();

        Codigo codigo;

        codigo = new Codigo("codigo 1",false);

        codigo = new Codigo("codigo 2",true);
        git.setState(codigo);
        github.createCommit("6R5F88",git.createVersion());

        codigo = new Codigo("codigo 3",false);

        codigo = new Codigo("codigo 4",false);

        codigo = new Codigo("codigo 5",true);
        git.setState(codigo);
        github.createCommit("777RRR",git.createVersion());

        codigo = new Codigo("codigo 6",false);

        git.restoreFromMemento(github.getMemento("6R5F88"));




    }
}
