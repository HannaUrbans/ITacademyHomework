package test.home_work_3;

import home_work_3.calcs.adapter.CalculatorAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAdapterTest {
    private static final CalculatorAdapter calculatorAdapter = new CalculatorAdapter();

    @Test
    public void addTest() {
        String example = "15 +7";
        double exp = 22.0;
        double res = calculatorAdapter.calc(example);
        assertEquals(exp, res, "Ошибка при сложении");
    }

    @Test
    public void minusTest() {
        String example = "15 - 7";
        double exp = 8.0;
        double res = calculatorAdapter.calc(example);
        assertEquals(exp, res, "Ошибка при вычитании");
    }

    @Test
    public void multipyTest() {
        String example = "15 * 7";
        double exp = 105.0;
        double res = calculatorAdapter.calc(example);
        assertEquals(exp, res, "Ошибка при умножении");
    }

    @Test
    public void divideTest() {
        String example = "10/2";
        double exp = 5.0;
        double res = calculatorAdapter.calc(example);
        assertEquals(exp, res, "Ошибка при делении");
    }

    @Test
    public void powTest() {
        String example = "2 ^ 3";
        double exp = 8.0;
        double res = calculatorAdapter.calc(example);
        assertEquals(exp, res, "Ошибка при возведении в степень");
    }

    @Test
    public void exampleTest() {
        String example = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        double exp = 140.45999999999998;
        double res = calculatorAdapter.calc(example);
        assertEquals(exp, res, "Ошибка в вычислениях");
    }
}
