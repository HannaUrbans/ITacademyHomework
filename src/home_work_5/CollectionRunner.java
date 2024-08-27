package home_work_5;

import home_work_5.api.ReturnUtil;
import home_work_5.api.comparators.AgeAndNickComparator;
import home_work_5.api.comparators.AgeComparator;
import home_work_5.api.comparators.PasswordLengthAndNickComparator;
import home_work_5.api.comparators.PasswordLengthComparator;

import java.util.*;

import static home_work_5.api.IterationUtil.*;
import static home_work_5.api.RemovalUtil.countDurationOfRemovalWithClear;
import static home_work_5.api.RemovalUtil.countDurationOfRemovalWithIterator;
import static home_work_5.api.comparators.DurationSortOperations.*;

public class CollectionRunner {
    public static void main(String[] args) {

        ReturnUtil<List<Person>> resultCreationPersonLinkedList = CollectionCreation.generatePersonLinkedList();
        List<Person> linkedPersonList = resultCreationPersonLinkedList.getResult();
        List<Person> linkedPersonListToSort1 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToSort2 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToSort3 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToSort4 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToRemove1 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToRemove2 = new LinkedList<>(linkedPersonList);

        ReturnUtil<List<Animal>> resultCreationAnimalLinkedList = CollectionCreation.generateAnimalLinkedList();
        List<Animal> linkedAnimalList = resultCreationAnimalLinkedList.getResult();
        List<Animal> linkedAnimalListToSort1 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToSort2 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToSort3 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToSort4 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToRemove1 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToRemove2 = new LinkedList<>(linkedAnimalList);

        ReturnUtil<List<Person>> resultCreationPersonArrayList = CollectionCreation.generatePersonArrayList();
        List<Person> arrayPersonList = resultCreationPersonArrayList.getResult();
        List<Person> arrayPersonListToSort1 = new ArrayList<>(arrayPersonList);
        List<Person> arrayPersonListToSort2 = new ArrayList<>(arrayPersonList);
        List<Person> arrayPersonListToSort3 = new ArrayList<>(arrayPersonList);
        List<Person> arrayPersonListToSort4 = new ArrayList<>(arrayPersonList);
        List<Person> arrayPersonListToRemove1 = new ArrayList<>(arrayPersonList);
        List<Person> arrayPersonListToRemove2 = new ArrayList<>(arrayPersonList);

        ReturnUtil<List<Animal>> resultCreationAnimalArrayList = CollectionCreation.generateAnimalArrayList();
        List<Animal> arrayAnimalList = resultCreationAnimalArrayList.getResult();
        List<Animal> arrayAnimalListToSort1 = new ArrayList<>(arrayAnimalList);
        List<Animal> arrayAnimalListToSort2 = new ArrayList<>(arrayAnimalList);
        List<Animal> arrayAnimalListToSort3 = new ArrayList<>(arrayAnimalList);
        List<Animal> arrayAnimalListToSort4 = new ArrayList<>(arrayAnimalList);
        List<Animal> arrayAnimalListToRemove1 = new ArrayList<>(arrayAnimalList);
        List<Animal> arrayAnimalListToRemove2 = new ArrayList<>(arrayAnimalList);

        ReturnUtil<Set<Person>> resultCreationPersonHashSet = CollectionCreation.generatePersonHashSet();
        Set<Person> personHashSet = resultCreationPersonHashSet.getResult();
        Set<Person> personHashSetToSort1 = new HashSet<>(personHashSet);
        Set<Person> personHashSetToSort2 = new HashSet<>(personHashSet);
        Set<Person> personHashSetToSort3 = new HashSet<>(personHashSet);
        Set<Person> personHashSetToSort4 = new HashSet<>(personHashSet);
        Set<Person> personHashSetToSort5 = new HashSet<>(personHashSet);
        Set<Person> personHashSetToSort6 = new HashSet<>(personHashSet);
        Set<Person> personHashSetToSort7 = new HashSet<>(personHashSet);
        Set<Person> personHashSetToSort8 = new HashSet<>(personHashSet);
        Set<Person> personHashSetToRemove1 = new HashSet<>(personHashSet);
        Set<Person> personHashSetToRemove2 = new HashSet<>(personHashSet);

        ReturnUtil<Set<Animal>> resultCreationAnimalHashSet = CollectionCreation.generateAnimalHashSet();
        Set<Animal> animalHashSet = resultCreationAnimalHashSet.getResult();
        Set<Animal> animalHashSetToSort1 = new HashSet<>(animalHashSet);
        Set<Animal> animalHashSetToSort2 = new HashSet<>(animalHashSet);
        Set<Animal> animalHashSetToSort3 = new HashSet<>(animalHashSet);
        Set<Animal> animalHashSetToSort4 = new HashSet<>(animalHashSet);
        Set<Animal> animalHashSetToSort5 = new HashSet<>(animalHashSet);
        Set<Animal> animalHashSetToSort6 = new HashSet<>(animalHashSet);
        Set<Animal> animalHashSetToSort7 = new HashSet<>(animalHashSet);
        Set<Animal> animalHashSetToSort8 = new HashSet<>(animalHashSet);
        Set<Animal> animalHashSetToRemove1 = new HashSet<>(animalHashSet);
        Set<Animal> animalHashSetToRemove2 = new HashSet<>(animalHashSet);

        ReturnUtil<Set<Person>> resultCreationPersonTreeSet = CollectionCreation.generatePersonTreeSet();
        Set<Person> personTreeSet = resultCreationPersonTreeSet.getResult();
        Set<Person> personTreeSetToRemove1 = new TreeSet<>(new PasswordLengthAndNickComparator());
        personTreeSetToRemove1.addAll(personTreeSet);
        Set<Person> personTreeSetToRemove2 = new TreeSet<>(new PasswordLengthAndNickComparator());
        personTreeSetToRemove2.addAll(personTreeSet);

        ReturnUtil<Set<Animal>> resultCreationAnimalTreeSet = CollectionCreation.generateAnimalTreeSet();
        Set<Animal> animalTreeSet = resultCreationAnimalTreeSet.getResult();
        Set<Animal> animalTreeSetToRemove1 = new TreeSet<>(new AgeAndNickComparator());
        animalTreeSetToRemove1.addAll(animalTreeSet);
        Set<Animal> animalTreeSetToRemove2 = new TreeSet<>(new AgeAndNickComparator());
        animalTreeSetToRemove2.addAll(animalTreeSet);

        System.out.println("LINKED LIST PERSON");
        //print(linkedPersonList);
        printResults("заполнение", linkedPersonList, resultCreationPersonLinkedList.getDuration());
        printResults("итерация с помощью Итератора", linkedPersonList, countDurationOfIteratorIteration(linkedPersonList));
        printResults("итерация с помощью конвертации в массив", linkedPersonList, countDurationOfWithConvertationIntoArrayIteration(linkedPersonList, Person.class));
        printResults("удаления с помощью Итератора", linkedPersonList, countDurationOfRemovalWithIterator(linkedPersonListToRemove1));
        printResults("удаления с помощью Clear", linkedPersonList, countDurationOfRemovalWithClear(linkedPersonListToRemove2));
        printResults("Стандартная сортировка. PasswordLengthComparator",linkedPersonList, measureDurationStandardComparator(linkedPersonListToSort1, new PasswordLengthComparator()));
        printResults("Стандартная сортировка. PasswordLengthAndNickComparator",linkedPersonList, measureDurationStandardComparator(linkedPersonListToSort2, new PasswordLengthAndNickComparator()));
        printResults("Пузырьковая сортировка. PasswordLengthComparator",linkedPersonList, measureDurationBubbleComparator(linkedPersonListToSort3, new PasswordLengthComparator()));
        printResults("Пузырьковая сортировка. PasswordLengthAndNickComparator",linkedPersonList, measureDurationBubbleComparator(linkedPersonListToSort4, new PasswordLengthAndNickComparator()));

        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("LINKED LIST ANIMAL");
        //print(linkedAnimalList);
        printResults("заполнение", linkedAnimalList, resultCreationAnimalLinkedList.getDuration());
        printResults("итерация с помощью Итератора", linkedAnimalList, countDurationOfIteratorIteration(linkedAnimalList));
        printResults("итерация с помощью конвертации в массив", linkedAnimalList, countDurationOfWithConvertationIntoArrayIteration(linkedAnimalList, Animal.class));
        printResults("удаления с помощью Итератора", linkedAnimalList, countDurationOfRemovalWithIterator(linkedAnimalListToRemove1));
        printResults("удаления с помощью Clear", linkedAnimalList, countDurationOfRemovalWithClear(linkedAnimalListToRemove2));
        printResults("Стандартная сортировка. AgeComparator",linkedAnimalList, measureDurationStandardComparator(linkedAnimalListToSort1, new AgeComparator()));
        printResults("Стандартная сортировка. AgeAndNickComparator",linkedAnimalList, measureDurationStandardComparator(linkedAnimalListToSort2, new AgeAndNickComparator()));
        printResults("Пузырьковая сортировка. AgeComparator",linkedAnimalList, measureDurationBubbleComparator(linkedAnimalListToSort3, new AgeComparator()));
        printResults("Пузырьковая сортировка. AgeAndNickComparator",linkedAnimalList, measureDurationBubbleComparator(linkedAnimalListToSort4, new AgeAndNickComparator()));

        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("ARRAY LIST PERSON");
        //print(arrayPersonList);
        printResults("заполнение", arrayPersonList, resultCreationPersonArrayList.getDuration());
        printResults("итерация с помощью Итератора", arrayPersonList, countDurationOfIteratorIteration(arrayPersonList));
        printResults("итерация с помощью конвертации в массив", arrayPersonList, countDurationOfWithConvertationIntoArrayIteration(arrayPersonList, Person.class));
        printResults("удаления с помощью Итератора", arrayPersonList, countDurationOfRemovalWithIterator(arrayPersonListToRemove1));
        printResults("удаления с помощью Clear", arrayPersonList, countDurationOfRemovalWithClear(arrayPersonListToRemove2));
        printResults("Стандартная сортировка. PasswordLengthComparator",arrayPersonList, measureDurationStandardComparator(arrayPersonListToSort1, new PasswordLengthComparator()));
        printResults("Стандартная сортировка. PasswordLengthAndNickComparator",arrayPersonList, measureDurationStandardComparator(arrayPersonListToSort2, new PasswordLengthAndNickComparator()));
        printResults("Пузырьковая сортировка. PasswordLengthComparator",arrayPersonList, measureDurationBubbleComparator(arrayPersonListToSort3, new PasswordLengthComparator()));
        printResults("Пузырьковая сортировка. PasswordLengthAndNickComparator",arrayPersonList, measureDurationBubbleComparator(arrayPersonListToSort4, new PasswordLengthAndNickComparator()));

        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("ARRAYLIST ANIMAL");
        //print(arrayAnimalList);
        printResults("заполнение", arrayAnimalList, resultCreationAnimalArrayList.getDuration());
        printResults("итерация с помощью Итератора", arrayAnimalList, countDurationOfIteratorIteration(arrayAnimalList));
        printResults("итерация с помощью конвертации в массив", arrayAnimalList, countDurationOfWithConvertationIntoArrayIteration(arrayAnimalList, Animal.class));
        printResults("удаления с помощью Итератора", arrayAnimalList, countDurationOfRemovalWithIterator(arrayAnimalListToRemove1));
        printResults("удаления с помощью Clear", arrayAnimalList, countDurationOfRemovalWithClear(arrayAnimalListToRemove2));
        printResults("Стандартная сортировка. AgeComparator",arrayAnimalList, measureDurationStandardComparator(arrayAnimalListToSort1, new AgeComparator()));
        printResults("Стандартная сортировка. AgeAndNickComparator",arrayAnimalList, measureDurationStandardComparator(arrayAnimalListToSort2, new AgeAndNickComparator()));
        printResults("Пузырьковая сортировка. AgeComparator",arrayAnimalList, measureDurationBubbleComparator(arrayAnimalListToSort3, new AgeComparator()));
        printResults("Пузырьковая сортировка. AgeAndNickComparator",arrayAnimalList, measureDurationBubbleComparator(arrayAnimalListToSort4, new AgeAndNickComparator()));

        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("HASHSET PERSON");
        //print(personHashSet);
        printResults("заполнение", personHashSet, resultCreationPersonHashSet.getDuration());
        printResults("итерация с помощью Итератора", personHashSet, countDurationOfIteratorIteration(personHashSet));
        printResults("итерация с помощью конвертации в массив", personHashSet, countDurationOfWithConvertationIntoArrayIteration(personHashSet, Person.class));
        printResults("удаления с помощью Итератора", personHashSet, countDurationOfRemovalWithIterator(personHashSetToRemove1));
        printResults("удаления с помощью Clear", personHashSet, countDurationOfRemovalWithClear(personHashSetToRemove2));
        printResults("Сортировка посредством конвертации в массив (с помощью Arrays.sort). PasswordLengthComparator",personHashSet, measureSortWithConvertationIntoArray(personHashSetToSort1, Person.class, new PasswordLengthComparator()));
        printResults("Сортировка посредством конвертации в массив (с помощью Arrays.sort). PasswordLengthAndNickComparator",personHashSet, measureSortWithConvertationIntoArray(personHashSetToSort2, Person.class, new PasswordLengthAndNickComparator()));
        printResults("Сортировка стандартная посредством конвертации в List. PasswordLengthComparator",personHashSet, measureSortWithConvertationIntoListStandardSort(personHashSetToSort3, new PasswordLengthComparator()));
        printResults("Сортировка стандартная посредством конвертации в List. PasswordLengthAndNickComparator",personHashSet, measureSortWithConvertationIntoListStandardSort(personHashSetToSort4, new PasswordLengthAndNickComparator()));
        printResults("Сортировка пузырьковая посредством конвертации в List. PasswordLengthComparator",personHashSet, measureSortWithConvertationIntoListBubbleSort(personHashSetToSort5, new PasswordLengthComparator()));
        printResults("Сортировка пузырьковая посредством конвертации в List. PasswordLengthAndNickComparator",personHashSet, measureSortWithConvertationIntoListBubbleSort(personHashSetToSort6, new PasswordLengthAndNickComparator()));
        printResults("Сортировка посредством конвертации в TreeSet. PasswordLengthComparator",personHashSet, measureSortWithConvertationIntoTreeset(personHashSetToSort7, new PasswordLengthComparator()));
        printResults("Сортировка посредством конвертации в TreeSet. PasswordLengthAndNickComparator",personHashSet, measureSortWithConvertationIntoTreeset(personHashSetToSort8, new PasswordLengthAndNickComparator()));

        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("HASHSET ANIMAL");
        //print(animalHashSet);
        printResults("заполнение", animalHashSet, resultCreationAnimalHashSet.getDuration());
        printResults("итерация с помощью Итератора", animalHashSet, countDurationOfIteratorIteration(animalHashSet));
        printResults("итерация с помощью конвертации в массив", animalHashSet, countDurationOfWithConvertationIntoArrayIteration(animalHashSet, Animal.class));
        printResults("удаления с помощью Итератора", animalHashSet, countDurationOfRemovalWithIterator(animalHashSetToRemove1));
        printResults("удаления с помощью Clear", animalHashSet, countDurationOfRemovalWithClear(animalHashSetToRemove2));
        printResults("Сортировка посредством конвертации в массив (с помощью Arrays.sort). AgeComparator",animalHashSet, measureSortWithConvertationIntoArray(animalHashSetToSort1, Animal.class, new AgeComparator()));
        printResults("Сортировка посредством конвертации в массив (с помощью Arrays.sort). AgeAndNickComparator",animalHashSet, measureSortWithConvertationIntoArray(animalHashSetToSort2, Animal.class, new AgeAndNickComparator()));
        printResults("Сортировка стандартная посредством конвертации в List. AgeComparator",animalHashSet, measureSortWithConvertationIntoListStandardSort(animalHashSetToSort3, new AgeComparator()));
        printResults("Сортировка стандартная посредством конвертации в List. AgeAndNickComparator",animalHashSet, measureSortWithConvertationIntoListStandardSort(animalHashSetToSort4, new AgeAndNickComparator()));
        printResults("Сортировка пузырьковая посредством конвертации в List. AgeComparator",animalHashSet, measureSortWithConvertationIntoListBubbleSort(animalHashSetToSort5, new AgeComparator()));
        printResults("Сортировка пузырьковая посредством конвертации в List. AgeAndNickComparator",animalHashSet, measureSortWithConvertationIntoListBubbleSort(animalHashSetToSort6, new AgeAndNickComparator()));
        printResults("Сортировка посредством конвертации в TreeSet. AgeComparator",animalHashSet, measureSortWithConvertationIntoTreeset(animalHashSetToSort7, new AgeComparator()));
        printResults("Сортировка посредством конвертации в TreeSet. AgeAndNickComparator",animalHashSet, measureSortWithConvertationIntoTreeset(animalHashSetToSort8, new AgeAndNickComparator()));


        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("TREESET PERSON");
        //print(personTreeSet);
        printResults("заполнение", personTreeSet, resultCreationPersonTreeSet.getDuration());
        printResults("итерация с помощью Итератора", personTreeSet, countDurationOfIteratorIteration(personTreeSet));
        printResults("итерация с помощью конвертации в массив", personTreeSet, countDurationOfWithConvertationIntoArrayIteration(personTreeSet, Person.class));
        printResults("удаления с помощью Итератора", personTreeSet, countDurationOfRemovalWithIterator(personTreeSetToRemove1));
        printResults("удаления с помощью Clear", personTreeSet, countDurationOfRemovalWithClear(personTreeSetToRemove2));
        System.out.println("Сортировка уже встроена в коллекцию, поэтому дополнительно реализовывать её нет смысла");
        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("TREESET ANIMAL");
        //print(animalTreeSet);
        printResults("заполнение", animalTreeSet, resultCreationAnimalTreeSet.getDuration());
        printResults("итерация с помощью Итератора", animalTreeSet, countDurationOfIteratorIteration(animalTreeSet));
        printResults("итерация с помощью конвертации в массив", animalTreeSet, countDurationOfWithConvertationIntoArrayIteration(animalTreeSet, Animal.class));
        printResults("удаления с помощью Итератора", animalTreeSet, countDurationOfRemovalWithIterator(animalTreeSetToRemove1));
        printResults("удаления с помощью Clear", animalTreeSet, countDurationOfRemovalWithClear(animalTreeSetToRemove2));
        System.out.println("Сортировка уже встроена в коллекцию, поэтому дополнительно реализовывать её нет смысла");
    }

    private static void printResults(String operation, Collection<?> collection, long duration) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Коллекция пустая");
        }

        String collectionClassName = collection.getClass().getSimpleName();

        Iterator<?> iterator = collection.iterator();
        String elementClassName = iterator.next().getClass().getSimpleName();
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                operation, collectionClassName, elementClassName, duration);
    }
}
