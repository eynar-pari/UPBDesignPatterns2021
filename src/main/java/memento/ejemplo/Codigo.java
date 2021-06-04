package memento.ejemplo;

public class Codigo {
    private String lineasCodigo;
    private boolean isCompletedStory;

    public Codigo (String lineasCodigo, boolean isCompletedStory){
        this.lineasCodigo= lineasCodigo;
        this.isCompletedStory= isCompletedStory;
    }

    public String getLineasCodigo() {
        return lineasCodigo;
    }

    public void setLineasCodigo(String lineasCodigo) {
        this.lineasCodigo = lineasCodigo;
    }

    public boolean isCompletedStory() {
        return isCompletedStory;
    }

    public void setCompletedStory(boolean completedStory) {
        isCompletedStory = completedStory;
    }

    public void info(){
        System.out.println("INFO> lineasCodigo: "+lineasCodigo);
        System.out.println("INFO> isCompletedStory: "+isCompletedStory);
    }
}
