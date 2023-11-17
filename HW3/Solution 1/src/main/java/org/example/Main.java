
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class Main {
    public static void main(String[] args) {

        OddEven oddeven = new OddEven();

        System.out.println("Is 4 even? " + oddeven.evenOddNumber(4));


        Result result = JUnitCore.runClasses(OddEvenTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Tests passed: " + result.wasSuccessful());
    }
}

