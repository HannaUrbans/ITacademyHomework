package home_work_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;
    private int defaultArrayLength = 10;


    public DataContainer(T[] data) {
        if (data != null && data.length > 0) {
            this.data = data;
        } else {
            this.data = createGenericArray(defaultArrayLength);
        }
    }

    private T[] createGenericArray(int length) {
        Class<?> dataType = data.getClass().getComponentType();
        return (T[]) Array.newInstance(dataType, length); //Создаем массив типа T
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
        if (index < data.length) {
            return data[index];
        }

        return null;
    }

    //public T[] getItems() {
    //    return data;
    //}

    public boolean delete(int index) {
        if (index < 0 || index >= data.length) {
            return false;
        }

        deleteWithOffset(index);
        return true;
    }

    public boolean delete(T item) {
        if (item == null) {
            return false;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                deleteWithOffset(i);
                return true;
            }
        }

        return false;
    }


    private T[] deleteWithOffset(int index) {
        for (int j = index; j < data.length - 1; j++) {
            data[j] = data[j + 1];
        }

        // Устанавливаем последний элемент в null, чтобы предотвратить "висячие" ссылки
        data[data.length - 1] = null;

        data = Arrays.copyOf(data, data.length - 1);

        return data;
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

}

