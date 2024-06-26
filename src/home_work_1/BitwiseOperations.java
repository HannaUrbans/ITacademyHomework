package home_work_1;

import java.util.Scanner;

public class BitwiseOperations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число в диапазоне от 0 до 2 147 483 647.");
        int firstNumber = in.nextInt(); //00100011

        if (!isInRange(firstNumber)){
            System.out.println("Введённое число не входит в требуемый диапазон.");
            return;
        }

        System.out.println("Введите ещё одно целое число в диапазоне от 0 до 2 147 483 647.");
        int secondNumber = in.nextInt(); //01000000

        if (!isInRange(secondNumber)){
            System.out.println("Введённое число не входит в требуемый диапазон.");
            return;
        }
        in.close();

        int andBitwiseResult = firstNumber & secondNumber; //00000000
        int orBitwiseResult = firstNumber | secondNumber; //01100011
        System.out.println("Результат побитовой операции И между цифрами " + firstNumber + " и " + secondNumber + " равен " + andBitwiseResult + ".\n" + "Результат побитовой операции ИЛИ между цифрами " + firstNumber + " и " + secondNumber + " равен " + orBitwiseResult + ".");
        }

    public static boolean isInRange(int number) {
        return number >= 0;
    }
}

