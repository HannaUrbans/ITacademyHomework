package home_work_5.folderToCorrect.api.comparators;

import java.util.Comparator;
import java.util.List;

public class BubbleSortUtil {
    /**
     * Метод пузырьковой сортировки для использования вместо стандартного
     * @param list - список для сортировки
     * @param comparator - компаратор для сравнения
     * @param <T> - тип элементов списка
     */
    public static <T> void bubbleSort(List<T> list, Comparator<? super T> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                T element1 = list.get(j);
                T element2 = list.get(j + 1);

                if (comparator.compare(element1, element2) > 0) {

                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}

