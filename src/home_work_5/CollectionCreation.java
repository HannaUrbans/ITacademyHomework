package home_work_5;

import home_work_5.api.ReturnUtil;
import home_work_5.api.comparators.AgeAndNickComparator;
import home_work_5.api.comparators.PasswordLengthAndNickComparator;

import java.util.*;
import java.util.function.Supplier;

import static home_work_5.Animal.generateAnimal;
import static home_work_5.Person.generatePerson;

public class CollectionCreation {
    private final static int quantity = 100_000;


    //метод для создания массивов Person и Animal
    public static <T> T[] createArray(Class<T> clazz){
        if (clazz == null) {
            throw new IllegalArgumentException("Аргумент не может быть null");
        }
        // Создание массива нужного типа и размера
        T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, quantity);
        for (int i = 0; i < quantity; i++) {
            if (clazz == Person.class){
            array[i] = (T) generatePerson();}
            else if (clazz == Animal.class){
                array[i] = (T) generateAnimal();
            }
        }
        return array;
    }

    //тестовый метод с лямбдами
    private static <T, C extends Collection<T>> ReturnUtil<C> generateCollection(Supplier<T> supplier, Supplier<C> collectionSupplier) {
        long startTime = System.currentTimeMillis();
        C collection = collectionSupplier.get();
        for (int i = 0; i < quantity; i++) {
            collection.add(supplier.get());
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(collection, duration);
    }

    //тестовый метод с лямбдами
    public static ReturnUtil<List<Person>> generatePersonLinkedList0() {
        return generateCollection(Person::new, LinkedList::new);
    }

    //тестовый метод с лямбдами
    public static ReturnUtil<List<Person>> generatePersonArrayList0() {
        return generateCollection(Person::new, ArrayList::new);
    }

    //тестовый метод с лямбдами
    public static ReturnUtil<Set<Person>> generatePersonHashset0() {
        return generateCollection(Person::new, HashSet::new);
    }

    public static ReturnUtil<List<Person>> generatePersonLinkedList1(Person[] array) {

        long startTime = System.currentTimeMillis();

        List<Person> linkedList = new LinkedList<>(Arrays.asList(array));

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(linkedList, duration);
    }

    public static ReturnUtil<List<Person>> generatePersonLinkedList2() {
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

    public static ReturnUtil<List<Animal>> generateAnimalLinkedList1(Animal[]array) {
        long startTime = System.currentTimeMillis();

        List <Animal> linkedList = new LinkedList<>(Arrays.asList(array));

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(linkedList, duration);
    }

    public static ReturnUtil<List<Animal>> generateAnimalLinkedList2() {
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

    public static ReturnUtil<List<Person>> generatePersonArrayList1(Person[] array) {
        long startTime = System.currentTimeMillis();

        List<Person> arrayList = new ArrayList<>(Arrays.asList(array));

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(arrayList, duration);
    }

    public static ReturnUtil<List<Person>> generatePersonArrayList2() {
        Person[] myArray = new Person[quantity];
        for (int i = 0; i < quantity; i++) {
            myArray[i] = generatePerson();
        }

        long startTime = System.currentTimeMillis();

        List<Person> arrayList = new ArrayList<>(Arrays.asList(myArray));

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

    public static ReturnUtil<Set<Person>> generatePersonHashSet1(Person[] myArray) {

        long startTime = System.currentTimeMillis();
        Set <Person> hashSet = new HashSet<>((Arrays.asList(myArray)));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(hashSet, duration);
    }

    public static ReturnUtil<Set<Person>> generatePersonHashSet2() {
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

    public static ReturnUtil<Set<Person>> generatePersonTreeSet1(Person[]myArray) {

        long startTime = System.currentTimeMillis();
        Set<Person> treeSet = new TreeSet<>(new PasswordLengthAndNickComparator());
        treeSet.addAll(Arrays.asList(myArray));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        return new ReturnUtil<>(treeSet, duration);
    }

    public static ReturnUtil<Set<Person>> generatePersonTreeSet2() {
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
