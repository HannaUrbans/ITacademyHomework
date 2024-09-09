package test.home_work_3;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterAutoCompositeTest {

    private static final CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

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

    @Test
    public void addTestGetCountOper1() {
        //System.out.println("Хэш до: " + calc.hashCode());
        calc.multiply(15, 7);
        assertEquals(9, calc.getCountOperation(), "Неправильно возвращено количество совершённых операций");
        //System.out.println("Хэш после: " + calc.hashCode());
    }

    @Test
    public void addTestGetCountOper2() {
        //System.out.println("Хэш до: " + calc.hashCode());
        calc.multiply(15, 7);
        assertEquals(10, calc.getCountOperation(), "Неправильно возвращено количество совершённых операций");
        //System.out.println("Хэш после: " + calc.hashCode());
    }

    @Test
    public void addTestGetCountOper3() {
        //System.out.println("Хэш до: " + calc.hashCode());
        calc.multiply(15, 7);
        calc.add(20, 7);
        assertEquals(12, calc.getCountOperation(), "Неправильно возвращено количество совершённых операций");
        //System.out.println("Хэш после: " + calc.hashCode());
    }

}
