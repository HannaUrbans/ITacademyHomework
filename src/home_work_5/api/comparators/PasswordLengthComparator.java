package home_work_5.api.comparators;

import home_work_5.Person;

import java.util.Comparator;

public class PasswordLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1 == null || o2 == null) {
            throw new IllegalArgumentException("Сравнивать с null нельзя");
        }
        return Integer.compare(o1.getPassword().length(), o2.getPassword().length());
    }
}
