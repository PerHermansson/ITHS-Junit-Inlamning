import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

@Category(BasicMath.class)
public class BasicMathTestFibonacci {

    String type;

    @Before
    public void setUp() throws Exception {
        System.out.println("This is the beginning of a Fibonacci Test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("This is Fibonacci Test   " + type);
    }


    /** Test fib(1). */
    @Test
    public void testFib1()
    {
        assertEquals(1, BasicMath.fib(1));
        type="for digit 1";
    }

    /** Test fib(2). */
    @Test
    public void testFib2()
    {
        assertEquals(1, BasicMath.fib(2));
        type="for digit 2";
    }

    /** Test fib(3). */
    @Test
    public void testFib3()
    {
        assertEquals(2, BasicMath.fib(3));
        type="for digit 3";
    }

    /** Test fib(30). */
    @Test
    public void testFib30()
    {
        assertEquals(832040, BasicMath.fib(30));
        type="for digit 30";
    }

    /** Test fib(-1). */
    @Test
    public void testFibMinusOne()
    {
        boolean caught = false;
        try
        {
            BasicMath.fib(-1);
        }
        catch (IllegalArgumentException e)
        {
            caught = true;
        }
        assertTrue(caught);
        type="for Minus value";
    }
}