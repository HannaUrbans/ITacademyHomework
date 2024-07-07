package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    // 2.2.1. Вывести все элементы в консоль.
    @Override
    public void printElements(int[] inputArray) {
        int i = 0;

        do {
            System.out.print(inputArray[i]);
            if (i < inputArray.length - 1) {
                System.out.print(" ");
            }
            i++;
        }
        while (i < inputArray.length);
        System.out.println();
    }

    //2.2.2. Вывести каждый второй элемент массива в консоль.
    @Override
    public void printEachSecondElement(int[] inputArray) {
        int i = 1;

        do {
            System.out.print(inputArray[i]);
            i += 2;
            if (i < inputArray.length) {
                System.out.print(" ");
            }
        }
        while (i < inputArray.length);
        System.out.println();
    }

    //2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    @Override
    public void printReversedElements(int[] inputArray) {
        int i = inputArray.length;

        do {
            System.out.print(inputArray[i - 1]);
            i--;
            if (i > 0) {
                System.out.print(" ");
            }
        }
        while (i > 0);
        System.out.println();
    }
}