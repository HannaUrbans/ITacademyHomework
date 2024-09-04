package home_work_1;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int inputYear = in.nextInt();

        if (correctYearInput(inputYear)) {
            System.out.println(inputYear + " - это " +specifyLeapStatus(inputYear) + " год");
        } else {
            System.out.println("Нельзя вводить отрицательные числа и 0");
        }
        in.close();
    }

    public static String specifyLeapStatus (int inputYear){
        if ((inputYear % 4 == 0) && (inputYear % 100 != 0 || inputYear % 400 == 0)) {
            return "високосный";
        } else {
            return "невисокосный";
        }
    }

    public static boolean correctYearInput(int year){
        return year > 0;
    }
}
