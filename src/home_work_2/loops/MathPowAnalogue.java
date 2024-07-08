package home_work_2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Возведение в степень. Через консоль пользователь вводит два числа.
 * Первое число это число которое мы будем возводить, Возводимое число - может быть отрицательным и оно будет дробным
 * Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
 * 1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
 * 1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */

public class MathPowAnalogue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для возведения в степень");
        float baseNum = in.nextFloat();

        if (baseNum <= 0) {
            System.out.println("Число для возведения в степень должно быть больше 0");
            return;
        }

        System.out.println("Введите степень, в которую возводится число"); //если не целочисленное, то будет ошибка, надо в идеале исключение
        int expNum = in.nextInt();

        if (expNum < 0) {
            System.out.println("Степень может быть только положительной");
            return;
        }

        String result = raiseNum(baseNum, expNum);
        System.out.println(baseNum + " ^ " + expNum + " = " + result);
    }

    public static String raiseNum(float num1, int num2) {
        float res = 1;
        for (int i = 1; i <= num2; i++) {
            res *= num1;
        }

        DecimalFormat df = new DecimalFormat("#,###.00");
        String formattedRes = df.format(res);
        return formattedRes;
    }
}
