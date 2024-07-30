package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * Задание 8
 * Внутри класса создать поле, хранящее объект класса CalculatorWithMathCopy
 * Для инициализации данного поля использовать конструктор, в который будут передавать CalculatorWithMathCopy
 * Данный класс ДЕЛЕГИРУЕТ расчёт математики калькулятору, который сохранён в его поле
 */

public class CalculatorWithCounterAutoAgregation {
    private final CalculatorWithMathCopy calculator;
    private long countOperation = 0;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

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
