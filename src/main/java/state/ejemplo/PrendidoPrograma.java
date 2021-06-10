package state.ejemplo;

import java.util.Random;

public class PrendidoPrograma implements IStateComputadora {
    private String program;

    public PrendidoPrograma(String program){
        this.program =program;
    }

    public String getActionMining() {
        return program;
    }

    public void setActionMining(String program) {
        this.program = program;
    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: PrendidoPrograma **");
        System.out.println("INFO> action: "+ program);
        MemoriaRam memoriaRam = new MemoriaRam(new Random().nextInt(100),program);
        computadora.setMemoriaRam(memoriaRam);
        System.out.println("INFO> memory usage: "+ memoriaRam.getPercentageUse());
        System.out.println("********");
    }
}
