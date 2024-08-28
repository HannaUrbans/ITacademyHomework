package home_work_5.api;

import java.util.Collection;
import java.util.Iterator;

public class RemovalUtil {

    /**
     * Метод для удаления элементов с помощью Итератора
     * @param collection - коллекция для итерирования
     * @param <T> - тип элементов в коллекции
     */
    public static <T> void removeAllWithIterator(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    /**
     * Метод для подсчета времени, затраченного на удаление элементов с помощью Итератора
     * @param collection - коллекция для итерирования
     * @param <T> - тип элементов в коллекции
     * @return - результат в мс
     */
    public static <T> long countDurationOfRemovalWithIterator(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Коллекция пуста");
        }

        long startTime = System.currentTimeMillis();
        removeAllWithIterator(collection);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    /**
     * Метод для удаления элементов с помощью метода clear
     * @param collection - коллекция для итерирования
     * @param <T> - тип элементов в коллекции
     */
    public static <T> void removeAllWithClear(Collection<T> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Коллекция пуста");
        }
        collection.clear();
    }

    /**
     * Метод для подсчета времени, затраченного на удаление элементов с помощью метода clear
     * @param collection - коллекция для итерирования
     * @param <T> - тип элементов в коллекции
     * @return - результат в мс
     */
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
