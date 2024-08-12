package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainerMain {
    public static void main(String[] args) {
        int arrayLength = 10;
        //DataContainer<String> container = new DataContainer<>(String.class, new String[arrayLength]);
        DataContainer<String> container = new DataContainer<>(String.class);

        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");

        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        System.out.println(container.delete(text1));
        System.out.println(container.delete("Как дела"));
        System.out.println(container.get(index1)); //Как дела
        System.out.println(Arrays.toString(container.getItems())); // ["Работаю", "Как дела", "Давай потом"]

        // Создание контейнера с начальными значениями
        Integer[] initialArray = {1, 2, null, 3, 777, null};
        //Integer[] initialArray = {};
        DataContainer<Integer> container2 = new DataContainer<>(Integer.class, initialArray);

        // Получение значений
        // Integer может иметь null внутри
        Integer num1 = container2.get(0);
        Integer num2 = container2.get(1);
        Integer num3 = container2.get(2);
        Integer num4 = container2.get(3);
        //boolean deletePrint = container2.delete((Integer)777);
        System.out.println(Arrays.toString(container2.getItems()));
        // System.out.println(deletePrint);
        System.out.println(container2.toString());
        //System.out.println(Arrays.toString(container2.getItems()));

        // задание 9
        System.out.println("********************************************");
        System.out.println("Задание 9");
        System.out.println();

        Integer[] intTest9Array = {1, 9, 9, 2, 0, -8, null};
        String[] stringLetterTest9Array = {"Массивы", "коллекции", null, "Инты"};
        String[] stringLengthTest9_1Array = Arrays.copyOf(stringLetterTest9Array, stringLetterTest9Array.length, String[].class);
        String[] stringLengthTest9_2Array = {"i", "hello", "1", "Как домашка"};

        System.out.println("Массив до сортировки: " + Arrays.toString(intTest9Array));
        DataContainer<Integer> containerToSort9_1 = new DataContainer<>(Integer.class, intTest9Array);
        containerToSort9_1.sort(new ComparatorOverride.IntegerComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort9_1.getData()));
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(stringLetterTest9Array));
        DataContainer<String> containerToSort9_2 = new DataContainer<>(String.class, stringLetterTest9Array);
        containerToSort9_2.sort(new ComparatorOverride.StringLetterComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort9_2.getData()));
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(stringLengthTest9_1Array));
        DataContainer<String> containerToSort9_3 = new DataContainer<>(String.class, stringLengthTest9_1Array);
        containerToSort9_3.sort(new ComparatorOverride.StringLengthComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort9_3.getData()));
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(stringLengthTest9_2Array));
        DataContainer<String> containerToSort9_4 = new DataContainer<>(String.class, stringLengthTest9_2Array);
        containerToSort9_4.sort(new ComparatorOverride.StringLengthComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort9_4.getData()));
        System.out.println();

        // задание 11 статический метод сортировки
        System.out.println("********************************************");
        System.out.println("Задание 11");
        System.out.println();

        Integer[] integerTest11Array = {1, 9, 9, 2, 0, -8, null};

        System.out.println("Массив до сортировки: " + Arrays.toString(integerTest11Array));
        DataContainer<Integer> containerToSort11_1 = new DataContainer<>(Integer.class, integerTest11Array);
        DataContainer.sort(containerToSort11_1, new ComparatorOverride.IntegerComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort11_1.getData()));


        // задание 12 статический метод сортировки с компаратором
        System.out.println("********************************************");
        System.out.println("Задание 12");
        System.out.println();

        Integer[] integerTest12Array = {1, 9, 9, 2, 0, -8, null};

        System.out.println("Массив до сортировки: " + Arrays.toString(integerTest12Array));
        DataContainer<Integer> containerToSort12_1 = new DataContainer<>(Integer.class, integerTest12Array);
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
        DataContainer<Integer> intTest10Container1 = new DataContainer<>(Integer.class, intTest10Array1);
        DataContainer<Integer> intTest10Container2 = new DataContainer<>(Integer.class, intTest10Array2);
        DataContainer<Integer> intTest10Container3 = new DataContainer<>(Integer.class, intTest10Array3);

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
        DataContainer<Integer> containerToIterate13 = new DataContainer<>(Integer.class, intTest10Array1);
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

