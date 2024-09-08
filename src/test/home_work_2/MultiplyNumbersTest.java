package test.home_work_2;

import home_work_2.loops.overflowCheckUtils.FactorialOverflow;
import home_work_2.loops.IMultiply;
import home_work_2.loops.MultiplyNumbers;
import home_work_2.loops.MultiplyNumbersWithRec;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MultiplyNumbersTest {
    @Test
    public void negativeInputTest() {
        assertThrows(IllegalArgumentException.class, () -> MultiplyNumbers.checkPositiveInput(-1));
    }

    @Test
    public void zeroInputTest() {
        assertThrows(IllegalArgumentException.class, () -> MultiplyNumbers.checkPositiveInput(0));
    }

    //создаем массив, содержащий все варианты Multiply
    public final IMultiply[] multiplyTypes = {
            new MultiplyNumbers(),
            new MultiplyNumbersWithRec()
    };

    //проходим по всем вариантам
    @Test
    public void exampleFromTaskTest() {
        for (IMultiply arrayPart : multiplyTypes) {
            long result = arrayPart.factorial(5);
            assertEquals(120, result, "Сумма чисел, из которых состоит 5, равна 120");
        }
    }

    @Test
    public void minInputTest() {
        for (IMultiply arrayPart : multiplyTypes) {
            long result = arrayPart.factorial(1);
            assertEquals(1, result, "Сумма чисел, из которых состоит 1, равна 1");
        }
    }

    @Test
    public void overflowTest() {
        int overflowNum = FactorialOverflow.overflowNum();
        for (IMultiply arrayPart : multiplyTypes) {
            long result = arrayPart.factorial(overflowNum);
            assertEquals(-1, result, "Произошло переполнение");
        }
    }
}


