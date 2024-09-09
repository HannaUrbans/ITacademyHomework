package home_work_5.folderToTest.sorts;

import java.util.Collection;
import java.util.Comparator;

public class OtherCollectionSort<T> implements ISort<T> {
    private final Comparator<T> cmp;

    public OtherCollectionSort(Comparator<T> cmp) {
        this.cmp = cmp;
    }

    @Override
    public void sort(Collection<T> data) {
        Object[] array = data.toArray();

        T o1 = (T) array[0];
        T o2 = (T) array[2];
    }
}
