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

    @Test
    public void addLowerAndZero() {
        assertEquals(Integer.MIN_VALUE, myMath.add(Integer.MIN_VALUE, 0));
    }

    @Test
    public void addAboveLowerAndNegativeOne() {
        assertEquals(Integer.MIN_VALUE, myMath.add(Integer.MIN_VALUE + 1, -1));
    }

    @Test
    public void addLowerAndOne() {
        assertEquals(Integer.MIN_VALUE + 1, myMath.add(Integer.MIN_VALUE, 1));
    }

    @Test
    public void addLowerAndNegativeOne() {
        assertEquals(Integer.MAX_VALUE, myMath.add(Integer.MIN_VALUE, -1));
    }

    @Test
    public void subtractPositivesWithoutUnderflow() {
        assertEquals(1000000000, myMath.sub(2000000000, 1000000000));
    }

    @Test
    public void subtractNegativesWithoutOverflow() {
        assertEquals(0, myMath.sub(-1000000000, -1000000000));
    }

    @Test
    public void subtractNegativeFromPositiveWithoutOverflow() {
        assertEquals(2000000000, myMath.sub(1000000000, -1000000000));
    }

    @Test
    public void subtractPositiveFromNegativeWithoutUnderflow() {
        assertEquals(-2000000000, myMath.sub(-1000000000, 1000000000));
    }

    @Test
    public void subtractZeroFromPositive() {
        assertEquals(42, myMath.sub(42, 0));
    }

    @Test
    public void subtractZeroFromNegative() {
        assertEquals(-42, myMath.sub(-42, 0));
    }

    @Test
    public void subtractZeroFromZero() {
        assertEquals(0, myMath.sub(-0, 0));
    }

    @Test
    public void subtractZeroFromUpper() {
        assertEquals(Integer.MAX_VALUE, myMath.sub(Integer.MAX_VALUE, 0));
    }

    @Test
    public void subtractNegativeOneFromBelowUpper() {
        assertEquals(Integer.MAX_VALUE, myMath.sub(Integer.MAX_VALUE - 1, -1));
    }

    @Test
    public void subtractNegativeOneFromUpper() {
        assertEquals(Integer.MIN_VALUE, myMath.sub(Integer.MAX_VALUE, -1));
    }

    @Test
    public void subtractOneFromUpper() {
        assertEquals(Integer.MAX_VALUE - 1, myMath.sub(Integer.MAX_VALUE, 1));
    }

    @Test
    public void subtractZeroFromLower() {
        assertEquals(Integer.MIN_VALUE, myMath.sub(Integer.MIN_VALUE, 0));
    }

    @Test
    public void subtractOneFromAboveLower() {
        assertEquals(Integer.MIN_VALUE, myMath.sub(Integer.MIN_VALUE + 1, 1));
    }

    @Test
    public void subtractOneFromLower() {
        assertEquals(Integer.MAX_VALUE, myMath.sub(Integer.MIN_VALUE, 1));
    }

    @Test
    public void subtractNegativeOneFromLower() {
        assertEquals(Integer.MIN_VALUE + 1, myMath.sub(Integer.MIN_VALUE, -1));
    }

    @Test
    public void multiplyZeroByZero() {
        assertEquals(0, myMath.mul(0, 0));
    }

    @Test
    public void multiplyPositiveWithZero() {
        assertEquals(0, myMath.mul(1000000000, 0));
    }

    @Test
    public void multiplyZeroNegative() {
        assertEquals(0, myMath.mul(0, -1000000000));
    }

    @Test
    public void multiplyPositivesWithoutOverflow() {
        assertEquals(1600000000, myMath.mul(40000, 40000));
    }

    @Test
    public void multiplyNegativesWithoutOverflow() {
        assertEquals(1600000000, myMath.mul(-40000, -40000));
    }

    @Test
    public void multiplyPositiveByNegativeWithoutUnderflow() {
        assertEquals(-1600000000, myMath.mul(40000, -40000));
    }

    @Test
    public void multiplyNegativeByPositiveWithoutUnderflow() {
        assertEquals(-1600000000, myMath.mul(-40000, 40000));
    }

    @Test
    public void multiplyUpperWithOverflow() {
        assertEquals(Integer.MAX_VALUE << 1, myMath.mul(Integer.MAX_VALUE, 2));
    }

    @Test
    public void multiplyLowerWithUnderflow() {
        assertEquals(Integer.MIN_VALUE << 1, myMath.mul(Integer.MIN_VALUE, 2));
    }

    @Test
    public void dividePositiveByOne() {
        assertEquals(42, myMath.div(42, 1));
    }

    @Test
    public void divideNegativeByOne() {
        assertEquals(-42, myMath.div(-42, 1));
    }
}