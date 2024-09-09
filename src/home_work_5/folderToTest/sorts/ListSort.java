package home_work_5.folderToTest.sorts;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ListSort<T> implements ISort<T> {
    private final Comparator<T> cmp;

    public ListSort(Comparator<T> cmp) {
        this.cmp = cmp;
    }

    @Override
    public void sort(Collection<T> data) {
        if (data instanceof List) {
            ((List<T>) data).sort(cmp);
        } else {
            throw new IllegalArgumentException("List sort only supports List");
        }
    }
}
