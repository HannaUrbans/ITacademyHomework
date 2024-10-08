package test.home_work_3;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterAutoAgregationTest {
    CalculatorWithMathCopy mathCalculator = new CalculatorWithMathCopy();
    CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation(mathCalculator);

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
        assertEquals(140.45999999999998, calc.add(calc.add(4.1, calc.multiply(15, 7)), calc.raiseToPower(calc.divide(28, 5), 2)), "Ошибка в вычислениях");
    }

    @Test
    public void addTestGetCountOper0() {
        assertEquals(0, calc.getCountOperation(), "Неправильно возвращено количество совершённых операций");
    }

    @Test
    public void addTestGetCountOper1() {
        calc.multiply(12, 7);
        assertEquals(1, calc.getCountOperation(), "Неправильно возвращено количество совершённых операций");
    }

    @Test
    public void addTestGetCountOper2() {
        calc.multiply(14, 7);
        calc.add(20, 7);
        assertEquals(2, calc.getCountOperation(), "Неправильно возвращено количество совершённых операций");
    }

}
