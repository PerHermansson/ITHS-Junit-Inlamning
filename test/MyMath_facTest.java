/*
 * Genererad av ../aux/fac
 */

import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MyMath_facTest {
    private MyMath myMath;
    private int n, f;

    public MyMath_facTest(int n, int f) {
        this.n = n;
        this.f = f;
    }

    @Before
    public void setUp() {
        myMath = new MyMath();
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        Integer t[][] = new Integer[][] {
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},
                {7, 5040},
                {8, 40320},
                {9, 362880},
                {10, 3628800},
                {11, 39916800},
                {12, 479001600}};
        return java.util.Arrays.asList(t);
    }

    @Test
    public void fac() {
        assertEquals(f, myMath.fac(n));
    }
}
