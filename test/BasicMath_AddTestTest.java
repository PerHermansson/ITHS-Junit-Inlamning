import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.Assert.*;

public class BasicMath_AddTestTest {

    BasicMath math = new BasicMath();
    double result;

    @Before
    public void setUp() throws Exception {
        result = 0;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_add_normal_case(){
        result = math.add(1890, 4);
        assertTrue(result == 1894);
    }

    @Test
    public void test_add_with_negative_ints(){
        result = math.add(-520, -100);
        assertTrue(result == -620);
    }

    @Test
    public void test_add_with_one_positive_and_one_negative_int(){
        result = math.add(675, -245);
        assertTrue(result == 430);
    }

    @Test
    public void test_add_with_one_negative_and_one_positive_int(){
        result = math.add(-342, 53);
        assertTrue(result == -289);
    }

}