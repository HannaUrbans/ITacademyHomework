package test.home_work_5;

import home_work_5.folderToTest.suppliers.NameArraySupplier;
import home_work_5.folderToTest.suppliers.NameFromFileSupplier;
import home_work_5.folderToTest.suppliers.NameRandomChoiceLangSupplier;
import home_work_5.folderToTest.suppliers.NameRandomSupplier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class suppliersTest {
    Supplier<String> nameArraySupplier = new NameArraySupplier();
    Supplier<String> nameFromFileSupplier = new NameFromFileSupplier("src/home_work_5/folderToTest/namesPerson.txt");

    String[] names = new String[]{"Авдей", "Авксентий", "Агапит", "Богдан", "Борис", "Вавила", "Вадим", "Валентин"};

    @Test
    @DisplayName("Проверка корректной передачи данных из массива")
    public void containsNameFromArrayTest() {
        String name = nameArraySupplier.get();
        assertTrue(Arrays.asList(names).contains(name), "Это имя не присутствует в массиве");
    }

    @Test
    @DisplayName("Проверка корректной передачи данных из файла")
    public void containsNameFromFileTest() {
        String filePath = ("C:\\Users\\user\\IdeaProjects\\it-academy\\JD1\\HomeWork\\src\\home_work_5\\folderToTest\\namesPerson.txt");
        List<String> namesFromFile;
        try {
            namesFromFile = Files.readAllLines(Path.of(filePath));
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении файла: " + filePath, e);
        }

        String name = nameFromFileSupplier.get();

        assertTrue(namesFromFile.contains(name), "Это имя не присутствует в файле");
    }

    @RepeatedTest(10)
    @DisplayName("Проверка допустимого диапазона данных")
    public void charactersInRangeNameRandomChoiceLangTest() {

        NameRandomChoiceLangSupplier supplier = new NameRandomChoiceLangSupplier(1);

        String generatedString = supplier.get();

        char generatedChar = generatedString.charAt(0);
        int generatedInt = (int) generatedChar;

        assertTrue((char)generatedInt >= 1072 && (char)generatedInt <= 1104, "Используются символы вне разрешенного диапазона");
    }

    @RepeatedTest(10)
    @DisplayName("Проверка на содержание только цифр")
    public void charactersInRangeNameRandomTest() {
        NameRandomSupplier supplier = new NameRandomSupplier();

        String generatedString = supplier.get();

        for (char c : generatedString.toCharArray()) {

            assertTrue(Character.isDigit(c) || c == '-',"Используются символы вне разрешенного диапазона");
        }
    }
}
