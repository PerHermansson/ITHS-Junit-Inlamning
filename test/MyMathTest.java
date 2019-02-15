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
        assertEquals(2000000000, myMath.add(1000000000, 1000000000));
    }

    @Test
    public void addNegativesWithoutUnderflow() {
        assertEquals(-2000000000, myMath.add(-1000000000, -1000000000));
    }

    @Test
    public void addPositiveAndNegativeWithoutUnderflow() {
        assertEquals(-1000000000, myMath.add(1000000000, -2000000000));
    }

    @Test
    public void addNegativeAndPositiveWithoutOverflow() {
        assertEquals(1000000000, myMath.add(-1000000000, 2000000000));
    }

    @Test
    public void addPositiveAndZero() {
        assertEquals(42, myMath.add(42, 0));
    }

    @Test
    public void addNegativeAndZero() {
        assertEquals(-42, myMath.add(-42, 0));
    }

    @Test
    public void addZeroAndZero() {
        assertEquals(0, myMath.add(-0, 0));
    }

    @Test
    public void addUpperAndZero() {
        assertEquals(Integer.MAX_VALUE, myMath.add(Integer.MAX_VALUE, 0));
    }

    @Test
    public void addBelowUpperAndOne() {
        assertEquals(Integer.MAX_VALUE, myMath.add(Integer.MAX_VALUE - 1, 1));
    }

    @Test
    public void addUpperAndNegativeOne() {
        assertEquals(Integer.MAX_VALUE - 1, myMath.add(Integer.MAX_VALUE, -1));
    }

    @Test
    public void addUpperAndOne() {
        assertEquals(Integer.MIN_VALUE, myMath.add(Integer.MAX_VALUE, 1));
    }
}