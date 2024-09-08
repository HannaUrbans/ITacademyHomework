package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    // 2.2.1. Вывести все элементы в консоль.
    @Override
    public String printElements(int[] inputArray) {
        StringBuilder sb1 = new StringBuilder();
        int i = 0;

        do {
            sb1.append(inputArray[i]);
            if (i < inputArray.length - 1) {
                sb1.append(" ");
            }
            i++;
        } while (i < inputArray.length);

        return sb1.toString();
    }

    //2.2.2. Вывести каждый второй элемент массива в консоль.
    @Override
    public String printEachSecondElement(int[] inputArray) {
        StringBuilder sb2 = new StringBuilder();
        if (inputArray.length == 1) {
            return null;
        }

        int i = 1;

        do {
            sb2.append(inputArray[i]);
            i += 2;

            if (i < inputArray.length) {
                sb2.append(" ");
            }
        } while (i < inputArray.length);

        return sb2.toString();
    }

    //2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    @Override
    public String printReversedElements(int[] inputArray) {
        StringBuilder sb3 = new StringBuilder();
        int i = inputArray.length;

        do {
            sb3.append(inputArray[i - 1]);
            if (i > 1) {
                sb3.append(" ");
            }
            i--;
        } while (i > 0);

        return sb3.toString();
    }
}
