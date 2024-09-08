package test.home_work_2;

import home_work_2.arrays.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IArraysOperationTest {
    //создаем массив, содержащий все варианты ArraysOperation
    public final IArraysOperation[] arraysOperationTypes = {
            new DoWhileOperation(),
            new ForEachOperation(),
            new ForOperation(),
            new WhileOperation()
    };

    //проходим по всем вариантам
    @Test
    public void oneDigitInputprintElementsTest() {
        for (IArraysOperation arrayPart : arraysOperationTypes) {
           String res = arrayPart.printElements(new int[]{1});
           assertEquals("1", res, "Неправильно обработан случай ввода массива из одного элемента");
        }
    }

    @Test
    public void twoDigitsInputprintElementsTest() {
        for (IArraysOperation arrayPart : arraysOperationTypes) {
            String res = arrayPart.printElements(new int[]{1,2});
            assertEquals("1 2", res, "Неправильно обработан случай ввода массива из двух элементов");
        }
    }

    @Test
    public void oneDigitPrintEachSecondElementTest() {
        for (IArraysOperation arrayPart : arraysOperationTypes) {
            String res = arrayPart.printEachSecondElement(new int[]{1});
            assertEquals(null, res, "Неправильно обработан случай ввода массива из одного элемента");
        }
    }

    @Test
    public void twoDigitsPrintEachSecondElementTest() {
        for (IArraysOperation arrayPart : arraysOperationTypes) {
            String res = arrayPart.printEachSecondElement(new int[]{1,2});
            assertEquals("2", res, "Неправильно обработан случай ввода массива из двух элементов");
        }
    }

    @Test
    public void oneDigitPrintReversedElementsTest() {
        for (IArraysOperation arrayPart : arraysOperationTypes) {
            String res = arrayPart.printReversedElements(new int[]{1});
            assertEquals("1", res, "Неправильно обработан случай ввода массива из одного элемента");
        }
    }

    @Test
    public void twoDigitsPrintReversedElementsTest() {
        for (IArraysOperation arrayPart : arraysOperationTypes) {
            String res = arrayPart.printReversedElements(new int[]{1,2});
            assertEquals("2 1", res, "Неправильно обработан случай ввода массива из двух элементов");
        }
    }


    @Test
    public void inputContainsZeroPrintElementsTest() {
        for (IArraysOperation arrayPart : arraysOperationTypes) {
            String res = arrayPart.printElements(new int[]{1,2,3,0});
            assertEquals("1 2 3 0", res, "Неправильно обработан случай ввода массива с нулём");
        }
    }

    @Test
    public void inputContainsZeroPrintEachSecondElementTest() {
        for (IArraysOperation arrayPart : arraysOperationTypes) {
            String res = arrayPart.printEachSecondElement(new int[]{1,2,3,0});
            assertEquals("2 0", res, "Неправильно обработан случай ввода массива из двух элементов");
        }
    }

    @Test
    public void inputContainsZeroPrintReversedElementsTest() {
        for (IArraysOperation arrayPart : arraysOperationTypes) {
            String res = arrayPart.printReversedElements(new int[]{1,2,3,0});
            assertEquals("0 3 2 1", res, "Неправильно обработан случай ввода массива из одного элемента");
        }
    }

}
