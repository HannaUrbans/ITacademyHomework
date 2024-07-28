package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * 4.3.1 4 базовых математических метода (деление, умножение, вычитание, сложение) НЕ ДОЛЖНЫ быть объявлены напрямую в классе,
 * а должны быть унаследованы от родительского класса (4.2).
 * 4.3.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * Данные методы должны ПЕРЕОПРЕДЕЛЯТЬ методы родительского класса (4.2) и должны содержать в своём теле вызов библиотеки Math и возврат полученного результата .
 */

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double raiseToPower(double a, double b) {
        if (a > 0) {
            return Math.pow(a, b);
        } else {
            return -1;
        }
    }

    @Override
    public double absoluteValue(double a) {
        return (Math.abs(a));
    }

    @Override
    public double squareRoot(double a) {
        return (Math.sqrt(a));
    }
}
