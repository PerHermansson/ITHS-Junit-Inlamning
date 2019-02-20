import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class MathJosefineSubtractionTest {

    private MathJosefine math;

    @Before
    public void setUp() throws Exception {
        math = new MathJosefine();
    }

    @Test
    public void subtractNormalValues() {
        assertEquals("Test failed: actual value does not match expected value",
                8, math.subtract(10, 2));
    }

    @Test
    public void subtractPositiveAndNegativeValue() {
        assertEquals("Test failed: actual value does not match expected value",
                12, math.subtract(10, -2));
    }

    @Test
    public void subtractNegativeValues() {
        assertEquals("Test failed: actual value does not match expected value",
                -8, math.subtract(-10, -2));
    }

    @Category(Gransvardetest.class)
    @Test
    public void subtractFromMinValue() {
        assertEquals("Test failed: actual value does not match expected value",
                Integer.MAX_VALUE, math.subtract(Integer.MIN_VALUE, 1));
    }

    @Test
    public void subtractDecimalValue() {
        assertEquals("Test failed: actual value does not match expected value",
                4, math.subtract(5, (int)1.5));
    }

    @After
    public void tearDown() throws Exception {
    }
}