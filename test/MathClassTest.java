import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathClassTest {
    private MathClass myObject;

    @Before
    public void beforeTest () { myObject = new MathClass();
    }

    @After // tearDown()
    public void after() throws Exception {
        myObject = null;
        assertNull(myObject);}

    @Test
    public void test_addTwoPositives() { //Basic kontroll på att int kan adderas.
        int x = 3; //Arrange
        int y = 7;
        int result;
        result = myObject.intAdd(x, y); // Act
        assertEquals(10,result); //Assert
    }
    @Test
    public void test_addOneToMax(){
        // Enligt google kallas det "overflow" om man försöker addera till det maximala värdet vilket returnerar min-värdet.

        Integer max = Integer.MAX_VALUE;
        int x = 1;
        int result;
        result = myObject.intAdd(max,x);
        assertEquals(-2147483648,result);
    }
    @Test
    public void test_addTwoNegatives(){
        //Kontrollera att två negativa kan adderas.
        int x = -20;
        int y = -20;
        int result = myObject.intAdd(x,y);
        assertEquals(-40,result);
    }
    @Test
    public void test_subTwoPositives(){
        // verifiera att int kan användas vid subtraktion.
        int x = 10;
        int y = 5;
        int result = myObject.intSub(x,y);
        assertEquals(5,result);
    }
    @Test
    public void test_subOneFromMin(){
        // verifiera funktionen underflow
        Integer x = Integer.MIN_VALUE;
        int y = 1;
        int result = myObject.intSub(x,y);
        assertEquals(2147483647, result);
    }
    @Test
    public void test_subTwoNegatives(){
        // verifiera att negativa tal kan användas.
        int x = -20;
        int y = -20;
        int result = myObject.intSub(x,y);
        assertEquals(0, result);
    }
    @Test
    public void test_multiply(){
        int x = 10;
        int y = 10;
        int result = myObject.intMultiply(x,y);
        assertEquals(100, result);
    }
    @Test
    public void test_multiplyWithZero(){
        int x = 100;
        int y = 0;
        int result = myObject.intMultiply(x,y);
        assertTrue(result==0);
    }
    @Test
    public void test_intDivisionWithZero(){
        try{
            int x = 10;
            int y = 0;
            int result = myObject.intDivisionBool(x,y);
            assertFalse(result == 0);
        }catch (ArithmeticException e){
            System.out.println("Cant divide by Zero in test 'DivisionWithZero' " + "Exception: " + e.toString());
        }}
    @Test
    public void test_intDivisionBoolean(){
        int x=10;
        int y = 5;
        int result = myObject.intDivisionBool(x,y);
        assertTrue(result == 2);
    }
    @Test
    public void test_intDivision(){
        Integer x = Integer.MIN_VALUE;
        int y = 2;
        int result = myObject.intDivision(x,y);
        assertEquals(-1073741824,result);
    }
    @Test
    public void test_fibonacci() throws Exception { //kontrollerar positiva värden sista värdet med nummer X
            int x = 7;
            int result = myObject.fibonacciCode(x);
            assertEquals(13, result);
            //System.out.println(result);
        }
    @Test
    public void test_fibonacciNegativ() throws Exception { //kontrollerar när det matas in negativa värden
        try {
            int x = -1;
            int result = myObject.fibonacciCode(x);
        }catch (Exception e){
            System.out.println("X måste vara positivt i test 'test_fibonacciNegativ' "+ "Exeption: " + e);
        }
    }
}