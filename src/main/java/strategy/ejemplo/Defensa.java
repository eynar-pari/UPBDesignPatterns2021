package strategy.ejemplo;

import java.util.List;

public class Defensa implements IModoJuego{
    @Override
    public void jugar(List<Jugador> jugadorList) {
        for (Jugador jugador:jugadorList ) {
            if (jugador.getPosition().toLowerCase().equals("defensa")){
                System.out.println("*** jugadores se replegan antes del medio campo");
                jugador.info();
            }
        }
    }
}
