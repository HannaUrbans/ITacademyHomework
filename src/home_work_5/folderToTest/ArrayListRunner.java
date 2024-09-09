package home_work_5.folderToTest;

import home_work_5.folderToTest.comparators.PersonNameComparator;
import home_work_5.folderToTest.dto.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayListRunner {
    public static void main(String[] args) {
        List<Person> data = new ArrayList<>();
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int quantity = 100_000;

        Long startAdd = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            data.add(new Person(String.valueOf(rnd.nextInt()),
                    String.valueOf(rnd.nextInt()),
                    String.valueOf(rnd.nextInt())));
        }
        Long stopAdd = System.currentTimeMillis();

        Long startSort = System.currentTimeMillis();
        data.sort(new PersonNameComparator());
        Long stopSort = System.currentTimeMillis();

        Long startIter = System.currentTimeMillis();
        Iterator<Person> itr = data.listIterator();
        while (itr.hasNext()) {
            Person p = itr.next();
            //System.out.println(p);
        }
        Long stopIter = System.currentTimeMillis();

        Long startRemove = System.currentTimeMillis();
        // Создаем новый итератор для удаления
        itr = data.iterator();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
        Long stopRemove = System.currentTimeMillis();

        System.out.println("add: " + (stopAdd - startAdd));
        System.out.println("sort: " + (stopSort - startSort));
        System.out.println("iter: " + (stopIter - startIter));
        System.out.println("remove: " + (stopRemove - startRemove));
    }
}
