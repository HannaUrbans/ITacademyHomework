package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * Задание 11
 * Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем что передал вам пользователь вашего класса.
 * В данном классе должен быть только конструктор принимающий объект типа ICalculator
 * 	Данный класс ДЕЛЕГИРУЕТ расчёт математики калькулятору, который передали в конструктор
 */

public class CalculatorWithCounterAutoAgregationInterface {
    private final ICalculator calculator;
    private long countOperation = 0;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
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
