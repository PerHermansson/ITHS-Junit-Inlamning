import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HansMathTest_multiply {

    private HansMath myHansMath;
    private int result;

    @Before
    public void setUp(){
        System.out.println("Welcome to the multiply_test.");
        myHansMath = new HansMath();
    }

    @After
    public void tearDown()  {
        System.out.println("Thank you for using the multiply_test.");
        System.out.println("####################");
    }

    @Test
    public void multiply_positives() {
        result = myHansMath.multiply(5,5);
        System.out.println("Testing: 5 * 5");
        assertTrue(result == 25);
    }

    @Test
    public void multiply_negative(){
        result = myHansMath.multiply(-5,5);
        System.out.println("Testing: -5 * 5");
        assertTrue(result == -25);
    }
}