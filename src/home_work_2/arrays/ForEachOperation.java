package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {

    //2.2.1. Вывести все элементы в консоль.
    @Override
    public String printElements(int[] inputArray) {
        StringBuilder sb1 = new StringBuilder();
        int count = 0;

        for (int value : inputArray) {
            sb1.append(String.valueOf(value));
            count++;

            if (count < inputArray.length) {
                sb1.append(" ");
            }
        }
      return sb1.toString();
    }

    //2.2.2. Вывести каждый второй элемент массива в консоль.
    @Override
    public String printEachSecondElement(int[] inputArray) {
        StringBuilder sb2 = new StringBuilder();
        boolean isFirst = true;

        if (inputArray.length == 1) {
            return null;
        }

        int index = 0;

        for (int value : inputArray) {
            if (index % 2 != 0) {
                if (!isFirst) {
                    sb2.append(" ");
                }
                sb2.append(value);
                isFirst = false;
            }
            index++;
        }
        return sb2.toString();
    }

    //2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    @Override
    public String printReversedElements(int[] inputArray) {
        StringBuilder sb3 = new StringBuilder();

        boolean isFirst = true;
        for (int value : inputArray) {

            if (!isFirst) {
                sb3.append(" ");
            } else {
                isFirst = false;
            }
            sb3.append(value);
        }
            return (sb3.reverse()).toString();
    }
}

