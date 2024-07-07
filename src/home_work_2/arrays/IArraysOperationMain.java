package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class IArraysOperationMain {
    public static void main(String[] args) {
        IArraysOperation doWhileOperation = new DoWhileOperation();
        IArraysOperation whileOperation = new WhileOperation();
        IArraysOperation forOperation = new ForOperation();
        IArraysOperation forEachOperation = new ForEachOperation();

        int[] array = ArraysUtils.arrayFromConsole();

        if (array != null) {
            System.out.println("DoWhileOperation:");
            doWhileOperation.printElements(array);
            doWhileOperation.printEachSecondElement(array);
            doWhileOperation.printReversedElements(array);

            System.out.println("");

            System.out.println("WhileOperation:");
            whileOperation.printElements(array);
            whileOperation.printEachSecondElement(array);
            whileOperation.printReversedElements(array);

            System.out.println("");

            System.out.println("ForOperation:");
            forOperation.printElements(array);
            forOperation.printEachSecondElement(array);
            forOperation.printReversedElements(array);

            System.out.println("");

            System.out.println("ForEachOperation:");
            forEachOperation.printElements(array);
            forEachOperation.printEachSecondElement(array);
            forEachOperation.printReversedElements(array);
        }
    }
}

