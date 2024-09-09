package home_work_5.folderToCorrect;

import home_work_5.folderToCorrect.api.ReturnUtil;
import home_work_5.folderToCorrect.api.comparators.AgeAndNickComparator;
import home_work_5.folderToCorrect.api.comparators.PasswordLengthAndNickComparator;
import home_work_5.folderToCorrect.api.comparators.PasswordLengthComparator;

import java.util.*;

import static home_work_5.folderToCorrect.CollectionCreation.*;
import static home_work_5.folderToCorrect.api.IterationUtil.countDurationOfIteratorIteration;
import static home_work_5.folderToCorrect.api.IterationUtil.countDurationOfWithConvertationIntoArrayIteration;
import static home_work_5.folderToCorrect.api.RemovalUtil.countDurationOfRemovalWithClear;
import static home_work_5.folderToCorrect.api.RemovalUtil.countDurationOfRemovalWithIterator;
import static home_work_5.folderToCorrect.api.comparators.DurationSortOperations.measureDurationQuickSortComparator;
import static home_work_5.folderToCorrect.api.comparators.DurationSortOperations.measureDurationStandardComparator;

public class CollectionRunner {
    public static void main(String[] args) {

        // Создаем массив Person
        Person[] personArray = createArray(Person.class);
        // Создаем массив Animal
        Animal[] animalArray = createArray(Animal.class);

        ReturnUtil<List<Person>> resultCreationPersonLinkedList1 = generatePersonLinkedList1(personArray);
        ReturnUtil<List<Person>> resultCreationPersonLinkedList2 = generatePersonLinkedList2();
        List<Person> linkedPersonList = resultCreationPersonLinkedList1.getResult();
        List<Person> linkedPersonListToSort1 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToSort2 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToSort3 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToSort4 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToRemove1 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToRemove2 = new LinkedList<>(linkedPersonList);

        ReturnUtil<List<Animal>> resultCreationAnimalLinkedList1 = generateAnimalLinkedList1(animalArray);
        ReturnUtil<List<Animal>> resultCreationAnimalLinkedList2 = generateAnimalLinkedList2();
        List<Animal> linkedAnimalList = resultCreationAnimalLinkedList1.getResult();
        List<Animal> linkedAnimalListToSort1 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToSort2 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToSort3 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToSort4 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToRemove1 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToRemove2 = new LinkedList<>(linkedAnimalList);

        ReturnUtil<List<Person>> resultCreationPersonArrayList1 = CollectionCreation.generatePersonArrayList1(personArray);
        ReturnUtil<List<Person>> resultCreationPersonArrayList2 = CollectionCreation.generatePersonArrayList2();
        List<Person> arrayPersonList = resultCreationPersonArrayList1.getResult();
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

        ReturnUtil<Set<Person>> resultCreationPersonHashSet1 = CollectionCreation.generatePersonHashSet1(personArray);
        ReturnUtil<Set<Person>> resultCreationPersonHashSet2 = CollectionCreation.generatePersonHashSet2();
        Set<Person> personHashSet = resultCreationPersonHashSet1.getResult();
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

        ReturnUtil<Set<Person>> resultCreationPersonTreeSet1 = CollectionCreation.generatePersonTreeSet1(personArray);
        ReturnUtil<Set<Person>> resultCreationPersonTreeSet2 = CollectionCreation.generatePersonTreeSet2();
        Set<Person> personTreeSet = resultCreationPersonTreeSet1.getResult();
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
        printResults("тестовое заполнение метода с лямбдами", generatePersonLinkedList0().getResult(), generatePersonLinkedList0().getDuration());
        printResults("заполнение через создание массива и конвертации массива в ", linkedPersonList, resultCreationPersonLinkedList1.getDuration());
        printResults("заполнение через add", linkedPersonList, resultCreationPersonLinkedList2.getDuration());
        printResults("итерация с помощью Итератора", linkedPersonList, countDurationOfIteratorIteration(linkedPersonList));
        printResults("итерация с помощью конвертации в массив", linkedPersonList, countDurationOfWithConvertationIntoArrayIteration(linkedPersonList, Person.class));
        printResults("удаления с помощью Итератора", linkedPersonList, countDurationOfRemovalWithIterator(linkedPersonListToRemove1));
        printResults("удаления с помощью Clear", linkedPersonList, countDurationOfRemovalWithClear(linkedPersonListToRemove2));
        printResults("Стандартная сортировка. PasswordLengthComparator",linkedPersonList, measureDurationStandardComparator(linkedPersonListToSort1, new PasswordLengthComparator()));
        printResults("Стандартная сортировка. PasswordLengthAndNickComparator",linkedPersonList, measureDurationStandardComparator(linkedPersonListToSort2, new PasswordLengthAndNickComparator()));
        printResults("Алгоритм быстрой сортировки. PasswordLengthComparator",linkedPersonList, measureDurationQuickSortComparator(linkedPersonListToSort3, new PasswordLengthComparator()));
        printResults("Алгоритм быстрой сортировки. PasswordLengthAndNickComparator",linkedPersonList, measureDurationQuickSortComparator(linkedPersonListToSort4, new PasswordLengthAndNickComparator()));

        System.out.println("____________________________________________");
        System.out.println();

      /**  System.out.println("LINKED LIST ANIMAL");
        //print(linkedAnimalList);
        printResults("заполнение через создание массива и конвертации массива в ", linkedAnimalList, resultCreationAnimalLinkedList1.getDuration());
        printResults("заполнение", linkedAnimalList, resultCreationAnimalLinkedList2.getDuration());
        printResults("итерация с помощью Итератора", linkedAnimalList, countDurationOfIteratorIteration(linkedAnimalList));
        printResults("итерация с помощью конвертации в массив", linkedAnimalList, countDurationOfWithConvertationIntoArrayIteration(linkedAnimalList, Animal.class));
        printResults("удаления с помощью Итератора", linkedAnimalList, countDurationOfRemovalWithIterator(linkedAnimalListToRemove1));
        printResults("удаления с помощью Clear", linkedAnimalList, countDurationOfRemovalWithClear(linkedAnimalListToRemove2));
        printResults("Стандартная сортировка. AgeComparator", linkedAnimalList, measureDurationStandardComparator(linkedAnimalListToSort1, new AgeComparator()));
        printResults("Стандартная сортировка. AgeAndNickComparator", linkedAnimalList, measureDurationStandardComparator(linkedAnimalListToSort2, new AgeAndNickComparator()));
        printResults("Алгоритм быстрой сортировки. AgeComparator", linkedAnimalList, measureDurationQuickSortComparator(linkedAnimalListToSort3, new AgeComparator()));
        printResults("Алгоритм быстрой сортировки. AgeAndNickComparator", linkedAnimalList, measureDurationQuickSortComparator(linkedAnimalListToSort4, new AgeAndNickComparator()));

        System.out.println("____________________________________________");
        System.out.println();
*/
      /**  System.out.println("ARRAYLIST PERSON");
        //print(arrayPersonList);
        printResults("тестовое заполнение метода с лямбдами", generatePersonArrayList0().getResult(), generatePersonArrayList0().getDuration());
        printResults("заполнение через создание массива и конвертации массива в ", arrayPersonList, resultCreationPersonArrayList1.getDuration());
        printResults("заполнение через add", arrayPersonList, resultCreationPersonArrayList2.getDuration());
        printResults("итерация с помощью Итератора", arrayPersonList, countDurationOfIteratorIteration(arrayPersonList));
        printResults("итерация с помощью конвертации в массив", arrayPersonList, countDurationOfWithConvertationIntoArrayIteration(arrayPersonList, Person.class));
        printResults("удаления с помощью Итератора", arrayPersonList, countDurationOfRemovalWithIterator(arrayPersonListToRemove1));
        printResults("удаления с помощью Clear", arrayPersonList, countDurationOfRemovalWithClear(arrayPersonListToRemove2));
        printResults("Стандартная сортировка. PasswordLengthComparator", arrayPersonList, measureDurationStandardComparator(arrayPersonListToSort1, new PasswordLengthComparator()));
        printResults("Стандартная сортировка. PasswordLengthAndNickComparator", arrayPersonList, measureDurationStandardComparator(arrayPersonListToSort2, new PasswordLengthAndNickComparator()));
        printResults("Алгоритм быстрой сортировки. PasswordLengthComparator", arrayPersonList, measureDurationQuickSortComparator(arrayPersonListToSort3, new PasswordLengthComparator()));
        printResults("Алгоритм быстрой сортировки. PasswordLengthAndNickComparator", arrayPersonList, measureDurationQuickSortComparator(arrayPersonListToSort4, new PasswordLengthAndNickComparator()));

        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("ARRAYLIST ANIMAL");
        //print(arrayAnimalList);
        printResults("заполнение", arrayAnimalList, resultCreationAnimalArrayList.getDuration());
        printResults("итерация с помощью Итератора", arrayAnimalList, countDurationOfIteratorIteration(arrayAnimalList));
        printResults("итерация с помощью конвертации в массив", arrayAnimalList, countDurationOfWithConvertationIntoArrayIteration(arrayAnimalList, Animal.class));
        printResults("удаления с помощью Итератора", arrayAnimalList, countDurationOfRemovalWithIterator(arrayAnimalListToRemove1));
        printResults("удаления с помощью Clear", arrayAnimalList, countDurationOfRemovalWithClear(arrayAnimalListToRemove2));
        printResults("Стандартная сортировка. AgeComparator", arrayAnimalList, measureDurationStandardComparator(arrayAnimalListToSort1, new AgeComparator()));
        printResults("Стандартная сортировка. AgeAndNickComparator", arrayAnimalList, measureDurationStandardComparator(arrayAnimalListToSort2, new AgeAndNickComparator()));
        printResults("Алгоритм быстрой сортировки. AgeComparator", arrayAnimalList, measureDurationQuickSortComparator(arrayAnimalListToSort3, new AgeComparator()));
        printResults("Алгоритм быстрой сортировки. AgeAndNickComparator", arrayAnimalList, measureDurationQuickSortComparator(arrayAnimalListToSort4, new AgeAndNickComparator()));

        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("HASHSET PERSON");
        //print(personHashSet);
        printResults("тестовое заполнение метода с лямбдами", generatePersonHashset0().getResult(), generatePersonHashset0().getDuration());
        printResults("заполнение через создание массива и конвертации массива в ", personHashSet, resultCreationPersonHashSet1.getDuration());
        printResults("заполнение через add", personHashSet, resultCreationPersonHashSet2.getDuration());
        printResults("итерация с помощью Итератора", personHashSet, countDurationOfIteratorIteration(personHashSet));
        printResults("итерация с помощью конвертации в массив", personHashSet, countDurationOfWithConvertationIntoArrayIteration(personHashSet, Person.class));
        printResults("удаления с помощью Итератора", personHashSet, countDurationOfRemovalWithIterator(personHashSetToRemove1));
        printResults("удаления с помощью Clear", personHashSet, countDurationOfRemovalWithClear(personHashSetToRemove2));
        printResults("Сортировка посредством конвертации в массив (с помощью Arrays.sort). PasswordLengthComparator", personHashSet, measureSortWithConvertationIntoArray(personHashSetToSort1, Person.class, new PasswordLengthComparator()));
        printResults("Сортировка посредством конвертации в массив (с помощью Arrays.sort). PasswordLengthAndNickComparator", personHashSet, measureSortWithConvertationIntoArray(personHashSetToSort2, Person.class, new PasswordLengthAndNickComparator()));
        printResults("Сортировка стандартная посредством конвертации в List. PasswordLengthComparator", personHashSet, measureSortWithConvertationIntoListStandardSort(personHashSetToSort3, new PasswordLengthComparator()));
        printResults("Сортировка стандартная посредством конвертации в List. PasswordLengthAndNickComparator", personHashSet, measureSortWithConvertationIntoListStandardSort(personHashSetToSort4, new PasswordLengthAndNickComparator()));
       printResults("Быстрая сортировка посредством конвертации в List. PasswordLengthComparator",personHashSet, measureSortWithConvertationIntoListQuickSort(personHashSetToSort5, new PasswordLengthComparator()));
        printResults("Быстрая сортировка посредством конвертации в List. PasswordLengthAndNickComparator",personHashSet, measureSortWithConvertationIntoListQuickSort(personHashSetToSort6, new PasswordLengthAndNickComparator()));
        printResults("Сортировка посредством конвертации в TreeSet. PasswordLengthComparator", personHashSet, measureSortWithConvertationIntoTreeset(personHashSetToSort7, new PasswordLengthComparator()));
        printResults("Сортировка посредством конвертации в TreeSet. PasswordLengthAndNickComparator", personHashSet, measureSortWithConvertationIntoTreeset(personHashSetToSort8, new PasswordLengthAndNickComparator()));

        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("HASHSET ANIMAL");
        //print(animalHashSet);
        printResults("заполнение", animalHashSet, resultCreationAnimalHashSet.getDuration());
        printResults("итерация с помощью Итератора", animalHashSet, countDurationOfIteratorIteration(animalHashSet));
        printResults("итерация с помощью конвертации в массив", animalHashSet, countDurationOfWithConvertationIntoArrayIteration(animalHashSet, Animal.class));
        printResults("удаления с помощью Итератора", animalHashSet, countDurationOfRemovalWithIterator(animalHashSetToRemove1));
        printResults("удаления с помощью Clear", animalHashSet, countDurationOfRemovalWithClear(animalHashSetToRemove2));
        printResults("Сортировка посредством конвертации в массив (с помощью Arrays.sort). AgeComparator", animalHashSet, measureSortWithConvertationIntoArray(animalHashSetToSort1, Animal.class, new AgeComparator()));
        printResults("Сортировка посредством конвертации в массив (с помощью Arrays.sort). AgeAndNickComparator", animalHashSet, measureSortWithConvertationIntoArray(animalHashSetToSort2, Animal.class, new AgeAndNickComparator()));
        printResults("Сортировка стандартная посредством конвертации в List. AgeComparator", animalHashSet, measureSortWithConvertationIntoListStandardSort(animalHashSetToSort3, new AgeComparator()));
        printResults("Сортировка стандартная посредством конвертации в List. AgeAndNickComparator", animalHashSet, measureSortWithConvertationIntoListStandardSort(animalHashSetToSort4, new AgeAndNickComparator()));
        printResults("Быстрая сортировка посредством конвертации в List. AgeComparator", animalHashSet, measureSortWithConvertationIntoListQuickSort(animalHashSetToSort5, new AgeComparator()));
        printResults("Быстрая сортировка посредством конвертации в List. AgeAndNickComparator", animalHashSet, measureSortWithConvertationIntoListQuickSort(animalHashSetToSort6, new AgeAndNickComparator()));
        printResults("Сортировка посредством конвертации в TreeSet. AgeComparator", animalHashSet, measureSortWithConvertationIntoTreeset(animalHashSetToSort7, new AgeComparator()));
        printResults("Сортировка посредством конвертации в TreeSet. AgeAndNickComparator", animalHashSet, measureSortWithConvertationIntoTreeset(animalHashSetToSort8, new AgeAndNickComparator()));


        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("TREESET PERSON");
        //print(personTreeSet);
        printResults("заполнение через создание массива и конвертации массива в ", personTreeSet, resultCreationPersonHashSet1.getDuration());
        printResults("заполнение через add", personTreeSet, resultCreationPersonTreeSet2.getDuration());
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
        System.out.println("Сортировка уже встроена в коллекцию, поэтому дополнительно реализовывать её нет смысла");*/
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
