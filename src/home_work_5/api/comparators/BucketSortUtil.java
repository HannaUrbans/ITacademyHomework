package home_work_5.api.comparators;

import java.util.*;

public class BucketSortUtil {

    public static <T> void bucketSort(Collection<T> collection, Comparator<? super T> comparator) {
        if (collection == null || collection.size() < 2) {
            return;
        }

        // Определяем диапазон значений и количество ведер
        int bucketCount = 10;
        List<List<T>> buckets = new ArrayList<>(bucketCount);

        // Инициализируем ведра
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        // Найти минимальное и максимальное значение для нормализации
        T minValue = Collections.min(collection, comparator);
        T maxValue = Collections.max(collection, comparator);

        // Если значения равны, нет смысла в сортировке
        if (comparator.compare(minValue, maxValue) == 0) {
            return;
        }

        // Распределяем элементы по ведрам
        for (T item : collection) {
            int bucketIndex = getBucketIndex(item, minValue, maxValue, bucketCount, comparator);
            buckets.get(bucketIndex).add(item);
        }

        // Сортируем каждое ведро и объединяем результаты
        collection.clear();
        for (List<T> bucket : buckets) {
            Collections.sort(bucket, comparator); // Используем стандартную сортировку для ведер
            collection.addAll(bucket);
        }
    }

    private static <T> int getBucketIndex(T item, T minValue, T maxValue, int bucketCount, Comparator<? super T> comparator) {
        //Вычисляется диапазон значений между минимальным и максимальным элементом
        //+1 для положительного значения, потому что компаратор может выдавать -1
        double range = (double) comparator.compare(maxValue, minValue) + 1;
        //преобразование значения элемента в диапазон от 0 до 1 на основе его относительного положения между минимальным и максимальным значениями
        double normalizedValue = (double) comparator.compare(item, minValue) / range;
        //получение индекса ведра: в какое ведро следует поместить текущий элемент для сортировки
        //Math.min, чтобы избежать выхода за пределы допустимых индексов ведер (0 до bucketCount - 1)
        return Math.min(bucketCount - 1, (int) (normalizedValue * bucketCount));
    }
}