package home_work_2.loops;

import java.text.DecimalFormat;

/**
 * Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
 * Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
 * <p>
 * ВАЖНО! Проверки на целочисленность и наличие НЕцифр лучше бы сделать в виде исключений, но я остановилась на своих способах, чтобы лучше разобраться, что за чем идет
 * Например, пункт 4 (проверка оставшихся возможных значений на наличие НЕ цифр) долго не могла придумать, куда поставить, ведь "-" и "." тоже !Digits
 */

public class MultiplyInsideNumber {
    public static void main(String[] args) {

        // 1. проверка на пустой ввод
        if (args.length == 0) {
            System.out.println("Ничего не введено в аргументах командной строки");
            return;
        }

        // читаем String из аргументов
        String inputString = args[0];

        //  2. проверка на целочисленность (если 1 точка - число, если >1 - не число)
        if (inputString.contains(".")) {
            //убираем точку, проходим по массиву
            inputString = inputString.replaceFirst("\\.", "");
            for (char c : inputString.toCharArray()) {
                if (!Character.isDigit(c)) {
                    System.out.println("Введено не число");
                    return;
                }
            }
            System.out.println("Введено не целое число");
            return;
        }

        //  3. проверка на > 0 (знак минуса + цифры = число, иначе не число)
        if (inputString.startsWith("-")) {
            //убираем -, проходим по массиву
            inputString = inputString.replaceFirst("-", "");
            for (char c : inputString.toCharArray()) {
                if (!Character.isDigit(c)) {
                    System.out.println("Введено не число");
                    return;
                }
            }
        }
        // 4. проверка оставшихся возможных значений на наличие НЕ цифр
        else {
            for (char c : inputString.toCharArray()) {
                if (!Character.isDigit(c)) {
                    System.out.println("Введено не число");
                    return;
                }
            }
        }

        long inputNumber = Math.abs(Long.parseLong(inputString)); //учитываем, что можно было вводить отрицательное число

        String result = toMultiply(inputNumber);
        System.out.print(result);
    }

    public static String toMultiply(long num) {
        int digit;
        int res = 1;
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            digit = (int) (num % 10);
            num /= 10;
            res *= digit;
            sb.insert(0, digit); // Вставляем цифру в начало строки (для обратного порядка)
            if (num > 0) {
                sb.insert(0, " * ");
            }
        }

        //отформатируем вывод результата
        DecimalFormat df = new DecimalFormat("#,###");
        String formattedRes = df.format(res);
        sb.append(" = ").append(formattedRes);
        return sb.toString();
    }

}
