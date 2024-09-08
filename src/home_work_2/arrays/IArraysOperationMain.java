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
            System.out.println(doWhileOperation.printElements(array));
            System.out.println(doWhileOperation.printEachSecondElement(array));
            System.out.println(doWhileOperation.printReversedElements(array));

            System.out.println("");

            System.out.println("WhileOperation:");
            System.out.println(whileOperation.printElements(array));
            System.out.println(whileOperation.printEachSecondElement(array));
            System.out.println(whileOperation.printReversedElements(array));

            System.out.println("");

            System.out.println("ForOperation:");
            System.out.println(forOperation.printElements(array));
            System.out.println(forOperation.printEachSecondElement(array));
            System.out.println(forOperation.printReversedElements(array));

            System.out.println("");

            System.out.println("ForEachOperation:");
            System.out.println(forEachOperation.printElements(array));
            System.out.println(forEachOperation.printEachSecondElement(array));
            System.out.println(forEachOperation.printReversedElements(array));
        }
    }
}

