package home_work_5.api;

import java.util.Iterator;
import java.util.List;

public class RemovalUtil {

    public static <T> void removeAllWithIterator(List<T> list) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static <T> long countDurationOfRemovalWithIterator(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }

        long startTime = System.currentTimeMillis();
        removeAllWithIterator(list);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


    public static <T> void removeAllWithClear(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("Список пуст");
        }
        list.clear();
    }

    public static <T> long countDurationOfRemovalWithClear(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }

        long startTime = System.currentTimeMillis();
        removeAllWithClear(list);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
