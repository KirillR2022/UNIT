import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CompareAverageTest {

    @Test
    public void testCompareAverage_SingleElementInEachList() {
        List<Integer> list1 = List.of(10);
        List<Integer> list2 = List.of(5);

        double result = CompareAverage.calculateAverage(list1);
        assertEquals(10.0, result, 0.001);

        result = CompareAverage.calculateAverage(list2);
        assertEquals(5.0, result, 0.001);

        String message = CompareAverage.compareAverages(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", message);
    }

    @Test
    public void testCompareAverage_ListsWithSameElements() {
        List<Integer> list1 = List.of(5, 10, 15);
        List<Integer> list2 = List.of(5, 10, 15);

        double result = CompareAverage.calculateAverage(list1);
        assertEquals(10.0, result, 0.001);

        result = CompareAverage.calculateAverage(list2);
        assertEquals(10.0, result, 0.001);

        String message = CompareAverage.compareAverages(list1, list2);
        assertEquals("Средние значения равны", message);
    }

    @Test
    public void testCompareAverage_ListsWithFloatingPointNumbers() {
        List<Double> list1 = List.of(2.5, 3.5, 4.5);
        List<Double> list2 = List.of(1.0, 2.0, 3.0);

        double result = CompareAverage.calculateAverage(list1);
        assertEquals(3.5, result, 0.001);

        result = CompareAverage.calculateAverage(list2);
        assertEquals(2.0, result, 0.001);

        String message = CompareAverage.compareAverages(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", message);
    }

    @Test
    public void testCompareAverage_EmptyLists() {
        List<Integer> list1 = List.of();
        List<Integer> list2 = List.of();

        double result = CompareAverage.calculateAverage(list1);
        assertEquals(0.0, result, 0.001);

        result = CompareAverage.calculateAverage(list2);
        assertEquals(0.0, result, 0.001);

        String message = CompareAverage.compareAverages(list1, list2);
        assertEquals("Средние значения равны", message);
    }

    @Test
    public void testCompareAverage_ListsWithNullValues() {
        List<Integer> list1 = List.of(10, null, 30);
        List<Integer> list2 = List.of(5, 15, 25);

        double result = CompareAverage.calculateAverage(list1);
        assertEquals(20.0, result, 0.001);

        result = CompareAverage.calculateAverage(list2);
        assertEquals(15.0, result, 0.001);

        String message = CompareAverage.compareAverages(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", message);
    }
}
