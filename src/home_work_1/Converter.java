package home_work_1;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в десятичной системе от -128 до 127");
        byte inputNumber = in.nextByte();
        in.close();

        System.out.println("Результат конвертации " + inputNumber + " в двоичную систему: " + toBinaryString(inputNumber));
    }

    public static String toBinaryString(byte number) {

        byte positiveBinaryDigit = (byte) Math.abs(number);
        StringBuilder binaryStringBuilder = new StringBuilder();
        String res; //idea сказал не инициализировать здесь (String res = "";), потому что этот стринг перезаписывается внутри метода перед возвращением его значения


        while (positiveBinaryDigit >= 1) {
            binaryStringBuilder.append((byte) (positiveBinaryDigit % 2));
            positiveBinaryDigit = (byte) (positiveBinaryDigit / 2);
        }

        StringBuilder reversedBinaryStringBuilder = new StringBuilder(binaryStringBuilder).reverse();

        while (reversedBinaryStringBuilder.length() != 8) {
            reversedBinaryStringBuilder.insert(0, '0');
        }

        if (number > 0) {
            res = String.valueOf(reversedBinaryStringBuilder);
        }
        else if (number == 0) {
            res = String.format("%8s", "0").replace(' ', '0');
        }

        else {
            char[] binaryArray = new char[reversedBinaryStringBuilder.length()];
            for (int i = 0; i < reversedBinaryStringBuilder.length(); i++) {
                binaryArray[i] = reversedBinaryStringBuilder.charAt(i);
            }

            for (int i = 0; i < binaryArray.length; i++) {
                if (binaryArray[i] == '0') {
                    binaryArray[i] = '1';
                }
                else {
                    binaryArray[i] = '0';
                }
            }

            if (binaryArray[reversedBinaryStringBuilder.length() - 1] == '0') {
                binaryArray[reversedBinaryStringBuilder.length() - 1] = '1';
            }
            else {
                binaryArray[reversedBinaryStringBuilder.length() - 1] = '0';
                for (int m = (binaryArray.length - 2); m >= 0; m--) {
                    if (binaryArray[m] == '1') {
                        binaryArray[m] = '0';
                    }
                    else {
                        binaryArray[m] = '1';
                        break;
                    }
                }
            }
            res = String.valueOf(binaryArray);
        }
        return res;
    }
}



