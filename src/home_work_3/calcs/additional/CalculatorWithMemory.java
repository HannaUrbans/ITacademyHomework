package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * Задание 12
 * Создать CalculatorWithMemory используя аналогичные принципы построения класса CalculatorWithCounterAutoAgregationInterface.
 * Расширить возможности калькулятора и обеспечить его дополнительной функцией памяти
 * В данном классе должен быть только конструктор принимающий объект типа ICalculator
 * Данный класс ДЕЛЕГИРУЕТ расчёт математики калькулятору, который передали в конструктор
 * Функция памяти работает через методы:
 * 		12.6.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно быть параметров. Данный метод вызывается непосредтвенно пользователем, а не автоматический. Пример void save();
 * 		12.6.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи нового значения память перезаписывается. Данный метод вызывается непосредтвенно пользователем, а не автоматический. Пример double load();
 */

public class CalculatorWithMemory {
    private final ICalculator calculator;
    private double result = 0;
    private double resultToLoad = Double.NaN;

    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double divide(double a, double b) {
        result = calculator.divide(a, b);
        return result;
    }

    public double multiply(double a, double b) {
        result = calculator.multiply(a, b);
        return result;
    }

    public double subtract(double a, double b) {
        result = calculator.subtract(a, b);
        return result;
    }


    public double add(double a, double b) {
        result = calculator.add(a, b);
        return result;
    }

    public double raiseToPower(double a, double b) {
        result = calculator.raiseToPower(a, b);
        return result;
    }

    public double absoluteValue(double a) {
        result = calculator.absoluteValue(a);
        return result;
    }

    public double squareRoot(double a) {
        result = calculator.squareRoot(a);
        return result;
    }

    public void save() {
        resultToLoad = result;
    }

    public double load() {
        if (Double.isNaN(resultToLoad)) {
            return -1;
        }
        return resultToLoad;
    }

}
