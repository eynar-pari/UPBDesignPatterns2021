package proxy.ejemplo;
import java.util.ArrayList;
import java.util.List;

public class FileServer implements IServidor {

    private String ip;
    private String port;
    private String hostName;
    private List<Archivo> storeArchivos;
    public FileServer(){}

    public FileServer(String ip, String port, String hostName){
        this.ip=ip;
        this.port=port;
        this.hostName=hostName;
        storeArchivos= new ArrayList<>();
    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public void guardar(Archivo archivo) {
        System.out.println("archivo guardado");
        storeArchivos.add(archivo);
        archivo.showInfo();
    }
}
