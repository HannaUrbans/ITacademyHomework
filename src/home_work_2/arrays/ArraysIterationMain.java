package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIterationMain {
    public static void main(String[] args) {
        ArraysIteration arraysIteration = new ArraysIteration();
        int[] array = ArraysUtils.arrayFromConsole();

        if (array != null) {
            arraysIteration.printElements(array);
            arraysIteration.printEachSecondElement(array);
            arraysIteration.printReversedElements(array);
        }
    }
}
