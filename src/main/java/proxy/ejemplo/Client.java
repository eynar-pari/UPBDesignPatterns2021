package proxy.ejemplo;

public class Client {
    public static void main (String[]args){
        Proxy fileServerProxy = new Proxy("192.168.55.1","80");

        fileServerProxy.guardar(new Archivo("tesis","50mb","pdf"));
        fileServerProxy.guardar(new Archivo("tesis2","51mb","doc"));
        fileServerProxy.guardar(new Archivo("foto","5mb","jpg"));
        fileServerProxy.guardar(new Archivo("foto2","1mb","gift"));
        fileServerProxy.guardar(new Archivo("tesis3","1mb","xls"));
        fileServerProxy.guardar(new Archivo("tesis4","1mb","ppt"));
    }

}
