package prototype;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderlinePen underlinePen = new UnderlinePen('~');

        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("Strong message", underlinePen);
        manager.register("Waring Box", mbox);
        manager.register("Slash Box", sbox);

        Product product1 = manager.creat("Strong message");
        Product product2 = manager.creat("Waring Box");
        Product product3 = manager.creat("Slash Box");

        product1.use("hello world1");
        product2.use("hello world2");
        product3.use("hello world3");
    }
}
