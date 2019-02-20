import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathJosefineDivisionTest {

    private MathJosefine math;

    @Before
    public void setUp() throws Exception {
        math = new MathJosefine();
    }

    @Test
    public void divideNormalValues() {
        assertEquals("Test failed: actual value does not match expected value",
                5, math.divide(10, 2));
    }

    @Test
    public void divideNegativeValues() {
        assertEquals("Test failed: actual value does not match expected value",
                5, math.divide(-10, -2));
    }


    @Test
    public void dividePositiveAndNegativeValues() {
        assertEquals("Test failed: actual value does not match expected value",
                -5, math.divide(10, -2));
    }

    @Test
    public void divideZeroByNumber() {
        assertEquals("Test failed: actual value does not match expected value",
                0, math.divide(0, 2));
    }

    @Test
    public void divideByZero() {

        try {
            math.divide(10, 0);
            fail("Test failed: Arithmetic exception expected");
        }

        catch (ArithmeticException e) {
            assertEquals("java.lang.ArithmeticException: / by zero", e.toString());
        }

        catch (Exception e) {
            assertEquals("java.lang.ArithmeticException: / by zero", e.toString());
        }

    }

    @Test
    public void divideDecimalValue() {
        assertEquals("Test failed: actual value does not match expected value",
                3, math.divide(6, (int)2.5));
    }

    @After
    public void tearDown() throws Exception {
    }
}