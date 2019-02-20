import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTestMultiply {
    String type;


    @Before
    public void setUp() throws Exception {
        System.out.println("This is the beginning of a Multiplication Test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("This is Multiplication Test   " + type);
    }

    @Test
    public void multiply() {
        assertEquals(35, BasicMath.multiply(5, 7));
        type="for Normal";
    }

    @Test
    public void multiplyMinus() {
        assertEquals(-35, BasicMath.multiply(-5, 7));
        type="for Minus";
    }

    @Test
    public void multiplyZero() {
        assertEquals(0, BasicMath.multiply(0, 7));
        type="for Zero";
    }

    @Test
    public void multiplyMinus1() {
        assertEquals(35, BasicMath.multiply(-5, -7));
        type="for two Minus";
    }
}