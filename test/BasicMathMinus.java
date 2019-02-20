import jdk.nashorn.internal.objects.Global;
import org.junit.*;
import org.*;

import static org.junit.Assert.*;

public class BasicMathMinus {
    String type;

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("This is the beginning of a Minus Test");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        System.out.println("This is Minus Function Test   " );
    }

    @Test
    public void minusNormal() {
        BasicMath Minus = new BasicMath();
        int resultMinus = Minus.minus(3,3);
        type = "This is for two positive values";
        assertTrue(resultMinus == 0);
    }

    @Test
    public void minusNegative() {
        BasicMath Minus = new BasicMath();
        int resultMinus = Minus.minus(-3,-3);
        type = "This is for two Negative Equal values";
        assertTrue(resultMinus == 0);
    }

    @Test
    public void minusNegative1() {
        BasicMath Minus = new BasicMath();
        int resultMinus = Minus.minus(-3,-6);
        type = "This is for two Negative values with positive result";
        assertTrue(resultMinus == 3);
    }

    @Test
    public void minusNegative2() {
        BasicMath Minus = new BasicMath();
        int resultMinus = Minus.minus(-9,6);
        type = "This is for one Negative and one positive value";
        assertTrue(resultMinus == -15);
    }

    @Test
    public void minusMax() {
        BasicMath Minus = new BasicMath();
        /*
        if (int a > Math.max(a)){
            throw new ArithmeticException("Can not do ");
        }else{
*/
            int resultMinus = Minus.minus(3, 3);
            type = "This is for two positive values";
            assertTrue(resultMinus == 0);
      /*  }*/
        }
}