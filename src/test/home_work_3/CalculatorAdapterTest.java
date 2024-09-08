package test.home_work_3;

import home_work_3.calcs.adapter.CalculatorAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAdapterTest {
    private final CalculatorAdapter calc = new CalculatorAdapter();

    @Test
    public void addTest() {
        assertEquals(7.0, calc.calc("0 +7"), "Ошибка при сложении");
    }

    @Test
    public void minusTest() {
        assertEquals(8.0, calc.calc("15 - 7"), "Ошибка при вычитании");
    }

    @Test
    public void multipyTest() {
        assertEquals(105.0, calc.calc("15* 7"), "Ошибка при умножении");
    }

    @Test
    public void divideTest() {
        assertEquals(5.0, calc.calc("10/2"), "Ошибка при делении");
    }

    @Test
    public void powTest() {
        assertEquals(8.0, calc.calc("2 ^ 3"), "Ошибка при возведении в степень");
    }

    @Test
    public void exampleTest() {
        String example = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        assertEquals(140.45999999999998, calc.calc(example), "Ошибка в вычислениях");
    }
}
