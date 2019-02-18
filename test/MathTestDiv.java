import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTestDiv {

    private Math math;

    @BeforeClass
    static  public void greetings() throws Exception {
        System.out.println("Hello! These are tests for DIVISION.");
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
    public void divTestNormalValue() {
        assertEquals(25,  math.div(100, 4));
    }

    @Test
    public void divTestNegativValue() {
        assertEquals(-25,  math.div(100, -4));
    }

    @Test
    public void divTestZeroByPosValue() {
        assertEquals(0,  math.div(0, 4));
    }

    @Test
    public void divTestMaxByMaxValue() {
        assertEquals(1,  math.div(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void divTestMinByOneValue() {
        assertEquals(Integer.MIN_VALUE,  math.div(Integer.MIN_VALUE, 1));
    }

    @Test
    public void divTestByZero() {
        try {
            math.div(3, 0);
            fail("Should result in a division by zero exception");
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic exception: division by zero" );
        }
        catch(Exception e){
            fail("Non-Arithmetic exception");
        }

    }



}