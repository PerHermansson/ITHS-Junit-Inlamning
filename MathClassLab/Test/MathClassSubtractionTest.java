import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathClassSubtractionTest {
    String test;
    @Before
    public void setUp() throws Exception {
        System.out.println("Here we will run different type of subtraction tests!");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println(test + " type done! ");
    }

    @Test
    public void SubtractMethodTest() {
        test = "Two simple values true test";
        MathClass mc = new MathClass();
        int result = mc.subtractMethod(2,3);
        assertTrue(result==-1);
    }
    @Test
    public void SubtractMethodFalseTest() {
        test = "Two simple values false test";
        MathClass mc = new MathClass();
        int result = mc.subtractMethod(2,3);
        assertFalse(result==10);

    }
    @Test
    public void SubtractMinusValueTest() {
        test = "One minus value test";
        MathClass mc = new MathClass();
        int result = mc.subtractMethod(3,-3);
        assertTrue(result == 6);
    }

    @Test
    public void SubtractTwoMinusValueTest() {
        test = "Two minus values test";
        MathClass mc = new MathClass();
        int result = mc.subtractMethod(-2,-3);
        assertTrue(result==1);
    }

    @Test
    public void SubtractWithZeroTest() {
        test = "One zero value test";
        MathClass mc = new MathClass();
        int result = mc.subtractMethod(2,0);
        assertTrue(result==2);
    }

}