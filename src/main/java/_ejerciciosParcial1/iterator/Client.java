package _ejerciciosParcial1.iterator;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String [] args){
        EmpresaAvantica avantica = new EmpresaAvantica();
        avantica.add(new Empleado("Juan","QA","111"));
        avantica.add(new Empleado("Juan2","QA","1112"));
        avantica.add(new Empleado("Juan3","QA","1113"));
        
        EmpresaJalaSoft jalaSoft = new EmpresaJalaSoft();
        jalaSoft.add(new Empleado("Jose","DEV","222"));
        jalaSoft.add(new Empleado("Jose2","DEV","333"));
        jalaSoft.add(new Empleado("Jose3","DEV","444"));

        EmpresaMojix mojix = new EmpresaMojix();
        mojix.add(new Empleado("Roberto","DEVOPS","555"));
        mojix.add(new Empleado("Roberto2","DEVOPS","666"));
        mojix.add(new Empleado("Roberto3","DEVOPS","777"));

        EmpresaTruextend truextend = new EmpresaTruextend();
        truextend.add(new Empleado("Roberto","DEVOPS","555"));
        truextend.add(new Empleado("Maria","DEVOPS","999"));
        truextend.add(new Empleado("Maria3","DEVOPS","453"));
        
        Map<String , Empleado> google = new HashMap<>();

        Iterator iterator = truextend.iterator();
        while (iterator.hasNext()){
            Empleado empleado= (Empleado) iterator.next();
            google.put(empleado.getCi(), empleado);
        }
        iterator = avantica.iterator();
        while (iterator.hasNext()){
            Empleado empleado= (Empleado) iterator.next();
            google.put(empleado.getCi(), empleado);
        }
        iterator = mojix.iterator();
        while (iterator.hasNext()){
            Empleado empleado= (Empleado) iterator.next();
            google.put(empleado.getCi(), empleado);
        }
        iterator = jalaSoft.iterator();
        while (iterator.hasNext()){
            Empleado empleado= (Empleado) iterator.next();
            google.put(empleado.getCi(), empleado);
        }

        for (String ci: google.keySet()) {
             google.get(ci).showEmpleado(); 
        }

    }
}
