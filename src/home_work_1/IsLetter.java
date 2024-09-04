package home_work_1;

import java.util.Scanner;


public class IsLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 символ.");
        String inputString = in.next();

        char inputChar = inputString.charAt(0);

        if (isNotCorrectSize(inputString)) {
            System.out.println("Вы ввели больше одного символа.");
            return;
        }

        System.out.println("Вы ввели " + specifyInput(inputChar) + inputChar);

        in.close();
    }

    public static String specifyInput(char input) {
        if (Character.isLetter(input)) {
            return "букву ";
        } else if (Character.isDigit(input)) {
            return "цифру ";
        } else {
            return "символ ";
        }
    }

    public static boolean isNotCorrectSize(String input){
        return input.length()>1;
    }
}
