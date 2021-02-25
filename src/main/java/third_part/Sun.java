package third_part;

public class Sun {
    private String name;
    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public Sun(String name, Shape shape) {
        this.name = name;
        this.shape = shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
