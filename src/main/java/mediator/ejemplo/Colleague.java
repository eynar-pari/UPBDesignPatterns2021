package mediator.ejemplo;

public abstract class Colleague {
     protected ICanalDeComunicacion canalDeComunicacion;

     public Colleague(ICanalDeComunicacion mediator){
         this.canalDeComunicacion =mediator;
     }

     public abstract void send(String message);
     public abstract void messageReceived(String message);
}
