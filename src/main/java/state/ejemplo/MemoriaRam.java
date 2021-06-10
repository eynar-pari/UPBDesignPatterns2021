package state.ejemplo;

public class MemoriaRam {
      private int percentageUse=0;
      private String nameProgram;

      public MemoriaRam(int percentageUse,String nameProgram){
          this.percentageUse=percentageUse;
          this.nameProgram=nameProgram;
      }

    public int getPercentageUse() {
        return percentageUse;
    }

    public void setPercentageUse(int percentageUse) {
        this.percentageUse = percentageUse;
    }

    public String getNameProgram() {
        return nameProgram;
    }

    public void setNameProgram(String nameProgram) {
        this.nameProgram = nameProgram;
    }
}
