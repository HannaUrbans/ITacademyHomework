package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {

    //2.2.1. Вывести все элементы в консоль.
    @Override
    public void printElements(int[] inputArray) {
        int count = 0;

        for (int value : inputArray) {
            System.out.print(value);
            count++;
            if (count < inputArray.length) {
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    //2.2.2. Вывести каждый второй элемент массива в консоль.
    @Override
    public void printEachSecondElement(int[] inputArray) {
        int index = 0;

        for (int value : inputArray) {
            if (index % 2 != 0) {
                System.out.print(value);
                if (index < inputArray.length - 2) {
                    System.out.print(" ");
                }
            }
            index++;
        }
        System.out.println();
    }

    //2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    @Override
    public void printReversedElements(int[] inputArray) {
        int index = 0;

        int[] reversedArray = new int[inputArray.length];
        int reverseIndex = inputArray.length - 1;
        for (int value : inputArray) {
            reversedArray[reverseIndex] = value;
            reverseIndex--;
        }
        for (int value : reversedArray) {
            System.out.print(value);
            if (value != reversedArray[reversedArray.length - 1]) {
                System.out.print(" ");
            }
        }
    }
}

