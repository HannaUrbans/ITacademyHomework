package home_work_6;

import java.util.*;

/**
 * Отсортировать получившуюся коллекцию:
 * создать List,
 * наполнять лист Entry из Map,
 * из получившегося отсортированного набора данных вывести первые N записей
 */
public class SortUtil {
    public static Map<String, Integer> sortMapByValue(Map<String, Integer> mapToConvertIntoList) {
        //для хранения объектов типа Map.Entry<String, Integer
//        List<Map.Entry<String, Integer>> listToSort = new ArrayList<>();
//
//        for (Map.Entry<String, Integer> entry : mapToConvertIntoList.entrySet()) {
//            listToSort.add(entry);
//        }
        List<Map.Entry<String, Integer>> listToSort = new ArrayList<>(mapToConvertIntoList.entrySet());

        //сортировка в обратном порядке
        listToSort.sort((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()));

        // конвертируем список в мапу, но ту, что поддерживает порядок ввода
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : listToSort) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
