import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.assertTrue;

public class TestSuite_Add {
    private BasicMath math;
    private int a;
    private int b;
    private int result;

    @BeforeEach
    public void startup(){
        math = new BasicMath();
    }

    @Test
    public void addNormal ()  {
        result =  math.add(8,4);
        assertSame(result, 12);

    }
    @Test
    public void addOneNegative(){
        result = math.add(-2,4);
        assertTrue(result<4);

    }

   @Test
   public void addTwoNegatives(){
        result = math.add(-5,-22);
        assertTrue(result<0);
   }

   @Test
   public void addZero (){
        result = math.add(5,0);
        assertTrue(result==5);

   }
    @Test
    public void test_subtractFromMin(){
        Integer a = Integer.MAX_VALUE;
        b = 1;
        result = math.add(a,b);
        assertTrue(Integer.MIN_VALUE==result);
    }

   @AfterEach
    public void testReciept(){
       System.out.println("Adding Test Done");
   }




}