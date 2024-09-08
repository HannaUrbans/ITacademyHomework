package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    //2.2.1. Вывести все элементы в консоль.
    @Override
    public String printElements(int[] inputArray) {
        StringBuilder sb1 = new StringBuilder();
        for (int x = 0; x < inputArray.length; x++) {
            sb1.append(inputArray[x]);
            if (x < inputArray.length - 1) {
                sb1.append(" ");
            }
        }
        return sb1.toString();
    }

    //2.2.2. Вывести каждый второй элемент массива в консоль.
    @Override
    public String printEachSecondElement(int[] inputArray) {
        StringBuilder sb2 = new StringBuilder();

        if (inputArray.length == 1) {
            return null;
        }

        for (int x = 1; x < inputArray.length; x += 2) {
            {
                sb2.append(inputArray[x]);
                if (x < inputArray.length - 2) {
                    sb2.append(" ");
                }
            }
        }
        return sb2.toString();
    }

    //2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    @Override
    public String printReversedElements(int[] inputArray) {
        StringBuilder sb3 = new StringBuilder();

        for (int x = inputArray.length; x > 0; x--) {
            sb3.append(inputArray[x - 1]);
            if (x > 1) {
                sb3.append(" ");
            }
        }
        return sb3.toString();
    }
}
