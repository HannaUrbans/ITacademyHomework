package home_work_5.folderToCorrect.api.comparators;

import java.util.Comparator;
import java.util.List;

/**
 * Выбираем опорный элемент
 * Разделяем коллекцию на две части
 * Метод рекурсивной сортировки:
 * Рекурсивно сортируем подмножество элементов слева от опорного элемента (элементы меньшие или равные опорному).
 * Рекурсивно сортируем подмножество элементов справа от опорного элемента (элементы большие опорного).
 * Базовый случай рекурсии - подмножество имеет один или ноль элементов (оно уже отсортировано) (low < high)
 * low - индекс начала текущего сегмента массив
 * high - индекс конца текущего сегмента массив
 */

public class QuickSortUtil {

    /**
     * Метод для быстрой сортировки коллекций. Используется вместо стандартного способа сортировки, делит подмассив на списки
     * Рекурсивная сортировка работает, пока в подмассиве не останется один или 0 элементов
     * @param list - список для сортировки
     * @param left - индекс, с которого начинается сортировка в текущем вызове метода (начало диапазона)
     * @param right - индекс, на котором заканчивается сортировка в текущем вызове метода (конец подмассива)
     * @param comparator - компаратор для сравнения
     * @param <T> - тип элементов списка
     */
    public static <T> void sortByQuickSort(List<T> list, int left, int right, Comparator<? super T> comparator) {
        if (left < right) {
            // Выбор опорного элемента
            T pivot = list.get(right);
            // Разделение списка на две части и получение индекса опорного элемента
            int pivotIndex = partition(list, left, right, pivot, comparator);
            // Рекурсивная сортировка левой части
            sortByQuickSort(list, left, pivotIndex - 1, comparator);
            // Рекурсивная сортировка правой части
            sortByQuickSort(list, pivotIndex + 1, right, comparator);
        }
    }

    /** Метод для разделения списка на две части относительного опорного элемента
     *
     * @param list - список для сортировки
     * @param left - индекс начала сортируемого диапазона
     * @param right - индекс конца сортируемого диапазона
     * @param pivot - элемент, относительно котороого идет сортировка
     * @param comparator - компаратор для сравнения
     * @return - индекс на котором опорный элемент находится после разделения
     * @param <T> - тип элементов списка
     */
    private static <T> int partition(List<T> list, int left, int right, T pivot, Comparator<? super T> comparator) {

        while (true) {
            while (left <= right && comparator.compare(list.get(left), pivot) < 0) {
                left++;
            }

            while (right >= left && comparator.compare(list.get(right), pivot) > 0) {
                right--;
            }

            if (left >= right) {
                return right;
            }

            T temporary = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temporary);

            left++;
            right--;

        }
    }
}