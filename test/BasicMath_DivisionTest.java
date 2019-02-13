import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class BasicMath_DivisionTest {

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
    public void test_division_normal_case(){
        result = math.division(12400, 124);
        assertTrue(result == 100);
    }

    @Test
    public void test_division_with_negative_ints(){
        result = math.division(-125, -5);
        assertTrue(result == 25);
    }

    @Test
    public void test_division_with_decimals(){
        result = math.division(100, 0.08);
        assertTrue(result == 1250);
    }

    @Test
    public void test_subtract_with_negative_decimals(){
        result = math.subtract(1485.2, -43.52);
        assertTrue(result == -34.1268382353);
    }

    @Test
    public void test_division_with_one_positive_and_one_negative_int(){
        result = math.division(15, -80);
        System.out.println(result);
        assertTrue(result == -0.1875);
    }

    @Test
    public void test_division_with_one_negative_and_one_positive_int(){
        result = math.division(-87, 12);
        assertTrue(result == -7.25);
    }
}
