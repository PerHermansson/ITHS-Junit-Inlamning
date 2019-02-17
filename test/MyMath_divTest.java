/*
 * MyMath_divTest.java
 *
 * Torgny Lyon <torgny@abc.se>
 */

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MyMath_divTest {
    private MyMath myMath;
    private int dividend, divisor, quotition;

    public MyMath_divTest(int dividend, int divisor, int quotition) {
        this.dividend = dividend;
        this.divisor = divisor;
        this.quotition = quotition;
    }

    @Before
    public void setUp() {
        myMath = new MyMath();
    }

    @Parameterized.Parameters
    public static ArrayList getParameters() {
        ArrayList<Integer[]> a = new ArrayList<>();
        a.add(new Integer[] {1000, 100, 10});
        a.add(new Integer[] {12, 4, 3});
        a.add(new Integer[] {12, 3, 4});
        a.add(new Integer[] {15, 5, 3});
        return a;
    }

    @Test
    public void div() {
        assertEquals(quotition, myMath.div(dividend, divisor));
    }
}
