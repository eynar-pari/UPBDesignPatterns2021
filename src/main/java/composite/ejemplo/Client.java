package composite.ejemplo;

public class Client {
    public static void main(String []arg){

        CompositeEntidad tarea1= new CompositeEntidad("Tarea>Crear Mockups","2","Diseno",2);
        tarea1.add(new SubTask("SubTarea>research","1","todo",1));
        tarea1.add(new SubTask("SubTarea>creacion","1","todo",1));
        tarea1.add(new SubTask("SubTarea>pruebas","1","todo",2));

        CompositeEntidad tarea2= new CompositeEntidad("Tarea>Crear Diagramas","2","Use Case",2);
        tarea2.add(new SubTask("SubTarea>research","1","todo",2));
        tarea2.add(new SubTask("SubTarea>creacion","1","todo",2));
        tarea2.add(new SubTask("SubTarea>pruebas","1","todo",2));

        CompositeEntidad userStory1= new CompositeEntidad("US>Login ","2","AS .... , I WANT TO ... SO THAT....",1);
        userStory1.add(tarea1);
        userStory1.add(tarea2);

        CompositeEntidad userStory2= new CompositeEntidad("US>Logot ","2","AS .... , I WANT TO ... SO THAT....",1);
        userStory2.add(tarea1);
        userStory2.add(tarea2);

        CompositeEntidad epic1= new CompositeEntidad("EPIC> Authentication","1","todo",5);
        epic1.add(userStory1);
        epic1.add(userStory2);

        CompositeEntidad epic2= new CompositeEntidad("EPIC> Security Authentication","1","todo",5);
        epic2.add(userStory1);
        epic2.add(userStory2);

        CompositeEntidad feature = new CompositeEntidad("FEATURE> trello","55","todo",1);
        feature.add(epic1);
        feature.add(epic2);

        feature.operation();
        feature.showTotalEstimacion();
     }

}
