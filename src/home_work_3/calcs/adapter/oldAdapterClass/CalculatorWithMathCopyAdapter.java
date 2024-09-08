package home_work_3.calcs.adapter.oldAdapterClass;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopyAdapter implements ICalculatorWithoutSquareRoot {
        //адаптирует ICalculator для использования интерфейса ICalculatorWithoutSquareRoot
        private final ICalculator calculator;

        public CalculatorWithMathCopyAdapter (ICalculator calculator) {
            this.calculator = calculator;
        }

        @Override
        public double add(double a, double b) { return calculator.add(a, b); }
        @Override
        public double subtract(double a, double b) { return calculator.subtract(a, b); }
        @Override
        public double multiply(double a, double b) { return calculator.multiply(a, b); }
        @Override
        public double divide(double a, double b) { return calculator.divide(a, b); }
        @Override
        public double raiseToPower(double a, double b) { return calculator.raiseToPower(a, b); }
        @Override
        public double absoluteValue(double a) { return calculator.absoluteValue(a); }
    }
