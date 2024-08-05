package home_work_1;

import java.util.Scanner;

/*
В этой задаче я сознательно выставила такой диапазон, поскольку если вводимое число выходит за границы int, то нужно выбрасывать исключение, решила пока не затрагивать эту тему.
 */

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число в диапазоне от -100 000 до 100 000.");
        int inputNumber1 = in.nextInt();

        if (!isInRange(inputNumber1)) {
            System.out.println("Введённое число не входит в требуемый диапазон.");
            return;
        }

        System.out.println("Введите второе целое число в диапазоне от -100 000 до 100 000.");
        int inputNumber2 = in.nextInt();

        if (!isInRange(inputNumber2)) {
            System.out.println("Введённое число не входит в требуемый диапазон.");
            return;
        }

        System.out.println("Введите третье целое число в диапазоне от -100 000 до 100 000.");
        int inputNumber3 = in.nextInt();

        if (!isInRange(inputNumber3)) {
            System.out.println("Введённое число не входит в требуемый диапазон.");
            return;
        }

        int middleNumber = findMiddleNumber(inputNumber1, inputNumber2, inputNumber3);
        System.out.println("Среднее число из введённых Вами чисел " + inputNumber1 + ", " + inputNumber2 + ", " + inputNumber3 + ": " + middleNumber);

        in.close();
    }

    public static int findMiddleNumber(int a, int b, int c) {
        int maxNumber = Math.max(a, b);
        if (c > maxNumber) {
            maxNumber = c;
        }

        int minNumber = Math.min(a, b);
        if (c < minNumber) {
            minNumber = c;
        }

       return a + b + c - maxNumber - minNumber;
    }

    public static boolean isInRange(int number) {
        return (number >= -100_000) && (number <= 100_000);
    }
}
