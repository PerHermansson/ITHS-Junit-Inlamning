import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestSuite_Subtract {

    private BasicMath math;
    private int a;
    private int b;
    private int result;

    @BeforeEach
    public void startup(){
        math = new BasicMath();
    }


    @Test //Verifierar att normalfall med positiva tal går bra
    void test_subtractNormal() {
        a=8;
        b=4;
        result =  math.subtract(a,b);
        assertSame(result, 4);

    }

    @Test//Verifierar att en subtraktion med negativt tal alltid blir större än första talet
    public void test_subtractNegativeBigger(){
        a=4;
        b=-8;
        result = math.subtract(a, b);
        assertFalse(result<a);

    }
    @Test//verifierar att en subtraktion med negativt tal aldrig blir mindre än 0
    public void test_subtractNegativeNeverBelowZero(){
        a=4;
        b=-8;
        result = math.subtract(a, b);
        assertFalse(result<0);

    }

    @Test//Verifierar att talet blir oförändrat om man subtraherar 0
    public void test_subtractZero(){
        a=13;
        b=0;
        result = math.subtract(a,b);
        assertTrue(result==a);

    }

    @Test //Verifierar att om 1 subtraheras från MIN_VALUE slår den runt i underflow.
    public void test_subtractFromMin(){
        Integer a = Integer.MIN_VALUE;
        b = 1;
        result = math.subtract(a,b);
        assertTrue(Integer.MAX_VALUE==result);
    }


    /*Testar samma som test_subtractNegativeBigger och blir därför redundant, men får stanna som kommentar för att
      tydliggöra tankegången och resonemanget.

    @Test//Verifierar att om man subtraherar två negativa tal blir det alltid större än första negativa talet
    public void test_subtractNegatives(){
        a=-20;
        b=-12;
        result = math.subtract(a, b);
        assertTrue(result > a);

    }
    */



    @AfterEach
    public void testReciept() {
        System.out.println("Subtraction Test Done");
    }
}