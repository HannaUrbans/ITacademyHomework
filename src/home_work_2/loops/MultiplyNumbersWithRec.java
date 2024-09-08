package home_work_2.loops;

public class MultiplyNumbersWithRec implements IMultiply {
    /**
     * public static void main(String[] args) {
     * if (args.length == 0) {
     * System.out.println("Ничего не введено в аргументах командной строки");
     * return;
     * }
     * <p>
     * // Получаем данные из аргумента командной строки
     * String input = args[0];
     * long inputNumber;
     * <p>
     * //проверяем с помощью исключений, что ввели не буквы и больше 0
     * try {
     * inputNumber = Long.parseLong(input);
     * if (inputNumber <= 0) {
     * System.out.println("Введите положительное число");
     * return;
     * }
     * } catch (NumberFormatException e) {
     * System.out.println("Вы ввели не число");
     * return;
     * }
     * <p>
     * MultiplyNumbersWithRec tmp = new MultiplyNumbersWithRec();
     * long result = tmp.factorial(inputNumber);
     * <p>
     * //проверяем, произошло ли переполнение
     * if (result == -1) {
     * System.out.println("В результате умножения получилось слишком большое число для типа long");
     * } else {
     * DecimalFormat df = new DecimalFormat("#,###");
     * String formattedResult = df.format(result);
     * <p>
     * //выводим на экран ход вычислений
     * StringBuilder steps = new StringBuilder();
     * steps.append("1");
     * for (long k = 2; k <= inputNumber; k++) {
     * steps.append(" * ").append(k);
     * }
     * System.out.println(steps + " = " + formattedResult);
     * }
     * }
     */

    @Override
    public long factorial(long number) {
        // Базовый случай (указывает, когда рекурсия должна завершиться)
        if (number == 1) {
            return 1;
        }
        // Рекурсивный случай (функция вызывает саму себя с аргументом `i - 1`)
        long prevNumberFactorial = factorial(number - 1);
        //проверка на переполнение
        if (number > Long.MAX_VALUE / prevNumberFactorial) {
            return -1;
        }
        return number * prevNumberFactorial;
    }
}

