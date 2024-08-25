package home_work_5.api;

public class PrintCollectionUtil {
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
