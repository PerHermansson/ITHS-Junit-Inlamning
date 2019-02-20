import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Categories.IncludeCategory(Gransvardetest.class)
@Suite.SuiteClasses({MathJosefineFactorialTest.class, MathJosefineFibonacciTest.class,
        MathJosefineMultiplicationTest.class, MathJosefineAdditionTest.class, MathJosefineSubtractionTest.class})

public class MathJosefineTestSuite {

}