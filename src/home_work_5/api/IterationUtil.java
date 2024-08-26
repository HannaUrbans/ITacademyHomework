package home_work_5.api;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IterationUtil {

    public static <T> void iterateWithIteratorIteration(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }

    public static <T> long countDurationOfIteratorIteration(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Коллекция пуста");
        }

        long startTime = System.currentTimeMillis();
        iterateWithIteratorIteration(collection);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    //только для List
    public static <T> void iterateWithForLoop(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }

    public static <T> long countDurationOfForLoopIteration(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Коллекция пуста");
        }

        long startTime = System.currentTimeMillis();
        iterateWithForLoop(list);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
