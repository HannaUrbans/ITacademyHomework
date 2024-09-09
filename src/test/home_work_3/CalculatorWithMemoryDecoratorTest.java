package test.home_work_3;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMemoryDecoratorTest {
    ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

    @Test
    public void addTest() {
        assertEquals(7, calc.add(0, 7), "Ошибка при сложении");
    }

    @Test
    public void minusTest() {
        assertEquals(8, calc.subtract(15, 7), "Ошибка при вычитании");
    }

    @Test
    public void multipyTest() {
        assertEquals(105, calc.multiply(15, 7), "Ошибка при умножении");
    }

    @Test
    public void divisionTest() {
        assertEquals(5, calc.divide(10, 2), "Ошибка при делении");
    }

    @Test
    public void powTest() {
        assertEquals(8, calc.raiseToPower(2, 3), "Ошибка при возведении в степень");
    }

    @Test
    public void exampleTest() {
        //"4.1 + 15 * 7 + (28 / 5) ^ 2";
        assertEquals(140.45999999999998, calc.add(calc.add(4.1, calc.multiply(15, 7)), calc.raiseToPower(calc.divide(28, 5), 2)), "Ошибка в вычислениях");
    }

}
