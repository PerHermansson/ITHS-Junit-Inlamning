import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathClassAdditionTest {
String test;
    @Before
    public void setUp() throws Exception {
        System.out.println("Here we will run different type of addition tests!");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println(test + " type done! ");
    }

    @Test
    public void addMethodTest() {
        test = "Two simple values true test";
        MathClass mc = new MathClass();
        int result = mc.addMethod(2,3);
        assertTrue(result==5);
    }
    @Test
    public void addMethodFalseTest() {
        test = "Two simple values false test";
        MathClass mc = new MathClass();
        int result = mc.addMethod(2,3);
        assertFalse(result==10);

    }
    @Test
    public void addMinusValueTest() {
        test = "One minus value test";
        MathClass mc = new MathClass();
        int result = mc.addMethod(3,-3);
        assertTrue(result == 0);
    }

    @Test
    public void addTwoMinusValueTest() {
        test = "Two minus values test";
        MathClass mc = new MathClass();
        int result = mc.addMethod(-2,-3);
        assertTrue(result==-5);
    }

    @Test
    public void addWithZeroTest() {
        test = "One zero value test";
        MathClass mc = new MathClass();
        int result = mc.addMethod(2,0);
        assertTrue(result==2);
    }

}