package state.ejemplo;

public class Apagado implements IStateComputadora {

    public Apagado(){

    }


    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Apagado **");
        computadora.setTarjetaVideo(new TarjetaVideo(0,"apagado"));
        computadora.setMemoriaRam(new MemoriaRam(0,"NAN"));
        computadora.setTimeLimit(0);
        System.out.println("%video:"+computadora.getTarjetaVideo().getPercentageUse());
        System.out.println("%meoria:"+computadora.getMemoriaRam().getPercentageUse());
        System.out.println("time:"+computadora.getTimeLimit());
        System.out.println("********");
    }
}
