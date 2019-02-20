import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestSuite_Division {
    private BasicMath math;
    int a;
    int b;
    int result;


    @BeforeEach
    public void  setUp() {
        math = new BasicMath();
    }


    @Test
     void test_divideNegative(){
        a=-12;
        b=6;
        result = math.divide(a,b);
        assertTrue(result<0);
    }

    @Test
    public void test_divideZero() {
        a=0;
        b=5;
        result = math.divide(a,b);
        assertEquals(0, result);
    }

    @Test
    public void test_divideByZero(){
        try{
            a=8;
            b=0;
            result = math.divide(a,b);
            assertFalse(result == 0);
        }catch (ArithmeticException e){
            System.out.println("Cant divide by Zero in test 'test_divideByZero' " + "Exception: " + e.toString());
        }

    }

    @Test
    public void test_divideToOne(){
        a=20;
        b=20;
        result = math.divide(a,b);
        assertTrue(result==1);
    }
    @Test
    public void test_divideNormalValue() {
        a=10;
        b=5;
        result = math.divide(a,b);
        assertSame(result, 2);
    }

    @AfterEach
    public void testReciept(){

        System.out.println("Division Test done.");

    }


}