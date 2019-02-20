import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class URLValidTest {

    private URLValid valid;

    @BeforeClass
    public static void startUp() {
        System.out.println("URLValidTest is starting up");
    }
    @Before
    public void setUp() throws Exception {
        valid = new URLValid();
        System.out.println("Test starting");
    }

    @Test
    public void isNotValid_specialCharacter() {
        boolean result;
        result = valid.IsValid("http://www.feber.com/%20");
        assertFalse(result);
    }
    @Test
    public void isValid_specialCharacter() {
        boolean result;
        result = valid.IsValid("/");
        assertTrue(result);
        System.out.println("Test passed since URL contains /");
    }

    @Test
    public void isValid_startsWith() {
        boolean result;
        result = valid.IsValid("http://www.iths.se");
        assertTrue(result);
        System.out.println("Test passed since URL starts with www");
    }
    @Test
    public void isNotValid_endsWith() {
        boolean result;
        result = valid.IsValid("org");
        assertFalse(result);
    }
    @Test
    public void isValid_endsWith() {
        boolean result;
        result = valid.IsValid("http://www.iths.se");
        assertTrue(result);
        System.out.println("Test passed since URL ends with se");
    }
    @AfterClass
    public static void finalized() {
        System.out.println("Test completed");
    }


}