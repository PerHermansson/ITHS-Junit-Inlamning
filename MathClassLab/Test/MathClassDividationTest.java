import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathClassDividationTest {

    String test;
    @Before
    public void setUp() throws Exception {
        System.out.println("Here we will run different type of dividation tests!");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println(test + " type done! ");
    }

    @Test
    public void SimpleDividationTest() {
        test = "Two simple values true test";
        MathClass mc = new MathClass();
        assertEquals(2,mc.divideMethod(4,2));
    }

    @Test
    public void SimpleDividationFalseTest() {
        test = "Two simple values false test";
        MathClass mc = new MathClass();
        assertNotEquals(3,mc.divideMethod(4,2));
    }



    @Test
    public void DivideWithZeroTest() {
        test = "One zero value test";
        MathClass mc = new MathClass();
        assertEquals(0 , mc.divideMethod(0,2));
    }

    @Test
    public void DivideWithMinusValueTest() {
        test = "One zero value test";
        MathClass mc = new MathClass();
        assertEquals(-3 , mc.divideMethod(-6,2));
    }


}