package prototype;

public interface Product extends Cloneable {

    void use(String a);

    Product creatClone();
}
