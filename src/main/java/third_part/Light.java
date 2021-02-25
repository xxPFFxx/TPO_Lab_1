package third_part;

public class Light {
    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Light(Shape shape) {
        this.shape = shape;
    }
}
