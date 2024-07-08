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

        if (inputArray.length == 1) {
            System.out.println("Вы ввели только один элемент");
            return;
        }

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

        boolean first = true;
        for (int value : reversedArray) {
            //после первого цикла устанавливаем флаг в положение false
            if (!first) {
                System.out.print(" ");
            } else {
                first = false;
            }
            System.out.print(value);
        }
    }
}

