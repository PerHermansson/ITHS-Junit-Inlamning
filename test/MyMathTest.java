/*
 * MyMathTest.java
 *
 * Torgny Lyon <torgny@abc.se>
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyMathTest {
    private MyMath myMath;

    @Before
    public void setUp() {
         myMath = new MyMath();
    }

    @Test
    public void addPositivesWithoutOverflow() {
        int result = myMath.add(1000000000, 1000000000);

        assertEquals(2000000000, result);
    }

    @Test
    public void addNegativesWithoutUnderflow() {
        int result = myMath.add(-1000000000, -1000000000);

        assertEquals(-2000000000, result);
    }

    @Test
    public void addPositiveAndNegativeWithoutUnderflow() {
        int result = myMath.add(1000000000, -2000000000);

        assertEquals(-1000000000, result);
    }

    @Test
    public void addNegativeAndPositiveWithoutOverflow() {
        int result = myMath.add(-1000000000, 2000000000);

        assertEquals(1000000000, result);
    }
}