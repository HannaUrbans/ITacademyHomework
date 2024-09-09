package home_work_5.folderToTest.comparators;

import home_work_5.folderToTest.dto.Person;

import java.util.Comparator;

public class PersonPasswordComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length() - o2.getPassword().length();
    }
}

