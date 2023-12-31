package seminars.second.hw;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(VehicleTest.class);

        if (result.wasSuccessful()) {
            System.out.println("All tests passed successfully.");
        } else {
            System.out.println("Some tests failed:");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }
}
