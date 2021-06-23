package proxy.ejemplo;

public class Archivo {
    private String name;
    private String size;
    private String extention;

    public Archivo(){}

    public Archivo(String name, String size,String extention){
        this.name=name;
        this.size=size;
        this.extention=extention;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public void showInfo() {
        System.out.println("name: "+name);
        System.out.println("size: "+size);
        System.out.println("extention: "+extention);
    }
}
