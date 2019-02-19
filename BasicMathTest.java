//package division;

//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.fail;
import static java.lang.Math.pow;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/***********************
 * Teresa Arndtsson*
 **********************/

public class BasicMathTest {

    int a;
    int b;
    int result;

    @Test
    public void testAddMax() {
        a = 2147483647;
        b = 1;
        try{
        System.out.println("Största integer + 1 ger "+(a+b));
        //assertTrue((a+b)==2147483648);
    }catch(IllegalArgumentException e){
            System.out.println("Talet är för stort för att kunna hanteras.");
        }
    }

    @Test
    public void testAddMin() {
        a = -2147483647;
        b = 1;
        System.out.println("Största integer med minus framför + 1 ger "+(a+b));
        assertTrue((a+b)==-2147483646);
    }

    @Test
    public void testAddNextToMax(){
        a= 2147483646;
        b= 1;
        System.out.println("Näst näst största integer + 1 ger "+(a+b));
        assertTrue((a+b)==2147483647);
    }

    @Test
    public void testNormalValue(){
        a= 2;
        b= 3;
        System.out.println("Två normala tal: 2+3 ger "+(a+b));
        assertTrue((a+b)==5);
    }

    @Test
    public void testAddTwoNegatives() {
        a = -2;
        b = -3;
        System.out.println("Två negativa tal ger " +(a+b));
        assertTrue((a+b)==-5);
    }

    @Test
    public void testAddOneNegative() {
        a = -2;
        b = 3;
        System.out.println("Ett negativt tal plus ett positivt tal -2 + 3 = " +(a+b));
        assertTrue((a+b)==1);

    }

    /*@Before
    public void setUp() throws Exception {
        // Kod som körs innan varje test
    }*/

    @Test
    public void testDivisonByZero(){
        a = 2;
        b = 0;
        try{
        System.out.println("Två genom noll ger "+(a/b));
        assertFalse(a/b==0);
    }catch(ArithmeticException e){
            System.out.println("Exception: " + e.toString() );
        }
    }

    @Test
    public void testSubstractByNegatives(){
        a = -2;
        b = -3;
        System.out.println("Ett negativt tal minus ett annat -2-(-3) ger "+(a-b));
        assertTrue(a-b==1);
    }

    @Test
    public void testMultiplyByZero(){
        a = 2;
        b = 0;
        System.out.println("Multiplicera ett tal med noll ger "+(a*b));
        assertTrue(a*b==0);
    }

    @Test
    public void testToThePowerOf(){
        a = 2;
        b = 0;
        System.out.println("Något upphöjt till noll ger " +(pow(a,b)));
        assertTrue((pow(a,b)==1.0));
    }
}