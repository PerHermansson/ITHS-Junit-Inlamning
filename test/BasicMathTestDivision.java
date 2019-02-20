
import org.junit.*;

import static org.junit.Assert.*;

public class BasicMathTestDivision {


    @BeforeClass
    public static void before() throws Exception {
        System.out.println("Division tests starts now");
    }

    @AfterClass
    public static void after() throws Exception{
        System.out.println("Division testsuite is now finished");
    }

    @Test //Dividerar lika värden för att få 0
    public void divisionNormal() {
        BasicMath div = new BasicMath();
        int divResult = div.division(2,2);
        assertFalse(divResult == 0);
    }

    @Test // dividera 0 med ett tal blir 0
    public void divisionOnZero() {
        BasicMath div = new BasicMath();
        int divResult = div.division(0, 4);
        assertTrue(divResult == 0);
    }
    @Test // dividera med 0 borde inte fungera
    public void divisionZero() {
        BasicMath div = new BasicMath();
        try {
            int divResult = div.division(2, 0);
            assertFalse(divResult == 0);
        }
        catch (ArithmeticException e) {
            System.out.println("This can not be divided by 0");
        }
    }

    @Test // dividera med ett negativt tal
    public void divisionNegative() {
        BasicMath div = new BasicMath();
        int divResult = div.division(4, -4);
        assertTrue(divResult == -1);
    }
    //@Category(Normaltest.class)

}