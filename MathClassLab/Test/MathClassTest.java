import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathClassTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Here we will test different type of addition test");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("We have done ");
    }

    @Test
    public void addMethodTest() {
        MathClass mc = new MathClass();
        int result = mc.addMethod(2,3);
        assertTrue(result==5);
    }


}