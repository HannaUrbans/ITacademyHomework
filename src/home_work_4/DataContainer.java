package home_work_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T extends Comparable<T>> {

    private int defaultArrayLength = 10;
    private T[] data;
    private Class<T> type;
    //private int inputElementsQuantity;

    public DataContainer(Class<T> type) {
        this.type = type;
        this.data = createGenericArray(defaultArrayLength);
    }

    public DataContainer(Class<T> type, T[] data) {
        this.type = type;
        if (data != null && data.length > 0) {
            this.data = data;
        } else {
            this.data = createGenericArray(defaultArrayLength);
        }
    }

    private T[] createGenericArray(int length) {
        return (T[]) Array.newInstance(type, length);
    }

    public T[] getData() {
        return data;
    }

    public int add(T item) {

        // Проверяем, что item является экземпляром типа данных массива
        if (!isSameClass(item)) {
            return -1;
        }

        // Ищем null
        int res = findNullPos();
        if (res == -1) {
            // расширяем, если не нашли null
            data = Arrays.copyOf(data, data.length + 1);
            res = data.length - 1;
        }

        // Меняем null на item
        changeNullIntoItem(item, res);
        return res;
    }

    public T get(int index) {
        if (index >= 0 && index < data.length) {
            return data[index];
        }

        return null;
    }

    public T[] getItems() {
        return Arrays.copyOf(data, data.length);
    }

    public boolean delete(int index) {
        if (index < 0 || index >= data.length) {
            return false;
        }
        if (data[index] != null) {
            deleteWithOffset(index);
            return true;
        }

        return false;
    }

    public boolean delete(T item) {
        if (item == null) {
            return false;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i].equals(item)) {
                deleteWithOffset(i);
                return true;
            }
        }

        return false;
    }


    private void deleteWithOffset(int index) {
        for (int j = index; j < data.length - 1; j++) {
            data[j] = data[j + 1];
        }

        // Устанавливаем последний элемент в null, чтобы предотвратить "висячие" ссылки
        data[data.length - 1] = null;
        data = Arrays.copyOf(data, data.length - 1);
    }

    private void changeNullIntoItem(T item, int res) {
        data[res] = item;
    }

    private int findNullPos() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private boolean isSameClass(T item) {
        return (data.getClass().getComponentType().isInstance(item));
    }

    // public void makeArraySizeEqualToInputELementsAmount(){
    //
    //}


    @Override
    public String toString() {
        int count = 0;

        for (T item : data) {
            if (item != null) {
                count++;
            }
        }

        T[] tmpData = createGenericArray(count);
        int index = 0;
        for (T item : data) {
            if (item != null) {
                tmpData[index++] = item;
            }
        }

        data = Arrays.copyOf(tmpData, tmpData.length);

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
            if (i < data.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    public void sort(Comparator<T> comparator) {

        for (int i = 1; i < data.length; i++) {
            T tmp = data[i];
            int j = i - 1;

            // Сравнение элементов и перемещение
            while (j >= 0 && comparator.compare(data[j], tmp) > 0) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = tmp;
        }
    }


    public static <T extends Comparable<T>> void sort(DataContainer<T> container) {

        for (int i = 1; i < container.data.length; i++) {
            T tmp = container.data[i];
            int j = i - 1;

            // Сравнение элементов и перемещение
            while (j >= 0 && container.data[j].compareTo(tmp) > 0) {
                container.data[j + 1] = container.data[j];
                j--;
            }
            container.data[j + 1] = tmp;
        }
    }

    public static <T extends Comparable<T>> void sort(DataContainer<T> container, Comparator<T> comparator) {

        for (int i = 1; i < container.data.length; i++) {
            T tmp = container.data[i];
            int j = i - 1;

            // Сравнение элементов и перемещение
            while (j >= 0 && comparator.compare(container.data[j], tmp) > 0) {
                container.data[j + 1] = container.data[j];
                j--;
            }
            container.data[j + 1] = tmp;
        }
    }
}
