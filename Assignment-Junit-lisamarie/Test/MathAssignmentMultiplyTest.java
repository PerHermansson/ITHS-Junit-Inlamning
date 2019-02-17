import org.junit.*;

import static org.junit.Assert.*;


public class MathAssignmentMultiplyTest {


    @BeforeClass

    public static void startUp() {

        System.out.println("Test is starting up");

    }

    @Test

    public void multiply() {

        MathAssignment math = new MathAssignment();

        int result = math.multiply(14,10);

        assertTrue(result==140);

        System.out.println("Test passed since the expected result is " + result);
    }

    @Test

    public void multiplyPositiveNegative() {

        MathAssignment math = new MathAssignment();

        int result = math.multiply(10,-2);

        assertTrue(result==-20);

        System.out.println("Test passed since the expected result is " + result);

    }

    @Ignore

    public void multiplyWithStrings() {

        MathAssignment math = new MathAssignment();

        Object result = math.multiply(8,"Hello");

        assertNull(result);

    }

    @Test

    public void multiplyWithSpecialCharacters() {

        MathAssignment math = new MathAssignment();

        Object result = math.multiply("@","#");

        assertNotNull(result);
    }

    @AfterClass

    public static void failure() {

        System.out.println("Test failed since the Object is not an Integer");

    }

}