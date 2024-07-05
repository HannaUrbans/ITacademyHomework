package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class ArraysIteration {
    /**
     * написать перебор (итерирование) массива
     * Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив.
     * Все задачи в одном классе, в отдельных методах, в каждом методе используется 4 разных цикла.
     */

    //2.2.1. Вывести все элементы в консоль.
    public static int[] printElements(int[] inputArray) {

        //do....while
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

        //while
        int k = 0;
        while (k < inputArray.length) {
            System.out.print(inputArray[k]);
            if (k < inputArray.length - 1) {
                System.out.print(" ");
            }
            k++;
        }
        System.out.println();

        //for
        for (int x = 0; x < inputArray.length; x++) {
            System.out.print(inputArray[x]);
            if (x < inputArray.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        //foreach
        int count = 0;
        for (int value : inputArray) {
            System.out.print(value);
            count++;
            if (count < inputArray.length) {
                System.out.print(" ");
            }
        }
        System.out.println();

        return inputArray;
    }

    //2.2.2. Вывести каждый второй элемент массива в консоль.
    public static int[] printEachSecondElement(int[] inputArray) {

        //do....while
        int i = 1;
        do {
            System.out.print(inputArray[i]);
            if (i < inputArray.length - 1) {
                System.out.print(" ");
            }
            i += 2;
        }
        while (i < inputArray.length);
        System.out.println();

        //while
        int k = 1;
        while (k < inputArray.length) {
            {
                System.out.print(inputArray[k]);
                if (k < inputArray.length - 1) {
                    System.out.print(" ");
                }
                k += 2;
            }
        }
        System.out.println();

        //for
        for (int x = 1; x < inputArray.length; x += 2) {
            {
                System.out.print(inputArray[x]);
                if (x < inputArray.length - 1) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();

        //foreach
        int index = 0;
        for (int value : inputArray) {
            if (index % 2 != 0) {
                System.out.print(value);
                if (index < inputArray.length - 1 && (index + 1) % 2 != 0) {
                    System.out.print(" ");
                }
            }
            index++;
        }
        return inputArray;
    }

    //2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    public static int[] printReversedElements(int[] inputArray) {

        //do....while
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

        //while
        int k = inputArray.length;
        ;
        while (k > 0) {
            System.out.print(inputArray[k - 1]);
            if (k > 0) {
                System.out.print(" ");
                k--;
            }
        }
        System.out.println();

        //for
        for (int x = inputArray.length; x > 0; x--) {
            System.out.print(inputArray[x - 1]);
            if (x > 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        //foreach
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

        return inputArray;
    }
        public static void main (String[]args){
            int[] array = arrayFromConsole();
            if (array != null) {
                //printElements(array);
                //printEachSecondElement(array);
                printReversedElements(array);
            }
        }
    }

