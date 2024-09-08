package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

import static home_work_2.loops.ExampleTasks.checkFalseRange;

public class ExampleTasksArrays {
    public static void main(String[] args) {
        int[] myArray = ArraysUtils.arrayRandom(50, 100);
        System.out.println("Это массив: " + Arrays.toString(myArray));

        System.out.println("Это сумма четных положительных элементов: " + sumEvenPosElems(myArray));

        System.out.println("Это максимальный из элементов массива с четными индексами: " + findMaxArrayEvenElem(myArray));

        System.out.println("Это элементы массива, которые меньше среднего арифметического: " + findLessThanAverage(myArray));

        System.out.println("Это два минимальных элемента массива: " + Arrays.toString(findMinArrayElem(myArray)));

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число диапазона");
        int firstNum = in.nextInt();
        System.out.println("Введите последнее число диапазона");
        int lastNum = in.nextInt();

        if (checkFalseRange(firstNum, lastNum)) {
            System.out.println("Последнее число должно быть больше первого");
            return;
        } else {
            System.out.println("Это массив, из которого удалили цифры от " + firstNum + " до " + lastNum + ": " + Arrays.toString(makeArraySmall(myArray, firstNum, lastNum)));
        }

        try {
            findDigitSum(myArray);
            System.out.println("Это сумма цифр массива: " + findDigitSum(myArray));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    //2.4.1. Сумма четных положительных элементов массива
    public static int sumEvenPosElems(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0 && myArray[i] % 2 == 0) {
                sum += myArray[i];
            }
            isIntOverflow(sum);
        }
        return sum;
    }

    //2.4.2. Максимальный из элементов массива с четными индексами
    public static int findMaxArrayEvenElem(int[] myArray) {
        int maxValue = Integer.MIN_VALUE; //не -1, потому что -1 теоретически может получиться, если массив будет содержать и отрицат. значения элементов
        for (int i = 0; i < myArray.length; i += 2) {
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
        }
        return maxValue;
    }

    //2.4.3. Элементы массива, которые меньше среднего арифметического
    public static String findLessThanAverage(int[] myArray) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        double average = (double) sum / myArray.length;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < average) {
                if (sb.length() > 0) { //добавлем запятые ПЕРЕД
                    sb.append(", ");
                }
                sb.append(myArray[i]);
            }

        }
        return sb.toString();
    }

    //2.4.4. Найти два наименьших (минимальных) элемента массива
    public static int[] findMinArrayElem(int[] myArray) {
        int minValue1 = Integer.MAX_VALUE;//не -1, потому что -1 теоретически может получиться, если массив будет содержать и отрицат. значения элементов
        int minValue2 = Integer.MAX_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] <= minValue1) {
                minValue2 = minValue1;
                minValue1 = myArray[i];
            }
        }
        if (minValue2 != Integer.MAX_VALUE) {
            return new int[]{minValue1, minValue2};
        } else {
            return new int[]{minValue1};
        }
    }

    //2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
    public static int[] makeArraySmall(int[] myArray, int firstNumtoDelete, int lastNumToDelete) {

        int newArrayLength = 0;

        //узнаем длину нового массива
        for (int i = 0; i < myArray.length; i++) {
            if (!(myArray[i] >= firstNumtoDelete && myArray[i] <= lastNumToDelete)) {
                newArrayLength++;
            }
        }

        int[] newArray = new int[myArray.length];
        for (int i = 0, k = 0; i < myArray.length; i++) {
            if (!(myArray[i] >= firstNumtoDelete && myArray[i] <= lastNumToDelete)) {
                newArray[k] = myArray[i];
                k++;
            }
        }

        //заполняем нулями разницу между длиной короткого и длинного массива
        for (int i = newArrayLength; i < myArray.length; i++) {
            newArray[i] = 0;
        }

        return newArray;
    }


    //2.4.6. Сумма цифр массива
    public static long findDigitSum(int[] myArray) {
        long digitSum = 0;
        for (int number : myArray) {
            digitSum += number;
        }
        isLongOverflow(digitSum);
        return digitSum;
    }

    //этот метод только для сложения чисел от 0!
    public static void isIntOverflow(int sum) {
        if (sum < 0) {
            throw new ArithmeticException("Сумма превышает границы формата int");
        }
    }

    //этот метод только для сложения чисел от 0!
    public static void isLongOverflow(long sum) {
        if (sum < 0) {
            throw new ArithmeticException("Сумма превышает границы формата long");
        }
    }
}
