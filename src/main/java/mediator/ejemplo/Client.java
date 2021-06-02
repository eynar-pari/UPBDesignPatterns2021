package mediator.ejemplo;



public class Client {

    public static void main (String[] args){
        Slack slack= new Slack();

        Persona dev1 = new Persona(slack);
        dev1.setCargo("DEV");
        dev1.setName("dev1");
        dev1.setCi("111");

        Persona dev2 = new Persona(slack);
        Persona dev3 = new Persona(slack);
        Persona qa1 = new Persona(slack);
        Persona qa2 = new Persona(slack);
        Persona sm1 = new Persona(slack);

        dev2.setCargo("DEV");
        dev2.setName("dev2");
        dev2.setCi("1112");
        dev3.setCargo("DEV");
        dev3.setName("dev3");
        dev3.setCi("1113");
        qa1.setCargo("QA");
        qa1.setName("qa1");
        qa1.setCi("11133");
        qa2.setCargo("QA");
        qa2.setName("qa2");
        qa2.setCi("111533");
        sm1.setCargo("SM");
        sm1.setName("sm11");
        sm1.setCi("1115533");

        slack.addPersonasAlChat(dev1);
        slack.addPersonasAlChat(dev2);
        slack.addPersonasAlChat(dev3);
        slack.addPersonasAlChat(qa1);
        slack.addPersonasAlChat(qa2);
        slack.addPersonasAlChat(sm1);

        dev1.send("hola como estan todos los DEVs");
        dev2.send("todo bien DEVs");

        qa2.send("hola a todos los QAs");

        sm1.send("hola a todos!! hoy acaba el sprint");

    }

}
