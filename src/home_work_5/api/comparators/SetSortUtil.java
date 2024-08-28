package home_work_5.api.comparators;

import java.util.*;

import static home_work_5.api.comparators.QuickSortUtil.sortByQuickSort;

public class SetSortUtil {

    /**
     * Метод для сортировки сетов посредством конвертации сета в массив. Используется стандартная сортировка массивов и компаратор
     *
     * @param set        - список для сортировки
     * @param clazz      - класс типа элементов сета, используемый для создания массива
     * @param comparator - компаратор для сравнения
     * @param <T>        - тип элементов сета
     */
    public static <T> void sortWithConvertationIntoArray(Set<T> set, Class<T> clazz, Comparator<? super T> comparator) {
        if (set == null || clazz == null || comparator == null) {
            throw new IllegalArgumentException("Аргумент не может быть null");
        }
        // Создание массива нужного типа и размера
        T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, set.size());
        // Заполнение массива элементами из сета
        set.toArray(array);
        // Сортировка массива с использованием предоставленного компаратора
        Arrays.sort(array, comparator);
    }

    /**
     * Метод для сортировки сетов посредством конвертации сета в LinkedList и стандартной сортировки
     * @param set        - список для сортировки
     * @param comparator - компаратор для сравнения
     * @param <T>        - тип элементов сета
     */
    public static <T> void sortWithConvertationIntoListStandardSort(Set<T> set, Comparator<? super T> comparator) {
        if (set == null || comparator == null) {
            throw new IllegalArgumentException("Аргумент не может быть null");
        }

        List<T> sortedlist = new LinkedList<>(set);
        sortedlist.sort(comparator);
    }

    /**
     * Метод для сортировки сетов посредством конвертации сета в LinkedList и быстрой сортировки
     * @param set        - список для сортировки
     * @param comparator - компаратор для сравнения
     * @param <T>        - тип элементов сета
     */

    public static <T> void sortWithConvertationIntoListQuickSort(Set<T> set, Comparator<? super T> comparator) {
        if (set == null || comparator == null) {
            throw new IllegalArgumentException("Аргумент не может быть null");
        }

        List<T> sortedlist = new LinkedList<>(set);
        sortByQuickSort(sortedlist, 0, set.size() - 1, comparator);
    }

    /**
     * Метод для сортировки сетов посредством конвертации сета в TreeSet
     * @param set        - список для сортировки
     * @param comparator - компаратор для сравнения
     * @param <T>        - тип элементов сета
     */
    public static <T> void sortWithConvertationIntoTreeset(Set<T> set, Comparator<? super T> comparator) {
        if (set == null || comparator == null) {
            throw new IllegalArgumentException("Аргумент не может быть null");
        }

        Set<T> sortedSet = new TreeSet<T>(comparator);
        sortedSet.addAll(set);
    }
}
