package test.home_work_4;

import home_work_4.DataContainer;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorTest {
    @Test
    public void hasNextElemTest() {
        Integer[] initialArray = {1, 2, null, 3, 777, null};
        DataContainer<Integer> container = new DataContainer<>(initialArray);

        Iterator<Integer> iterator = container.iterator();
        assertTrue(iterator.hasNext(), "Отсутствует следующий элемент у непустого итератора");
    }

    @Test
    public void nextElemTest() {
        Integer[] initialArray = {1, 2, null, 3, 777, null};
        DataContainer<Integer> container = new DataContainer<>(initialArray);

        Iterator<Integer> iterator = container.iterator();
        assertEquals(1, iterator.next(), "Неверно проитерирован первый элемент");
        assertEquals(2, iterator.next(), "Неверно проитерирован второй элемент");
    }

    @Test
    public void removeTest() {
        Integer[] initialArray = {1, 2, null, 3, 777, null};
        DataContainer<Integer> container = new DataContainer<>(initialArray);

        Iterator<Integer> iterator = container.iterator();
        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        Integer[] exp = {2, null, 3, 777, null};
        assertArrayEquals(exp, container.getItems(), "Неверно удалён первый элемент");
    }
}
