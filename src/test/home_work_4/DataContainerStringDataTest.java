package test.home_work_4;

import home_work_4.ComparatorOverride;
import home_work_4.DataContainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataContainerStringDataTest {

    @Test
    public void createArrayLengthTest() {
        int arrayLength = 10;
        DataContainer<String> container = new DataContainer<>(new String[arrayLength]);
        assertEquals(arrayLength, container.getSize(), "Размеры контейнеров не совпадают");
    }

    @Test
    public void createArrayNullLengthTest() {
        DataContainer<String> container = new DataContainer<>(null);
        assertEquals(0, container.getSize(), "Размеры контейнеров не совпадают");
    }

    @Test
    public void addAndGet1ElemStringElemsTest() {
        DataContainer<String> container = new DataContainer<>(null);
        int index1 = container.add("Привет");
        assertEquals("Привет", container.get(index1), "Ошибка добавления и считывания элемента");
    }

    @Test
    public void addAndGetNullStringElemsTest() {
        DataContainer<String> container = new DataContainer<>(null);
        int index2 = container.add(null);
        assertEquals(null, container.get(index2), "Ошибка добавления и считывания null элемента");
    }

    @Test
    public void deleteByContentStringElemsTest() {
        DataContainer<String> container = new DataContainer<>(null);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");

        assertEquals(true, container.delete(container.get(index1)),
                "Ошибка в удалении элемента по номеру");
        assertEquals("[Как дела, Работаю]", container.toString(),
                "Ошибка в удалении элемента по номеру");
    }

    @Test
    public void deleteByPosNumStringElemsTest() {
        DataContainer<String> container = new DataContainer<>(null);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");

        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);

        String exp = container.get(index2);

        assertEquals(true, container.delete(text1),
                "Ошибка в удалении элемента по номеру");
        assertEquals(exp, container.get(index1),
                "Ошибка в удалении элемента по номеру");
    }

    @Test
    public void sortByLengthStringElemsTest() {
        DataContainer<String> container = new DataContainer<>(null);
        int index1 = container.add("Давай потом");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");

        container.sort(new ComparatorOverride.StringLengthComparator());
        String exp = "[Работаю, Как дела, Давай потом]";
        String res = container.toString();
        assertEquals(exp, res, "Ошибка в сортировке по длине строки");
    }

    @Test
    public void sortAlphabeticStringElemsTest() {
        DataContainer<String> container = new DataContainer<>(null);
        int index1 = container.add("Давай потом");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");

        container.sort(new ComparatorOverride.StringAlphabeticComparator());
        String exp = "[Давай потом, Как дела, Работаю]";
        String res = container.toString();
        assertEquals(exp, res, "Ошибка в сортировке по алфавиту");
    }
}
