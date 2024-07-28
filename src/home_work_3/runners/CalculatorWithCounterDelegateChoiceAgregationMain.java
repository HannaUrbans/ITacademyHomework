package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * 9.7.1 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithOperator и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * 		9.7.2 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathCopy и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * 		9.7.3 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathExtends и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithOperator сalculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(сalculatorWithOperator);

        System.out.println("CalculatorWithOperator");
        System.out.println(calculator1.add(calculator1.add(4.1, calculator1.multiply(15, 7)), calculator1.raiseToPower(calculator1.divide(28, 5), 2)));
        System.out.println("Количество операций: "+ calculator1.getCountOperation());
        System.out.println("________________________");

        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathCopy);

        System.out.println("CalculatorWithMathCopy");
        System.out.println(calculator2.add(calculator2.add(4.1, calculator2.multiply(15, 7)), calculator2.raiseToPower(calculator2.divide(28, 5), 2)));
        System.out.println("Количество операций: "+ calculator2.getCountOperation());
        System.out.println("________________________");

        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathExtends);

        System.out.println("CalculatorWithMathExtends");
        System.out.println(calculator3.add(calculator3.add(4.1, calculator3.multiply(15, 7)), calculator3.raiseToPower(calculator3.divide(28, 5), 2)));
        System.out.println("Количество операций: "+ calculator3.getCountOperation());

    }
}
