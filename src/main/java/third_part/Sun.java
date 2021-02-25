package third_part;

public class Sun {
    private String name;
    private Shape shape;
    private boolean isSeen;

    public boolean isSeen() {
        return isSeen;
    }

    public void setSeen(boolean seen) {
        isSeen = seen;
    }

    public Shape getShape() {
        return shape;
    }

    public Sun(String name, Shape shape, boolean isSeen) {
        this.name = name;
        this.shape = shape;
        this.isSeen = isSeen;
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
    public void showUp(){
        setSeen(true);
    }
    public void hide(){
        setSeen(false);
    }
}
