package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(calculator);

        calcMemory.divide(28, 5);
        calcMemory.save();

        calcMemory.raiseToPower(calcMemory.load(), 2);
        calcMemory.save();

        calcMemory.add(4.1, calcMemory.load());
        calcMemory.save();

        calcMemory.add(calcMemory.load(), calcMemory.multiply(15, 7));
        calcMemory.save();

        System.out.println(calcMemory.load()); // 140.46
    }
}
