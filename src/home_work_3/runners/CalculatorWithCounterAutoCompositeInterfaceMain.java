package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        ICalculator calculator1 = new CalculatorWithMathCopy();
        ICalculator calculator2 = new CalculatorWithMathExtends();
        ICalculator calculator3 = new CalculatorWithOperator();

        CalculatorWithCounterAutoAgregationInterface calculatorWithMathCopy = new CalculatorWithCounterAutoAgregationInterface(calculator1);
        CalculatorWithCounterAutoAgregationInterface calculatorWithMathExtends = new CalculatorWithCounterAutoAgregationInterface(calculator2);
        CalculatorWithCounterAutoAgregationInterface calculatorWithOperator = new CalculatorWithCounterAutoAgregationInterface(calculator3);

        System.out.println("calculatorWithMathCopy");
        System.out.println(calculatorWithMathCopy.add(calculatorWithMathCopy.add(4.1, calculatorWithMathCopy.multiply(15, 7)), calculatorWithMathCopy.raiseToPower(calculatorWithMathCopy.divide(28, 5), 2)));
        System.out.println("Количество операций: "+ calculatorWithMathCopy.getCountOperation());
        System.out.println("_______________________________________");

        System.out.println("calculatorWithMathExtends");
        System.out.println(calculatorWithMathExtends.add(calculatorWithMathExtends.add(4.1, calculatorWithMathExtends.multiply(15, 7)), calculatorWithMathExtends.raiseToPower(calculatorWithMathExtends.divide(28, 5), 2)));
        System.out.println("Количество операций: "+ calculatorWithMathExtends.getCountOperation());
        System.out.println("_______________________________________");

        System.out.println("calculatorWithOperator");
        System.out.println(calculatorWithOperator.add(calculatorWithOperator.add(4.1, calculatorWithOperator.multiply(15, 7)), calculatorWithOperator.raiseToPower(calculatorWithOperator.divide(28, 5), 2)));
        System.out.println("Количество операций: "+ calculatorWithOperator.getCountOperation());



    }
}
