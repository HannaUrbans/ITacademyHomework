package home_work_5.folderToTest.unnecessaryRunners;

import home_work_5.folderToTest.comparators.PersonNameComparator;
import home_work_5.folderToTest.dto.Person;
import home_work_5.folderToTest.dto.SpeedResult;
import home_work_5.folderToTest.sorts.ISort;
import home_work_5.folderToTest.sorts.ListSort;
import home_work_5.folderToTest.sorts.OtherCollectionSort;
import home_work_5.folderToTest.suppliers.NameRandomSupplier;
import home_work_5.folderToTest.suppliers.PersonSupplier;

import java.util.*;
import java.util.function.Supplier;

public class SpeedTestRunner {
    public static void main(String[] args) {
        Map<String, SpeedResult> resultMap = new LinkedHashMap<>();

        Supplier<Person> supplier = new PersonSupplier(new NameRandomSupplier(),
                new NameRandomSupplier(),
                new NameRandomSupplier());

        Comparator<Person> comparator = new PersonNameComparator();

        SpeedResult speedResultArray = job(new ArrayList<>(), supplier, new ListSort<>(comparator));
        SpeedResult speedResultLinked = job(new LinkedList<>(), supplier, new ListSort<>(comparator));
        SpeedResult speedResultHashSet = job(new HashSet<>(), supplier, new OtherCollectionSort<>(comparator));
        SpeedResult speedResultTreeSet = job(new TreeSet<>(), supplier, new OtherCollectionSort<>(comparator));

        resultMap.put("array person", speedResultArray);
        resultMap.put("linked person", speedResultLinked);

        System.out.println("*******************");
        resultMap.forEach((String key, SpeedResult value) -> {
            System.out.println(key + " add: " + value.getTimeAdd());
            System.out.println(key + " sort: " + value.getTimeSort());
            System.out.println(key + " iter: " + value.getTimeIter());
            System.out.println(key + " remove: " + value.getTimeRemove());
            System.out.println("______");
        });


        for (Map.Entry<String, SpeedResult> entry : resultMap.entrySet()) {
            String key = entry.getKey();
            SpeedResult value = entry.getValue();

            System.out.println(key + " add: " + value.getTimeAdd());
            System.out.println(key + " sort: " + value.getTimeSort());
            System.out.println(key + " iter: " + value.getTimeIter());
            System.out.println(key + " remove: " + value.getTimeRemove());
            System.out.println("______");
        }
    }

    public static <T> SpeedResult job(Collection<T> data,
                                      Supplier<T> supplier,
                                      ISort<T> sort) {
        Long startAdd = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            data.add(supplier.get());
        }
        Long stopAdd = System.currentTimeMillis();

        Long startSort = System.currentTimeMillis();
        sort.sort(data);
        Long stopSort = System.currentTimeMillis();

        Long startIter = System.currentTimeMillis();
        Iterator<T> itr = data.iterator();
        while (itr.hasNext()) {
            T p = itr.next();
            System.out.println(p);
        }
        Long stopIter = System.currentTimeMillis();


        Long startRemove = System.currentTimeMillis();
        itr = data.iterator();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
        Long stopRemove = System.currentTimeMillis();

        return new SpeedResult(
                new SpeedResult.Sample(startAdd, stopAdd),
                new SpeedResult.Sample(startSort, stopSort),
                new SpeedResult.Sample(startIter, stopIter),
                new SpeedResult.Sample(startRemove, stopRemove)
        );
    }
}

