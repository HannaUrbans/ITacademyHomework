package test.home_work_3;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterAutoChoiceAgregationTest {
    private final CalculatorWithOperator calcWithOperator = new CalculatorWithOperator();
    private final CalculatorWithMathCopy calcWithMathCopy = new CalculatorWithMathCopy();
    private final CalculatorWithMathExtends calcWithMathExtends = new CalculatorWithMathExtends();
    private final CalculatorWithCounterAutoChoiceAgregation calcWithOperatorVariant = new CalculatorWithCounterAutoChoiceAgregation(calcWithOperator);
    private final CalculatorWithCounterAutoChoiceAgregation calcWithMathCopyVariant = new CalculatorWithCounterAutoChoiceAgregation(calcWithMathCopy);
    private final CalculatorWithCounterAutoChoiceAgregation calcWithMathExtendsVariant = new CalculatorWithCounterAutoChoiceAgregation(calcWithMathExtends);

    CalculatorWithCounterAutoChoiceAgregation[] types = {
            calcWithOperatorVariant,
            calcWithMathCopyVariant,
            calcWithMathExtendsVariant
    };

    @Test
    public void addTest() {
        for (CalculatorWithCounterAutoChoiceAgregation type : types) {
            assertEquals(7, type.add(0, 7), "Ошибка при сложении");
        }
    }

    @Test
    public void minusTest() {
        for (CalculatorWithCounterAutoChoiceAgregation type : types) {
            assertEquals(8, type.subtract(15, 7), "Ошибка при вычитании");
        }
    }

    @Test
    public void multipyTest() {
        for (CalculatorWithCounterAutoChoiceAgregation type : types) {
            assertEquals(105, type.multiply(15, 7), "Ошибка при умножении");
        }
    }

    @Test
    public void divisionTest() {
        for (CalculatorWithCounterAutoChoiceAgregation type : types) {
            assertEquals(5, type.divide(10, 2), "Ошибка при делении");
        }
    }

    @Test
    public void powTest() {
        for (CalculatorWithCounterAutoChoiceAgregation type : types) {
            assertEquals(8, type.raiseToPower(2, 3), "Ошибка при возведении в степень");
        }
    }

    @Test
    public void exampleTest() {
       //"4.1 + 15 * 7 + (28 / 5) ^ 2";
        for (CalculatorWithCounterAutoChoiceAgregation type : types) {
            assertEquals(140.45999999999998, type.add(type.add(4.1, type.multiply(15, 7)), type.raiseToPower(type.divide(28, 5), 2)), "Ошибка в вычислениях");
        }
    }

    @Test
    public void addTestGetCount2Oper() {
        for (CalculatorWithCounterAutoChoiceAgregation type : types) {
            type.add(4.1, type.multiply(15, 7));
            assertEquals(2, type.getCountOperation(), "Неправильно возвращено количество совершённых операций");
        }
    }

}