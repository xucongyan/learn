package bridge;

public class Circle extends Shape {

    private int x, y, radius;


    protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    protected void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
