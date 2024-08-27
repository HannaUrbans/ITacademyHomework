package home_work_5.api;

import java.util.*;

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

    public static <T> void iterateWithConvertationIntoArray(Collection<T> collection, Class<T> clazz) {
        T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, collection.size());
        collection.toArray(array);
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
        }
    }

    public static <T> long countDurationOfWithConvertationIntoArrayIteration(Collection<T> collection, Class<T> clazz) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Коллекция пуста");
        }

        long startTime = System.currentTimeMillis();
        iterateWithConvertationIntoArray(collection, clazz);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
