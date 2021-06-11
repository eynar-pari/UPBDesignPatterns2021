package strategy.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main (String []args){

        EquipoDeFutbol equipoDeFutbol= new EquipoDeFutbol();
        equipoDeFutbol.setEntrenador("Ronaldhino");
        List<Jugador> jugadorList= new ArrayList<>();
        jugadorList.add(new Jugador("123","Jose",1,"arquero"));
        jugadorList.add(new Jugador("123","Jose1",2,"defensa"));
        jugadorList.add(new Jugador("123","Jose2",3,"defensa"));
        jugadorList.add(new Jugador("123","Jose3",4,"defensa"));
        jugadorList.add(new Jugador("123","Jose4",5,"defensa"));
        jugadorList.add(new Jugador("123","Jose5",6,"medio campista"));
        jugadorList.add(new Jugador("123","Jose6",7,"medio campista"));
        jugadorList.add(new Jugador("123","Jose7",8,"medio campista"));
        jugadorList.add(new Jugador("123","Jose8",9,"delanteros"));
        jugadorList.add(new Jugador("123","Jose9",10,"delanteros"));
        jugadorList.add(new Jugador("123","Jose10",11,"delanteros"));

        equipoDeFutbol.setJugadorList(jugadorList);

        // local
        equipoDeFutbol.setModoJuego(new Defensa());
        equipoDeFutbol.jugarConEstrategia();

        equipoDeFutbol.setModoJuego(new ContraGolpe());
        equipoDeFutbol.jugarConEstrategia();


    }

}
