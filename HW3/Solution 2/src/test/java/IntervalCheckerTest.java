import org.junit.Test;
import static org.junit.Assert.*;

public class IntervalCheckerTest {

    @Test
    public void testNumberInIntervalWithinRange() {
        assertTrue(IntervalChecker.numberInInterval(30));
        assertTrue(IntervalChecker.numberInInterval(50));
        assertTrue(IntervalChecker.numberInInterval(99));
    }

    @Test
    public void testNumberInIntervalOutsideRange() {
        assertFalse(IntervalChecker.numberInInterval(20));
        assertFalse(IntervalChecker.numberInInterval(25));
        assertFalse(IntervalChecker.numberInInterval(100));
        assertFalse(IntervalChecker.numberInInterval(120));
    }

    @Test
    public void testNumberInIntervalEdgeValues() {
        assertFalse(IntervalChecker.numberInInterval(25)); // граничное значение, не включено
        assertTrue(IntervalChecker.numberInInterval(26));  // внутри интервала
        assertTrue(IntervalChecker.numberInInterval(99));  // внутри интервала
        assertFalse(IntervalChecker.numberInInterval(100)); // граничное значение, не включено
    }
}