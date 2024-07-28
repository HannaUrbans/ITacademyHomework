package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Данный класс наследует класс CalculatorWithMathExtends.
 * 	6.3 Данный класс переопределяет все методы полученные в результате наследования
 * 	в этих методах должен быть реализован механизм учёта их использования (учёт общий для всех методов класса)
 * 	вместо реализации математики при помощи ключевого слова super вызывает данный метод у родителя.
 * 	Например вызвали метод plus(7, 3) который должен сложить два числа и вернуть результат сложения.
 * 	Внутри метода plus() пишем реализацию учета, а после делаем вызов super.plus(7, 3).
 * 	Использование super позволит вызвать реализацию из родительского класса.
 * 	6.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
 * 	При вызове данного метода счётчик учёта не увеличивается.
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
