import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class BasicMath_MultiplyTest {

    BasicMath math = new BasicMath();
    double result;

    @Before
    public void setUp() throws Exception{
        result = 0;
    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void test_multiply_normal_case(){
        result = math.multiply(161, 623);
        assertTrue(result == 100303);
    }

    @Test
    public void test_multiply_with_negative_ints(){
        result = math.multiply(-1254.00, -634.00);
        assertTrue(result == 795036.00);
    }

    @Test
    public void test_multiply_with_one_positive_and_one_negative_int(){
        result = math.multiply(25, -98);
        assertTrue(result == -2450);
    }

    @Test
    public void test_multiply_with_one_negative_and_one_positive_int(){
        result = math.multiply(-15, 87);
        assertTrue(result == -1305);
    }

}
