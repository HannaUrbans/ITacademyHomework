package home_work_2.loops;

import java.text.DecimalFormat;

/**
 * Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
 * Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
 */

public class MultiplyInsideNumber {
   /** public static void main(String[] args) {

        // 1. проверка на пустой ввод
        if (args.length == 0) {
            throw new IllegalArgumentException("Ничего не введено в аргументах командной строки");
        }

        // читаем String из аргументов
        String inputString = args[0];

        // 2. проверка на целочисленность (если 1 точка - число, если >1 - не число)
        dotCheck(inputString);
        // 3. проверка на > 0 (знак минуса + цифры = число, иначе не число)
        // 4. проверка оставшихся возможных значений на наличие НЕ цифр
        isDigitCheck(inputString);

        String result = toMultiply(inputString);
        System.out.print(result);
    }
*/
    public static String toMultiply(String inputString) {
        long num = Math.abs(Long.parseLong(inputString)); //учитываем, что можно было вводить отрицательное число

        int digit;
        int res = 1;
        StringBuilder sb = new StringBuilder();
        String stringToReturn = "";
        if (num == 0) {
            stringToReturn = "0";
        } else {
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
            stringToReturn = sb.toString();
        }

        return stringToReturn;
    }

    public static void dotCheck(String inputString) {
        if (inputString.contains(".")) {
            //убираем точку, проходим по массиву
            inputString = inputString.replaceFirst("\\.", "");
            for (char c : inputString.toCharArray()) {
                if (!Character.isDigit(c)) {
                    throw new IllegalArgumentException("Введено не число");
                }
            }
            throw new IllegalArgumentException("Введено не целое число");
        }
    }

    public static void isDigitCheck(String inputString) {
        if (inputString.startsWith("-")) {
            //убираем -, проходим по массиву
            inputString = inputString.replaceFirst("-", "");
            for (char c : inputString.toCharArray()) {
                if (!Character.isDigit(c)) {
                    throw new IllegalArgumentException("Введено не число");
                }
            }
        } else {
            for (char c : inputString.toCharArray()) {
                if (!Character.isDigit(c)) {
                    throw new IllegalArgumentException("Введено не число");
                }
            }
        }
    }
}
