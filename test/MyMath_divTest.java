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
        int v[][] = new int[][]{
                {1000, 100, 10},
                {12, 4, 3},
                {12, 3, 4},
                {15, 5, 3}};
        int m[][] = new int[][] {
                {1, 1, 1},
                {1, -1, -1},
                {-1, 1, -1},
                {-1, -1, 1}};
        ArrayList<Integer[]> a = new ArrayList<>();
        for (int i = 0; i < v.length; ++i)
            for (int j = 0; j < m.length; ++j) {
                Integer r[] = new Integer[v[i].length];
                for (int k = 0; k < v[i].length; k++)
                    r[k] = v[i][k] * m[j][k];
                a.add(r);
            }
        return a;
    }

    @Test
    public void div() {
        assertEquals(quotition, myMath.div(dividend, divisor));
    }
}
