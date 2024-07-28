package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        System.out.println(calculator.add(calculator.add(4.1, calculator.multiply(15, 7)), calculator.raiseToPower(calculator.divide(28, 5), 2)));
    }
}
