package home_work_2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 * Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 * Проверки:
 * Число положительное, максимум long
 * Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 */
public class MultiplyNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное число");
        long inputNumber = in.nextLong();
        in.close();
        long result = 1;

        if (inputNumber <= 0) {
            System.out.println("Введите положительное число");
            return;
        }

        result = factorial(inputNumber);
        DecimalFormat df = new DecimalFormat("#,###");
        String formattedResult = df.format(result);
        if (result == -1) {
            System.out.println("В результате умножения получилось слишком большое число для типа long");
        } else {
            System.out.println("Результат умножения чисел от 1 до " + inputNumber + " (включительно): " + formattedResult);
        }
    }

    public static long factorial(long number) {
        long result = 1;
        boolean overflow = false;
        for (long i = 1; i <= number; i++) {
            if (result > Long.MAX_VALUE / i) {
                overflow = true;
                break;
            }
            result *= i;
        }
        if (overflow) {
            return -1;
        } else {
            return result;
        }
    }

}
