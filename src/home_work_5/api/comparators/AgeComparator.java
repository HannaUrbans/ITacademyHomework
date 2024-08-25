package home_work_5.api.comparators;

import home_work_5.Animal;

import java.util.Comparator;

public class AgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1 == null || o2 == null) {
            throw new IllegalArgumentException("Сравнивать с null нельзя");
        }

        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
