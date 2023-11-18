
import org.junit.Test;
import static org.junit.Assert.*;

public class OddEvenTest {

    @Test
    public void testEvenNumber() {
        OddEven oddEvent = new OddEven();
        assertTrue(oddEvent.evenOddNumber(4));
    }

    @Test
    public void testOddNumber() {
        OddEven oddEvent = new OddEven();
        assertFalse(oddEvent.evenOddNumber(7));
    }

    @Test
    public void testZero() {
        OddEven oddEvent = new OddEven();
        assertTrue(oddEvent.evenOddNumber(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        OddEven oddEvent = new OddEven();
        assertTrue(oddEvent.evenOddNumber(-2));
    }

    @Test
    public void testNegativeOddNumber() {
        OddEven oddEvent = new OddEven();
        assertFalse(oddEvent.evenOddNumber(-3));
    }
}