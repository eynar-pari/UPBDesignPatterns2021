package state.ejemplo;

public class PrendidoMinando implements IStateComputadora {
    private String actionMining;

    public PrendidoMinando(String actionMining){
        this.actionMining=actionMining;
    }

    public String getActionMining() {
        return actionMining;
    }

    public void setActionMining(String actionMining) {
        this.actionMining = actionMining;
    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: PrendidoMinando **");
        System.out.println("INFO> action: "+actionMining);
        System.out.println("INFO> time: "+computadora.getTimeLimit());
        TarjetaVideo tarjetaVideo= new TarjetaVideo(0,actionMining);

        for (int i = 0; i < computadora.getTimeLimit(); i=i+5) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tarjetaVideo.setPercentageUse(i);
            computadora.setTarjetaVideo(tarjetaVideo);
            System.out.println("Uso Targeta De Video: "+tarjetaVideo.getPercentageUse()+" %");
        }
        System.out.println("********");
    }
}
