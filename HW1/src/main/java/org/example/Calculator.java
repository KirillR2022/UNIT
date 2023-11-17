package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Calculator {
    public double calculateDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100.");
        }

        double discount = purchaseAmount * discountPercentage / 100;
        return purchaseAmount - discount;
    }
}

public class CalculatorTest {
    @Test
    public void testValidDiscountCalculation() {
        Calculator calculator = new Calculator();
        double result = calculator.calculateDiscount(100.0, 10.0);
        Assertions.assertThat(result).isEqualTo(90.0);
    }

    @Test
    public void testInvalidDiscountPercentage() {
        Calculator calculator = new Calculator();
        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(100.0, -10.0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100.");
    }

    @Test
    public void testInvalidPurchaseAmount() {
        Calculator calculator = new Calculator();
        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(-100.0, 10.0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100.");
    }

    @Test
    public void testInvalidDiscountPercentageOutOfRange() {
        Calculator calculator = new Calculator();
        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(100.0, 110.0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100.");
    }
}
