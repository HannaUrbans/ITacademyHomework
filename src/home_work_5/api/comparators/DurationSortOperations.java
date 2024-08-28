package home_work_5.api.comparators;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static home_work_5.api.comparators.SetSortUtil.*;

public class DurationSortOperations {
    public static <T> long measureDurationStandardComparator(List<T> list, Comparator<? super T> comparator) {
        long start = System.currentTimeMillis();
        Collections.sort(list, comparator);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    /**
     * public static <T> long measureDurationBubbleComparator(List<T> list, Comparator<? super T> comparator) {
     * long start = System.currentTimeMillis();
     * BubbleSortUtil.bubbleSort(list, comparator);
     * long finish = System.currentTimeMillis();
     * return finish - start;
     * }
     */

    public static <T> long measureDurationQuickSortComparator(List<T> list, Comparator<? super T> comparator) {
        long start = System.currentTimeMillis();
        QuickSortUtil.sortByQuickSort(list, 0, list.size() - 1, comparator);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static <T> long measureSortWithConvertationIntoArray(Set<T> set, Class<T> clazz, Comparator<? super T> comparator) {
        long start = System.currentTimeMillis();
        sortWithConvertationIntoArray(set, clazz, comparator);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static <T> long measureSortWithConvertationIntoListStandardSort(Set<T> set, Comparator<? super T> comparator) {
        long start = System.currentTimeMillis();
        sortWithConvertationIntoListStandardSort(set, comparator);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static <T> long measureSortWithConvertationIntoListQuickSort(Set<T> set, Comparator<? super T> comparator) {
        long start = System.currentTimeMillis();
        sortWithConvertationIntoListQuickSort(set, comparator);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static <T> long measureSortWithConvertationIntoTreeset(Set<T> set, Comparator<? super T> comparator) {
        long start = System.currentTimeMillis();
        sortWithConvertationIntoTreeset(set, comparator);
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
