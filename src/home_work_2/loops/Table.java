package home_work_2.loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("С какого числа начинать таблицу умножения");
        int from = scan.nextInt();
        System.out.println("Сколько столбцов должно быть в строке");
        int maxColumnNumberInRow = scan.nextInt();
        System.out.println("Сколько всего столбцов должно быть");
        int totalColumnNumber = scan.nextInt();

        //int потому что надо целое число
        //Math.ceil округление вверх
        //double потому что для округления надо иметь число с точкой
        //row - это совокупность строк, в которых строки с умножением на числа от 1 до 10, А НЕ ОДИНОЧНАЯ СТРОКА
        //totalRowNumber - несколько таких блоков
        int totalRowNumber = (int) Math.ceil(totalColumnNumber / (double) maxColumnNumberInRow);

        for (int i = 0; i < totalRowNumber; i++) {
            //здесь мы указываем не конкретное число ДО, а в зависимости от количества столбцов в строке
            int to = from + maxColumnNumberInRow + (maxColumnNumberInRow * i) - 1;

            //рассчитывает, сколько столбцов ещё осталось в последней строке таблицы
            //maxColumnNumberInRow * i - количество столбцов, которые уже были обработаны в предыдущих строках
            int tmp = totalColumnNumber - (maxColumnNumberInRow * i);
            if (tmp < maxColumnNumberInRow) {
                //корректируем значение to, чтобы при необходимости в последнем row отображалось меньше, чем maxColumnNumberInRow
                to = from + (maxColumnNumberInRow * i) + tmp - 1;
            }

            System.out.println(printTable(from + (maxColumnNumberInRow * i), to));
        }

    }

    public static String printTable(int from, int to) {
        if (ExampleTasks.checkFalseRange(from,to)){
            throw new IllegalArgumentException("Неверно введен интервал");
        }

        StringBuilder sb = new StringBuilder();
        int res;
        // внешний цикл - на что умножаем (потому что идет строка 2*1 3*1 4*1...)
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to; j++) {
                //внутренний цикл - что умножаем
                res = i * j;
                sb.append(String.format("%2d * %2d = %3d", j, i, res));
                if (j < to) {
                    sb.append(" |");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}