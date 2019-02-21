import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathClassMultiplicationTest {
    String test;
    @Before
    public void setUp() throws Exception {
        System.out.println("Here we will run different type of multiplication tests!");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println(test + " type done! ");
    }

    @Test
    public void SimpleMultiplicationTest() {
        test = "Two simple values true test";
        MathClass mc = new MathClass();
        int result = mc.multiplyMethod(2,3);
        assertTrue(result==6);
    }
    @Test
    public void SimpleMultiplicationFalseTest() {
        test = "Two simple values false test";
        MathClass mc = new MathClass();
        int result = mc.multiplyMethod(2,3);
        assertFalse(result==10);

    }
    @Ignore
    public void MultiplyoneMinusValueTest() {
        test = "One minus value test";
        MathClass mc = new MathClass();
        int result = mc.multiplyMethod(3,-3);
        assertTrue(result == -9);
    }

    @Test
    public void MultiplyTwoMinusValuesTest() {
        test = "Two minus values test";
        MathClass mc = new MathClass();
        int result = mc.multiplyMethod(-2,-3);
        assertTrue(result==6);
    }

    @Test
    public void MultiplyWithZeroTest() {
        test = "One zero value test";
        MathClass mc = new MathClass();
        int result = mc.multiplyMethod(2,0);
        assertTrue(result==0);
    }

}