package builder.basic;

public class Product {
    private String attributo1;
    private String attributo2;
    private String attributo3;
    private String attributo4;
    private String attributo5;

    public Product(){}

    public String getAttributo1() {
        return attributo1;
    }

    public void setAttributo1(String attributo1) {
        this.attributo1 = attributo1;
    }

    public String getAttributo2() {
        return attributo2;
    }

    public void setAttributo2(String attributo2) {
        this.attributo2 = attributo2;
    }

    public String getAttributo3() {
        return attributo3;
    }

    public void setAttributo3(String attributo3) {
        this.attributo3 = attributo3;
    }

    public String getAttributo4() {
        return attributo4;
    }

    public void setAttributo4(String attributo4) {
        this.attributo4 = attributo4;
    }

    public String getAttributo5() {
        return attributo5;
    }

    public void setAttributo5(String attributo5) {
        this.attributo5 = attributo5;
    }

    public void showData(){
       System.out.println("attribute1 :"+attributo1);
       System.out.println("attribute2 :"+attributo2);
       System.out.println("attribute3 :"+attributo3);
       System.out.println("attribute4 :"+attributo4);
       System.out.println("attribute5 :"+attributo5);

    }
}
