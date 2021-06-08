package command.ejemplo;

public class GenerateBuild implements  IOperacionBuild {
    private IntellijIdea ide;

    public GenerateBuild(IntellijIdea ide){
        this.ide=ide;
    }

    @Override
    public void execute() {
        System.out.println("building .......");
        this.ide.createBuild();
    }
}
