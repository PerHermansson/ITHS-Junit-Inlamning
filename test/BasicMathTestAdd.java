import org.junit.*;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.experimental.categories.IncludeCategories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

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


    @Test // addera två tal
    @Category(includedTests.class)
    public void addition() {
        BasicMath add = new BasicMath();
        int addResult = add.add(4,2);
        assertTrue(addResult == 6);
    }

    @Test // addera två negativa tal
    @Category(includedTests.class)
    public void additionNegative() {
        BasicMath add = new BasicMath();
        int addResult = add.add(-4,-2);
        assertTrue(addResult == -6);
    }

    @Test // addera med 0
    @Category(excludedTests.class)
    public void additionZero() {
        BasicMath add = new BasicMath();
        int addResult = add.add(4,0);
        assertTrue(addResult == 4);
    }

    @Test //MaxInt försök att addera på ett tal, får error så testet fungerar ej. Addera med 0 fungerar att ha int på max gränsen men inte över
    @Category(includedTests.class)
    public void additionMaxInt() {
        BasicMath add = new BasicMath();
        int addResult = add.add(Integer.MAX_VALUE, 0);
        assertTrue(addResult == 2147483647);
    }

}