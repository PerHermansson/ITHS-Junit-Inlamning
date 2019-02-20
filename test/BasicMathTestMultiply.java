import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTestMultiply {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test // Multiplicera två tal
    public void multiply() {
        BasicMath multiply = new BasicMath();
        int result = multiply.multiply(5, 6);
        assertTrue(result == 30);

    }
    @Test // Multiplicera ett tal med 0 är noll
    public void multiplyZero() {
        BasicMath multiply = new BasicMath();
        int result = multiply.multiply(5, 0);
        assertTrue(result == 0);
    }

    @Test //Multiplicera med negativt tal
    public void multiplyNegative() {
        BasicMath multiply = new BasicMath();
        int result = multiply.multiply(-5, 6);
        assertTrue(result == -30);

    }
    @Test
    public void multiplyTwoNegative() {
        BasicMath multiply = new BasicMath();
        int result = multiply.multiply(-5, -6);
        assertTrue(result == 30);

    }
}