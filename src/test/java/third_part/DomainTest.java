package third_part;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class DomainTest extends Assert {
    static Space space;
    @BeforeClass
    public static void createSpace(){
        space = new Space();
    }
    @Test
    public void isBrightnessNormal(){
        assertEquals(Brightness.NORMAL, space.getBrightness());
    }
}
