import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Main application test.
 */
public class AppTest {

    /**
     * Test that checks if app has greeting or not.
     */
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}