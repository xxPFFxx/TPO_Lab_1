package third_part;

import java.util.ArrayList;

public class Enviroment {
    private Skyline skyline;
    private ArrayList<Sun> suns;
    private Light light;

    public Skyline getSkyline() {
        return skyline;
    }

    public void setSkyline(Skyline skyline) {
        this.skyline = skyline;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public ArrayList<Sun> getSuns() {
        return suns;
    }

    public void setSuns(ArrayList<Sun> suns) {
        this.suns = suns;
    }


    public Enviroment() {
        this.suns = new ArrayList<>();
    }
    public int getAmountOfSeenSuns(){
        int count = 0;
        for (Sun sun: suns){
            if (sun.isSeen()){
                count += 1;
            }
        }
        return count;
    }

    public void updateBrightness(){
        int amountOfSeenSuns = getAmountOfSeenSuns();
        switch (amountOfSeenSuns) {
            case 0 -> getSkyline().setBrightness(Brightness.DARKNESS);
            case 1 -> getSkyline().setBrightness(Brightness.NORMAL);
            default -> getSkyline().setBrightness(Brightness.DAZZLING);
        }
    }

    public void lightSpread(Light light){

    }
    public int amountOfSuns(){
        return this.getSuns().size();
    }
}
