package _parcial1Solucion.singletonFB;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class VentanillaUnica {
    private static VentanillaUnica instance= null;
    private Map<String,Estudiante> estudianteMap;
    private int cantidadDinero;

    private VentanillaUnica(){
        estudianteMap= new HashMap<>();
        cantidadDinero=0;
    }

   private synchronized static  void makeInstance(){
       if (instance==null){
           instance= new VentanillaUnica();
       }
   }


    public static VentanillaUnica getInstance(){
        if (instance==null){
            makeInstance();
        }
        return instance;
    }

    public synchronized void pagarMatricula(Estudiante estudiante,int cantidadAPagar){
        if (!estudianteMap.containsKey(estudiante.getCi())) {
             estudiante.setHoraMatriculacion(new Date().toString());
            estudiante.setCantidad(cantidadAPagar);
            estudianteMap.put(estudiante.getCi(), estudiante);
            cantidadDinero = cantidadDinero + cantidadAPagar;
        }else{
            System.out.println(".....Estudiante Ya Inscrito....");
            estudiante.info();
            System.out.println(".............");

        }

    }

    public void mostrarDatod(){
        System.out.println("MONTO RECAUDADO : "+cantidadDinero);
        for (String ci:estudianteMap.keySet()
             ) {
              estudianteMap.get(ci).info();
        }
    }

}
