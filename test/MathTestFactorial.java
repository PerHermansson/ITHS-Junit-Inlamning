import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTestFactorial {

    private Math math;

    @BeforeClass
    static  public void greetings() throws Exception {
        System.out.println("Hello! These are tests for FACTORIAL.");
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
    public void facultyTestNormalValue() throws Exception {
        assertEquals(720,  math.factorial(6));
    }

    @Test
    public void facultyTestZeroValue() throws  Exception{
        assertEquals(1,  math.factorial(0));
    }

    @Test
    public void facultyTestNegativeValue()throws Exception{
        try {
            math.factorial(-1);
            fail("Should result in a factorial negative exception");
        } catch(Exception e) {
            System.out.println("Arithmetic exception: factorial is not defined for negative values " );
        }
    }
}