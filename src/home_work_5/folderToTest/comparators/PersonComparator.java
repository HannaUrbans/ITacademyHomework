package home_work_5.folderToTest.comparators;

import home_work_5.folderToTest.dto.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    private final static Comparator<Person> comparator = new PersonPasswordComparator();

    /**
     * метод для сравнения объектов класса Person по двум параметрам
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Person o1, Person o2) {
        int lengthDiff = comparator.compare(o1, o2);

        if(lengthDiff == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return lengthDiff;
    }
}
