import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;


import static org.junit.Assert.*;

public class MathJosefineMultiplicationTest {

    private MathJosefine math;

    @Before
    public void setUp() throws Exception {
        math = new MathJosefine();
    }

    @Test
    public void multiplyNormalValues() {
        assertEquals("Test failed: actual value does not match expected value",
                20, math.multiply(10, 2));
    }

    @Test
    public void multiplyPositiveAndNegativeValue() {
        assertEquals("Test failed: actual value does not match expected value",
                -20, math.multiply(10, -2));
    }

    @Test
    public void multiplyNegativeValues() {
        assertEquals("Test failed: actual value does not match expected value",
                20, math.multiply(-10, -2));
    }

    @Category(Gransvardetest.class)
    @Test
    public void multiplyExceedMaxValue() {
        try {
            math.multiply(Integer.MAX_VALUE, 2);
            fail("Test failed: Arithmetic exception expected");
        } catch (ArithmeticException e) {
            assertEquals("java.lang.ArithmeticException", e.toString());
        } catch (Exception e) {
            assertEquals("java.lang.ArithmeticException", e.toString());
        }
    }

    @Category(Gransvardetest.class)
    @Test
    public void multiplyNotExceedMaxValue() {
        assertTrue("Test failed, result exceeds maximum integer",
                math.multiply(240000, 240000) <= Integer.MAX_VALUE && math.multiply(240000, 240000) > 0);

    }

    @Test
    public void multiplyDecimalValue() {
        assertEquals("Test failed: actual value does not match expected value",
                4, math.multiply(2, (int) 2.5));
    }

    @After
    public void tearDown() throws Exception {
    }

}