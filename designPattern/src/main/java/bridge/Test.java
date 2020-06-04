package bridge;

/**
 * 桥接模式
 */
public class Test {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 15, new RedCircle());

        Shape greenCircle = new Circle(100, 10, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
