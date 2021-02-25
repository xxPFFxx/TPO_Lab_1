package third_part;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class DomainTest extends Assert {
    static Enviroment enviroment;
    static Sun sulianis;
    static Sun ram;
    static Skyline skyline;
    @BeforeClass
    public static void createSpace(){
        enviroment = new Enviroment();
        sulianis = new Sun("Сулианис", Shape.CIRCLE, false);
        ram = new Sun("Рам", Shape.CIRCLE, false);
        skyline = new Skyline(Brightness.NORMAL);
        enviroment.setSkyline(skyline);
        enviroment.getSuns().add(sulianis);
        enviroment.getSuns().add(ram);
    }
    @Test
    public void isBrightnessNormal(){
        assertEquals(Brightness.NORMAL, enviroment.getSkyline().getBrightness());
    }
    @Test
    public void flashOccures(){
        enviroment.flash();
        assertEquals(Brightness.DAZZLING, enviroment.getSkyline().getBrightness());
        assertEquals(Shape.POINT, enviroment.getLights().get(0).getShape());
    }

}
