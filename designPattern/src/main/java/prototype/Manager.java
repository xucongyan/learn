package prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map<String, Product> showcase;

    public void register(String name, Product product) {
        if (showcase == null) {
            showcase = new HashMap<>();
        }

        showcase.put(name, product);
    }

    public void unregister(String name) {
        showcase.remove(name);
    }

    public Product creat(String productName) {
        Product product = showcase.get(productName);
        return product.creatClone();
    }
}
