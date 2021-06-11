package command.ejemplo;

public class IntellijIdea {
    private String version="2021";
    private boolean isFreeVersion;

    public IntellijIdea(String version, boolean isFreeVersion){
        this.version= version;
        this.isFreeVersion=isFreeVersion;
    }

    public void showInfo(){
        System.out.println("version: "+version);
        System.out.println("isFreeVersion: "+isFreeVersion);
    }

    public void cleanFolder(){
        System.out.println("COMMAND>cleanFolder....");
        this.showInfo();
    }

    public void runUnitTest(){
        System.out.println("COMMAND>runUnitTest....");
        this.showInfo();
    }

    public void codeStandartReview(){
        System.out.println("COMMAND>codeStandartReview ... ");
        this.showInfo();
    }

    public void createBuild(){
        System.out.println("COMMAND>createBuild ....");
        this.showInfo();
    }


}
