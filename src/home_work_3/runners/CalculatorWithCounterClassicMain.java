package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

/**
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1,
 * при каждой математической операции самостоятельно вызывать метод incrementCountOperation() для увеличения счётчика.
 * Вывести в консоль результат
 * 4.1 + 15 * 7 + (28 / 5) ^ 2
 */

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double resultFinal;
        double resultIntermediate;

        resultIntermediate = calculator.divide(28, 5);
        calculator.incrementCountOperation();

        resultIntermediate = calculator.raiseToPower(resultIntermediate, 2);
        calculator.incrementCountOperation();

        resultFinal = calculator.multiply(15, 7);
        calculator.incrementCountOperation();

        resultFinal = calculator.add(4.1, resultFinal);
        calculator.incrementCountOperation();

        resultFinal = calculator.add(resultFinal, resultIntermediate);
        calculator.incrementCountOperation();

        System.out.println("Результат: " + resultFinal);
        System.out.println("Количество операций: " + calculator.getCountOperation());
    }
}
