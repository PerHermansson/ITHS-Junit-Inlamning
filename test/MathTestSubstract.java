import org.junit.*;

import static org.junit.Assert.*;

public class MathTestSubstract {
    private Math math;

    @BeforeClass
    static  public void greetings() throws Exception {
        System.out.println("----------");
        System.out.println("SUBSTRACTION is under test...");
    }

    @Before
    public void setUp() throws Exception {
        math = new Math();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void substractTestNormalValue() {
        assertEquals(5.1,  math.substract(10.3, 5.2),0.00000001);
    }

    @Test
    public void substractTestZeroValue() {
        assertEquals(5.3,  math.substract(5.3, 0),0.00000001);
    }

    @Test
    public void substractTestZeroZeroValue() {
        assertEquals(0,  math.substract(0, 0),0.00000001);
    }


    @Test
    public void substractTestNegativeValue() {
        assertEquals(16.2,  math.substract(-5.5, - 21.7),0.00000001);
    }

    @Test
    public void substractTestPozNegValue() {
        assertEquals(47.0,  math.substract(25.9, -21.1),0.00000001);
    }

    @Test
    public void substractTestMaxDoubleValue() {
        assertEquals(Double.MAX_VALUE,  math.substract(Double.MAX_VALUE, 0),0.00000001);
    }


    @AfterClass
    static  public void finish(){
        System.out.println("----------");
        System.out.println(" ");
    }


}