import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HansMathTest_Add {
    private HansMath myHansMath;
    private int result;

    @Before
    public void welcome(){
        System.out.println("Welcome to the add_test.");
        myHansMath = new HansMath();
    }

    @After
    public void godbye(){
        System.out.println("Thank you for using the add_test.");
        System.out.println("####################");
    }

    @Test
    public void test_add_normal_int(){
        result = myHansMath.add(2,3);
        System.out.println("Testing 2 + 3 ");
        assertTrue(result == 5);
    }

    @Test
    public void test_add_negative_int(){
        result = myHansMath.add(-2,-3);
        System.out.println("Testing -2 + -3 ");
        assertTrue(result == -5);
    }

    @Test
    public void test_add_max_int(){
        result = myHansMath.add(Integer.MAX_VALUE ,Integer.MAX_VALUE);
        System.out.println("Testing Int_max + Int_max ");
        assertTrue(result == -2);
    }
    @Test
    public void test_add_char() {
        result = myHansMath.add('a', 0);
        System.out.println("Testing char conversion");
        assertTrue(result == 97);



    }







}