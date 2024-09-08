package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {

    // 2.2.1. Вывести все элементы в консоль.
    @Override
    public String printElements(int[] inputArray) {
        StringBuilder sb1 = new StringBuilder();
        int k = 0;

        while (k < inputArray.length) {
            sb1.append(inputArray[k]);
            if (k < inputArray.length - 1) {
                sb1.append(" ");
            }
            k++;
        }
        return sb1.toString();
    }

    //2.2.2. Вывести каждый второй элемент массива в консоль.
    @Override
    public String printEachSecondElement(int[] inputArray) {
        StringBuilder sb2 = new StringBuilder();
        int k = 1;

        if (inputArray.length == 1) {
            return null;
        }
        while (k < inputArray.length) {
            if (k > 2) {
                sb2.append(" " + inputArray[k]);
                k += 2;
            } else {
                sb2.append(inputArray[k]);
                k += 2;
            }
        }
        return sb2.toString();
    }

    //2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    @Override
    public String printReversedElements(int[] inputArray) {
        StringBuilder sb3 = new StringBuilder();
        int k = inputArray.length;

        while (k > 0) {
            sb3.append(inputArray[k - 1]);
            if (k != 1) {
                sb3.append(" ");
            }
            k--;
        }
        return sb3.toString();
    }
}
