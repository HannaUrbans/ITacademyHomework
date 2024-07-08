package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIterationMain {
    public static void main(String[] args) {
        ArraysIteration arraysIteration = new ArraysIteration();
        int[] array = ArraysUtils.arrayFromConsole();

        if (array != null) {
            System.out.println("Вывести все элементы в консоль");
            arraysIteration.printElements(array);
            System.out.println("Вывести каждый второй элемент массива в консоль");
            arraysIteration.printEachSecondElement(array);
            System.out.println("Вывести все элементы массива в консоль в обратном порядке");
            arraysIteration.printReversedElements(array);
        }
    }
}
