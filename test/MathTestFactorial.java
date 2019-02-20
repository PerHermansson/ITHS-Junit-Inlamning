import org.junit.*;

import static org.junit.Assert.*;

public class MathTestFactorial {

    private Math math;

    @BeforeClass
    static  public void greetings() throws Exception {
        System.out.println("----------");
        System.out.println("FACTORIAL  is under test...");
    }

    @Before
    public void setUp() throws Exception {
        math = new Math();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void factorialTestNormalValue() throws Exception {
        assertEquals(720,  math.factorial(6));
    }


    @Test
    public void factorialTestZeroValue() throws  Exception{
        assertEquals(1,  math.factorial(0));
    }

    @Test
    public void factorialTestNegativeValue()throws Exception{
        try {
            math.factorial(-1);
            fail("Should result in a factorial negative exception");
        } catch(Exception e) {
            System.out.println("Exception: factorial is not defined for negative values " );
        }
    }

    @AfterClass
    static  public void finish(){
        System.out.println("----------");
        System.out.println(" ");
    }

}