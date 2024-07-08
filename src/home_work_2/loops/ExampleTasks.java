package home_work_2.loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExampleTasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int a = in.nextInt();

        System.out.println("Наибольшая цифра числа " + a + ": " + findMaxDigit(a));

        System.out.print("Вероятность выпадения чётного числа: ");
        testEvenProbability();

        int[][] countedArray = countOddEvenDigits(a);
        System.out.print("Число " + a + " содержит ");
        System.out.print(countedArray[0][0] + " нечётных (");
        for (int i = countedArray[0][0] - 1; i >= 0; i--) {
            System.out.print(countedArray[1][i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.print(") и ");

        System.out.print(countedArray[0][1] + " чётных (");
        for (int i = countedArray[0][1] - 1; i >= 0; i--) {
            System.out.print(countedArray[2][i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(")");

        System.out.println("Сколько чисел ряда Фибоначчи вывести на экран?");
        int b = in.nextInt();
        if (!isNatural(b)) {
            System.out.println("Введите число больше нуля");
            return;
        }
        System.out.println("Число Фибоначчи до " + b + " числа: " + showFibonacci(b));

        System.out.println("Введите первое число ряда");
        int minNum = in.nextInt();
        if (!isNatural(minNum)) {
            System.out.println("Введите число больше нуля");
            return;
        }
        System.out.println("Введите последнее число ряда");
        int maxNum = in.nextInt();
        if (!isNatural(maxNum)) {
            System.out.println("Введите число больше нуля");
            return;
        }
        if (maxNum < minNum) {
            System.out.println("Последнее число должно быть больше первого");
            return;
        }
        System.out.println("Уточните шаг");
        int size = in.nextInt();
        if (!isNatural(size) || size > maxNum - minNum) {
            System.out.println("Введите корректный шаг");
            return;
        }
        System.out.println("Запрашиваемый ряд натуральных чисел от " + minNum + " до " + maxNum + " с шагом " + size + ": " + lineOfNums(minNum, maxNum, size));

        System.out.println("Введите число для отображения задом наперёд");
        int numToReverse = in.nextInt();
        if (!isNatural(numToReverse)) {
            System.out.println("Введите число больше нуля");
            return;
        }
        System.out.println("Перевёрнутое число: " + reversedNum(numToReverse));
    }

    //Найти наибольшую цифру натурального числа
    public static int findMaxDigit(int num) {
        int tmp = Math.abs(num);
        int maxDigit = -1;

        while (tmp != 0) {
            int current = tmp % 10;
            if (current > maxDigit) {
                maxDigit = current;
            }

            tmp /= 10;
        }

        return maxDigit;
    }

    //Вероятность четных случайных чисел
    public static void testEvenProbability() {
        int i = 0;
        Random random = new Random();
        for (int k = 0; k <= 1000; k++) {
            int randomNumber = random.nextInt();
            if (randomNumber % 2 == 0) {
                i++;
            }
        }
        double probability = (double) i / 1000 * 100;
        System.out.println(probability);
    }

    //Посчитать четные и нечетные цифры числа
    public static int[][] countOddEvenDigits(int numToCount) {
        int positiveNumToCount = Math.abs(numToCount);

        int numToCountLength;
        if (positiveNumToCount < 10) {
            numToCountLength = 1;
        } else {
            numToCountLength = (int) Math.floor(Math.log10(positiveNumToCount)) + 1;
        }

        int oddCounter = 0;
        int[] oddArray = new int[numToCountLength];
        int evenCounter = 0;
        int[] evenArray = new int[numToCountLength];

        while (positiveNumToCount != 0) {
            int current = positiveNumToCount % 10; //4%10=4;
            if (current % 2 == 0) {
                evenArray[evenCounter] = current;
                evenCounter++;
            } else {
                oddArray[oddCounter] = current;
                oddCounter++;
            }
            positiveNumToCount /= 10;
        }

        int[][] countedOddEven = new int[3][];
        countedOddEven[0] = new int[]{oddCounter, evenCounter};
        countedOddEven[1] = Arrays.copyOf(oddArray, oddCounter);
        countedOddEven[2] = Arrays.copyOf(evenArray, evenCounter);

        return countedOddEven;
    }

    //число Фибоначчи
    public static String showFibonacci(int num) {
        int numToEndWith = Math.abs(num);

        int[] fibArray = new int[numToEndWith];

        if (numToEndWith >= 1) {
            fibArray[0] = 1;
        }
        if (numToEndWith >= 2) {
            fibArray[1] = 2;
        }

        for (int i = 2; i < numToEndWith; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return Arrays.toString(fibArray);
    }

    // Вывести ряд чисел в диапазоне с шагом
    public static String lineOfNums(int minNum, int maxNum, int start) {
        StringBuilder sb = new StringBuilder();

        for (int i = minNum; i <= maxNum; i += start) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i);
        }

        return sb.toString();
    }

    //Переворот числа
    public static int reversedNum(int num) {
        String numString = Integer.toString(num);
        char[] charArray = numString.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        String reversedString = new String(charArray); //созадется строка из символов
        int reversedNum = Integer.parseInt(reversedString);

        return reversedNum;
    }

    public static boolean isNatural(int numToCheck) {
        return numToCheck > 0;
    }
}
