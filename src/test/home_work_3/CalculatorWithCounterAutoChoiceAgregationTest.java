package test.home_work_3;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterAutoChoiceAgregationTest {
    private static final CalculatorWithOperator calcWithOperator = new CalculatorWithOperator();
    private static final CalculatorWithMathCopy calcWithMathCopy = new CalculatorWithMathCopy();
    private static final CalculatorWithMathExtends calcWithMathExtends = new CalculatorWithMathExtends();
    private static final CalculatorWithCounterAutoChoiceAgregation calcWithOperatorVariant = new CalculatorWithCounterAutoChoiceAgregation(calcWithOperator);
    private static final CalculatorWithCounterAutoChoiceAgregation calcWithMathCopyVariant = new CalculatorWithCounterAutoChoiceAgregation(calcWithMathCopy);
    private static final CalculatorWithCounterAutoChoiceAgregation calcWithMathExtendsVariant = new CalculatorWithCounterAutoChoiceAgregation(calcWithMathExtends);

    static CalculatorWithCounterAutoChoiceAgregation[] types = {
            calcWithOperatorVariant,
            calcWithMathCopyVariant,
            calcWithMathExtendsVariant
    };

    @Test
    public void addTest() {
        for (CalculatorWithCounterAutoChoiceAgregation type : types) {
            assertEquals(22, type.add(15, 7), "Ошибка при сложении");
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
            assertEquals(10, type.getCountOperation(), "Неправильно возвращено количество совершённых операций");
        }
    }

}
