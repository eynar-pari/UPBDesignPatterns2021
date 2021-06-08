package command.ejemplo;

public class Client {
    public static void main (String[]args){
        IntellijIdea intellijIdea = new IntellijIdea("2000",true);

        Clean cleanFolder= new Clean(intellijIdea);
        GenerateBuild build = new GenerateBuild(intellijIdea);
        RunTest test = new RunTest(intellijIdea);
        StandarizationCode standarizationCode = new StandarizationCode(intellijIdea);


        Invoker makeBuild= new Invoker();
        makeBuild.addCommand(cleanFolder);
        makeBuild.addCommand(test);
        makeBuild.addCommand(standarizationCode);
        makeBuild.addCommand(build);

        /* llamando al comando especifico*/
        makeBuild.executeCommands();

    }


}
