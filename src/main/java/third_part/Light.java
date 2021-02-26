package third_part;

public class Light {
    private Shape shape;
    private Brightness brightness;

    public Brightness getBrightness() {
        return brightness;
    }

    public void setBrightness(Brightness brightness) {
        this.brightness = brightness;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Light(Shape shape, Brightness brightness) {
        this.shape = shape;
        this.brightness = brightness;
    }
}
