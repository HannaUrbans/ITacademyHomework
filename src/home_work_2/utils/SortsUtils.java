package home_work_2.utils;

public class SortsUtils {
    /**
     * 4.1.1. Написать метод public static void sort(int[] arr).
     * Данный метод будет сортировать переданный ему массив при помощи алгоритма пузырьковая сортировка.
     */

    public static void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            boolean moved = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    moved = true;
                }
            }

            if (!moved) {
                break;
            }
        }
    }


    /**
     * 4.1.2. Написать метод public static void shake(int[] arr).
     * Данный метод будет сортировать переданный ему массив при помощи алгоритма шейкерная сортировка.
     */
    public static void shake(int[] arr) {
        int size = arr.length;
        boolean moved = true;
        int left = 0;
        int right = size - 1;

        while (moved) {
            moved = false;

            int i = left;
            while (i < right) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    moved = true;
                }
                i++;
            }
            right--;

            i = right;
            while (i > left) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    moved = true;
                }
                i--;
            }
            left++;
        }
    }
}

