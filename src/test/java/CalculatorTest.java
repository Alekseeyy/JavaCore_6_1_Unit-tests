import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Проверка сложения")
    void plus() {
        // given:
        int a = 3;
        int b = 6;
        int expected = 9;

        // when:
        final int resuit = calculator.plus(a, b);

        // then:
        Assertions.assertEquals(expected, resuit);
    }

    @Test
    @DisplayName("Проверка деления")
    void devide() {
        int a = 10;
        int b = 5;
        int expected = 2;

        final int resuit = calculator.devide(a, b);

        Assertions.assertEquals(expected, resuit);
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    void devideByZero() {
        int a = 10;
        int b = 0;

        Assertions.assertThrows(
                ArithmeticException.class,
                () -> calculator.devide(a, b)
        );
    }
}