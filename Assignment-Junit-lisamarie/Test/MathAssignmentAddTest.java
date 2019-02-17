import org.junit.*;
import static org.junit.Assert.*;

public class MathAssignmentAddTest {

    @BeforeClass
    public static void startUp() {
        System.out.println("Test is starting up");
    }

    @Test
    //testing with positive numbers
    public void addPositive() {
        MathAssignment math = new MathAssignment();
        int result = math.add(5,5);
        assertTrue(result==10);
        System.out.println("Test passed since the expected result is " + result);
    }
    @Test
    //testing with one positive and one negative number
    public void addPositiveNegative() {
        MathAssignment math = new MathAssignment();
        int result = math.add(-15,+32);
        assertEquals(result, 17);

    }

    //testing boundary analysis with maximum value
    @Test
    public void addCoverageMax() {
        MathAssignment math = new MathAssignment();
        double a = Double.MAX_VALUE;
        double b = 0.0;
        double result = math.add(a,b);
        System.out.println("Test passed but with an incorrect outcome: " + result);

    }
    //testing with decimal numbers
    @Test
    public void addWithDecimals() {
        MathAssignment math = new MathAssignment();
        double result = math.add(0.5,3.9);
        assertTrue(result ==4.4);
        System.out.println("Test passed since the expected result is " + result);

    }
}

