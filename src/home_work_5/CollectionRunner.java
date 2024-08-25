package home_work_5;

import home_work_5.api.ReturnUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static home_work_5.api.IterationUtil.countDurationOfForLoopIteration;
import static home_work_5.api.IterationUtil.countDurationOfIteratorIteration;
import static home_work_5.api.RemovalUtil.countDurationOfRemovalWithClear;
import static home_work_5.api.RemovalUtil.countDurationOfRemovalWithIterator;

public class CollectionRunner {
    public static void main(String[] args) {

        ReturnUtil<List<Person>> resultCreationPersonLinkedList = CollectionCreation.generatePersonLinkedList();
        List<Person> linkedPersonList = resultCreationPersonLinkedList.getResult();
        long durationCreationPersonLinkedList = resultCreationPersonLinkedList.getDuration();
        long durationIterationWithIteratorPersonLinkedList = countDurationOfIteratorIteration(linkedPersonList);
        long durationIterationWithForLoopPersonLinkedList = countDurationOfForLoopIteration(linkedPersonList);
        //long durationIterationWithForEachPersonLinkedList = countDurationOfForEachIteration(linkedPersonList);
        //List<Person> linkedPersonListToSort1 = new LinkedList<>(linkedPersonList);
        //List<Person> linkedPersonListToSort2 = new LinkedList<>(linkedPersonList);
        //List<Person> linkedPersonListToSort3 = new LinkedList<>(linkedPersonList);
        //List<Person> linkedPersonListToSort4 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToRemove1 = new LinkedList<>(linkedPersonList);
        List<Person> linkedPersonListToRemove2 = new LinkedList<>(linkedPersonList);
        long durationOfRemovalPersonLinkedListWithIterator = countDurationOfRemovalWithIterator(linkedPersonListToRemove1);
        long durationOfRemovalPersonLinkedListWithClear = countDurationOfRemovalWithClear(linkedPersonListToRemove2);

        ReturnUtil<List<Animal>> resultCreationAnimalLinkedList = CollectionCreation.generateAnimalLinkedList();
        List<Animal> linkedAnimalList = resultCreationAnimalLinkedList.getResult();
        long durationCreationAnimalLinkedList = resultCreationAnimalLinkedList.getDuration();
        long durationIterationWithIteratorAnimalLinkedList = countDurationOfIteratorIteration(linkedAnimalList);
        long durationIterationWithForLoopAnimalLinkedList = countDurationOfForLoopIteration(linkedAnimalList);
        //List<Animal> linkedAnimalListToSort1 = new LinkedList<>(linkedAnimalList);
        //List<Animal> linkedAnimalListToSort2 = new LinkedList<>(linkedAnimalList);
        //List<Animal> linkedAnimalListToSort3 = new LinkedList<>(linkedAnimalList);
        //List<Animal> linkedAnimalListToSort4 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToRemove1 = new LinkedList<>(linkedAnimalList);
        List<Animal> linkedAnimalListToRemove2 = new LinkedList<>(linkedAnimalList);
        long durationOfRemovalAnimalLinkedListWithIterator = countDurationOfRemovalWithIterator(linkedAnimalListToRemove1);
        long durationOfRemovalAnimalLinkedListWithClear = countDurationOfRemovalWithClear(linkedAnimalListToRemove2);

        ReturnUtil<List<Person>> resultCreationPersonArrayList = CollectionCreation.generatePersonArrayList();
        List<Person> arrayPersonList = resultCreationPersonArrayList.getResult();
        long durationCreationPersonArrayList = resultCreationPersonArrayList.getDuration();
        long durationIterationWithIteratorPersonArrayList = countDurationOfIteratorIteration(arrayPersonList);
        long durationIterationWithForLoopPersonArrayList = countDurationOfForLoopIteration(arrayPersonList);
        //long durationIterationWithForEachPersonArrayList = countDurationOfForEachIteration(arrayPersonList);
        //List<Person> arrayPersonListToSort1 = new ArrayList<>(arrayPersonList);
        //List<Person> arrayPersonListToSort2 = new ArrayList<>(arrayPersonList);
        //List<Person> arrayPersonListToSort3 = new ArrayList<>(arrayPersonList);
        //List<Person> arrayPersonListToSort4 = new ArrayList<>(arrayPersonList);
        List<Person> arrayPersonListToRemove1 = new ArrayList<>(arrayPersonList);
        List<Person> arrayPersonListToRemove2 = new ArrayList<>(arrayPersonList);
        long durationOfRemovalPersonArrayListWithIterator = countDurationOfRemovalWithIterator(arrayPersonListToRemove1);
        long durationOfRemovalPersonArrayListWithClear = countDurationOfRemovalWithClear(arrayPersonListToRemove2);

        ReturnUtil<List<Animal>> resultCreationAnimalArrayList = CollectionCreation.generateAnimalArrayList();
        List<Animal> arrayAnimalList = resultCreationAnimalArrayList.getResult();
        long durationCreationAnimalArrayList = resultCreationAnimalArrayList.getDuration();
        long durationIterationWithIteratorAnimalArrayList = countDurationOfIteratorIteration(arrayAnimalList);
        long durationIterationWithForLoopAnimalArrayList = countDurationOfForLoopIteration(arrayAnimalList);
        //List<Animal> arrayAnimalListToSort1 = new ArrayList<>(arrayAnimalList);
        //List<Animal> arrayAnimalListToSort2 = new ArrayList<>(arrayAnimalList);
        //List<Animal> arrayAnimalListToSort3 = new ArrayList<>(arrayAnimalList);
        //List<Animal> arrayAnimalListToSort4 = new ArrayList<>(arrayAnimalList);
        List<Animal> arrayAnimalListToRemove1 = new ArrayList<>(arrayAnimalList);
        List<Animal> arrayAnimalListToRemove2 = new ArrayList<>(arrayAnimalList);
        long durationOfRemovalAnimalArrayListWithIterator = countDurationOfRemovalWithIterator(arrayAnimalListToRemove1);
        long durationOfRemovalAnimalArrayListWithClear = countDurationOfRemovalWithClear(arrayAnimalListToRemove2);

        System.out.println("LINKED LIST PERSON");
        //print(linkedPersonList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "заполнение", linkedPersonList.getClass().getSimpleName(), linkedPersonList.get(0).getClass().getSimpleName(), durationCreationPersonLinkedList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью Итератора", linkedPersonList.getClass().getSimpleName(), linkedPersonList.get(0).getClass().getSimpleName(), durationIterationWithIteratorPersonLinkedList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью For", linkedPersonList.getClass().getSimpleName(), linkedPersonList.get(0).getClass().getSimpleName(), durationIterationWithForLoopPersonLinkedList);
        //System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
        //       "итерация с помощью ForEach", linkedPersonList.getClass().getSimpleName(), linkedPersonList.get(0).getClass().getSimpleName(), durationIterationWithForEachPersonLinkedList);
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
                "удаления с помощью Итератора", linkedPersonList.getClass().getSimpleName(), linkedPersonList.get(0).getClass().getSimpleName(), durationOfRemovalPersonLinkedListWithIterator);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Clear", linkedPersonList.getClass().getSimpleName(), linkedPersonList.get(0).getClass().getSimpleName(), durationOfRemovalPersonLinkedListWithClear);
        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("LINKED LIST ANIMAL");
        //print(linkedAnimalList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "заполнение", linkedAnimalList.getClass().getSimpleName(), linkedAnimalList.get(0).getClass().getSimpleName(), durationCreationAnimalLinkedList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью Итератора", linkedAnimalList.getClass().getSimpleName(), linkedAnimalList.get(0).getClass().getSimpleName(), durationIterationWithIteratorAnimalLinkedList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью For", linkedAnimalList.getClass().getSimpleName(), linkedAnimalList.get(0).getClass().getSimpleName(), durationIterationWithForLoopAnimalLinkedList);
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
                "удаления с помощью Итератора", linkedAnimalList.getClass().getSimpleName(), linkedAnimalList.get(0).getClass().getSimpleName(), durationOfRemovalAnimalLinkedListWithIterator);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Clear", linkedAnimalList.getClass().getSimpleName(), linkedAnimalList.get(0).getClass().getSimpleName(), durationOfRemovalAnimalLinkedListWithClear);
        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("ARRAY LIST PERSON");
        //print(arrayPersonList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "заполнение", arrayPersonList.getClass().getSimpleName(), arrayPersonList.get(0).getClass().getSimpleName(), durationCreationPersonArrayList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью Итератора", arrayPersonList.getClass().getSimpleName(), arrayPersonList.get(0).getClass().getSimpleName(), durationIterationWithIteratorPersonArrayList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью For", arrayPersonList.getClass().getSimpleName(), arrayPersonList.get(0).getClass().getSimpleName(), durationIterationWithForLoopPersonArrayList);
        //System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
        //      "итерация с помощью ForEach", arrayPersonList.getClass().getSimpleName(), arrayPersonList.get(0).getClass().getSimpleName(), durationIterationWithForEachPersonArrayList);
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
                "удаления с помощью Итератора", arrayPersonList.getClass().getSimpleName(), arrayPersonList.get(0).getClass().getSimpleName(), durationOfRemovalPersonArrayListWithIterator);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Clear", arrayPersonList.getClass().getSimpleName(), arrayPersonList.get(0).getClass().getSimpleName(), durationOfRemovalPersonArrayListWithClear);
        System.out.println("____________________________________________");
        System.out.println();

        System.out.println("ARRAYLIST ANIMAL");
        //print(arrayAnimalList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "заполнение", arrayAnimalList.getClass().getSimpleName(), arrayAnimalList.get(0).getClass().getSimpleName(), durationCreationAnimalArrayList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью Итератора", arrayAnimalList.getClass().getSimpleName(), arrayAnimalList.get(0).getClass().getSimpleName(), durationIterationWithIteratorAnimalArrayList);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "итерация с помощью For", arrayAnimalList.getClass().getSimpleName(), arrayAnimalList.get(0).getClass().getSimpleName(), durationIterationWithForLoopAnimalArrayList);
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
                "удаления с помощью Итератора", arrayAnimalList.getClass().getSimpleName(), arrayAnimalList.get(0).getClass().getSimpleName(), durationOfRemovalAnimalArrayListWithIterator);
        System.out.printf("Операция: %s %s для класса %s. Заняла %d мс%n",
                "удаления с помощью Clear", arrayAnimalList.getClass().getSimpleName(), arrayAnimalList.get(0).getClass().getSimpleName(), durationOfRemovalAnimalArrayListWithClear);
    }


}
