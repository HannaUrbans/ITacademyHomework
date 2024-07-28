package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy mathCalculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(mathCalculator);

        System.out.println(calculator.add(calculator.add(4.1, calculator.multiply(15, 7)), calculator.raiseToPower(calculator.divide(28, 5), 2)));
        System.out.println("Количество операций: "+ calculator.getCountOperation());
    }
}
