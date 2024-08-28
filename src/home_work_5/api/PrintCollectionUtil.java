package home_work_5.api;

public class PrintCollectionUtil {
    /**
     * Метод для вывода коллекции в консоль
     * @param collection - коллекция для итерирования
     * @param <T> - тип элементов в коллекции
     */
    public static <T> void print(Iterable<T> collection) {
        if (collection == null) {
            System.out.println("Коллекция не существует");
            return;
        }
        for (T elem : collection) {
            System.out.println(elem);
        }
    }
}
