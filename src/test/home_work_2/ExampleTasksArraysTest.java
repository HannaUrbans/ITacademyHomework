package test.home_work_2;

import home_work_2.arrays.ExampleTasksArrays;
import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTasksArraysTest {
    static int size = 50;
    static int maxValueExclusion = 100;
    static int[] randomResultArray = ArraysUtils.arrayRandom(size, maxValueExclusion);
    static int[] notRandomArray = new int[size];

    /**
     * в идеале переписать метод arrayRandom, чтобы принимал в качестве аргументов и мин.возможное вводимое значение элемента
     * в данных тестах мин возможное значение элемента 0, случаи отрицательного ввода не тестируются, поскольку мин возможное значение не вводится вручную
     */

    @Test
    public void checkArraySizeSumEvenPosElemsTest() {
        assertEquals(size, randomResultArray.length, "Размер массива должен быть равен 50");
    }

    @Test
    public void checkMaxDigitSumEvenPosElemsTest() {
        boolean maxDigitLessThan100 = true;
        for (int value : randomResultArray) {
            if (value > maxValueExclusion) {
                maxDigitLessThan100 = false;
                break;
            }
        }
        assertTrue(maxDigitLessThan100, "Каждый элемент массива должен быть не больше 100");
    }

    @Test
    public void zeroCaseEvenPosElemsTest() {
        Arrays.fill(notRandomArray, 0);
        int res = ExampleTasksArrays.sumEvenPosElems(notRandomArray);
        assertEquals(0, res, "Неверная обработка массива, состоящего из нулей");
    }

    @Test
    public void noEvenSumEvenPosElemsTest() {
        Arrays.fill(notRandomArray, 1);
        int res = ExampleTasksArrays.sumEvenPosElems(notRandomArray);
        assertEquals(0, res, "Неверная обработка массива, состоящего из нечетных чисел");
    }

    @Test
    public void minEvenDigitsSumEvenPosElemsTest() {
        Arrays.fill(notRandomArray, 2);
        int res = ExampleTasksArrays.sumEvenPosElems(notRandomArray);
        assertEquals(100, res, "Неверная обработка массива, состоящего из всех четных чисел");
    }

    @Test
    public void min1EvenDigitSumEvenPosElemsTest() {
        Arrays.fill(notRandomArray, 1);
        notRandomArray[0] = 2;
        int res = ExampleTasksArrays.sumEvenPosElems(notRandomArray);
        assertEquals(2, res, "Неверная обработка массива");
    }

    @Test
    public void min2EvenDigitsSumEvenPosElemsTest() {
        Arrays.fill(notRandomArray, 1);
        notRandomArray[0] = 2;
        notRandomArray[1] = 2;
        int res = ExampleTasksArrays.sumEvenPosElems(notRandomArray);
        assertEquals(4, res, "Неверная обработка массива");
    }

    @Test
    public void min3SumEvenPosElemsTest() {
        Arrays.fill(notRandomArray, 1);
        notRandomArray[0] = 2;
        notRandomArray[1] = 4;
        notRandomArray[2] = 6;
        int res = ExampleTasksArrays.sumEvenPosElems(notRandomArray);
        assertEquals(12, res, "Неверная обработка массива");
    }

    @Test
    public void maxEvenDigitsSumEvenPosElemsTest() {
        Arrays.fill(notRandomArray, 100);
        int res = ExampleTasksArrays.sumEvenPosElems(notRandomArray);
        assertEquals(5000, res, "Неверная обработка массива, состоящего из всех четных чисел");
    }

    @Test
    public void zeroCasefindMaxArrayEvenElemTest() {
        Arrays.fill(notRandomArray, 0);
        int res = ExampleTasksArrays.findMaxArrayEvenElem(notRandomArray);
        assertEquals(0, res, "Неверная обработка массива из нулей");
    }

    @Test
    public void minFindMaxArrayEvenElemTest() {
        Arrays.fill(notRandomArray, 1);
        int res = ExampleTasksArrays.findMaxArrayEvenElem(notRandomArray);
        assertEquals(1, res, "Неверная обработка массива, состоящего из одинаковых чисел");
    }

    @Test
    public void oddMaxElemCaseFindMaxArrayEvenElemTest() {
        Arrays.fill(notRandomArray, 2);
        notRandomArray[0] = 0;
        notRandomArray[49] = 3;
        int res = ExampleTasksArrays.findMaxArrayEvenElem(notRandomArray);
        assertEquals(2, res, "Неверная обработка условия задачи");
    }

    @Test
    public void evenMaxElemCaseFindMaxArrayEvenElemTest() {
        Arrays.fill(notRandomArray, 2);
        notRandomArray[0] = 0;
        notRandomArray[48] = 3;
        int res = ExampleTasksArrays.findMaxArrayEvenElem(notRandomArray);
        assertEquals(3, res, "Неверная обработка массива, состоящего из разных чисел");
    }

    @Test
    public void maxFindMaxArrayEvenElemTest() {
        Arrays.fill(notRandomArray, 100);
        int res = ExampleTasksArrays.findMaxArrayEvenElem(notRandomArray);
        assertEquals(100, res, "Неверная обработка массива, состоящего из одинаковых максимально возможных чисел");
    }

    @Test
    public void zeroCasefindLessThanAverageTest() {
        Arrays.fill(notRandomArray, 0);
        String res = ExampleTasksArrays.findLessThanAverage(notRandomArray);
        assertEquals("", res, "Неверная обработка массива, состоящего из нулей");
    }

    @Test
    public void sameDigitsCasefindLessThanAverageTest() {
        Arrays.fill(notRandomArray, 1);
        String res = ExampleTasksArrays.findLessThanAverage(notRandomArray);
        assertEquals("", res, "Неверная обработка массива, состоящего из одинаковых чисел");
    }

    @Test
    public void minDigitsCasefindLessThanAverageTest() {
        Arrays.fill(notRandomArray, 1);
        notRandomArray[0] = 0;
        String res = ExampleTasksArrays.findLessThanAverage(notRandomArray);
        assertEquals("0", res, "Неверная обработка массива");
    }

    @Test
    public void minTwoDigitsCasefindLessThanAverageTest() {
        Arrays.fill(notRandomArray, 2);
        notRandomArray[0] = 0;
        notRandomArray[1] = 1;
        String res = ExampleTasksArrays.findLessThanAverage(notRandomArray);
        assertEquals("0, 1", res, "Неверная обработка массива");
    }

    @Test
    public void maxTwoDigitsCasefindLessThanAverageTest() {
        Arrays.fill(notRandomArray, 100);
        notRandomArray[0] = 99;
        notRandomArray[1] = 98;
        String res = ExampleTasksArrays.findLessThanAverage(notRandomArray);
        assertEquals("99, 98", res, "Неверная обработка массива");
    }

    @Test
    public void zeroCasefindMinArrayElemTest() {
        Arrays.fill(notRandomArray, 0);
        int[] exp = {0, 0};
        int[] res = ExampleTasksArrays.findMinArrayElem(notRandomArray);
        assertArrayEquals(exp, res, "Неверная обработка массива, состоящего из нулей");
    }

    @Test
    public void sameDigitsfindMinArrayElemThanAverageTest() {
        Arrays.fill(notRandomArray, 1);
        int[] exp = {1, 1};
        int[] res = ExampleTasksArrays.findMinArrayElem(notRandomArray);
        assertArrayEquals(exp, res, "Неверная обработка массива, состоящего из одинаковых чисел");
    }

    @Test
    public void onlyOneMinDigitCasefindMinArrayElemTest() {
        Arrays.fill(notRandomArray, 1);
        notRandomArray[0] = 0;
        int[] exp = {0};
        int[] res = ExampleTasksArrays.findMinArrayElem(notRandomArray);
        assertArrayEquals(exp, res, "Неверная обработка массива только с одним мин числом");
    }

    @Test
    public void twoMinDigitsCasefindMinArrayElemTest() {
        Arrays.fill(notRandomArray, 2);
        notRandomArray[0] = 1;
        notRandomArray[1] = 1;
        int[] exp = {1, 1};
        int[] res = ExampleTasksArrays.findMinArrayElem(notRandomArray);
        assertArrayEquals(exp, res, "Неверная обработка массива");
    }

    @Test
    public void zeroAndOneCasefindMinArrayElemTest() {
        Arrays.fill(notRandomArray, 0);
        int[] exp = {0, 0};
        int[] res = ExampleTasksArrays.findMinArrayElem(notRandomArray);
        assertArrayEquals(exp, res, "Неверная обработка массива, состоящего из нулей");
    }

    @Test
    public void zeroCaseMakeArraySmallTest() {
        Arrays.fill(notRandomArray, 0);
        int[] arrayAfterDelete = new int[notRandomArray.length];
        Arrays.fill(arrayAfterDelete, 0);
        int[] exp = arrayAfterDelete;
        int[] res = ExampleTasksArrays.makeArraySmall(notRandomArray, 0, 0);
        assertArrayEquals(exp, res, "Неверная обработка массива, состоящего из нулей");
    }

    @Test
    public void minDeleteCaseSameDigitsIntervalMakeArraySmallTest() {
        Arrays.fill(notRandomArray, 1);
        notRandomArray[0] = 0;
        notRandomArray[1] = 0;
        int[] arrayAfterDelete = new int[notRandomArray.length];
        Arrays.fill(arrayAfterDelete, 1);
        arrayAfterDelete[48] = 0;
        arrayAfterDelete[49] = 0;
        int[] exp = arrayAfterDelete;
        int[] res = ExampleTasksArrays.makeArraySmall(notRandomArray, 0, 0);
        assertArrayEquals(exp, res, "Неверная обработка массива при удалении чисел из максимально узакого интервала (одна цифра)");
    }

    @Test
    public void minDeleteCaseNotSameDigitsIntervalMakeArraySmallTest() {
        Arrays.fill(notRandomArray, 2);
        notRandomArray[0] = 0;
        notRandomArray[1] = 1;
        int[] arrayAfterDelete = new int[notRandomArray.length];
        Arrays.fill(arrayAfterDelete, 2);
        arrayAfterDelete[48] = 0;
        arrayAfterDelete[49] = 0;
        int[] exp = arrayAfterDelete;
        int[] res = ExampleTasksArrays.makeArraySmall(notRandomArray, 0, 1);
        assertArrayEquals(exp, res, "Неверная обработка массива");
    }

    @Test
    public void averageDeleteCaseMakeArraySmallTest() {
        Arrays.fill(notRandomArray, 6);
        notRandomArray[0] = 7;
        notRandomArray[1] = 1;
        notRandomArray[2] = 7;
        notRandomArray[3] = 1;
        notRandomArray[4] = 5;
        notRandomArray[5] = 4;
        notRandomArray[6] = 3;
        notRandomArray[7] = 3;
        int[] arrayAfterDelete = new int[notRandomArray.length];
        Arrays.fill(arrayAfterDelete, 6);
        arrayAfterDelete[0] = 7;
        arrayAfterDelete[1] = 1;
        arrayAfterDelete[2] = 7;
        arrayAfterDelete[3] = 1;
        arrayAfterDelete[4] = 6;
        arrayAfterDelete[5] = 6;
        arrayAfterDelete[6] = 6;
        arrayAfterDelete[7] = 6;
        arrayAfterDelete[46] = 0;
        arrayAfterDelete[47] = 0;
        arrayAfterDelete[48] = 0;
        arrayAfterDelete[49] = 0;
        int[] exp = arrayAfterDelete;
        int[] res = ExampleTasksArrays.makeArraySmall(notRandomArray, 2, 5);
        assertArrayEquals(exp, res, "Неверная обработка массива");
    }

    @Test
    public void maxDeleteCaseMakeArraySmallTest() {
        Arrays.fill(notRandomArray, 100);
        int[] arrayAfterDelete = new int[notRandomArray.length];
        Arrays.fill(arrayAfterDelete, 0);
        int[] exp = arrayAfterDelete;
        int[] res = ExampleTasksArrays.makeArraySmall(notRandomArray, 0, 100);
        assertArrayEquals(exp, res, "Неверная обработка массива, состоящего из нулей");
    }

    @Test
    public void zeroCasefindDigitSumTest() {
        Arrays.fill(notRandomArray, 0);
        long res = ExampleTasksArrays.findDigitSum(notRandomArray);
        assertEquals(0, res, "Неверная обработка массива, состоящего из нулей");
    }

    @Test
    public void minPossibleSumCasefindDigitSumTest() {
        Arrays.fill(notRandomArray, 0);
        notRandomArray[0] = 1;
        long res = ExampleTasksArrays.findDigitSum(notRandomArray);
        assertEquals(1, res, "Неверно вычислена мин возможная сумма цифр");
    }

    @Test
    public void maxPossibleSumCasefindDigitSumTest() {
        Arrays.fill(notRandomArray, 100);
        long res = ExampleTasksArrays.findDigitSum(notRandomArray);
        assertEquals(5000, res, "Неверно вычислена макс возможная сумма цифр");
    }

    @Test
    public void sameDigitsCasefindDigitSumTest() {
        Arrays.fill(notRandomArray, 1);
        long res = ExampleTasksArrays.findDigitSum(notRandomArray);
        assertEquals(50, res, "Неверно вычислена сумма цифр");
    }

    @Test
    public void notSameDigitsCasefindDigitSumTest() {
        Arrays.fill(notRandomArray, 1);
        notRandomArray[0]=0;
        notRandomArray[1]=25;
        notRandomArray[2]=3;
        long res = ExampleTasksArrays.findDigitSum(notRandomArray);
        assertEquals(75, res, "Неверно вычислена сумма цифр");
    }

    @Test
    public void isIntOverlowCase(){
        int sum = Integer.MAX_VALUE + 100;
        assertThrows(ArithmeticException.class, () -> ExampleTasksArrays.isIntOverflow(sum));
    }

    @Test
    public void isLongOverlowCase(){
        long sum = Long.MAX_VALUE + 100;
        assertThrows(ArithmeticException.class, () -> ExampleTasksArrays.isLongOverflow(sum));

    }
}
