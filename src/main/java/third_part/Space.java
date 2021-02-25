package third_part;

public class Space {
    private Sun sulianis;
    private Sun ram;
    private Brightness brightness;

    public Sun getSulianis() {
        return sulianis;
    }

    public void setSulianis(Sun sulianis) {
        this.sulianis = sulianis;
    }

    public Sun getRam() {
        return ram;
    }

    public void setRam(Sun ram) {
        this.ram = ram;
    }

    public Brightness getBrightness() {
        return brightness;
    }

    public void setBrightness(Brightness brightness) {
        this.brightness = brightness;
    }

    public Space() {
        setupSpace();
    }

    public void setupSpace(){
        sulianis = new Sun("Сулианис", Shape.CIRCLE);
        ram = new Sun("Рам", Shape.CIRCLE);
        brightness = Brightness.NORMAL;
    }
}
