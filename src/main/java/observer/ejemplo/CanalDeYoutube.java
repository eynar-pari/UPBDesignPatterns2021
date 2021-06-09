package observer.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class CanalDeYoutube implements ICanal {
    private List<IUsuario> observerList= new ArrayList<>();

    private List<Video> videoList = new ArrayList<>();

   public void uploadNewVideo(Video video){
       videoList.add(video);
       this.notifyObserver(video);
   }

    @Override
    public void attach(IUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
       observerList.remove(observer);
    }


    @Override
    public void notifyObserver(Video video) {
        for (IUsuario userYoutube:observerList) {
               if (userYoutube.getCategoria().equals(video.getCategoria())){
                   // notificacion
                     userYoutube.update("Se subio un nuevo video titulo: "+video.getTitulo(),video);
               }

        }
    }
}
