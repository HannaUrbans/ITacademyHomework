package home_work_1;

import java.util.Scanner;


public class IsLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 символ.");
        String inputString = in.next();

        /*if (inputString.isEmpty()) {
            System.out.println("Вы ничего не ввели.");
            return;
        }
        ПОЧЕМУ НЕ РАБОТАЕТ?*/

        char inputChar = inputString.charAt(0);

        if (inputString.length() > 1) {
            System.out.println("Вы ввели больше одного символа.");
            return;
        }

        if (Character.isLetter(inputChar)) {
            System.out.println("Вы ввели букву " + inputChar);
        } else if (Character.isDigit(inputChar)) {
            System.out.println("Вы ввели цифру " + inputChar);
        } else {
            System.out.println("Вы ввели символ " + inputChar);
        }

        in.close();
    }
}
