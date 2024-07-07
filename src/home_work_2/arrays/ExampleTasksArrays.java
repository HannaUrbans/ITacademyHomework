package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

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
        if (lastNum <= firstNum)
        {
            System.out.println("Введите корректный интервал");
        }
        else {
            System.out.println("Это массив, из которого удалили цифры от " + firstNum + " до " + lastNum + ": " + Arrays.toString(MakeArraySmall(myArray, firstNum, lastNum)));
        }

        if (findDigitSum(myArray) == Long.MIN_VALUE) {
            System.out.println("Сумма превышает границы формата Long");
        } else {
            System.out.println("Это сумма цифр массива: " + findDigitSum(myArray));
        }

    }

    //2.4.1. Сумма четных положительных элементов массива
    public static int sumEvenPosElems(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (i > 0 && i % 2 == 0) {
                sum += i;
            }
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
        int minValue1 = Integer.MAX_VALUE;
        int minValue2 = Integer.MAX_VALUE;//не -1, потому что -1 теоретически может получиться, если массив будет содержать и отрицат. значения элементов
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] <= minValue1) {
                minValue2 = minValue1;
                minValue1 = myArray[i];
            }
        }
        return new int[]{minValue1, minValue2};
    }

    //2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
    public static int[] MakeArraySmall(int[] myArray, int firstNumtoDelete, int lastNumToDelete) {

        int newArrayLength = 0;
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

        for (int i = newArrayLength; i < myArray.length; i++) {
            newArray[i] = 0;
        }

        return newArray;
    }


    //2.4.6. Сумма цифр массива
    public static long findDigitSum(int[] myArray) {
        long digitSum = 0;
        for (int number : myArray) {

            String numberStr = String.valueOf(number);
            for (int i = 0; i < numberStr.length(); i++) {
                char digitChar = numberStr.charAt(i);
                int digit = Character.getNumericValue(digitChar);
                digitSum += digit;

                if (digitSum > Long.MAX_VALUE) {
                    digitSum = Long.MIN_VALUE;
                }
            }

        }
        return digitSum;
    }
}