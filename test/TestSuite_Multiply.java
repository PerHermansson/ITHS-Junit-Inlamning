import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.assertTrue;

public class TestSuite_Multiply {
    private BasicMath math;
    private int a;
    private int b;
    private int result;

    @BeforeEach
    public void startup(){
        math = new BasicMath();
    }

    @Test//Testar positiva heltal
    public void test_multiplyNormal() {
        a=8;
        b=4;
        result =  math.multiply(a,b);
        assertSame(result, 32);

    }
    @Test //testar med ett negativt tal, ska bli negativt
    public void test_multiplyOneNegative(){
        a=-9;
        b=10;
        result = math.multiply(a,b);
        assertTrue(result<0);

    }

    @Test //Testar med två negativa tal, ska bli positivt
    public void test_multiplyTwoNegatives(){
        a=-11;
        b=-2;
        result = math.multiply(a,b);
        assertTrue(result>0);
    }

    @Test//Testar multiplikation med 0, ska bli 0
    public void test_multiplyByZero(){
        a=9;
        b=0;
        result = math.multiply(a,b);
        assertSame(0,result);
    }

    @Test//Kontrollerar att multiplikationen fungerar även om man byter plats på talen
    public void test_multiplyBothWays(){
        a=7;
        b=12;
        result=math.multiply(a,b);
        int temp = math.multiply(b,a);
        assertEquals(temp,result);
    }

    @AfterEach
    public void testReciept() {
        System.out.println("Multiplication Test Done");
    }

}