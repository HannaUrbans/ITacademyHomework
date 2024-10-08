package home_work_5.folderToCorrect.api.comparators;

import home_work_5.folderToCorrect.Person;

import java.util.Comparator;

public class PasswordLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1 == null || o2 == null) {
            throw new IllegalArgumentException("Сравнивать с null нельзя");
        }
        if (o1.getPassword()== o2.getPassword()){
            return 0;
        }
        return Integer.compare(o1.getPassword().length(), o2.getPassword().length());
    }
}
