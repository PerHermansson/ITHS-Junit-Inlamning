import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTestAdd {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void simpleAddTest() {
        BasicMath mathTest = new BasicMath();
        int a = 4;
        int b = 2;
        int result = mathTest.add(a, b);
        assertTrue(result == a+b);
    }

    @Test
    public void addNegativeNumbers(){
        BasicMath mathTest = new BasicMath();
        int a = -4;
        int b = -2;
        int result = mathTest.add(a, b);
        assertTrue(result == a+b);
    }

    @Test
    public void addDecimalNumbers(){
        BasicMath mathTest = new BasicMath();
        double a = 0.4;
        double b = 0.3;
        double result = 0;
        result = mathTest.add((int) a, (int) b);
        assertTrue(result == 0.7);
        //Does not work because the mathTest.add method is of the type integer, program can't handle decimal numbers
    }


}