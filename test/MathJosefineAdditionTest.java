import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class MathJosefineAdditionTest {

    private MathJosefine math;

    @Before
    public void setUp() throws Exception {
        math = new MathJosefine();
    }

    @Test
    public void addNormalValues() {
        assertEquals("Test failed: actual value does not match expected value",
                12, math.add(10, 2));
    }

    @Test
    public void addZeroValue() {
        assertEquals("Test failed: actual value does not match expected value",
                10, math.add(10, 0));
    }

    @Test
    public void addTwoZeroValues() {
        assertEquals("Test failed: actual value does not match expected value",
                0, math.add(0, 0));
    }

    @Test
    public void addPositiveAndNegativeValue() {
        assertEquals("Test failed: actual value does not match expected value",
                8, math.add(10, -2));
    }

    @Test
    public void addNegativeValues() {
        assertEquals("Test failed: actual value does not match expected value",
                -12, math.add(-10, -2));
    }

    @Category(Gransvardetest.class)
    @Test
    public void addToMaxValue() {
        //assertEquals("Test failed: actual value does not match expected value",
        //      Integer.MIN_VALUE, math.add(Integer.MAX_VALUE, 1));
        try {
            math.add(Integer.MAX_VALUE, 5);
            fail("Test failed: Arithmetic exception expected");
        }

        catch (ArithmeticException e) {
            assertEquals("java.lang.ArithmeticException", e.toString() );
        }

        catch (Exception e) {
            assertEquals("java.lang.ArithmeticException", e.toString() );
        }

    }

    @Test
    public void addDecimalValue() {
        assertEquals("Test failed: actual value does not match expected value",
                3, math.add(2, (int)1.5));
    }

    @After
    public void tearDown() throws Exception {
    }
}