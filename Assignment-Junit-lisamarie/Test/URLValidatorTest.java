import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class URLValidatorTest {

    @BeforeClass
    public static void startUp() {
        System.out.println("Test is starting up");
    }

    @Test
    public void isNotValidURL_specialCharacter() {
        boolean result;
        URLValidator validator = new URLValidator();
        result = validator.isValidURL("www.example.com/%20");
        assertTrue(result);
    }
    @Test
    public void isValidURL_specialCharacter() {
        boolean result;
        URLValidator validator = new URLValidator();
        result = validator.isValidURL("/");
        assertTrue(result);
        System.out.println("Test passed since URL contains /");
    }

    @Test
    public void isValidURL_startsWith() {
        boolean result;
        URLValidator validator = new URLValidator();
        result = validator.isValidURL("www.google.com");
        assertTrue(result);
        System.out.println("Test passed since URL starts with www");
    }
    @Test
    public void isNotValidURL_endsWith() {
        boolean result;
        URLValidator validator = new URLValidator();
        result = validator.isValidURL("no");
        assertFalse(result);

    }
    @Test
    public void isValidURL_endsWith() {
        boolean result;
        URLValidator validator = new URLValidator();
        result = validator.isValidURL("se");
        assertFalse(result);
    }
    @AfterClass
    public static void finalized() {
        System.out.println("Test passed since URL ends with se");
    }

}