package mediator.ejemplo;


import java.util.ArrayList;
import java.util.List;

public class Slack implements ICanalDeComunicacion {

    private List<Persona> personasChat= new ArrayList<>();

    public void addPersonasAlChat(Persona persona){
        personasChat.add(persona);
    }

    @Override
    public void send(String message, Colleague personaOrigen) {
        Persona personaParseOrigen= (Persona) personaOrigen;
        for (Persona persona:personasChat) {
            if ( !personaParseOrigen.getCi().equals(persona.getCi())){
                 if (personaParseOrigen.getCargo().equals("SM")){
                     persona.messageReceived(message);
                 }
                 if (personaParseOrigen.getCargo().equals("QA") && persona.getCargo().equals("QA")){
                     persona.messageReceived(message);
                 }
                if (personaParseOrigen.getCargo().equals("DEV") && persona.getCargo().equals("DEV")){
                    persona.messageReceived(message);
                }
            }
        }
    }
}
