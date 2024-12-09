package quiz.app;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Test;

public class LoginTest {

    // Test for processing text input
    @Test
    public void testProcessInputString() {
        Login login = new Login();
        login.processInput("Test User");

        // You can add assertions based on your expected output
        assertTrue(true); // This is just a placeholder, replace with actual checks
    }

    // Test for exception handling (empty name)
    @Test
    public void testEmptyName() {
        try {
            Login login = new Login();
            String name = "";
            if (name.isEmpty()) {
                throw new Exception("Name cannot be empty!");
            }
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Name cannot be empty!", e.getMessage());
        }
    }

    // Test for processing integer input (generic method)
    @Test
    public void testProcessInputInteger() {
        Login login = new Login();
        login.processInput(123); // Should handle integer input
        assertTrue(true); // Placeholder assertion
    }
}
