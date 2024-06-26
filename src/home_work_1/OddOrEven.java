package home_work_1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число в диапазоне от 0 до 2 147 483 647.");
        int inputNumber = in.nextInt();

        if (isInRange(inputNumber)) {
            if (inputNumber % 2 == 0) {
                System.out.println("Число " + inputNumber + " чётное.");
            } else {
                System.out.println("Число " + inputNumber + " НЕчётное.");
            }
        } else {
            System.out.println("Введённое число не входит в требуемый диапазон.");
        }
        in.close();
    }

    public static boolean isInRange(int number) {
        return number >= 0;
        }
    }


