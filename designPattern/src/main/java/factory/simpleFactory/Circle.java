package factory.simpleFactory;

/**
 * @author admin
 */
public class Circle implements Shape {

    public Circle() {
        System.out.println("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
