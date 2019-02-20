import org.junit.*;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class BasicMathAdd {
    String type;



    @Before
    public void setUp() throws Exception {
        System.out.println("This is the beginning of an Addition Test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("This is an Addition Test   " + type);
    }

    @Test
    public void addNormal() {
        BasicMath add = new BasicMath();
        int result_add = add.add(3,3);
        type = "Addition";
        assertTrue(result_add == 6);
    }

    @Test
    public void addMinus() {
        BasicMath add = new BasicMath();
        int result_add = add.add(3,-3);
        type = "Addition of Minus";
        assertTrue(result_add == 0);
    }

    @Test
    public void addMinusMinus() {
        BasicMath add = new BasicMath();
        int result_add = add.add(-3,-3);
        type = "Addition of two minus values";
        assertTrue(result_add == -6);
    }

    @Test
    public void addZero() {
        BasicMath add = new BasicMath();
        int result_add = add.add(-3,0);
        type = "Addition of zero";
        assertTrue(result_add == -3);
    }

    @Test
    public void addZeroFalse() {
        BasicMath add = new BasicMath();
        int result_add = add.add(3,0);
        type = "Addition of zero but false Assert";
        assertFalse(result_add == -3);
    }
}