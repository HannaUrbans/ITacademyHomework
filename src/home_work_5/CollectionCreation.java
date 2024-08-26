package home_work_5;

import home_work_5.api.ReturnUtil;
import home_work_5.api.comparators.AgeAndNickComparator;
import home_work_5.api.comparators.PasswordLengthAndNickComparator;

import java.util.*;

import static home_work_5.Animal.generateAnimal;
import static home_work_5.Person.generatePerson;

public class CollectionCreation {
    private final static int quantity = 1_000_000;

    public static ReturnUtil<List<Person>> generatePersonLinkedList() {
        List<Person> linkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            Person person = generatePerson();
            linkedList.add(person);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(linkedList, duration);
    }

    public static ReturnUtil<List<Animal>> generateAnimalLinkedList() {
        List<Animal> linkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            Animal animal = generateAnimal();
            linkedList.add(animal);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(linkedList, duration);
    }

    public static ReturnUtil<List<Person>> generatePersonArrayList() {
        List<Person> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            Person person = generatePerson();
            arrayList.add(person);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(arrayList, duration);
    }

    public static ReturnUtil<List<Animal>> generateAnimalArrayList() {
        List<Animal> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            Animal animal = generateAnimal();
            arrayList.add(animal);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(arrayList, duration);
    }

    public static ReturnUtil<Set<Person>> generatePersonHashSet() {
        Set<Person> hashSet = new HashSet<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            Person person = generatePerson();
            hashSet.add(person);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(hashSet, duration);
    }

    public static ReturnUtil<Set<Animal>> generateAnimalHashSet() {
        Set<Animal> hashSet = new HashSet<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            Animal animal = generateAnimal();
            hashSet.add(animal);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(hashSet, duration);
    }

    public static ReturnUtil<Set<Person>> generatePersonTreeSet() {
        Set<Person> treeSet = new TreeSet<>(new PasswordLengthAndNickComparator());
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            Person person = generatePerson();
            treeSet.add(person);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(treeSet, duration);
    }

    public static ReturnUtil<Set<Animal>> generateAnimalTreeSet() {
        Set<Animal> treeSet = new TreeSet<>(new AgeAndNickComparator());
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            Animal animal = generateAnimal();
            treeSet.add(animal);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(treeSet, duration);
    }

}
