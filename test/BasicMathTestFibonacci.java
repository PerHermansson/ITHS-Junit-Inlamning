import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTestFibonacci {

    @Before
    public void before() throws Exception {
        System.out.println("Fibonacci test starting");
    }

    @After
    public void after() throws Exception {
        System.out.println("Fibonacci test ended");
    }

    @Test
    public void fibonacci2() {
        BasicMath fib = new BasicMath();
        long result = fib.fibonacci(3);
        assertTrue(result == 2);
    }
    
}