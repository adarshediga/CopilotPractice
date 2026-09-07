import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void isOddHandlesPositiveNegativeAndZero() {
        assertTrue(calculator.isOdd(3));
        assertTrue(calculator.isOdd(-3));
        assertFalse(calculator.isOdd(2));
        assertFalse(calculator.isOdd(-2));
        assertFalse(calculator.isOdd(0));
    }
    
    @Test
    void isPositiveHandlesPositiveNegativeAndZero() {
        assertTrue(calculator.isPositive(3));
        assertFalse(calculator.isPositive(-3));
        assertFalse(calculator.isPositive(0));
    }

    @Test
    void isNegativeHandlesPositiveNegativeAndZero() {
        assertFalse(calculator.isNegative(3));
        assertTrue(calculator.isNegative(-3));
        assertFalse(calculator.isNegative(0));
    }

    @Test
    void isZeroHandlesPositiveNegativeAndZero() {
        assertTrue(calculator.isZero(0));
        assertFalse(calculator.isZero(5));
        assertFalse(calculator.isZero(-5));
    }
}
