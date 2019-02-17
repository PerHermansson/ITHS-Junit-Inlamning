import org.junit.*;

import static org.junit.Assert.*;

public class MathAssignmentSubtractionTest {

    @Before
    public void startUp() {
        System.out.println("Test is starting up");

    }
    @Test
    //testing with positive numbers
    public void subtractionPositive() {
        MathAssignment math = new MathAssignment();
        int result = math.subtraction(10,2);
        assertTrue(result==8);
        System.out.println("Test passed since the actual result is " + result);

    }
    @Test
    //testing with negative numbers
    public void subtractionNegative() {
        MathAssignment math = new MathAssignment();
        int result = math.subtraction(-34,-7);
        assertEquals(result, -41);
    }

    @Test
    //testing with one positive and one negative number
    public void subtractionPositiveNegative() {
        MathAssignment math = new MathAssignment();
        int result = math.subtraction(-60,+4);
        assertTrue(result==-64);
        System.out.println("Test passed since the actual result is " + result);

    }
    @Test
    public void subtractionDecimal() {
        MathAssignment math = new MathAssignment();
        double result = math.subtraction(3.0,1.5);
        assertTrue(result==1.5);
        System.out.println("Test passed since the actual result is " +result);
    }
}