import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTestSubtract {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void simpleSubtract() {
        BasicMath mathTest = new BasicMath();
        int a = 4;
        int b = 2;
        int result = mathTest.subtract(a, b);
        assertTrue(result == a-b);
    }

    @Test
    public void subtractNegativeNumbers(){
        BasicMath mathTest = new BasicMath();
        int a = -4;
        int b = -2;
        int result = mathTest.subtract(a, b);
        assertTrue(result == a-b);
    }
}