package singleton.ejemplos.logger;

import java.util.Date;

public class Logger {

    private static Logger instance = null;

    private Logger(){
        System.out.println(new Date().getTime()+" INFO > ****** Iniciando el Logger ******");
    }

    public static Logger getInstance(){
         if (instance == null)
             instance= new Logger();
         return instance;
    }

    public void info(String info){
        System.out.println(new Date().getTime()+ " INFO > "+info);
    }
    public void warn(String info){
        System.out.println(new Date().getTime()+" WARN > "+info);
    }
    public void error(String info){
        System.out.println(new Date().getTime()+ "ERROR > "+info);
    }
}
