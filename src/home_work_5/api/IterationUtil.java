package home_work_5.api;

import java.util.Iterator;
import java.util.List;

public class IterationUtil {
    public static <T> void iterateWithIteratorIteration(List<T> list) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }

    public static <T> long countDurationOfIteratorIteration(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }

        long startTime = System.currentTimeMillis();
        iterateWithIteratorIteration(list);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static <T> void iterateWithForLoop(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }

    public static <T> long countDurationOfForLoopIteration(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }

        long startTime = System.currentTimeMillis();
        iterateWithForLoop(list);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    //этот метод сделала для себя, он не нужен по условию задачи
    public static <T> long countDurationOfForEachIteration(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }
        long startTime = System.currentTimeMillis();
        for (T item : list) {

        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
