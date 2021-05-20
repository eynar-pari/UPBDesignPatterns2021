package factoryMethod.basic;

public class ProductConcrete3 implements IProduct {

    public ProductConcrete3(){}

    @Override
    public void create() {
        System.out.println("ProductConcrete3");
    }
}
