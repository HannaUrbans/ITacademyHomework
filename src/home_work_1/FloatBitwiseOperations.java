package home_work_1;

import java.util.Scanner;

public class FloatBitwiseOperations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float firstNumber = 42.5f;

        System.out.println("Введите второе число.");
        float secondNumber = in.nextFloat();
        System.out.println("Вы ввели " + secondNumber);
        in.close();

        //float andBitwiseResult = firstNumber & secondNumber;
        //System.out.println("Результат побитовой операции И: " + andBitwiseResult);
    }
}

/*
Компилятор выдает ошибку:
java: bad operand types for binary operator '&'
first type:  float
second type: float

Причины:
Хотя float и можно перевести из десятичной системы в двоичную (разделить число на его целую и дробную части, перевести каждую из них отдельно),
побитовые операции предназначены для работы с целочисленными данными.
В числах с плавающей точкой биты отведены под разные компоненты (знак, экспонента, мантисса).
Изменение их напрямую через побитовые операции может привести к нарушению корректности числа.
*/