package test.home_work_5;

import home_work_5.folderToTest.comparators.PersonNameComparator;
import home_work_5.folderToTest.dto.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListGeneratorTest {
    @Test
    @DisplayName("Проверка правильности добавления элементов")
    void addTest() {
        List<Person> data = new ArrayList<>();
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int quantity = 100;

        for (int i = 0; i < quantity; i++) {
            data.add(new Person(String.valueOf(rnd.nextInt()),
                    String.valueOf(rnd.nextInt()),
                    String.valueOf(rnd.nextInt())));
        }

        assertEquals(quantity, data.size(), "Не все элементы добавлены");
    }

    @Test
    @DisplayName("Проверка правильности доступа к полям")
    void getFieldsTest() {
        List<Person> data = new ArrayList<>();
        data.add(new Person("Frodo", "123", "Фродо"));
        data.add(new Person("Aragorn", "456", "Арагорн"));
        data.add(new Person("Gandalf", "789", "Гендальф"));

        assertEquals("Frodo", data.get(0).getNick(), "Неверный вывод ника");
        assertEquals("456", data.get(1).getPassword(), "Неверный вывод пароля");
        assertEquals("Гендальф", data.get(2).getName(), "Неверный вывод имени");
    }

    @Test
    @DisplayName("Проверка правильности сортировки")
    void sortByNameAndGetSortedFieldsTest() {
        List<Person> data = new ArrayList<>();
        data.add(new Person("Frodo", "123", "Фродо"));
        data.add(new Person("Aragorn", "456", "Арагорн"));
        data.add(new Person("Zorro", "789", "Зорро"));

        data.sort(new PersonNameComparator());

        assertEquals("Aragorn", data.get(0).getNick(), "Неверный вывод ника");
        assertEquals("789", data.get(1).getPassword(), "Неверный вывод пароля");
        assertEquals("Фродо", data.get(2).getName(), "Неверный вывод имени");
    }

    @Test
    @DisplayName("Проверка правильности итерации")
    void iterationTest() {
        List<Person> data = new ArrayList<>();
        data.add(new Person("Frodo", "123", "Фродо"));
        data.add(new Person("Aragorn", "456", "Арагорн"));

        int count = 0;
        for (Person p : data) {
            count++;
        }

        assertEquals(2, count, "Ошибка в количестве итераций");
    }

    @Test
    @DisplayName("Проверка правильности удаления всех элементов из коллекции")
    void removeTest() {
        List<Person> data = new ArrayList<>();
        data.add(new Person("Frodo", "123", "Фродо"));
        data.add(new Person("Aragorn", "456", "Арагорн"));

        data.removeIf(p -> true);

        assertTrue(data.isEmpty(), "Не все элементы удалены");
    }
}
