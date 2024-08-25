package home_work_5.api.comparators;

import home_work_5.Person;

import java.util.Comparator;

public class PasswordLengthAndNickComparator implements Comparator<Person> {
    Comparator<Person> passwordLengthComparator = new PasswordLengthComparator();

    @Override
    public int compare(Person o1, Person o2) {

        int passwordLengthComparison = passwordLengthComparator.compare(o1, o2);
        if (passwordLengthComparison == 0) {
            return o1.getNick().compareTo(o2.getNick());
        }

        return passwordLengthComparison;
    }
}
