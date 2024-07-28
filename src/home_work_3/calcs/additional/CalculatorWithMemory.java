package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

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
