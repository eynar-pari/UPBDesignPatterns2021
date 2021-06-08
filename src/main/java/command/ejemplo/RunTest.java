package command.ejemplo;

public class RunTest implements  IOperacionBuild {
    private IntellijIdea ide;

    public RunTest(IntellijIdea ide){
        this.ide=ide;
    }

    @Override
    public void execute() {
        System.out.println("running test.....");
        this.ide.runUnitTest();
    }
}
