package home_work_1;

import java.util.Scanner;

public class IsDivided {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое целое число в диапазоне от 1 до 2 147 483 647."); //0 не входит в диапазон
        int inputNumber1 = in.nextInt();

        if (!isInRange(inputNumber1)) {
            System.out.println("Введённое число не входит в требуемый диапазон.");
            return;
        }

        System.out.println("Введите второе целое число в диапазоне от 1 до 2 147 483 647.");
        int inputNumber2 = in.nextInt();
        if (!isInRange(inputNumber2)) {
            System.out.println("Введённое число не входит в требуемый диапазон.");
            return;
        }

        if ((inputNumber2 > inputNumber1) && (inputNumber2 % inputNumber1 == 0)) {
            System.out.println("Число " + inputNumber2 + " делится на число " + inputNumber1 + " без остатка.");
        } else if ((inputNumber2 < inputNumber1) && (inputNumber1 % inputNumber2 == 0)) {
            System.out.println("Число " + inputNumber1 + " делится на число " + inputNumber2 + " без остатка.");
        } else if (inputNumber2 == inputNumber1) {
            System.out.println("Число " + inputNumber1 + " делится на число " + inputNumber2 + " без остатка.");
        } else {
            System.out.println("Числа не делятся без остатка.");
        }
        in.close();
    }

    public static boolean isInRange(int number) {
        return number > 0;
    }
}

