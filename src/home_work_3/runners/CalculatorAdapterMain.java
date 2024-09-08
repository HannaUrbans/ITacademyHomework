package home_work_3.runners;

import home_work_3.calcs.adapter.CalculatorAdapter;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorAdapterMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();

        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();

        double result = calculatorAdapter.calc("4.1 + 15 * 7 + (28 / 5) ^ 2");
        System.out.println(result);
    }
}
