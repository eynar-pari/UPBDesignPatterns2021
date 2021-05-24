package builder.basic;

public class ConcreteBuilder1 extends Builder{
    @Override
    public void buildAttribute1() {
        product.setAttributo1("value1");
    }

    @Override
    public void buildAttribute2() {
        product.setAttributo2("value2");
    }

    @Override
    public void buildAttribute3() {
        product.setAttributo3("value3");
    }

    @Override
    public void buildAttribute4() {
        product.setAttributo4("value4");
    }

    @Override
    public void buildAttribute5() {
        product.setAttributo5("value5");
    }
}
