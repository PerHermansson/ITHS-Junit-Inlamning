import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathClassFibonacciTest {
        String test;

        @Before
        public void setUp() throws Exception {
            System.out.println("Here we will run fibonacci tests for different digits!");
        }

        @After
        public void tearDown() throws Exception {
            System.out.println(test +  " test done! ");
        }


        @Test
        public void testFib1() {
            test = " Digit one value";
            assertEquals(1, MathClass.fib(1));
        }


        @Test
        public void testFib2() {
            test = " Digit two value";
            assertEquals(1, MathClass.fib(2));

        }


        @Test
        public void testFib3() {
            test = " Digit three value";
            assertEquals(2, MathClass.fib(3));

        }


        @Test
        public void testFib30() {
            test = " Digit thirty value";
            assertEquals(832040, MathClass.fib(30));

        }


        @Test
        public void testFibMinusOne() {
            test = " Minus value";
            boolean caught = false;
            try
            {
                MathClass.fib(-1);
            }
            catch (IllegalArgumentException e)
            {
                caught = true;
            }
            assertTrue(caught);

        }
    }