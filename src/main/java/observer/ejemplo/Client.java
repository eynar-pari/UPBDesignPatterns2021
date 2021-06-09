package observer.ejemplo;

public class Client {

    public static void main (String []args){

        CanalDeYoutube canalDeYoutubeUPB = new CanalDeYoutube();

        UsuarioRegistrado user1= new UsuarioRegistrado(new Persona("123","Juan"),"EDUCACION");
        UsuarioRegistrado user2= new UsuarioRegistrado(new Persona("124","Juan1"),"EDUCACION");
        UsuarioRegistrado user3= new UsuarioRegistrado(new Persona("125","Juan2"),"DRAMA");
        UsuarioRegistrado user4= new UsuarioRegistrado(new Persona("126","Juan3"),"MUSICALES");

        canalDeYoutubeUPB.attach(user1);
        canalDeYoutubeUPB.attach(user2);
        canalDeYoutubeUPB.attach(user3);
        canalDeYoutubeUPB.attach(user4);


        canalDeYoutubeUPB.uploadNewVideo(new Video("IngSoft","EDUCACION"));





    }
}
