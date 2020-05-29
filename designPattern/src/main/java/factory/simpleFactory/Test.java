package factory.simpleFactory;

/**
 * 简单工厂模式
 */
public class Test {
    public static void main(String[] args) {
        Factory circleFactory = new CircleFactory();

        Shape circle = circleFactory.getShape();

        circle.draw();
    }
}
