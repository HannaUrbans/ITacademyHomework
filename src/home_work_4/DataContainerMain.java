package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer testNull = null;
        //int arrayLength = 10;
        //DataContainer<String> container = new DataContainer<>(new String[arrayLength]);
        DataContainer<String> containerStringTest = new DataContainer<>(null);

        System.out.println("Тест String данные");
        System.out.println();
        int index1 = containerStringTest.add("Привет");
        int index2 = containerStringTest.add("Как дела");
        int index3 = containerStringTest.add("Работаю");
        int index4 = containerStringTest.add("Давай потом");

        String text1 = containerStringTest.get(index1);
        String text2 = containerStringTest.get(index2);
        String text3 = containerStringTest.get(index3);
        String text4 = containerStringTest.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        System.out.println();
        System.out.println("Удаление первого элемента произошло успешно?");
        System.out.println(containerStringTest.delete(text1));
        System.out.println();
        System.out.println("Теперь первый элемент:");
        System.out.println(containerStringTest.get(index1)); //Как дела
        System.out.println();

        System.out.println("Сортировка массива по длине:");
        containerStringTest.sort(new ComparatorOverride.StringLengthComparator());
        System.out.println(containerStringTest); // ["Работаю", "Как дела", "Давай потом"]
        System.out.println();
        System.out.println("Сортировка массива по алфавиту:");
        containerStringTest.sort(new ComparatorOverride.StringAlphabeticComparator());
        System.out.println(containerStringTest); // ["Давай потом", "Как дела", "Работаю"]
        System.out.println();
        System.out.println("********************************************");
        // Создание контейнера с начальными значениями
        System.out.println("Тест Integer данные");
        System.out.println();
        Integer[] initialArray = {1, 2, null, 3, 777, null};
        //Integer[] initialArray2 = {};

        DataContainer<Integer> containerIntegerTest = new DataContainer<>(initialArray);
        //DataContainer<Integer> containerIntegerTest2 = new DataContainer<>(initialArray2);

        // Получение значений
        Integer num1 = containerIntegerTest.get(0);

        System.out.println("Новый элемент 1992 добавлен на позицию:");
        int elempos = containerIntegerTest.add(1992);
        System.out.println(elempos);
        System.out.println();
        System.out.println("На позиции " + elempos + " находится элемент:");
        System.out.println(containerIntegerTest.get(elempos));
        System.out.println();
        System.out.println("Теперь массив выглядит так:");
        System.out.println(Arrays.toString(containerIntegerTest.getItems())); //здесь уже метод toString переопределен, поэтому null отсутствуют
        System.out.println();
        if (containerIntegerTest.add(null) == -1) {
            System.out.println("Элемент " + testNull + " вставить нельзя.");
        }
        System.out.println();

        System.out.println("Удаление позиций по индексу");
        System.out.println("Можем удалить 3 элемент?");
        boolean deletePrint = containerIntegerTest.delete(3);
        System.out.println(deletePrint);
        System.out.println("Теперь массив выглядит так:");
        System.out.println(Arrays.toString(containerIntegerTest.getItems()));

        System.out.println("Можем удалить 777 элемент?");
        boolean deletePrint2 = containerIntegerTest.delete(777);
        System.out.println(deletePrint2);
        System.out.println("Теперь массив выглядит так:");
        System.out.println(Arrays.toString(containerIntegerTest.getItems()));
        System.out.println();

        System.out.println("Удаление элемента");
        System.out.println("Можем удалить элемент \"2\"?");
        boolean deletePrint3 = containerIntegerTest.delete((Integer) 2);
        System.out.println(deletePrint3);
        System.out.println("Теперь массив выглядит так:");
        System.out.println(Arrays.toString(containerIntegerTest.getItems()));

        System.out.println("Можем удалить элемент \"7777\"?");
        boolean deletePrint4 = containerIntegerTest.delete((Integer) 7777);
        System.out.println(deletePrint4);
        System.out.println("Теперь массив выглядит так:");
        System.out.println(Arrays.toString(containerIntegerTest.getItems()));
        System.out.println();

        // задание 9
        System.out.println("********************************************");
        System.out.println("Задание 9");
        System.out.println();

        Integer[] intTest9Array = {1, 9, 9, 2, 0, -8, null};
        String[] stringLetterTest9Array = {"Массивы", "коллекции", null, "Инты"};
        String[] stringLengthTest9_1Array = Arrays.copyOf(stringLetterTest9Array, stringLetterTest9Array.length, String[].class);
        String[] stringLengthTest9_2Array = {"i", "hello", "1", "Как домашка"};

        System.out.println("Массив до сортировки: " + Arrays.toString(intTest9Array));
        DataContainer<Integer> containerToSort9_1 = new DataContainer<>(intTest9Array);
        containerToSort9_1.sort(new ComparatorOverride.IntegerComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort9_1.getData()));
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(stringLetterTest9Array));
        DataContainer<String> containerToSort9_2 = new DataContainer<>(stringLetterTest9Array);
        containerToSort9_2.sort(new ComparatorOverride.StringAlphabeticComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort9_2.getData()));
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(stringLengthTest9_1Array));
        DataContainer<String> containerToSort9_3 = new DataContainer<>(stringLengthTest9_1Array);
        containerToSort9_3.sort(new ComparatorOverride.StringLengthComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort9_3.getData()));
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(stringLengthTest9_2Array));
        DataContainer<String> containerToSort9_4 = new DataContainer<>(stringLengthTest9_2Array);
        containerToSort9_4.sort(new ComparatorOverride.StringLengthComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort9_4.getData()));
        System.out.println();

        // задание 11 статический метод сортировки
        System.out.println("********************************************");
        System.out.println("Задание 11");
        System.out.println();

        Integer[] integerTest11Array = {1, 9, 9, 2, 0, -8, null};

        System.out.println("Массив до сортировки: " + Arrays.toString(integerTest11Array));

        DataContainer<Integer> containerToSort11_1 = new DataContainer<>(integerTest11Array);
        DataContainer.sort(containerToSort11_1);
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort11_1.getData()));


        // задание 12 статический метод сортировки с компаратором
        System.out.println("********************************************");
        System.out.println("Задание 12");
        System.out.println();

        Integer[] integerTest12Array = {1, 9, 9, 2, 0, -8, null};

        System.out.println("Массив до сортировки: " + Arrays.toString(integerTest12Array));
        DataContainer<Integer> containerToSort12_1 = new DataContainer<>(integerTest12Array);
        Comparator<Integer> integerComparator = new ComparatorOverride.IntegerComparator();
        DataContainer.sort(containerToSort12_1, integerComparator);

        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort12_1.getData()));

        // задание 10
        System.out.println("********************************************");
        System.out.println("Задание 10");
        System.out.println();

        Integer[] intTest10Array1 = {1, 2, 3, 777, 3};
        Integer[] intTest10Array2 = {1, 2, 3, null};
        Integer[] intTest10Array3 = {};
        DataContainer<Integer> intTest10Container1 = new DataContainer<>(intTest10Array1);
        DataContainer<Integer> intTest10Container2 = new DataContainer<>(intTest10Array2);
        DataContainer<Integer> intTest10Container3 = new DataContainer<>(intTest10Array3);

        System.out.println("Массив до сортировки: " + Arrays.toString(intTest10Array1));
        System.out.println("Массив после сортировки: " + intTest10Container1.toString());
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(intTest10Array2));
        System.out.println("Массив после сортировки: " + intTest10Container2.toString());
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(intTest10Array3));
        System.out.println("Массив после сортировки: " + intTest10Container3.toString());

        // задание 13
        System.out.println("********************************************");
        System.out.println("Задание 13");
        System.out.println();
        DataContainer<Integer> containerToIterate13 = new DataContainer<>(intTest10Array1);
        Iterator<Integer> iterator = containerToIterate13.iterator();

        System.out.println("Первоначальный массив: " + Arrays.toString(intTest10Array1));

        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println("После удаления элемента:");
        System.out.println(Arrays.toString(containerToIterate13.getItems()));

        System.out.println("Итерация массива " + Arrays.toString(containerToIterate13.getItems()) + " через hasNext:");
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.println(item);
        }
    }
}

