package home_work_3.runners;

import home_work_3.calcs.adapter.CalculatorAdapter;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorAdapterMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();

        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();

        double result = calculatorAdapter.calc("5+8+10*2+2+5+5");
        System.out.println(result);
    }
}
