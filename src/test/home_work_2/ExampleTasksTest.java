package test.home_work_2;

import home_work_2.loops.ExampleTasks;
import org.junit.jupiter.api.Test;

import static home_work_2.loops.overflowCheckUtils.ReversedOverflow.checkOverflow;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTasksTest {
    @Test
    public void notNaturalInputTest() {
        boolean result = ExampleTasks.isNatural(-1);
        assertEquals(false, result, "-1 - ненатуральное число");
    }

    @Test
    public void zeroInputTest() {
        boolean result = ExampleTasks.isNatural(0);
        assertEquals(false, result, "0 - ненатуральное число");
    }

    @Test
    public void findMaxDigitNegativeInputTest() {
        int result = ExampleTasks.findMaxDigit(-1);
        assertEquals(1, result, "Самая большая цифра считается без учета знака минус перед числом");
    }

    @Test
    public void findMaxDigitZeroInputTest() {
        int result = ExampleTasks.findMaxDigit(0);
        assertEquals(0, result, "0 - самое большое число при отсутствии иных");
    }

    @Test
    public void findMaxDigitAnyZeroInputTest() {
        int result = ExampleTasks.findMaxDigit(000000);
        assertEquals(0, result, "0 - самое большое число при отсутствии иных");
    }

    @Test
    public void findMaxDigit1DigitInputTest() {
        int result = ExampleTasks.findMaxDigit(2);
        assertEquals(2, result, "Если число состоит из одной цифры, то оно и является самой большой цифрой");
    }

    @Test
    public void findMaxDigit2DigitsInputTest() {
        int result = ExampleTasks.findMaxDigit(23);
        assertEquals(3, result, "Ошибка при обработке 23");
    }

    @Test
    public void findMaxDigit3DigitsInputTest() {
        int result = ExampleTasks.findMaxDigit(182);
        assertEquals(8, result, "Ошибка при обработке 182");
    }

    @Test
    public void findMaxDigit2EqualDigitsInputTest() {
        int result = ExampleTasks.findMaxDigit(22);
        assertEquals(2, result, "Если число состоит из одинаковых цифр, то эта цифра и является самой большой цифрой");
    }

    @Test
    public void findMaxDigit2EqualDigitsBigNumInputTest() {
        int result = ExampleTasks.findMaxDigit(2128784);
        assertEquals(8, result, "Если 2 цифры одинаковые, то выбирается одно из них");
    }

    @Test
    public void evenProbabilityCheck() {
        assertTrue(ExampleTasks.EvenProbabilityCheck() >= 40 && ExampleTasks.EvenProbabilityCheck() <= 60,
                "Вероятность должна быть в районе 50%");
    }

    @Test
    public void countZeroInputOddEvenDigits() {
        int[][] expected = {{0, 0}, {}, {}};
        int[][] actual = ExampleTasks.countOddEvenDigits(0);
        assertArrayEquals(expected, actual, "0 не является ни четным, ни нечетным");
    }

    @Test
    public void countOneOddDigitInputOddEvenDigits() {
        int[][] expected = {{1, 0}, {1}, {}};
        int[][] actual = ExampleTasks.countOddEvenDigits(1);
        assertArrayEquals(expected, actual, "Ошибка при обработке 1");
    }

    @Test
    public void countOneEvenDigitInputOddEvenDigits() {
        int[][] expected = {{0, 1}, {}, {2}};
        ;
        int[][] actual = ExampleTasks.countOddEvenDigits(2);
        assertArrayEquals(expected, actual, "Ошибка при обработке 2");
    }

    @Test
    public void counTwoDigitsInputOddEvenDigits() {
        int[][] expected = {{1, 1}, {1}, {2}};
        int[][] actual = ExampleTasks.countOddEvenDigits(12);
        assertArrayEquals(expected, actual, "Ошибка при обработке 12");
    }

    @Test
    public void countFourDigitsInputOddEvenDigits() {
        int[][] expected = {{2, 2}, {1, 3}, {4, 2}};
        int[][] actual = ExampleTasks.countOddEvenDigits(2314);
        assertArrayEquals(expected, actual, "Ошибка при обработке 2314");
    }

    @Test
    public void showFibonacci1Input() {
        String res = ExampleTasks.showFibonacci(1);
        assertEquals("[1]", res, "Неправильно выведен в консоль 1 элемент ряда Фибоначчи");
    }

    @Test
    public void showFibonacci2Input() {
        String res = ExampleTasks.showFibonacci(2);
        assertEquals("[1, 2]", res, "Неправильно выведены в консоль 2 элемента ряда Фибоначчи");
    }

    @Test
    public void showFibonacci4Input() {
        String res = ExampleTasks.showFibonacci(4);
        assertEquals("[1, 2, 3, 5]", res, "Неправильно выведены в консоль 4 элемента ряда Фибоначчи");
    }


    @Test
    public void showFibonacciOverflowInput() {
        assertThrows(ArithmeticException.class, () -> {
            ExampleTasks.showFibonacci(46);
        });
    }

    @Test
    public void falseRangeTest(){
        boolean res = ExampleTasks.checkFalseRange(5,2);
        assertEquals(true, res, "Первое число должно быть меньше второго");
    }

    @Test
    public void falseIntervalTest(){
        boolean res = ExampleTasks.checkFalseInterval(2, 5, 7);
        assertEquals(true, res, "Неверная обработка случая с слишком большим шагом");
    }

    @Test
    public void sameDigitInputLineOfNumsTest(){
        String res = ExampleTasks.lineOfNums(1,1,1);
        assertEquals("1", res, "Неверная обработка случая ввода одинаковых стартового и конечного чисел");
    }

    @Test
    public void difDigitInputLineOfNumsTest(){
        String res = ExampleTasks.lineOfNums(1,4,2);
        assertEquals("1 3", res, "Неверная обработка ввода");
    }

    @Test
    public void oneDigitReversedNumTest(){
        int res = ExampleTasks.reversedNum(1);
        assertEquals(1, res, "Неверная обработка числа из одной цифры");
    }

    @Test
    public void twoDigitReversedNumTest(){
        int res = ExampleTasks.reversedNum(12);
        assertEquals(21, res, "Неверная обработка числа из двух цифр");
    }


    @Test
    public void threeDigitReversedNumTest(){
        int res = ExampleTasks.reversedNum(123);
        assertEquals(321, res, "Неверная обработка числа из трех цифр");
    }

    @Test
    public void maxReversedNumTest(){
       assertThrows(IllegalArgumentException.class, () -> {
           checkOverflow(String.valueOf(Integer.MAX_VALUE));});
    }
}
