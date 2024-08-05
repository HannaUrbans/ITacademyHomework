package home_work_1;

import java.util.Scanner;

public class IsDivided {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число (делитель) в диапазоне от 1 до 2 147 483 647."); //0 не входит в диапазон
        int inputNumber1 = in.nextInt();

        if (!isInRange(inputNumber1)) {
            System.out.println("Введённое число не входит в требуемый диапазон.");
            return;
        }

        System.out.println("Введите целое число (делимое) в диапазоне от 1 до 2 147 483 647.");
        int inputNumber2 = in.nextInt();
        if (!isInRange(inputNumber2)) {
            System.out.println("Введённое число не входит в требуемый диапазон.");
            return;
        }
        in.close();

        System.out.print("Число " + inputNumber2 + " делится на число " + inputNumber1);
        System.out.println(findIfDivided(inputNumber1, inputNumber2));
    }

    public static String findIfDivided (int a, int b){
        String answer;
        if ((b > a) && (b % a == 0) || b == a) {
            answer = " без остатка.";
        } else {
            answer = " с остатком.";
        }
        return answer;
    }

    public static boolean isInRange(int number) {
        return number > 0;
    }
}

