package factory.simpleFactory;

public class RectangleFactory implements Factory {

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
