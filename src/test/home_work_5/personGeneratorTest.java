package test.home_work_5;

import home_work_5.folderToTest.dto.Person;
import home_work_5.folderToTest.suppliers.NameArraySupplier;
import home_work_5.folderToTest.suppliers.NameFromFileSupplier;
import home_work_5.folderToTest.suppliers.NameRandomSupplier;
import home_work_5.folderToTest.suppliers.PersonSupplier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class personGeneratorTest {
    @Test
    @DisplayName("Проверка отсутствия null")
    void notNullTest() {

        Supplier<String> nameArraySupplier = new NameArraySupplier();
        Supplier<String> randomNameSupplier = new NameRandomSupplier();
        Supplier<String> nameFromFileSupplier = new NameFromFileSupplier("src/home_work_5/folderToTest/namesPerson.txt");

        Supplier<Person> personSupplier = new PersonSupplier(
                nameArraySupplier, randomNameSupplier, nameFromFileSupplier
        );

        Person person = personSupplier.get();

        assertNotNull(person, "Поля не должны быть пустые");
        assertNotNull(person.getName(), "Поле с именем не должно быть пустым");
        assertNotNull(person.getPassword(), "Поле с паролем не должно быть пустое");
        assertNotNull(person.getNick(), "Поле с ником не должно быть пустым");
    }

    @Test
    @DisplayName("Проверка отсутствия пустых полей")
    void notEmptyTest() {

        Supplier<String> nameArraySupplier = new NameArraySupplier();
        Supplier<String> randomNameSupplier = new NameRandomSupplier();
        Supplier<String> nameFromFileSupplier = new NameFromFileSupplier("src/home_work_5/folderToTest/namesPerson.txt");

        Supplier<Person> personSupplier = new PersonSupplier(
                nameArraySupplier, randomNameSupplier, nameFromFileSupplier
        );

        Person person = personSupplier.get();

        assertFalse(person.getName().isEmpty(), "Поле с именем не должно быть пустым");
        assertFalse(person.getPassword().isEmpty(), "Поле с паролем не должно быть пустое");
        assertFalse(person.getNick().isEmpty(), "Поле с ником не должно быть пустым");
    }
}

