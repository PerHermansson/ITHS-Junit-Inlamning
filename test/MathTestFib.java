import org.junit.*;

import static org.junit.Assert.*;

public class MathTestFib {

    private Math math;

    @BeforeClass
    static  public void greetings() throws Exception {
        System.out.println("----------");
        System.out.println("FIBONACCI is under test...");
    }

    @Before
    public void setUp() throws Exception {
        math = new Math();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fibTestNormalValue() throws Exception {
        assertEquals(21,  math.fibonacci(8));
    }

    @Test
    public void fibTestZeroValue()  throws Exception {
        assertEquals(0,  math.fibonacci(0));
    }

    @Test
    public void fibTestOneValue()  throws Exception {
        assertEquals(1,  math.fibonacci(1));
    }

   
    @Test
    public void fibTestNegativeValue(){
        try {
            math.fibonacci(-1);
            fail("Should result in a factorial negative exception");
        } catch(Exception e) {
            System.out.println("Exception: fibonacci method is not defined for negative values " );
        }
    }

    @AfterClass
    static  public void finish(){
        System.out.println("----------");
        System.out.println(" ");
    }


}