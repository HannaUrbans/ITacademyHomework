package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

/**
 * Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
 */

public class ArraysUtils {
    public static int[] arrayFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        in.nextLine(); //next() и nextInt() не считывают символ новой строки и оставляют его во входном потоке

        System.out.println("Введите элементы массива через запятую");
        String arrayEl = in.nextLine().trim();

        String[] elements = arrayEl.split(",");
        int[] inputArray = new int[size];

        if (size != elements.length) {
            System.out.println("Размер массива не совпадает с количеством введённых элементов");
            return null; //чтобы не выдавать массив с нулями после ошибки
        } else {
            for (int i = 0; i < size; i++) {
                inputArray[i] = Integer.parseInt(elements[i]);
            }
        }

        return inputArray;
    }

    /**
     * Написать метод public static int[] arrayRandom(int size, int maxValueExclusion).
     * Данный метод принимает два аргумента.
     * Первый (size) указывает размер массива который мы хотим получить.
     * Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
     */

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int [] myArray = new int[size];
        for (int i = 0; i <size; i++)
        {
            Random randomNumber = new Random();
            myArray [i] = randomNumber.nextInt(maxValueExclusion+1);
        }

        return myArray;
    }
}
/**
 *  for (int i = 0; i < size; i++) {
 *             array[i] = random.nextInt(max * 2 + 1) - max; // Генерация случайного числа от -max до max
 *         }
 */