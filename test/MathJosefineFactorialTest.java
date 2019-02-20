import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

interface Gransvardetest {}


public class MathJosefineFactorialTest {

    private MathJosefine math;

    @Before
    public void setUp() throws Exception {
        math = new MathJosefine();
    }

    @Test
    public void factorialNormalValue() {
        assertEquals("Test failed: actual value does not match expected value",
                120, math.factorial(5));
    }

    @Category({Gransvardetest.class})
    @Test
    public void factorialZero() {
        assertEquals("Test failed: actual value does not match expected value",
                1, math.factorial(0));
    }

    @Category({Gransvardetest.class})
    @Test
    public void factorialNegativeValue() {

        try {
            math.factorial(-1);
            fail("Test failed: Illegal argument exception expected");
        }

        catch (IllegalArgumentException e) {
            assertEquals("java.lang.IllegalArgumentException", e.toString() );
        }

        catch (Exception e) {
            assertEquals("java.lang.IllegalArgumentException", e.toString() );
        }

    }

    @Category({Gransvardetest.class})
    @Test
    public void factorialExceedMax() {
        try {
            math.factorial(32);
            fail("Test failed: Arithmetic exception expected");

        } catch (ArithmeticException e) {
            assertEquals("java.lang.ArithmeticException", e.toString());

        } catch (Exception e) {
            assertEquals("java.lang.ArithmeticException", e.toString());
        }
    }

    @Category({Gransvardetest.class})
    @Test
    public void factorialNotExceedMax() {

        try {
            assertTrue(math.factorial(31) <= Integer.MAX_VALUE && math.fibonacciSum(31) > 0);

        } catch (ArithmeticException e) {
            fail(e.toString());

        } catch (Exception e) {
            fail(e.toString());
        }
    }

    @After
    public void tearDown() throws Exception {
    }
}