import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(10, 5 + 5);
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, 5 - 3);
    }
}
