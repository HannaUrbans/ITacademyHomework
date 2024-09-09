package test.home_work_4;

import home_work_4.ComparatorOverride;
import home_work_4.DataContainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataContainerIntegerDataTest {

    @Test
    public void createArrayLengthTest() {
        int arrayLength = 10;
        DataContainer<Integer> container = new DataContainer<>(new Integer[arrayLength]);
        assertEquals(arrayLength, container.getSize(), "Размеры контейнеров не совпадают");
    }

    @Test
    public void createArrayNullLengthTest() {
        DataContainer<Integer> container = new DataContainer<>(null);
        assertEquals(0, container.getSize(), "Размеры контейнеров не совпадают");
    }

    @Test
    public void createFromInitialArrayIntegerElemsTest() {
        Integer[] initialArray = {1, 2, null, 3, 777, null};
        DataContainer<Integer> container = new DataContainer<>(initialArray);
        assertEquals(6, container.getSize(), "Размеры контейнеров не совпадают");
    }

    @Test
    public void addAndGet1ElemIntegerElemsTest() {
        DataContainer<Integer> container = new DataContainer<>(null);
        int index1 = container.add(1);
        assertEquals(1, container.get(index1), "Ошибка добавления и считывания элемента");
    }

    @Test
    public void addAndGetNullIntegerElemsTest() {
        DataContainer<Integer> container = new DataContainer<>(null);
        int index2 = container.add(null);
        assertEquals(null, container.get(index2), "Ошибка добавления и считывания null элемента");
    }

    @Test
    public void addAtZeroPosIntegerElemsTest() {
        Integer[] initialArray = {1, 2, null, 3, 777, null};
        DataContainer<Integer> container = new DataContainer<>(initialArray);
        int elempos = container.add(1992);
        assertEquals(2, elempos, "Ошибка добавления и считывания элемента на null позицию");
    }

    @Test
    public void deleteCorrectByContentIntegerElemsTest() {
        //убраны null, посколько toString по условиям дз должно оставлять только значения в массиве
        Integer[] initialArray = {1, 2, null, 3, 777, null};
        DataContainer<Integer> container = new DataContainer<>(initialArray);

        assertEquals(true, container.delete(container.get(1)),
                "Ошибка в удалении элемента по номеру");
        assertEquals("[1, 3, 777]", container.toString(),
                "Ошибка в удалении элемента по номеру");
    }

    @Test
    public void deleteIncorrectByContentIntegerElemsTest() {
        //убраны null, посколько toString по условиям дз должно оставлять только значения в массиве
        Integer[] initialArray = {1, 2, null, 3, 777, null};
        DataContainer<Integer> container = new DataContainer<>(initialArray);

        assertEquals(false, container.delete(container.get(777)),
                "Ошибка в удалении элемента по номеру");
        assertEquals("[1, 2, 3, 777]", container.toString(),
                "Ошибка в удалении элемента по номеру");
    }

    @Test
    public void deleteCorrectByPosNumIntegerElemsTest() {
        //убраны null, посколько toString по условиям дз должно оставлять только значения в массиве
        Integer[] initialArray = {1, 2, null, 3, 777, null};
        DataContainer<Integer> container = new DataContainer<>(initialArray);

        assertEquals(true, container.delete((Integer)777),
                "Ошибка в удалении элемента по номеру");
        assertEquals("[1, 2, 3]", container.toString(),
                "Ошибка в удалении элемента по номеру");
    }

    @Test
    public void deleteIncorrectByPosNumIntegerElemsTest() {
        //убраны null, посколько toString по условиям дз должно оставлять только значения в массиве
        Integer[] initialArray = {1, 2, null, 3, 777, null};
        DataContainer<Integer> container = new DataContainer<>(initialArray);

        assertEquals(false, container.delete((Integer)1000),
                "Ошибка в удалении элемента по номеру");
        assertEquals("[1, 2, 3, 777]", container.toString(),
                "Ошибка в удалении элемента по номеру");
    }

    @Test
    public void sortIntegerElemsTest() {
        Integer[] initialArray = {3, 2, 777,60};
        DataContainer<Integer> container = new DataContainer<>(initialArray);

        container.sort(new ComparatorOverride.IntegerComparator());
        String exp = "[2, 3, 60, 777]";
        String res = container.toString();
        assertEquals(exp, res, "Ошибка в сортировке");
    }

    @Test
    public void sortWithNullsElemsTest() {
        Integer[] initialArray = {3, null, 2, 777, null,60};
        DataContainer<Integer> container = new DataContainer<>(initialArray);

        container.sort(new ComparatorOverride.IntegerComparator());
        String exp = "[2, 3, 60, 777]";
        String res = container.toString();
        assertEquals(exp, res, "Ошибка в сортировке");
    }
}
