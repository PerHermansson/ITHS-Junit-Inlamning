import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class BasicMathSubtraction {

    @BeforeClass
    public static void before() throws Exception {
        System.out.println("Starts the subtraction tests");
    }

    @After
    public void after() throws Exception {
    }

    @Test // Subtrahera två tal
    public void sub() {
        BasicMath sub = new BasicMath();
        int result = sub.subtraction(5,4);
        assertTrue(result == 1);

    }
    @Test // Subtrahera två negativa tal
    public void subNegative() {
        BasicMath sub = new BasicMath();
        int result = sub.subtraction(-5,-5);
        assertTrue(result == 0);
    }

    @Test // Subtrahera två negativa tal med fel testresult
    public void subNegativeFalse() {
        BasicMath sub = new BasicMath();
        int result = sub.subtraction(-5,-5);
        assertFalse(result == -10);
    }
}