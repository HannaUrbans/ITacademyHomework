package home_work_1;

import java.util.Scanner;

public class IsSleep {
    public static void main(String[] args) {

        boolean weekday = false;
        boolean vacation = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Сегодня рабочий день? Введите + или -");
        String inputWeekdayString = in.next().trim();
        char inputWeekdayChar = inputWeekdayString.charAt(0);

        if (inputWeekdayString.length() == 1 && isInRange(inputWeekdayChar)) {
            if (inputWeekdayChar == '+') {
                weekday = true;
            }
        }
        else {
            System.out.println("Вы ввели неправильный символ");
            return;
        }

        System.out.println("Сегодня отпуск? Введите + или -");
        String inputVacationString = in.next();
        char inputVacationChar = inputVacationString.charAt(0);

        if (inputVacationString.length() == 1 && isInRange(inputVacationChar)) {
        if (inputVacationChar == '+') {
            vacation = true;
        }
        }
        else {
            System.out.println("Вы ввели неправильный символ");
            return;
        }

        checkCorrectInput(weekday, vacation);

        boolean sleepIn = sleepIn (weekday, vacation); //!вызываем метод и сохраняем результаты вызова функции

        if (sleepIn) {
            System.out.println("Спим сегодня? Да");
        } else {
            System.out.println("Спим сегодня? Нет");
        }
    in.close();
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static boolean isInRange(char answer) {
        return answer == '+' || answer == '-';
    }

    public static void checkCorrectInput(boolean weekday, boolean vacation){
        if (weekday && vacation){
            throw new IllegalArgumentException("Одновременно выбрать два значения нельзя");
        }
        else if (!weekday && !vacation){
            throw new IllegalArgumentException("Вы не выбрали значение");
           }
    }
}

