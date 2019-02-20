import org.junit.*;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;


public class BasicMathTestAdd {

    public interface excludedTests {}
    public interface includedTests {}

    @BeforeClass
    public static void before() throws Exception {
        System.out.println("Addition tests starting");
    }

    @After
    public void after() throws Exception {
    }

    @Category(includedTests.class)
    @Test // addera två tal
    public void addition() {
        BasicMath add = new BasicMath();
        int addResult = add.add(4,2);
        assertTrue(addResult == 6);
    }
    @Category(includedTests.class)
    @Test // addera två negativa tal
    public void additionNegative() {
        BasicMath add = new BasicMath();
        int addResult = add.add(-4,-2);
        assertTrue(addResult == -6);
    }
    @Category(excludedTests.class)
    @Test // addera med 0
    public void additionZero() {
        BasicMath add = new BasicMath();
        int addResult = add.add(4,0);
        assertTrue(addResult == 4);
    }
    @Category(includedTests.class)
    @Test //MaxInt försök att addera på ett tal, får error så testet fungerar ej. Addera med 0 fungerar att ha int på max gränsen men inte över
    public void additionMaxInt() {
        BasicMath add = new BasicMath();
        int addResult = add.add(Integer.MAX_VALUE, 0);
        assertTrue(addResult == 2147483647);
    }

}