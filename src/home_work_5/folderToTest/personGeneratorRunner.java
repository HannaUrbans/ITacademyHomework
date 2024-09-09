package home_work_5.folderToTest;

import home_work_5.folderToTest.dto.Person;
import home_work_5.folderToTest.suppliers.*;

import java.util.function.Supplier;

public class personGeneratorRunner {
    public static void main(String[] args) {
        Supplier<String> randomName = new NameRandomSupplier();
        Supplier<String> randomRussianWordSupplier = new NameRandomChoiceLangSupplier(20);
        Supplier<String> nameArraySupplier = new NameArraySupplier();
        Supplier<String> nameFromFileSupplier = new NameFromFileSupplier("C:\\Users\\user\\IdeaProjects\\it-academy\\JD1\\HomeWork\\src\\home_work_5\\folderToTest\\namesPerson.txt");

        Supplier<Person> personGenerator = new PersonSupplier(
                nameArraySupplier, randomName, nameFromFileSupplier
        );

        Person person = personGenerator.get();

        System.out.println(person);
    }
}

