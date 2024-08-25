package home_work_5;

import home_work_5.api.ReturnUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static home_work_5.Animal.generateAnimal;
import static home_work_5.Person.generatePerson;

public class CollectionCreation {
    private final static int quantity = 100_000;

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

}
