package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * 9.2 В данном классе должны быть следующие варианты конструктора:
 * 		9.2.1 Принимающий объект типа CalculatorWithOperator
 * 		9.2.2 Принимающий объект типа CalculatorWithMathCopy
 * 		9.2.3 Принимающий объект типа CalculatorWithMathExtends
 * 	9.4 Данные класс также не умеет напрямую считать математику, они умеют делегировать расчёт математики калькулятору который передали в конструктор.
 * 	9.5 В классах должны присутствовать математические методы:
 * 		9.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		9.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 	9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 */
public class CalculatorWithCounterAutoChoiceAgregation {
    // класс содержит отдельные поля для каждого типа калькулятора и проверяет, какой из них инициализирован
    private final CalculatorWithOperator calcWithOperator;
    private final CalculatorWithMathCopy calcWithMathCopy;
    private final CalculatorWithMathExtends calcWithMathExtends;
    private long countOperation = 0;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.calcWithOperator = calculator;
        this.calcWithMathCopy = null;
        this.calcWithMathExtends = null;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.calcWithOperator = null;
        this.calcWithMathCopy = calculator;
        this.calcWithMathExtends = null;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.calcWithOperator = null;
        this.calcWithMathCopy = null;
        this.calcWithMathExtends = calculator;
    }

    public double divide(double a, double b) {
        countOperation++;
        if (calcWithOperator != null) {
            return calcWithOperator.divide(a, b);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.divide(a, b);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.divide(a, b);
        }
        return -1;
    }

    public double multiply(double a, double b) {
        countOperation++;
        if (calcWithOperator != null) {
            return calcWithOperator.multiply(a, b);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.multiply(a, b);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.multiply(a, b);
        }
        return -1;
    }

    public double subtract(double a, double b) {
        countOperation++;
        if (calcWithOperator != null) {
            return calcWithOperator.subtract(a, b);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.subtract(a, b);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.subtract(a, b);
        }
        return -1;
    }

    public double add(double a, double b) {
        countOperation++;
        if (calcWithOperator != null) {
            return calcWithOperator.add(a, b);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.add(a, b);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.add(a, b);
        }
        return -1;
    }

    public double raiseToPower(double a, double b) {
        countOperation++;
        if (calcWithOperator != null) {
            return calcWithOperator.raiseToPower(a, b);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.raiseToPower(a, b);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.raiseToPower(a, b);
        }
        return -1;
    }

    public double absoluteValue(double a) {
        countOperation++;
        if (calcWithOperator != null) {
            return calcWithOperator.absoluteValue(a);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.absoluteValue(a);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.absoluteValue(a);
        }
        return -1;
    }


    public double squareRoot(double a) {
        countOperation++;
        if (calcWithOperator != null) {
            return calcWithOperator.squareRoot(a);
        } else if (calcWithMathCopy != null) {
            return calcWithMathCopy.squareRoot(a);
        } else if (calcWithMathExtends != null) {
            return calcWithMathExtends.squareRoot(a);
        }
        return -1;
    }

    public long getCountOperation() {
        return countOperation;
    }
}
