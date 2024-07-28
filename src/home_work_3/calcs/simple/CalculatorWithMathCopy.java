package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * В классе должны присутствовать математические методы:
 * 3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * Скопировать базовые математические операции из CalculatorWithOperator.
 * 3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 */
public class CalculatorWithMathCopy implements ICalculator {

    @Override
    public double divide(double a, double b) {
        return (a / b);
    }

    @Override
    public double multiply(double a, double b) {
        return (a * b);
    }

    @Override
    public double subtract(double a, double b) {
        return (a - b);
    }

    @Override
    public double add(double a, double b) {
        return (a + b);
    }

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
        return Math.abs(a);
    }

    @Override
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

}
