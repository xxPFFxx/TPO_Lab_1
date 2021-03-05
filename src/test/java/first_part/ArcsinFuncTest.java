package first_part;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ArcsinFuncTest extends Assert {
    private HashMap<Double, Double> testValues = new HashMap<>();
    public static final double delta = 0.001;

    @Before
    public void setup(){
        //проверка нулевого значения
        testValues.put( 0d, 0d);

        //проверка правой стороны

        testValues.put(0.5, Math.PI/6);
        testValues.put(Math.sqrt(2)/2, Math.PI/4);
        testValues.put(Math.sqrt(3)/2, Math.PI/3);

        //проверка левой стороны (на четность)

        testValues.put(-0.5, -Math.PI/6);
        testValues.put(-Math.sqrt(2)/2, -Math.PI/4);
        testValues.put(-Math.sqrt(3)/2, -Math.PI/3);


        //проверка граничных значений
        testValues.put(-1d, Double.NaN);
        testValues.put(1d, Double.NaN);

        //тестирование NaN, Infinity
        testValues.put(Double.NaN, Double.NaN);
        testValues.put(Double.POSITIVE_INFINITY, Double.NaN);
        testValues.put(Double.NEGATIVE_INFINITY, Double.NaN);

        //тестовые значения вне границы покрытия
        testValues.put(2d, Double.NaN);
        testValues.put(-2d, Double.NaN);
    }

    @After
    public void clearUp(){
        testValues.clear();
    }

    @Test
    public void testArcsin(){
        double expected, actual;
        for (Map.Entry entry: testValues.entrySet()){
            expected = ((Double) entry.getValue());
            actual = ArcsinFunc.arcsin(((Double) entry.getKey()));
            System.out.println("x = " + entry.getKey() + " actual = " + actual
                    + " expected = " + expected);
            assertEquals(expected, actual, delta);
        }
    }
}
