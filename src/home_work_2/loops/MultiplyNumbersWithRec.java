package home_work_2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiplyNumbersWithRec {
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

        result = factorialWithRec(inputNumber);
        if (result == -1) {
            System.out.println("В результате умножения получилось слишком большое число для типа long");
        } else {
            DecimalFormat df = new DecimalFormat("#,###");
            String formattedResult = df.format(result);
            System.out.println("Результат умножения чисел от 1 до " + inputNumber + " (включительно): " + formattedResult);
        }
    }

    public static long factorialWithRec(long number) {
        long prevNumberFactorial = 0;

        // Базовый случай (указывает, когда рекурсия должна завершиться)
        if (number == 1) {
            return 1;
        } else {
            // Рекурсивный случай (функция вызывает саму себя с аргументом `i - 1`)
            prevNumberFactorial = factorialWithRec(number - 1);
            //проверка на переполнение
            if (number > Long.MAX_VALUE / prevNumberFactorial) {
                return -1;
            } else {
                return number * prevNumberFactorial;
            }
        }
    }
}