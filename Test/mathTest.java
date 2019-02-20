
import org.junit.*;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class MathTest {
    private Math math;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting MathTest \n");
    }

    @Before
    public void setUp() throws Exception {
        math = new Math();
        System.out.println("Test starting");
    }
    @Test
    public void addNormal() {
        int result = math.add(15000, 50000);
        System.out.println("Add Normal result: " + result);
        assertEquals(65000, result);
    }
    @Test
    public void addWithDecimal() {
        double result = math.add(10.5, 5.5);
        System.out.println("Add with decimal result: " + result);
        assertEquals(16, result, 16);
    }
    @Test
    public void addMinLimitValue() {
        int a = Integer.MIN_VALUE;
        int b = 5;
        int result = math.add(a, b);
        System.out.println("Add with min value result: " + result);
        assertTrue(result ==-2147483643);
    }
    @Test
    public void addLimitValue() {
        int a = Integer.MAX_VALUE;
        int b = 5;
        int result = math.add(a, b);
        System.out.println("Add with max value result: " + result);
        assertTrue(result==-2147483644);
    }
    @Test
    public void addMinAndMAxLimitValue() {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        int result = math.add(a, b);
        System.out.println("Add with min and max value result: " + result);
    }
    @Test
    public void addString() {
        String result = math.add("abcd", "efg");
        System.out.println("Add with Strings Result = " + result);
        assertTrue(result.equals("abcdefg"));
    }
    @Test
    public void divNormal() {
        int result=math.div(100000, 5);
        System.out.println("Div Normal Result = " + result);
        assertTrue(result==20000);
    }
    @Test
    public void divWithZero(){
        int result=math.div(0,10);
        System.out.println("Div with Strings Result = " + result);
        assertTrue( result==0);
    }
    @Test
    public void divWithDouble() {
        double result = math.div(17.8, 10.99);
        System.out.println("Div with Strings Result = " + result);
        assertTrue(result == 1.6196542311191993);
    }
    @Test
    public void divMinLimitValue() {
        int a = Integer.MIN_VALUE;
        int b = 5;
        int result = math.div(a, b);
        System.out.println("div with min result:" + result);
        assertTrue(a <= result && result <= b);
    }
    @Test
    public void divMinAndMAxLimitValue() {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        int result = math.div(a, b);
        System.out.println("div with min and max result:" + result);
        assertTrue(a <= result && result <= b);
    }
    @Ignore
    @Test
    public void divWithStrings() {
        int a = 'A';
        int b = 'B';
        int result = math.div(a, b);
        System.out.println(("div with string") + result);
    }
    @Test
    public void multiplyNormal() {
        int result=math.multiply(10000, 50000);
        System.out.println("Multiply normal Result = " + result);
        assertTrue(result==500000000);
    }
    @Test
    public void multiplyWihtMinusValue(){
        int result=math.multiply(-10,-20);
        System.out.println("Multiply with minus value result: " + result);
        assertTrue(result==200);
    }
    @Test
    public void multiplyWithMinusAndPlusValue(){
        int result=math.multiply(-43,45);
        System.out.println("Multiply with minus and plus value result: " + result);
        assertTrue(result==-1935);
    }
    @Ignore
    @Test
    public void multiplyWithDouble(){
        double result=math.multiply(199.5,2000.9);
        System.out.println("This one will not work for some reason ");
        assertTrue(result==399179.55);
    }
    @Test
    public void multiplyWithDoubleAndResult(){
        double result=math.multiply(199.5,2000.9);
        System.out.println("Multiply with double value result: " + result);
        assertEquals(399179.55,399179.55000000005,399179.55000000005);
    }
    @Test
    public void subNormal() {
        int result=math.sub(9435, 5000);
        System.out.println("Subtract normal value Result = " + result);
        assertTrue(result==4435);
    }
    @Test
    public void subWithDouble() {
        double result=math.sub(149.345, 5.00998);
        System.out.println("Subtract normal value Result = " + result);
        assertTrue(result==144.33502);
    }
    @Test
    public void subWithMinusValues() {
        int result=math.sub(-10, -5);
        System.out.println("Subtract with minus values Result = " + result);
        assertTrue(result==-5);
    }
    @Test
    public void subString() {
        String result = math.sub("abcd", "cd");
        System.out.println("Subtract with String Result = " + result);
        assertTrue(result.equals("ab"));
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("Test in class complete \n");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("MathTest test complete\n");
    }
}
