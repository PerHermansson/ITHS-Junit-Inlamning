import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTestFib {

    private Math math;

    @BeforeClass
    static  public void greetings() throws Exception {
        System.out.println("Hello! These are tests for FIBONACCI.");
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
    public void fibTestNormalValue() throws Exception {
        assertEquals(3,  math.fibonacci(4));
    }

    @Test
    public void fibTestZeroValue()  throws Exception {
        assertEquals(0,  math.fibonacci(0));
    }

    @Test
    public void fibTestOneValue()  throws Exception {
        assertEquals(1,  math.fibonacci(1));
    }

    @Test
    public void fibTestNegativeValue()throws Exception{
        try {
            math.fibonacci(-1);
            fail("Should result in a factorial negative exception");
        } catch(Exception e) {
            System.out.println("Arithmetic exception: fibonacci method is not defined for negative values " );
        }
    }

   /* @Test
    public void fibTestMaxValue()  throws Exception {
        System.out.println( math.fibonacci(Integer.MAX_VALUE));
    }*/








}