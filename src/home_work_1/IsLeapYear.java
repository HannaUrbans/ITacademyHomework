package home_work_1;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int inputYear = in.nextInt();

        if (inputYear > 0) {
            if ((inputYear % 4 == 0) && (inputYear % 100 != 0 || inputYear % 400 == 0)) {
                System.out.println(inputYear + " год високосный");
            } else {
                System.out.println(inputYear + " год НЕвисокосный");
            }
        } else {
            System.out.println("Нельзя вводить отрицательные числа и 0");
        }
        in.close();
    }
}
