package prototype;

public class UnderlinePen implements Product {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String a) {
        int length = a.getBytes().length;

        System.out.println("\"" + a + "\"");

        for (int i = 0; i < length + 2; i++) {
            System.out.print(ulchar);

        }
        System.out.println("");

    }

    @Override
    public Product creatClone() {
        Product product = null;

        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }
}
