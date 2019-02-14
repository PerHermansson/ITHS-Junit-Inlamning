package com.hmkcode.junit;

import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.is;


@RunWith(JUnit4.class)
public class MatematikTestTest {

    @Rule
    public Timeout globalTimeout = new Timeout(3000); // MAX 3 SEKUNDER PER TESTAD METOD

    com.hmkcode.junit.Math math = new com.hmkcode.junit.Math();

    @Test
    @Ignore
    public void testAssertNotNull() {
        org.junit.Assert.assertNotNull("SKA INTE VARA NULL", math);
    }

    @Test
    public void testSum(){
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.sum(3, 2) == 5);

        //to test timeout
      /*for (;;) {
        }*/
    }

    @Test
    public void testMultiply(){
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.multiply(3, 2) == 6);
    }

    @Test
    public void testDivide(){
        double x = 3,y = 2;
        assertThat("FAILURE - KAN INTE DIVIDERA MED 0!",y, is(not(0.0)));
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.divide(x, y) == 1.5);
    }

    @Test
    public void testSubtract(){
        org.junit.Assert.assertTrue("FAILURE - NOT EQUAL!", math.subtract(3, 2) == 1);
    }

}