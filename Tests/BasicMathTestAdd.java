import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTestAdd {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void simpleAddTest() {
        BasicMath mathTest = new BasicMath();
        int a = 4;
        int b = 2;
        int result = mathTest.add(a, b);
        assertTrue(result == 6);
    }
}