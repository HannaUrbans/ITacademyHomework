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
    private final Object calculator;
    private long countOperation = 0;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.calculator = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.calculator = calculator;
    }

    public double divide(double a, double b) {
        countOperation++;
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).divide(a, b);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).divide(a, b);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).divide(a, b);
        }
        return -1;
    }

    public double multiply(double a, double b) {
        countOperation++;
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).multiply(a, b);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).multiply(a, b);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).multiply(a, b);
        }
        return -1;
    }

    public double subtract(double a, double b) {
        countOperation++;
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).subtract(a, b);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).subtract(a, b);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).subtract(a, b);
        }
        return -1;
    }

    public double add(double a, double b) {
        countOperation++;
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).add(a, b);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).add(a, b);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).add(a, b);
        }
        return -1;
    }

    public double raiseToPower(double a, double b) {
        countOperation++;
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).raiseToPower(a, b);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).raiseToPower(a, b);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).raiseToPower(a, b);
        }
        return -1;
    }

    public double absoluteValue(double a) {
        countOperation++;
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).absoluteValue(a);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).absoluteValue(a);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).absoluteValue(a);
        }
        return -1;
    }


    public double squareRoot(double a) {
        countOperation++;
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).squareRoot(a);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).squareRoot(a);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).squareRoot(a);
        }
        return -1;
    }

    public long getCountOperation() {
        return countOperation;
    }
}
