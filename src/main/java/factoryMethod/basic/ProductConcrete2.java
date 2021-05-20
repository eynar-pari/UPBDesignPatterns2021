package factoryMethod.basic;

public class ProductConcrete2 implements IProduct {

    public ProductConcrete2(){}

    @Override
    public void create() {
        System.out.println("ProductConcrete2");
    }
}
