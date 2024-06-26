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

        int maxNumber = Math.max(inputNumber1, inputNumber2);
        if (inputNumber3 > maxNumber) {
            maxNumber = inputNumber3;
        }

        int minNumber = Math.min(inputNumber1, inputNumber2);
        if (inputNumber3 < minNumber) {
            minNumber = inputNumber3;
        }

        int res = (inputNumber1 + inputNumber2 + inputNumber3 - maxNumber - minNumber);
        System.out.println("Среднее число из введённых Вами чисел " + inputNumber1 + ", " + inputNumber2 + ", " + inputNumber3 + ": " + res);

        in.close();
}

public static boolean isInRange(int number) {
    return (number >= -100_000) && (number <= 100_000);
}
}
