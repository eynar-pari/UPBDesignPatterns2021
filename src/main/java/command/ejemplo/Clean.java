package command.ejemplo;

public class Clean implements  IOperacionBuild {
    private IntellijIdea ide;

    public Clean(IntellijIdea ide){
        this.ide=ide;
    }

    @Override
    public void execute() {
        System.out.println("running.....");
        this.ide.cleanFolder();
    }
}
