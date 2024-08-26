package home_work_5;

import home_work_5.api.ReturnUtil;
import home_work_5.api.comparators.AgeAndNickComparator;
import home_work_5.api.comparators.PasswordLengthAndNickComparator;

import java.util.*;

import static home_work_5.api.IterationUtil.countDurationOfForLoopIteration;
import static home_work_5.api.IterationUtil.countDurationOfIteratorIteration;
import static home_work_5.api.RemovalUtil.countDurationOfRemovalWithClear;
import static home_work_5.api.RemovalUtil.countDurationOfRemovalWithIterator;

public class CollectionRunner {
    public static void main(String[] args) {

        ReturnUtil<List<Person>> resultCreationPersonLinkedList = CollectionCreation.generatePersonLinkedList();
        List<Person> linkedPersonList = resultCreationPersonLinkedList.getResult();
        //List<Person> linkedPersonListToSort1 = new LinkedList<>(linkedPersonList);
        //List<Person> linkedPersonListToSort2 = new LinkedList<>(linkedPersonList);
        //List<Person> linkedPersonListToSort3 = new LinkedList<>(linkedPersonList);
        //List<Person> linkedPersonListToSort4 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToRemove1 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToRemove2 = new LinkedList<>(linkedPersonList);

        ReturnUtil<List<Animal>> resultCreationAnimalLinkedList = CollectionCreation.generateAnimalLinkedList();
        List<Animal> linkedAnimalList = resultCreationAnimalLinkedList.getResult();
        //List<Animal> linkedAnimalListToSort1 = new LinkedList<>(linkedAnimalList);
        //List<Animal> linkedAnimalListToSort2 = new LinkedList<>(linkedAnimalList);
        //List<Animal> linkedAnimalListToSort3 = new LinkedList<>(linkedAnimalList);
        //List<Animal> linkedAnimalListToSort4 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToRemove1 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToRemove2 = new LinkedList<>(linkedAnimalList);

        ReturnUtil<List<Person>> resultCreationPersonArrayList = CollectionCreation.generatePersonArrayList();
        List<Person> arrayPersonList = resultCreationPersonArrayList.getResult();
        //List<Person> arrayPersonListToSort1 = new ArrayList<>(arrayPersonList);
        //List<Person> arrayPersonListToSort2 = new ArrayList<>(arrayPersonList);
        //List<Person> arrayPersonListToSort3 = new ArrayList<>(arrayPersonList);
        //List<Person> arrayPersonListToSort4 = new ArrayList<>(arrayPersonList);
        List<Person> arrayPersonListToRemove1 = new ArrayList<>(arrayPersonList);
        List<Person> arrayPersonListToRemove2 = new ArrayList<>(arrayPersonList);

        ReturnUtil<List<Animal>> resultCreationAnimalArrayList = CollectionCreation.generateAnimalArrayList();
        List<Animal> arrayAnimalList = resultCreationAnimalArrayList.getResult();
        //List<Animal> arrayAnimalListToSort1 = new ArrayList<>(arrayAnimalList);
        //List<Animal> arrayAnimalListToSort2 = new ArrayList<>(arrayAnimalList);
        //List<Animal> arrayAnimalListToSort3 = new ArrayList<>(arrayAnimalList);
        //List<Animal> arrayAnimalListToSort4 = new ArrayList<>(arrayAnimalList);
        List<Animal> arrayAnimalListToRemove1 = new ArrayList<>(arrayAnimalList);
        List<Animal> arrayAnimalListToRemove2 = new ArrayList<>(arrayAnimalList);

        ReturnUtil<Set<Person>> resultCreationPersonHashSet = CollectionCreation.generatePersonHashSet();
        Set<Person> personHashSet = resultCreationPersonHashSet.getResult();
        //ДОБАВИТЬ ЕЩЕ СПОСОБ ИТЕРАЦИИ
        //Set<Person> personHashSetToSort1 = new HashSet<>(personHashSet);
        //Set<Person> personHashSetToSort2 = new HashSet<>(personHashSet);
        //Set<Person> personHashSetToSort3 = new HashSet<>(personHashSet);
        //Set<Person> personHashSetToSort4 = new HashSet<>(personHashSet);
        Set<Person> personHashSetToRemove1 = new HashSet<>(personHashSet);
        Set<Person> personHashSetToRemove2 = new HashSet<>(personHashSet);

        ReturnUtil<Set<Animal>> resultCreationAnimalHashSet = CollectionCreation.generateAnimalHashSet();
        Set<Animal> animalHashSet = resultCreationAnimalHashSet.getResult();
        //ДОБАВИТЬ ЕЩЕ СПОСОБ ИТЕРАЦИИ
        //Set<Animal> animalHashSetToSort1 = new HashSet<>(animalHashSet);
        //Set<Animal> animalHashSetToSort2 = new HashSet<>(animalHashSet);
        //Set<Animal> animalHashSetToSort3 = new HashSet<>(animalHashSet);
        //Set<Animal> animalHashSetToSort4 = new HashSet<>(animalHashSet);
        Set<Animal> animalHashSetToRemove1 = new HashSet<>(animalHashSet);
        Set<Animal> animalHashSetToRemove2 = new HashSet<>(animalHashSet);

        ReturnUtil<Set<Person>> resultCreationPersonTreeSet = CollectionCreation.generatePersonTreeSet();
        Set<Person> personTreeSet = resultCreationPersonTreeSet.getResult();
        //ДОБАВИТЬ ЕЩЕ СПОСОБ ИТЕРАЦИИ
        Set<Person> personTreeSetToRemove1 = new TreeSet<>(new PasswordLengthAndNickComparator());
        personTreeSetToRemove1.addAll(personTreeSet);
        Set<Person> personTreeSetToRemove2 = new TreeSet<>(new PasswordLengthAndNickComparator());
        personTreeSetToRemove2.addAll(personTreeSet);

        ReturnUtil<Set<Animal>> resultCreationAnimalTreeSet = CollectionCreation.generateAnimalTreeSet();
        Set<Animal> animalTreeSet = resultCreationAnimalTreeSet.getResult();
        //ДОБАВИТЬ ЕЩЕ СПОСОБ ИТЕРАЦИИ
        Set<Animal> animalTreeSetToRemove1 = new TreeSet<>(new AgeAndNickComparator());
        animalTreeSetToRemove1.addAll(animalTreeSet);
        Set<Animal> animalTreeSetToRemove2 = new TreeSet<>(new AgeAndNickComparator());
        animalTreeSetToRemove2.addAll(animalTreeSet);

        System.out.println("LINKED LIST PERSON");
        //print(linkedPersonList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "заполнение", linkedPersonList.getClass().getSimpleName(), linkedPersonList.get(0).getClass().getSimpleName(), resultCreationPersonLinkedList.getDuration());
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью Итератора", linkedPersonList.getClass().getSimpleName(), linkedPersonList.get(0).getClass().getSimpleName(), countDurationOfIteratorIteration(linkedPersonList));
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью For", linkedPersonList.getClass().getSimpleName(), linkedPersonList.get(0).getClass().getSimpleName(), countDurationOfForLoopIteration(linkedPersonList));
        //System.out.println("Встроенный компаратор");
        //System.out.println("PasswordLengthComparator");
        //Collections.sort(linkedPersonListToSort1, new PasswordLengthComparator());
        //System.out.println(linkedPersonListToSort1);
        //System.out.println("PasswordLengthAndNickComparator");
        //Collections.sort(linkedPersonListToSort2, new PasswordLengthAndNickComparator());
        //System.out.println(linkedPersonListToSort2);
        //System.out.println("Сортировка ведрами");
        //System.out.println("PasswordLengthComparator");
        //BucketSortUtil.bucketSort(linkedPersonListToSort3, new PasswordLengthComparator());
        //System.out.println(linkedPersonListToSort3);
        //System.out.println("PasswordLengthAndNickComparator");
        //BucketSortUtil.bucketSort(linkedPersonListToSort4, new PasswordLengthAndNickComparator());
        //System.out.println(linkedPersonListToSort4);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Итератора", linkedPersonList.getClass().getSimpleName(), linkedPersonList.get(0).getClass().getSimpleName(), countDurationOfRemovalWithIterator(linkedPersonListToRemove1));
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Clear", linkedPersonList.getClass().getSimpleName(), linkedPersonList.get(0).getClass().getSimpleName(), countDurationOfRemovalWithClear(linkedPersonListToRemove2));
        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("LINKED LIST ANIMAL");
        //print(linkedAnimalList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "заполнение", linkedAnimalList.getClass().getSimpleName(), linkedAnimalList.get(0).getClass().getSimpleName(), resultCreationAnimalLinkedList.getDuration());
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью Итератора", linkedAnimalList.getClass().getSimpleName(), linkedAnimalList.get(0).getClass().getSimpleName(), countDurationOfIteratorIteration(linkedAnimalList));
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью For", linkedAnimalList.getClass().getSimpleName(), linkedAnimalList.get(0).getClass().getSimpleName(), countDurationOfForLoopIteration(linkedAnimalList));
        //System.out.println("Встроенный компаратор");
        //System.out.println("AgeComparator");
        //Collections.sort(linkedAnimalListToSort1, new AgeComparator());
        //System.out.println(linkedAnimalListToSort1);
        //System.out.println("AgeAndNickComparator");
        //Collections.sort(linkedAnimalListToSort2, new AgeAndNickComparator());
        //System.out.println(linkedAnimalListToSort2);
        //System.out.println("Сортировка ведрами");
        //System.out.println("AgeComparator");
        //BucketSortUtil.bucketSort(linkedAnimalListToSort3, new AgeComparator());
        //System.out.println(linkedAnimalListToSort3);
        //System.out.println("AgeAndNickComparator");
        //BucketSortUtil.bucketSort(linkedAnimalListToSort4, new AgeAndNickComparator());
        //System.out.println(linkedAnimalListToSort4);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Итератора", linkedAnimalList.getClass().getSimpleName(), linkedAnimalList.get(0).getClass().getSimpleName(), countDurationOfRemovalWithIterator(linkedAnimalListToRemove1));
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Clear", linkedAnimalList.getClass().getSimpleName(), linkedAnimalList.get(0).getClass().getSimpleName(), countDurationOfRemovalWithClear(linkedAnimalListToRemove2));
        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("ARRAY LIST PERSON");
        //print(arrayPersonList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "заполнение", arrayPersonList.getClass().getSimpleName(), arrayPersonList.get(0).getClass().getSimpleName(), resultCreationPersonArrayList.getDuration());
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью Итератора", arrayPersonList.getClass().getSimpleName(), arrayPersonList.get(0).getClass().getSimpleName(), countDurationOfIteratorIteration(arrayPersonList));
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью For", arrayPersonList.getClass().getSimpleName(), arrayPersonList.get(0).getClass().getSimpleName(), countDurationOfForLoopIteration(arrayPersonList));
        //System.out.println("Встроенный компаратор");
        //System.out.println("PasswordLengthComparator");
        //Collections.sort(arrayPersonListToSort1, new PasswordLengthComparator());
        //System.out.println(arrayPersonListToSort1);
        //System.out.println("PasswordLengthAndNickComparator");
        //Collections.sort(arrayPersonListToSort2, new PasswordLengthAndNickComparator());
        //System.out.println(arrayPersonListToSort2);
        //System.out.println("Сортировка ведрами");
        //System.out.println("PasswordLengthComparator");
        //BucketSortUtil.bucketSort(arrayPersonListToSort3, new PasswordLengthComparator());
        //System.out.println(arrayPersonListToSort3);
        //System.out.println("PasswordLengthAndNickComparator");
        //BucketSortUtil.bucketSort(arrayPersonListToSort4, new PasswordLengthAndNickComparator());
        //System.out.println(arrayPersonListToSort4);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Итератора", arrayPersonList.getClass().getSimpleName(), arrayPersonList.get(0).getClass().getSimpleName(), countDurationOfRemovalWithIterator(arrayPersonListToRemove1));
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Clear", arrayPersonList.getClass().getSimpleName(), arrayPersonList.get(0).getClass().getSimpleName(), countDurationOfRemovalWithClear(arrayPersonListToRemove2));
        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("ARRAYLIST ANIMAL");
        //print(arrayAnimalList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "заполнение", arrayAnimalList.getClass().getSimpleName(), arrayAnimalList.get(0).getClass().getSimpleName(), resultCreationAnimalArrayList.getDuration());
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью Итератора", arrayAnimalList.getClass().getSimpleName(), arrayAnimalList.get(0).getClass().getSimpleName(), countDurationOfIteratorIteration(arrayAnimalList));
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью For", arrayAnimalList.getClass().getSimpleName(), arrayAnimalList.get(0).getClass().getSimpleName(), countDurationOfForLoopIteration(arrayAnimalList));
        //System.out.println("Встроенный компаратор");
        //System.out.println("AgeComparator");
        //Collections.sort(arrayAnimalListToSort1, new AgeComparator());
        //System.out.println(arrayAnimalListToSort1);
        //System.out.println("AgeAndNickComparator");
        //Collections.sort(arrayAnimalListToSort2, new AgeAndNickComparator());
        //System.out.println(arrayAnimalListToSort2);
        //System.out.println("Сортировка ведрами");
        //System.out.println("AgeComparator");
        //BucketSortUtil.bucketSort(arrayAnimalListToSort3, new AgeComparator());
        //System.out.println(arrayAnimalListToSort3);
        //System.out.println("AgeAndNickComparator");
        //BucketSortUtil.bucketSort(arrayAnimalListToSort4, new AgeAndNickComparator());
        //System.out.println(arrayAnimalListToSort4);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Итератора", arrayAnimalList.getClass().getSimpleName(), arrayAnimalList.get(0).getClass().getSimpleName(), countDurationOfRemovalWithIterator(arrayAnimalListToRemove1));
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Clear", arrayAnimalList.getClass().getSimpleName(), arrayAnimalList.get(0).getClass().getSimpleName(), countDurationOfRemovalWithClear(arrayAnimalListToRemove2));
        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("HASHSET PERSON");
        //print(personHashSet);
        System.out.printf("Операция: %s %s для класса Person. Заняла %d мс%n",
                "заполнение", personHashSet.getClass().getSimpleName(), resultCreationPersonHashSet.getDuration());
        System.out.printf("Операция: %s %s для класса Person. Заняла %d мс%n",
                "итерация с помощью Итератора", personHashSet.getClass().getSimpleName(), countDurationOfIteratorIteration(personHashSet));
        //System.out.println("Встроенный компаратор");
        //System.out.println("Сортировка ведрами");
        System.out.printf("Операция: %s %s для класса Person. Заняла %d мс%n",
                "удаления с помощью Итератора", personHashSet.getClass().getSimpleName(), countDurationOfRemovalWithIterator(personHashSetToRemove1));
        System.out.printf("Операция: %s %s для класса Person. Заняла %d мс%n",
                "удаления с помощью Clear", personHashSet.getClass().getSimpleName(), countDurationOfRemovalWithClear(personHashSetToRemove2));
        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("HASHSET ANIMAL");
        //print(animalHashSet);
        System.out.printf("Операция: %s %s для класса Animal. Заняла %d мс%n",
                "заполнение", animalHashSet.getClass().getSimpleName(), resultCreationAnimalHashSet.getDuration());
        System.out.printf("Операция: %s %s для класса Animal. Заняла %d мс%n",
                "итерация с помощью Итератора", animalHashSet.getClass().getSimpleName(), countDurationOfIteratorIteration(animalHashSet));
        //System.out.println("Встроенный компаратор");
        //System.out.println("Сортировка ведрами");
        System.out.printf("Операция: %s %s для класса Animal. Заняла %d мс%n",
                "удаления с помощью Итератора", animalHashSet.getClass().getSimpleName(), countDurationOfRemovalWithIterator(animalHashSetToRemove1));
        System.out.printf("Операция: %s %s для класса Animal. Заняла %d мс%n",
                "удаления с помощью Clear", animalHashSet.getClass().getSimpleName(), countDurationOfRemovalWithClear(animalHashSetToRemove2));
        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("TREESET PERSON");
        //print(personTreeSet);
        System.out.printf("Операция: %s %s для класса Person. Заняла %d мс%n",
                "заполнение", personTreeSet.getClass().getSimpleName(), resultCreationPersonTreeSet.getDuration());
        System.out.printf("Операция: %s %s для класса Person. Заняла %d мс%n",
                "итерация с помощью Итератора", personTreeSet.getClass().getSimpleName(), countDurationOfIteratorIteration(personTreeSet));
        System.out.println("Сортировка уже встроена в коллекцию, поэтому дополнительно реализовывать её нет смысла");
        System.out.printf("Операция: %s %s для класса Person. Заняла %d мс%n",
                "удаления с помощью Итератора", personTreeSet.getClass().getSimpleName(), countDurationOfRemovalWithIterator(personTreeSetToRemove1));
        System.out.printf("Операция: %s %s для класса Person. Заняла %d мс%n",
                "удаления с помощью Clear", personTreeSet.getClass().getSimpleName(), countDurationOfRemovalWithClear(personTreeSetToRemove2));
        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("TREESET ANIMAL");
        //print(animalTreeSet);
        System.out.printf("Операция: %s %s для класса Animal. Заняла %d мс%n",
                "заполнение", animalTreeSet.getClass().getSimpleName(), resultCreationAnimalTreeSet.getDuration());
        System.out.printf("Операция: %s %s для класса Animal. Заняла %d мс%n",
                "итерация с помощью Итератора", animalTreeSet.getClass().getSimpleName(), countDurationOfIteratorIteration(animalTreeSet));
        System.out.println("Сортировка уже встроена в коллекцию, поэтому дополнительно реализовывать её нет смысла");
        System.out.printf("Операция: %s %s для класса Animal. Заняла %d мс%n",
                "удаления с помощью Итератора", animalTreeSet.getClass().getSimpleName(), countDurationOfRemovalWithIterator(animalTreeSetToRemove1));
        System.out.printf("Операция: %s %s для класса Animal. Заняла %d мс%n",
                "удаления с помощью Clear", animalTreeSet.getClass().getSimpleName(), countDurationOfRemovalWithClear(animalTreeSetToRemove2));
    }
}

