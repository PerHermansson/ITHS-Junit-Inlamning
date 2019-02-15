import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTestMultiply {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void simpleMultiply() {
        BasicMath mathTest = new BasicMath();
        int a = 4;
        int b = 2;
        int result = mathTest.multiply(a, b);
        assertTrue(result == a*b);
    }

    @Test
    public void multiplyNegativeNumbers(){
        BasicMath mathtest = new BasicMath();
        int a = -4;
        int b = -2;
        int result = mathtest.multiply(a, b);
        assertTrue(result == a*b);
    }
}