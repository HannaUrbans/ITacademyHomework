
package home_work_1;

import java.util.Scanner;

public class CorrectedPhoneNumber {
    static char[] inputArray;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 10 цифр номера");
        String input = in.nextLine().trim();
        in.close();

        if (input.isEmpty()) {
            System.out.println("Вы ничего не ввели.");
            return;
        }

        inputArray = new char[input.length()];
        /*размер лучше указывать сразу же в начале "static char[] inputArray = new char [10];",
        тогда при вводе большего/меньшего количества знаков, будет выбрасываться исключение
         */

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = input.charAt(i);
            if (!Character.isDigit(inputArray[i])) {
                System.out.println("Введите только цифры без пробелов, букв и иных символов");
                return;
            }
        }

        if (inputArray.length < 10) {
            System.out.println("Вы ввели менее 10 цифр");
        } else if (inputArray.length > 10) {
            System.out.println("Вы ввели более 10 цифр");
        } else {
            createPhoneNumber(inputArray);
        }
    }

    public static void createPhoneNumber(char[] inputArray) {
       String phoneNumber = String.format("(%c%c%c) %c%c%c-%c%c%c%c", inputArray[0], inputArray[1], inputArray[2],
               inputArray[3], inputArray[4], inputArray[5], inputArray[6], inputArray[7], inputArray[8], inputArray[9]);
        System.out.println(phoneNumber);
        //System.out.println("(" + inputArray[0] + inputArray[1] + inputArray[2] + ") " + inputArray[3] + inputArray[4] + inputArray[5] + "-" + inputArray[6] + inputArray[7] + inputArray[8] + inputArray[9]);

    }
}


