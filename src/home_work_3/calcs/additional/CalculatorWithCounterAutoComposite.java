package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
 * 7.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор.
 * Для примера можно использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
 * 	7.3 Инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора.
 * 	7.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору который сохранён в его поле.
 * 	7.5 В классах должны присутствовать математические методы:
 * 		7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 	7.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
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
