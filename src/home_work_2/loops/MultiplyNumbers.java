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
        String input = args[0];
        long inputNumber;

        try {
            inputNumber = Long.parseLong(input);
            if (inputNumber <= 0) {
                System.out.println("Введите положительное число");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число");
            return;
        }

        long result = factorial(inputNumber);
        long k = 2; //переменная для вывода хода вычислений

        if (result == -1) {
            System.out.println("В результате умножения получилось слишком большое число для типа long");
        } else {
            DecimalFormat df = new DecimalFormat("#,###");
            String formattedResult = df.format(result);

            //выводим на экран ход вычислений, этот вариант ок только если числа идут по порядку
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
            if (Long.MAX_VALUE / numberFactorial < i) {
                return -1;
            }
            numberFactorial *= i;
        }
        return numberFactorial;
    }
}