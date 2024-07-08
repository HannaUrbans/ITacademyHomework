package home_work_2.arrays;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class ArrayFromConsoleExample {
    public static void main(String[] args) {

        /**
         *  Пример в отдельном классе с main.
         *  int[] container = arrayFromConsole().
         *  Результат: В методе arrayFromConsole будет запрошена информация у пользователя, пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}.
         *  Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
         */

        int[] container = arrayFromConsole();
        if (container != null) {
            System.out.println(Arrays.toString(container));
        }
    }
}
