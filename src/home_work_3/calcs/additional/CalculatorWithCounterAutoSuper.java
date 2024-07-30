package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Задание 6
 * Данный класс наследует класс CalculatorWithMathExtends
 * Данный класс переопределяет все методы, полученные в результате наследования
 * В этих методах должен быть реализован механизм учёта их использования (учёт общий для всех методов класса)
 * Вместо реализации математики: при помощи ключевого слова super вызывает реализацию из родительского класса.
 */

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long countOperation = 0;

    @Override
    public double divide(double a, double b) {
        countOperation++;
        return super.divide(a,b);
    }

    @Override
    public double multiply(double a, double b) {
        countOperation++;
        return super.multiply(a, b);
    }

    @Override
    public double subtract(double a, double b) {
        countOperation++;
        return super.subtract(a, b);
    }

    @Override
    public double add(double a, double b) {
        countOperation++;
        return super.add(a, b);
    }

    @Override
    public double raiseToPower(double a, double b) {
        countOperation++;
        return super.raiseToPower(a,b);
    }

    @Override
    public double absoluteValue(double a) {
        countOperation++;
        return super.absoluteValue(a);
    }

    @Override
    public double squareRoot(double a) {
        countOperation++;
        return super.squareRoot(a);
    }

    public long getCountOperation() {
        return countOperation;
    }

}
