package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    //2.2.1. Вывести все элементы в консоль.
    @Override
    public void printElements(int[] inputArray) {
        for (int x = 0; x < inputArray.length; x++) {
            System.out.print(inputArray[x]);
            if (x < inputArray.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    //2.2.2. Вывести каждый второй элемент массива в консоль.
    @Override
    public void printEachSecondElement(int[] inputArray) {

        if (inputArray.length == 1) {
            System.out.println("Вы ввели только один элемент");
            return;
        }
        for (int x = 1; x < inputArray.length; x += 2) {
            {
                System.out.print(inputArray[x]);
                if (x < inputArray.length - 2) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

    //2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    @Override
    public void printReversedElements(int[] inputArray) {

        for (int x = inputArray.length; x > 0; x--) {
            System.out.print(inputArray[x - 1]);
            if (x > 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
