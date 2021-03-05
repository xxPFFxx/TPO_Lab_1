package first_part;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArcsinFuncTest extends Assert {
    double eps = 0.001;
    @Test
    public void CheckPositive() {
        Assertions.assertEquals(Math.asin(0.5), ArcsinFunc.arcsin(0.5), eps);
        Assertions.assertEquals(Math.asin(Math.sqrt(2)/2), ArcsinFunc.arcsin(Math.sqrt(2)/2), eps);
        Assertions.assertEquals(Math.asin(Math.sqrt(3)/2), ArcsinFunc.arcsin(Math.sqrt(3)/2), eps);
    }
    @Test
    public void CheckZero() {
        Assertions.assertEquals(Math.asin(0), ArcsinFunc.arcsin(0), eps);
    }
    @Test
    public void CheckNegative() {
        Assertions.assertEquals(Math.asin(-0.5), ArcsinFunc.arcsin(-0.5), eps);
        Assertions.assertEquals(Math.asin(-Math.sqrt(2)/2), ArcsinFunc.arcsin(-Math.sqrt(2)/2), eps);
        Assertions.assertEquals(Math.asin(-Math.sqrt(3)/2), ArcsinFunc.arcsin(-Math.sqrt(3)/2), eps);
    }
    @Test
    public void CheckOutOfBounds() {
        Assertions.assertEquals(Math.asin(1.001), ArcsinFunc.arcsin(1.001), eps);
        Assertions.assertEquals(Math.asin(-1.001), ArcsinFunc.arcsin(-1.001), eps);
    }
    @Test
    public void CheckBounds() {
        Assertions.assertEquals(Double.NaN, ArcsinFunc.arcsin(1), eps);
        Assertions.assertEquals(Double.NaN, ArcsinFunc.arcsin(-1), eps);
    }
}
