package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * В классе должны присутствовать математические методы:
 * 2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение)
 * каждый из этих методов должен принимать два параметра и должны возвращать результат при помощи ключевого слово return.
 * 2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
 * 2.3 В методах можно использовать любые арифметические операторы.
 */
public class CalculatorWithOperator implements ICalculator {

    @Override
    public double divide(double a, double b) {
        return (a / b);
    }

    @Override
    public double multiply(double a, double b) {
        return (a * b);
    }

    @Override
    public double subtract(double a, double b) {
        return (a - b);
    }

    @Override
    public double add(double a, double b) {
        return (a + b);
    }

    @Override
    public double raiseToPower(double a, double b) {
        double raisingToPowerResult = 1;
        if (a > 0) {
            if (b == 0) {
                return 1;
            } else if (b == 1) {
                return a;
            } else {
                for (int i = 0; i < b; i++) {
                    raisingToPowerResult *= a;
                }
                return raisingToPowerResult;
            }
        } else {
            return -1;
        }
    }

    @Override
    public double absoluteValue(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    @Override
    public double squareRoot(double a) {
        // метода половинного деления
        double left = 0;
        double right = a;
        double midPoint = -1;
        double accuracy = 1e-7;

        while (right - left >= accuracy) {
            midPoint = (left + right) / 2;
            double square = midPoint * midPoint;

            if (square == a) {
                return midPoint;
            } else if (square < a) {
                left = midPoint; // сдвигаем левую границу вправо
            } else {
                right = midPoint; // сдвигаем правую границу влево
            }
        }

        return midPoint;
    }
}
