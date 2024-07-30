package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * Задание 7
 * Внутри класса создать поле, хранящее объект класса CalculatorWithMathCopy
 * Инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора
 * Данный класс ДЕЛЕГИРУЕТ расчёт математики калькулятору, который сохранён в его поле
 */

public class CalculatorWithCounterAutoComposite {
    private final CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
    private long countOperation = 0;

    public double divide(double a, double b) {
        countOperation++;
        return calculator.divide(a, b);
    }

    public double multiply(double a, double b) {
        countOperation++;
        return calculator.multiply(a, b);
    }

    public double subtract(double a, double b) {
        countOperation++;
        return calculator.subtract(a, b);
    }

    public double add(double a, double b) {
        countOperation++;
        return calculator.add(a, b);
    }

    public double raiseToPower(double a, double b) {
        countOperation++;
        return calculator.raiseToPower(a,b);
    }

    public double absoluteValue(double a) {
        countOperation++;
        return calculator.absoluteValue(a);
    }


    public double squareRoot(double a) {
        countOperation++;
        return calculator.squareRoot(a);
    }

    public long getCountOperation() {
        return countOperation;
    }
}
