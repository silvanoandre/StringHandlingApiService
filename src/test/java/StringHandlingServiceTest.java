import org.junit.jupiter.api.Test;
import org.sapm.services.StringHandlingService;

import static org.junit.jupiter.api.Assertions.*;

public class StringHandlingServiceTest {

    private StringHandlingService stringHandlingService;

    StringHandlingServiceTest(){
        stringHandlingService = new StringHandlingService();
    }

    @Test
    public void testRemoveDuplicatesWithDuplicates() {

        String input = "AABBCCD112233";
        String result = stringHandlingService.removeDuplicates(input);
        assertEquals("ABCD123", result);
    }


    @Test
    public void testRemoveDuplicatesWithEmptyString() {
        String input = "";
        String result = stringHandlingService.removeDuplicates(input);
        assertEquals("", result);
    }

    @Test
    public void testRemoveDuplicatesWithNullString() {
        String result = stringHandlingService.removeDuplicates(null);
        assertNull(result);
    }

    @Test
    public void testRemoveDuplicatesWithWhitespace() {
        String input = "  a b c  ";
        String result = stringHandlingService.removeDuplicates(input);
        assertEquals(" abc", result);
    }
}
