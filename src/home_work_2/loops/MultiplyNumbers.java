package home_work_2.loops;

import java.text.DecimalFormat;

/**
 * Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 * Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 * Проверки:
 * Число положительное, максимум long
 * Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 */
public class MultiplyNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Ничего не введено в аргументах командной строки");
            return;
        }

        // Получаем число из аргумента командной строки
        long inputNumber = Long.parseLong(args[0]);

        if (inputNumber <= 0) {
            System.out.println("Введите положительное число");
            return;
        }

        long result;
        long k = 2;

        result = factorial(inputNumber);
        if (result == -1) {
            System.out.println("В результате умножения получилось слишком большое число для типа long");
        } else {
            DecimalFormat df = new DecimalFormat("#,###");
            String formattedResult = df.format(result);

            //выводим на экран ход вычислений, можно ли так или это костыль?
            System.out.print(k - 1);
            while (k <= inputNumber) {
                System.out.print(" * " + k);
                k++;
            }
            System.out.print(" = " + formattedResult);
        }
    }

    public static long factorial(long number) {
        long numberFactorial = 1;
        for (long i = 1; i <= number; i++) {
            numberFactorial *= i;
            if (numberFactorial > Long.MAX_VALUE / i) {
                return -1;
            }
        }
        return numberFactorial;
    }
}