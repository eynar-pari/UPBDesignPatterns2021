package builder.examples;

public class Client {

    public static void main (String []arfss){
        Dueno jose= new Dueno();
        I7Medio i7Medio = new I7Medio();
        I9Alto i9Alto = new I9Alto();
        I5Bajo i5Bajo = new I5Bajo();

        jose.setBuilderComputadora(i9Alto);
        jose.armarComputadora();

        Computadora computadoraI9 = jose.getComputadora();
        computadoraI9.showData();

        jose.setBuilderComputadora(i7Medio);
        jose.armarComputadora();

        Computadora computadoraI7 = jose.getComputadora();
        computadoraI7.showData();

        jose.setBuilderComputadora(i5Bajo);
        jose.armarComputadora();

        Computadora computadoraI5 = jose.getComputadora();
        computadoraI5.showData();

    }

}
