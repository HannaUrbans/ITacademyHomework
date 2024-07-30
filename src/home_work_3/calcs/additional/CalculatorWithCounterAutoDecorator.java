package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * Задание 13
 * Класс реализовывает интерфейс ICalculator
 * Существует метод ICalculator getCalculator(), который возвращает вложенный в него калькулятор
 */

public class CalculatorWithCounterAutoDecorator implements ICalculator{

    private final ICalculator calculator;
    private long countOperation = 0;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double divide(double a, double b) {
        countOperation++;
        return calculator.divide(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        countOperation++;
        return calculator.multiply(a, b);
    }

    @Override
    public double subtract(double a, double b) {
        countOperation++;
        return calculator.subtract(a, b);
    }

    @Override
    public double add(double a, double b) {
        countOperation++;
        return calculator.add(a, b);
    }

    @Override
    public double raiseToPower(double a, double b) {
        countOperation++;
        return calculator.raiseToPower(a,b);
    }

    @Override
    public double absoluteValue(double a) {
        countOperation++;
        return calculator.absoluteValue(a);
    }

    @Override
    public double squareRoot(double a) {
        countOperation++;
        return calculator.squareRoot(a);
    }

    public long getCountOperation() {
        return countOperation;
    }

    public ICalculator getCalculator() {
        return calculator;
    }
}
