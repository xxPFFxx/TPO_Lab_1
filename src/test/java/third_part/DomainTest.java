package third_part;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DomainTest extends Assert {
    static Enviroment enviroment;
    static Sun sulianis;
    static Sun ram;
    static Skyline skyline;
    static Person ford;
    static Person zafod;
    @Before
    public void createSpace(){
        enviroment = new Enviroment();
        sulianis = new Sun("Сулианис", Shape.CIRCLE, false);
        ram = new Sun("Рам", Shape.CIRCLE, false);
        skyline = new Skyline(Brightness.DARKNESS);
        ford = new Person("Форд", false);
        zafod = new Person("Зафод", false);
        enviroment.setSkyline(skyline);
        enviroment.getSuns().add(sulianis);
        enviroment.getSuns().add(ram);
        enviroment.getPeople().add(ford);
        enviroment.getPeople().add(zafod);
    }
    @Test
    public void arePeopleBlinded(){
        assertEquals(0, enviroment.getAmountOfBlindedPeople());
    }
    @Test
    public void isBrightnessDarkness(){
        assertEquals(Brightness.DARKNESS, enviroment.getSkyline().getBrightness());
    }
    @Test
    public void areThereTwoSuns(){
        assertEquals(2, enviroment.getSuns().size());
    }
    @Test
    public void areAllSunsUnseen(){
        assertEquals(0, enviroment.getAmountOfSeenSuns());
    }
    @Test
    public void flashOccurs(){
        Light light = new Light(Shape.POINT, Brightness.DAZZLING);
        enviroment.setLight(light);
        assertEquals(Shape.POINT, enviroment.getLight().getShape());
        assertEquals(Brightness.DAZZLING, enviroment.getLight().getBrightness());
        assertEquals(2, enviroment.getAmountOfBlindedPeople());
    }
    @Test
    public void resizeLight(){
        Light light = new Light(Shape.POINT, Brightness.DAZZLING);
        enviroment.setLight(light);
        enviroment.getLight().setShape(Shape.CRESCENT);
        assertEquals(Shape.CRESCENT, enviroment.getLight().getShape());
        assertEquals(0, enviroment.getAmountOfBlindedPeople());
    }
    @Test
    public void firstSunOccurs(){
        sulianis.showUp();
        enviroment.updateBrightness();
        assertEquals(1, enviroment.getAmountOfSeenSuns());
        assertEquals(Brightness.NORMAL, enviroment.getSkyline().getBrightness());
    }
    @Test
    public void secondSunOccurs(){
        sulianis.showUp();
        ram.showUp();
        enviroment.updateBrightness();
        assertEquals(2, enviroment.getAmountOfSeenSuns());
        assertEquals(Brightness.DAZZLING, enviroment.getSkyline().getBrightness());
    }
}
