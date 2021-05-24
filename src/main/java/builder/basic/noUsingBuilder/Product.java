package builder.basic.noUsingBuilder;

public class Product {
    private String attributo1;
    private String attributo2;
    private String attributo3;
    private String attributo4;
    private String attributo5;

    public Product(){}

    public Product(String attributo1){
        this.attributo1=attributo1;
        attributo2="value2";
        attributo3="value3";
        attributo4="value4";
        attributo5="value5";
    }
    public void ProductType1(){
        attributo1="value1";
        attributo2="value2";
        attributo3="value9";
        attributo4="value4";
        attributo5="value5";
    }

    public void ProductType2(){
        attributo1="Pvalue1";
        attributo2="Pvalue2";
        attributo3="Pvalue3";
        attributo4="Pvalue4";
        attributo5="Pvalue5";
    }

    public void ProductType3(){
        attributo1="Pvalue11";
        attributo2="Pvalue21";
        attributo3="Pvalue31";
        attributo4="Pvalue41";
        attributo5="Pvalue51";
    }
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
}
