package home_work_1;

import java.util.Scanner;

public class GreetingIfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String inputName = in.nextLine().trim(); //!вводим текст - убери пробелы
        in.close();

        if (inputName.isEmpty()) {
            System.out.println("Вы ничего не ввели.");
            return;
        }

        String userVasya = "Вася";
        String userAnastasiya = "Анастасия";

        if (inputName.equals(userVasya)) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else {
            if (inputName.equals(userAnastasiya)) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
}

