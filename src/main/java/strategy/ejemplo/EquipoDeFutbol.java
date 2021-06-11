package strategy.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeFutbol {
    private IModoJuego modoJuego;
    private List<Jugador> jugadorList= new ArrayList<>();
    private String entrenador;

    public EquipoDeFutbol(){

    }

    public IModoJuego getModoJuego() {
        return modoJuego;
    }

    public void setModoJuego(IModoJuego modoJuego) {
        this.modoJuego = modoJuego;
    }

    public void jugarConEstrategia(){
        modoJuego.jugar(this.jugadorList);
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
}
