package test.home_work_5;

import home_work_5.folderToTest.dto.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashSetGeneratorTest {
    @Test
    @DisplayName("Проверка правильности добавления элементов")
    void addTest() {
        Set<Person> data = new HashSet<>();
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
    @DisplayName("Проверка наличия объектов")
    void getFieldsTest() {
        Set<Person> data = new HashSet<>();
        //метод get здесь не будет работать
        //нет доступа по индексу/по содержимому -> проверяем объекты с определенными значениями полей

        Person frodo = new Person("Frodo", "123", "Фродо");
        Person aragorn = new Person("Aragorn", "456", "Арагорн");
        Person gandalf = new Person("Gandalf", "789", "Гендальф");

        data.add(frodo);
        data.add(aragorn);
        data.add(gandalf);

        assertTrue(data.contains(frodo), "Не найден объект");
    }


    @Test
    @DisplayName("Проверка правильности итерации")
    void iterationTest() {
        Set<Person> data = new HashSet<>();
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
        Set<Person> data = new HashSet<>();
        data.add(new Person("Frodo", "123", "Фродо"));
        data.add(new Person("Aragorn", "456", "Арагорн"));

        data.removeIf(p -> true);

        assertTrue(data.isEmpty(), "Не все элементы удалены");
    }
}
