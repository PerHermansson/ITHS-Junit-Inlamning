import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTest {
    String type;

    @Before
    public void setUp() throws Exception {
        System.out.println("This is the beginning of a Division Test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("This is Division Test   " + type);
    }

    @Test
    public void divnormal() {
        BasicMath divn = new BasicMath();
        int result = divn.div(2,2);
        type = "Normal";
        assertTrue(result==1);
    }

    @Test
    public void divzero() {
        BasicMath divn = new BasicMath();
        int result = divn.div(0,2);
        type = "With Zero";
        assertTrue(result==0);
    }

    @Ignore
    public void divminus_1() {
        BasicMath divn = new BasicMath();
        int result = divn.div(2,-2);
        type = "Ignore Test";
        assertTrue(result== 1);
    }

    @Test
    public void divminus() {
        BasicMath divn = new BasicMath();
        int result = divn.div(2,-2);
        type = "With Minus";
        assertTrue(result==-1);
    }

}