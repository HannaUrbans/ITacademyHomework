package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * Задание 3
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
