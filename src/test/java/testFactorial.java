import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testFactorial {

    private Factorial factorial = new Factorial();

    @Test
    public void factorial() {
        assertTrue(factorial.getFactorial(0) == 1);
        assertTrue(factorial.getFactorial(1) == 1);
        assertTrue(factorial.getFactorial(5) == 120);
    }

    @Test
    public void factorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> factorial.getFactorial(-5), "Введено не корректное значение ");
    }
}
