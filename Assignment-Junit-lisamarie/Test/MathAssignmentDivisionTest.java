import com.sun.org.glassfish.external.statistics.BoundaryStatistic;
import org.junit.*;
import static org.junit.Assert.*;



public class MathAssignmentDivisionTest {

    @Before
    public void startUp() {
        System.out.println("Test is starting up");
    }

    //testing dividing numbers by zero
    @Test
    public void dividingNumbersByZero() {
        MathAssignment math = new MathAssignment();
        try {
            math.division(2,0);
            fail(("Will result in a arithmetic exception"));
        }
        catch(ArithmeticException e) {
            System.out.println("Exception: " + e.toString());

        }
    }

    //testing boundary analysis with maximum value
    @Test
    public void divisionCoverageMax() {
        MathAssignment math = new MathAssignment();
        int a = Integer.MAX_VALUE;
        int b = 8;
        int result = math.division(a, b);
        System.out.println("Numbers added to the max value are: " + result);

    }
    //testing boundary analysis with minimum value
    @Test
    public void divisionCoverageMin() {
        MathAssignment math = new MathAssignment();
        int a = Integer.MIN_VALUE;
        int b = -20;
        int result = math.division(a,-b);
        System.out.println("Numbers added to the min value are: " + result);
    }
}