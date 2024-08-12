package home_work_4;

import java.util.Arrays;

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

        // DataContainer<Integer> container2 = new DataContainer<>(Integer.class, new Integer[arrayLength]);

        // задание 9
        System.out.println("********************************************");
        System.out.println("Задание 9");
        System.out.println();

        Integer[] intTest9Array = {1, 9, 9, 2, 0, -8, null};
        String[] stringTest9Array = {"Массивы", "коллекции", null, "Инты"};

        System.out.println("Массив до сортировки: " + Arrays.toString(intTest9Array));
        DataContainer<Integer> containerToSort1 = new DataContainer<>(Integer.class, intTest9Array);
        containerToSort1.sort(new Comparator.IntegerComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort1.getData()));
        System.out.println();

        System.out.println("Массив до сортировки: " + Arrays.toString(stringTest9Array));
        DataContainer<String> containerToSort2 = new DataContainer<>(String.class, stringTest9Array);
        containerToSort2.sort(new Comparator.StringComparator());
        System.out.println("Массив после сортировки: " + Arrays.toString(containerToSort2.getData()));
        System.out.println();

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
    }
}
