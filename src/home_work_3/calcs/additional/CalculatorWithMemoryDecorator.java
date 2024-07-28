package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator{

    private final ICalculator calculator;
    private double result = 0;
    private double resultToLoad = Double.NaN;

    public  CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double divide(double a, double b) {
        result = calculator.divide(a, b);
        return result;
    }

    @Override
    public double multiply(double a, double b) {
        result = calculator.multiply(a, b);
        return result;
    }

    @Override
    public double subtract(double a, double b) {
        result = calculator.subtract(a, b);
        return result;
    }

    @Override
    public double add(double a, double b) {
        result = calculator.add(a, b);
        return result;
    }

    @Override
    public double raiseToPower(double a, double b) {
        result = calculator.raiseToPower(a, b);
        return result;
    }

    @Override
    public double absoluteValue(double a) {
        result = calculator.absoluteValue(a);
        return result;
    }

    @Override
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

    public ICalculator getCalculator() {
        return calculator;
    }
}
