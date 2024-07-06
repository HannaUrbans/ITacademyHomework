package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

import static home_work_2.utils.ArrayPrint.printArray;
import static home_work_2.utils.SortsUtils.shake;
import static home_work_2.utils.SortsUtils.sort;

public class SortsMain {
    /**
     * После каждого теста в консоль вы должны распечатать сообщение формата
     * "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
     * Для преобразования массива в текст можно использовать класс Arrays.
     * 4.2.2. Для тестов используем предварительно созданные массивы:
     * 4.2.2.1. new int[]{1,2,3,4,5,6}
     * 4.2.2.2. new int[]{1,1,1,1}
     * 4.2.2.3. new int[]{9,1,5,99,9,9}
     * 4.2.2.4. new int[]{}
     * 4.2.2.5. new int[]{6,5,4,3,2,1}
     * 4.2.2 После предварительных тестов пишем тест с рандомным заполнением массива.
     * Вызывая ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100)) получить массив. Отсортировать.
     * 4.2.3 После теста с рандомно заполненным массивом пишем тест с массивом полученным через консоль.
     * Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Отсортировать.
     */

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] aBeforeChanges = Arrays.copyOf(a, a.length);

        System.out.print("Пузырьковая сортировка: ");
        printArray(a);
        System.out.print(" -> ");
        sort(a);
        printArray(a);
        System.out.println();

        a = Arrays.copyOf(aBeforeChanges, aBeforeChanges.length);

        System.out.print("Шейкерная сортировка: ");
        printArray(a);
        System.out.print(" -> ");
        shake(a);
        printArray(a);
        System.out.println();


        int[] b = new int[]{1, 1, 1, 1};
        int[] bBeforeChanges = Arrays.copyOf(b, b.length);

        System.out.print("Пузырьковая сортировка: ");
        printArray(b);
        System.out.print(" -> ");
        sort(b);
        printArray(b);
        System.out.println();

        b = Arrays.copyOf(bBeforeChanges, bBeforeChanges.length);

        System.out.print("Шейкерная сортировка: ");
        printArray(b);
        System.out.print(" -> ");
        shake(b);
        printArray(b);
        System.out.println();


        int [] c = new int[]{9,1,5,99,9,9};
        int[] cBeforeChanges = Arrays.copyOf(c, c.length);

        System.out.print("Пузырьковая сортировка: ");
        printArray(c);
        System.out.print(" -> ");
        sort(c);
        printArray(c);
        System.out.println();

        c = Arrays.copyOf(cBeforeChanges, cBeforeChanges.length);

        System.out.print("Шейкерная сортировка: ");
        printArray(c);
        System.out.print(" -> ");
        shake(c);
        printArray(c);
        System.out.println();


        int [] d = new int[]{};
        int[] dBeforeChanges = Arrays.copyOf(d, d.length);

        System.out.print("Пузырьковая сортировка: ");
        printArray(d);
        System.out.print(" -> ");
        sort(d);
        printArray(d);
        System.out.println();

        d = Arrays.copyOf(dBeforeChanges, dBeforeChanges.length);

        System.out.print("Шейкерная сортировка: ");
        printArray(d);
        System.out.print(" -> ");
        shake(d);
        printArray(d);
        System.out.println();

        int [] x = new int[]{6,5,4,3,2,1};
        int[] xBeforeChanges = Arrays.copyOf(x, x.length);

        System.out.print("Пузырьковая сортировка: ");
        printArray(x);
        System.out.print(" -> ");
        sort(x);
        printArray(x);
        System.out.println();

        x = Arrays.copyOf(xBeforeChanges, xBeforeChanges.length);

        System.out.print("Шейкерная сортировка: ");
        printArray(x);
        System.out.print(" -> ");
        shake(x);
        printArray(x);
        System.out.println();

        int [] y = ArraysUtils.arrayRandom(50, 100);
        int[] yBeforeChanges = Arrays.copyOf(y, y.length);

        System.out.print("Пузырьковая сортировка: ");
        printArray(y);
        System.out.print(" -> ");
        sort(y);
        printArray(y);
        System.out.println();

        y = Arrays.copyOf(yBeforeChanges, yBeforeChanges.length);

        System.out.print("Шейкерная сортировка: ");
        printArray(y);
        System.out.print(" -> ");
        shake(y);
        printArray(y);
        System.out.println();

        int [] z = ArraysUtils.arrayFromConsole();
        int[] zBeforeChanges = Arrays.copyOf(z, z.length);

        System.out.print("Пузырьковая сортировка: ");
        printArray(z);
        System.out.print(" -> ");
        sort(z);
        printArray(z);
        System.out.println();

        z = Arrays.copyOf(zBeforeChanges, zBeforeChanges.length);

        System.out.print("Шейкерная сортировка: ");
        printArray(z);
        System.out.print(" -> ");
        shake(z);
        printArray(z);
        System.out.println();
    }
}
