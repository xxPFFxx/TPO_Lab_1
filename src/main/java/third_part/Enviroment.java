package third_part;

import java.util.ArrayList;

public class Enviroment {
    private Skyline skyline;
    private ArrayList<Sun> suns;
    private ArrayList<Light> lights;

    public Skyline getSkyline() {
        return skyline;
    }

    public void setSkyline(Skyline skyline) {
        this.skyline = skyline;
    }

    public ArrayList<Light> getLights() {
        return lights;
    }

    public void setLights(ArrayList<Light> lights) {
        this.lights = lights;
    }

    public ArrayList<Sun> getSuns() {
        return suns;
    }

    public void setSuns(ArrayList<Sun> suns) {
        this.suns = suns;
    }

    public void flash(){
        this.skyline.setBrightness(Brightness.DAZZLING);
        lights.add(new Light(Shape.POINT));
    }
    public Enviroment() {
        this.lights = new ArrayList<>();
        this.suns = new ArrayList<>();
    }
    public int amountOfSuns(){
        return this.getSuns().size();
    }
}
