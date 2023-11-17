package org.example;

public class IntervalChecker {

    public static void main(String[] args) {
        // Пример использования метода
        int number = 50;
        if (numberInInterval(number)) {
            System.out.println(number + " попадает в интервал (25;100).");
        } else {
            System.out.println(number + " не попадает в интервал (25;100).");
        }
    }

    public static boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}