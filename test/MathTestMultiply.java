import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTestMultiply {

    private Math math;

    @BeforeClass
    static  public void greetings() throws Exception {
        System.out.println("Hello! These are tests for Multiply.");
        System.out.println();
    }

    @Before
    public void setUp() throws Exception {
        math = new Math();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mulitplyTestNormalValue() {
        Object result = math.multiply(10, 10);
        assertTrue(result.equals(100));
    }

    @Test
    public void mulitplyTestWithZero() {
        Object result = math.multiply(100, 0);
        assertTrue(result.equals(0));
    }

    @Test
    public void mulitplyTestNegativValue() {
        Object result = math.multiply(-61, 10);
        assertTrue(result.equals(-610));
    }

    @Test
    public void mulitplyTestWithString() {
        try
            {
                Object result = math.multiply("Hej", "klassen!");
                fail("Should result in a multiply string exception");
            }
        catch(Exception e)
            {
                System.out.println("Exeption: multiply strings!");
            }
    }
}