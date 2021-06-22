package bridge.ejemplo;

public class Client {

    public static void main(String[] args){

        IFigura cuadrado = new Cuadrado(new Rojo());
        cuadrado.pintar();

        IFigura cuadrado1 = new Cuadrado(new Verde());
        cuadrado1.pintar();

        IFigura cuadrado2 = new Cuadrado(new Azul());
        cuadrado2.pintar();

        IFigura cuadrado3 = new Cuadrado(new Morado());
        cuadrado3.pintar();

        IFigura cuadrado4 = new Cuadrado(new Cafe());
        cuadrado4.pintar();

        IFigura circuloi = new Circulo( new Amarillo());
        circuloi.pintar();



    }

}
