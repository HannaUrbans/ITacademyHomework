package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;
/*
2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результат.
 */
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();

        System.out.println(calculator.add(calculator.add(4.1, calculator.multiply(15, 7)), calculator.raiseToPower(calculator.divide(28, 5), 2)));
    }
}
