package adapter;

/**
 * 适配器模式
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");

        Adaptee adaptee = new Adaptee();

        Target target = new ObjectAdapter(adaptee);

        target.request();
    }
}
