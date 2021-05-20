package factoryMethod.basic;

public class ProductConcrete1 implements IProduct {

    // muchos attributos que son otros objetos y estos tmb tienen que instaciarse
    public ProductConcrete1(){}

    @Override
    public void create() {
        System.out.println("ProductConcrete1");
    }
}
