import org.junit.*;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

interface NormalCaseTest {};
interface BoundaryCaseTest {};


public class MathTestAdd {

    private Math math;

    @BeforeClass
    static  public void start(){
        System.out.println("----------");
        System.out.println("ADDITION is under test...");
    }

    @Before
    public void setUp() throws Exception {
        math = new Math();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Category({NormalCaseTest.class})
    @Test
    public void addTestNormalValue() {
        System.out.println("Test: normal values a=15, b=36, result=51");
        int result = math.add(15, 36);
        assertTrue(result==51);
    }

    @Category({NormalCaseTest.class,BoundaryCaseTest.class})
    @Test
    public void addTestMaxValue() {
        System.out.println("Test: boundary value a=Integer.MAX_VALUE, b=1, result=Integer.MIN_VALUE");
        int result = math.add(Integer.MAX_VALUE, 1);
        assertTrue(result == Integer.MIN_VALUE);
    }

    @Category({NormalCaseTest.class, BoundaryCaseTest.class})
    @Test
    public void AddTestMinValue() {
        System.out.println("Test: boundary value a=Integer.MIN_VALUE, b=2, result=-2147483646");
        int result = math.add(Integer.MIN_VALUE, 2);
        assertTrue(result == -2147483646);
    }

    @Category({NormalCaseTest.class, BoundaryCaseTest.class})
    @Test
    public void AddTestMaxMinValue() {
        System.out.println("Test: boundary values a=Integer.MAX_VALUE, b=Integer.MIN_VALUE, result=-1");
        int result = math.add(Integer.MAX_VALUE, Integer.MIN_VALUE);
        assertTrue(result == -1);
    }

    @Category({NormalCaseTest.class})
    @Test
    public void AddTestNegativValue() {
        System.out.println("Test: normal negativ values a=-135, b=-123, result=-258");
        int result=math.add(-135, -123);
        assertTrue(result == -258);
    }

    @Category({NormalCaseTest.class})
    @Test
    public void AddTestZeroValue() {
        System.out.println("Test: normal values a=10, b=0, result=10");
        int result=math.add(10, 0);
        assertTrue(result == 10);
    }

    @AfterClass
    static  public void finish(){
        System.out.println("----------");
        System.out.println("");
    }





}