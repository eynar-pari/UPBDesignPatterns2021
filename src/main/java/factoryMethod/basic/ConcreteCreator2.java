package factoryMethod.basic;

public class ConcreteCreator2  extends  Creator{
    @Override
    public ProductConcrete2 factoryMethod() {
        ProductConcrete2 productConcrete2 = new ProductConcrete2();
        return productConcrete2;
    }
}
