package proxy.ejemplo;

public class Proxy implements  IServidor {
    private FileServer datosServer= new FileServer("10.10.10.10","8080","datosreales");
    private FileServer datosNoPermitdos = new FileServer("192.168.1.1","8080","datosNoPermitidos");
    private String ip;
    private String port;

    public Proxy(String ip, String port){
        this.ip=ip;
        this.port=port;
        System.out.println("inicializando proxy ...");
        System.out.println("ip: "+this.ip);
        System.out.println("port: "+this.port);

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

    @Override
    public void guardar(Archivo archivo) {

        if (archivo.getExtention().toLowerCase().equals("pdf") ||archivo.getExtention().toLowerCase().equals("doc")||archivo.getExtention().toLowerCase().equals("xls")) {
            System.out.println("Guardando Archivo en Servidor: "+datosServer.getIp());
            datosServer.guardar(archivo);
        } else{
            System.out.println("\n---Archivo NO Permitido---");
            System.out.println("Copying to"+datosNoPermitdos.getIp());
            datosNoPermitdos.guardar(archivo);
            System.out.println("-------------------------\n");
        }
    }
}
