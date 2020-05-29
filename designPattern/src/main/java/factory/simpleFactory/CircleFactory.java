package factory.simpleFactory;

public class CircleFactory implements Factory {

    @Override
    public Shape getShape() {
        return new Circle();
    }
}
