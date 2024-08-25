package home_work_5.api.comparators;

import home_work_5.Animal;

import java.util.Comparator;

public class AgeAndNickComparator implements Comparator<Animal> {
    Comparator<Animal> ageComparator = new AgeComparator();

    @Override
    public int compare(Animal o1, Animal o2) {

        int ageComparison = ageComparator.compare(o1, o2);
        if (ageComparison == 0) {
            return o1.getNick().compareTo(o2.getNick());
        }
        return ageComparison;
    }
}
