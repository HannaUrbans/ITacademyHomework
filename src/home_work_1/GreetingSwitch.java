package home_work_1;

import java.util.Scanner;

public class GreetingSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String inputName = in.nextLine().trim();
        in.close();

        if (inputName.isEmpty()) {
            System.out.println("Вы ничего не ввели.");
            return;
        }
        switch (inputName) {
            case "Вася":
                System.out.println("Привет!\nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
    }
}
