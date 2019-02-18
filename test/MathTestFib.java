import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTestFib {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fibTestNormalValue() {
        Math math = new Math();
        int result = math.fibonacci(4);
        assertTrue(result == 3 );
    }
}