
import org.junit.Test;
import static org.junit.Assert.*;

public class OddEvenTest {

    @Test
    public void testEvenNumber() {
        YourClass yourObject = new YourClass(); // Замените YourClass на имя вашего класса

        // Проверяем, что метод правильно определяет четное число
        assertTrue(yourObject.evenOddNumber(4));
    }

    @Test
    public void testOddNumber() {
        YourClass yourObject = new YourClass(); // Замените YourClass на имя вашего класса

        // Проверяем, что метод правильно определяет нечетное число
        assertFalse(yourObject.evenOddNumber(7));
    }

    @Test
    public void testZero() {
        YourClass yourObject = new YourClass(); // Замените YourClass на имя вашего класса

        // Проверяем, что метод правильно обрабатывает ноль
        assertTrue(yourObject.evenOddNumber(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        YourClass yourObject = new YourClass(); // Замените YourClass на имя вашего класса

        // Проверяем, что метод правильно определяет четное отрицательное число
        assertTrue(yourObject.evenOddNumber(-2));
    }

    @Test
    public void testNegativeOddNumber() {
        YourClass yourObject = new YourClass(); // Замените YourClass на имя вашего класса

        // Проверяем, что метод правильно определяет нечетное отрицательное число
        assertFalse(yourObject.evenOddNumber(-3));
    }
}