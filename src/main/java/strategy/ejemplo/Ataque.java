package strategy.ejemplo;

import java.util.List;

public class Ataque implements IModoJuego{
    @Override
    public void jugar(List<Jugador> jugadorList) {
        for (Jugador jugador:jugadorList ) {
            if (jugador.getPosition().toLowerCase().equals("delanteros")){
                System.out.println("*** delaneros atacan");
                jugador.info();
            }
        }
    }
}
