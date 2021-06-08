package command.ejemplo;

public class StandarizationCode implements  IOperacionBuild {
    private IntellijIdea ide;

    public StandarizationCode(IntellijIdea ide){
        this.ide=ide;
    }

    @Override
    public void execute() {
        System.out.println("reviewing code.....");
        this.ide.codeStandartReview();
    }
}
