import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HansMathTest_Subtract {
    private HansMath myHansMath;
    private int result;

    @Before
    public void setUp()  {
        System.out.println("Welcome to the subtract_test.");
        myHansMath = new HansMath();

    }

    @After
    public void tearDown() {
        System.out.println("Test completed");
        System.out.println("##########################");
    }

    @Test
    public void test_subtract_positive() {
        result = myHansMath.subtract(5, 3);
        System.out.println("Testing 5 -3 ");
        assertTrue(result == 2);
    }
    @Test
    public void test_subtract_min(){
        result = myHansMath.subtract(Integer.MIN_VALUE, 1);
        System.out.println("Testing subtract from MIN.");
        assertTrue(result == 2147483647);
    }


}