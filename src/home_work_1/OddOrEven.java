package home_work_1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        OddOrEven printer = new OddOrEven();

        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число в диапазоне от 0 до 2 147 483 647.");
        int inputNumber = in.nextInt();
        in.close();

        System.out.print("Введённое число " + inputNumber);
        String result = findOddOrEvenNumber(inputNumber);

        System.out.println(result);
    }

    public static String findOddOrEvenNumber(int inputNumber) {
        String answer;
        if (isInRange(inputNumber)) {
            if (inputNumber % 2 != 0) {
                answer = " нечётное";
            } else {
                answer = " чётное";
            }
        } else {
            answer = " не входит в требуемый диапазон.";
        }
        return answer;
    }

    public static boolean isInRange(int number) {
        return number >= 0;
    }
}


