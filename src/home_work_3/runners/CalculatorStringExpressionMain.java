package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.additional.CalculatorWithMathCopyAdapter;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.api.ICalculatorWithoutSquareRoot;
import home_work_3.calcs.simple.CalculatorWithMathCopy;


public class CalculatorStringExpressionMain {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithMathCopy();
        ICalculatorWithoutSquareRoot adapter = new CalculatorWithMathCopyAdapter(calculator);
        CalculatorStringExpression calculator1 = new CalculatorStringExpression(adapter);

        String input = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        System.out.println(calculator1.parseAndCalculateString(input));
    }
}
