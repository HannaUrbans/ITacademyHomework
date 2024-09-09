package home_work_5.folderToTest;

import home_work_5.folderToTest.dto.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class HashSetRunner {
    public static void main(String[] args) {
            Set<Person> data = new HashSet<>();
            ThreadLocalRandom rnd = ThreadLocalRandom.current();
            int quantity = 100_000;

            long startAdd = System.currentTimeMillis();
            for (int i = 0; i < quantity; i++) {
                data.add(new Person(String.valueOf(rnd.nextInt()),
                        String.valueOf(rnd.nextInt()),
                        String.valueOf(rnd.nextInt())));
            }
            long stopAdd = System.currentTimeMillis();

            long startIter = System.currentTimeMillis();
            Iterator<Person> itr = data.iterator();
            while (itr.hasNext()) {
                Person p = itr.next();
                // System.out.println(p);
            }
            long stopIter = System.currentTimeMillis();

            long startRemove = System.currentTimeMillis();
            itr = data.iterator();
            while (itr.hasNext()) {
                itr.next();
                itr.remove();
            }
            long stopRemove = System.currentTimeMillis();

            System.out.println("add: " + (stopAdd - startAdd));
            System.out.println("iter: " + (stopIter - startIter));
            System.out.println("remove: " + (stopRemove - startRemove));
        }
    }
