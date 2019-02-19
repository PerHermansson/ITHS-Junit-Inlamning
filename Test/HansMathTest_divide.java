import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HansMathTest_divide {

    private HansMath myHansMath;
    private int result;

    @Before
    public void setUp() {
        System.out.println("Welcome to the divide_test.");
        myHansMath = new HansMath();
    }

    @After
    public void tearDown(){
        System.out.println("Thank you for using the divide_test.");
        System.out.println("####################");
    }

    @Test
    public void divide_positives() {
        result = myHansMath.divide(6,2);
        System.out.println("Testing: 6 / 2");
        assertTrue(result == 3);
    }

    @Test
    public void divide_negatives(){
        result = myHansMath.divide(-6, -3);
        System.out.println("Testing: -6 / -3");
        assertTrue(result == 2);
    }
    @Test
    public void divide_zero() {

        try {
            myHansMath.divide(42, 0);
        }
        catch(ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
        catch(Exception e) {
            fail("Non-Arithmetic exception");
        }


    }
}