import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class MathJosefineFibonacciTest {

    private MathJosefine math;

    @Before
    public void setUp() throws Exception {
        math = new MathJosefine();
    }

    @Test
    public void fibonacciNormalValue() {
        assertEquals(89, math.fibonacciSum(10));
    }

    @Category({Gransvardetest.class})
    @Test
    public void fibonacciZeroValue() {
        assertEquals(0, math.fibonacciSum(0));
    }

    @Category({Gransvardetest.class})
    @Test
    public void fibonacciNegativeValue() {

        try {
            math.fibonacciSum(-1);
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
    public void fibonacciExceedMax() {
        try {
            math.fibonacciSum(46);
            fail("Test failed: Arithmetic exception expected");
        }

        catch (ArithmeticException e) {
            assertEquals("java.lang.ArithmeticException", e.toString() );
        }

        catch (Exception e) {
            assertEquals("java.lang.ArithmeticException", e.toString() );
        }
    }

    @Category({Gransvardetest.class})
    @Test
    public void fibonacciNotExceedMax() {

        try {
            assertTrue(math.fibonacciSum(45) <= Integer.MAX_VALUE && math.fibonacciSum(45) > 0);
        }

        catch (ArithmeticException e) {
            fail(e.toString() );
        }

        catch (Exception e) {
            fail(e.toString() );
        }
    }

    @Test
    public void isFibonacci() {
        assertTrue(math.fibonacciNumber(5));
    }

    @After
    public void tearDown() throws Exception {
    }
}