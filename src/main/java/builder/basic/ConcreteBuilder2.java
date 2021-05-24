package builder.basic;

public class ConcreteBuilder2 extends Builder{
    @Override
    public void buildAttribute1() {
        product.setAttributo1("value5");
    }

    @Override
    public void buildAttribute2() {
        product.setAttributo2("value6");
    }

    @Override
    public void buildAttribute3() {
        product.setAttributo3("value7");
    }

    @Override
    public void buildAttribute4() {
        product.setAttributo4("value8");
    }

    @Override
    public void buildAttribute5() {
        product.setAttributo5("value9");
    }
}
