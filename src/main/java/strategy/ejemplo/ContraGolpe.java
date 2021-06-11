package strategy.ejemplo;

import java.util.List;

public class ContraGolpe implements IModoJuego{
    @Override
    public void jugar(List<Jugador> jugadorList) {
        for (Jugador jugador:jugadorList ) {
            if (!jugador.getPosition().toLowerCase().equals("defensa")){
                System.out.println("*** jugadores van al frente para el contragope");
                jugador.info();
            }
        }

    }
}
