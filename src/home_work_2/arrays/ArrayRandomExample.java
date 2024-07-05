package home_work_2.arrays;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class ArrayRandomExample {
    /**
     * Пример в отдельном классе с main. int[] container = arrayRandom(5, 100).
     * Результат: В методе arrayRandom будет создан массив размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.
     */

    public static void main(String[] args) {

    int[] container = arrayRandom(5, 100);
        System.out.println(Arrays.toString(container));
    }

}
