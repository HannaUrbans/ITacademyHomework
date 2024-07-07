package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {

    // 2.2.1. Вывести все элементы в консоль.
    @Override
    public void printElements(int[] inputArray) {
        int k = 0;

        while (k < inputArray.length) {
            System.out.print(inputArray[k]);
            if (k < inputArray.length - 1) {
                System.out.print(" ");
            }
            k++;
        }
        System.out.println();
    }

    //2.2.2. Вывести каждый второй элемент массива в консоль.
    @Override
    public void printEachSecondElement(int[] inputArray) {
        int k = 1;

        while (k < inputArray.length) {
            if (k > 2) {
                System.out.print(" " + inputArray[k]);
                k += 2;
            } else {
                System.out.print(inputArray[k]);
                k += 2;
            }
        }
        System.out.println();
    }

    //2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    @Override
    public void printReversedElements(int[] inputArray) {
        int k = inputArray.length;

        while (k > 0) {
            System.out.print(inputArray[k - 1]);
            if (k != 1) {
                System.out.print(" ");
            }
            k--;
        }
        System.out.println();
    }
}
