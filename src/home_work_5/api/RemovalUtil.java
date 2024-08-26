package home_work_5.api;

import java.util.Collection;
import java.util.Iterator;

public class RemovalUtil {

    public static <T> void removeAllWithIterator(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static <T> long countDurationOfRemovalWithIterator(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Коллекция пуста");
        }

        long startTime = System.currentTimeMillis();
        removeAllWithIterator(collection);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


    public static <T> void removeAllWithClear(Collection<T> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Коллекция пуста");
        }
        collection.clear();
    }

    public static <T> long countDurationOfRemovalWithClear(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Коллекция пуста");
        }

        long startTime = System.currentTimeMillis();
        removeAllWithClear(collection);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
