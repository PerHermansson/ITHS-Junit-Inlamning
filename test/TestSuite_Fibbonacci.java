import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSuite_Fibbonacci {
    private BasicMath math;
    private int x;
    private int result;


    @BeforeEach
    void setUp() {
        math = new BasicMath();
    }
    @Test//Kollar alla positiva värden upp till värdet av plats x
    public void test_fibonacciNormal() throws Exception {
        x = 7;
        result = math.fibonacci(x);
        assertEquals(13, result);

    }
    @Test//kontrollerar när det matas in negativa värden
    public void test_fibonacciNegative() throws Exception {
        try {
            x = -1;
            result = math.fibonacci(x);

        }catch (Exception e){
            System.out.println("test_fibonacciNegative: Value has to be positive in fibonacci"+ "Exception: " + e.toString());
        }
    }
    @AfterEach
    void testReciept() {
        System.out.println("Fibonacci Test Done");
    }
}