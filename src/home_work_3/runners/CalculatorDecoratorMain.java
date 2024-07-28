package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;

/**
 * 13.5 Создать класс CalculatorDecoratorMain в котором будет точка входа (main метод).
 * Cоздать переменную типа ICalculator calc записав в неё новый экземпляр класса CalculatorWithCounterAutoDecorator
 * которому в конструктор был передан новый экземпляр класса CalculatorWithMemoryDecorator
 * которому в конструтор был передан новый экземпляр класса CalculatorWithMathExtends.
 * Используя созданную переменную посчитать выражения из задания 1. Вывести в консоль.
 * 13.6 Вывести количество использований калькулятора.
 * 13.7** Получить перечисленные далее сведения требуется из калькулятора который вам вернёт метод getCalculator().
 * Данный пункт вам очень поможет выполнить оператор instanceof который нужно использовать в main.
 * 13.7.1 Выполнить метод сохранения последнего расчёта и вывести сохранённое значение.
 * 13.7.2 Изменить calc путём изменения создаваемого экземпляра на CalculatorWithCounterClassic.
 * Сделать выводы в комментариях зачем нужен instanceof
 */
public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        // ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        ICalculator calc = new CalculatorWithCounterClassic();

        System.out.println(calc.add(calc.add(4.1, calc.multiply(15, 7)), calc.raiseToPower(calc.divide(28, 5), 2)));

        if (calc instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator decoratorCalc = (CalculatorWithCounterAutoDecorator) calc;
            System.out.println("Количество операций: " + decoratorCalc.getCountOperation());

            ICalculator newCalc = decoratorCalc.getCalculator();

            if (newCalc instanceof CalculatorWithMemoryDecorator) {
                ((CalculatorWithMemoryDecorator) newCalc).save();
                System.out.println(((CalculatorWithMemoryDecorator) newCalc).load());
            }
        }

    }

}

/**
 * Вывод:
 * Когда передается экземпляр класса CalculatorWithCounterAutoDecorator через переменную типа ICalculator,
 * теряется доступ к методам, специфичным для класса CalculatorWithCounterAutoDecorator
 * (интерфейсы не имеют доступа к методам, не определённым в интерфейсе)
 * Для доступа к методам, не объявленным в интерфейсе, необходимо привести объект к конкретному типу класса, который реализует интерфейс
 * (явное приведение типа с проверкой instanceof).
 */