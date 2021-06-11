package _parcial1Solucion.singletonFB;

public class Client {
    public static void main(String[]args){
        Colegio colegio= new Colegio();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                colegio.inscripcion(new Estudiante("123","Pablo"),10);
                colegio.mostrarInfoColegio(new Persona("888","Mario","RecursosHumanos"));
                System.out.println("****");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                colegio.inscripcion(new Estudiante("456","Pablo1"),10);
                colegio.mostrarInfoColegio(new Persona("888","Mario","RecursosHumanos"));
                System.out.println("****");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                colegio.inscripcion(new Estudiante("678","Pablo2"),10);
                colegio.mostrarInfoColegio(new Persona("888","Mario","RecursosHumanos"));
                System.out.println("****");
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {

                colegio.inscripcion(new Estudiante("999","Pablo3"),10);
                colegio.mostrarInfoColegio(new Persona("888","Mario","RecursosHumanos"));
                System.out.println("****");
            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                colegio.inscripcion(new Estudiante("123","Pablo"),10);
                colegio.mostrarInfoColegio(new Persona("888","Mario","RecursosHumanos"));
                System.out.println("****");
            }
        });



        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        }
}
