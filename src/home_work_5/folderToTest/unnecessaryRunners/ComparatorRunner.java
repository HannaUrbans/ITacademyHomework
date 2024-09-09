package home_work_5.folderToTest.unnecessaryRunners;

import home_work_5.folderToTest.comparators.PersonNameComparator;
import home_work_5.folderToTest.comparators.PersonPasswordComparator;
import home_work_5.folderToTest.dto.Person;

import java.util.Comparator;

public class ComparatorRunner {
    public static void main(String[] args) {
    Comparator<Person> cmp = new PersonPasswordComparator();
    cmp = cmp.thenComparing(new PersonNameComparator());

    Comparator<Person> cmp2 = new PersonPasswordComparator()
            .thenComparing(new PersonNameComparator());
}
}
